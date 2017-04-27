package hu.polygon.jform.client;

import hu.polygon.jform.client.ImageFactory;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.z;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Vector;

public final class Main extends Applet implements Runnable {
   public static final String Field47 = "5.0.17";
   public static float a = 1.1F;
   public static boolean Field48;
   static AppletContext Field49;
   static String Field50;
   static boolean Field51;
   private String Field52;
   private String[] Field53;
   public Container Field54;
   private Properties Field55;
   private final Vector Field56 = new Vector();
   boolean Field57;
   boolean Field58 = true;
   static z Field59;

   static {
      try {
         a = Float.valueOf(System.getProperty("java.version", "1.1").substring(0, 3)).floatValue();
      } catch (Exception var1) {
         ;
      }

   }

   public Main() {
      this.enableEvents(0L);
   }

   public Main(String[] var1, Container var2) {
      this.Field54 = var2;
      this.Field53 = var1;
      Field48 = true;
      this.run();
   }

   public static final void main(String[] var0) {
      new Main(var0, (Container)null);
   }

   public final void init() {
      Field49 = this.getAppletContext();
      this.Field52 = this.getCodeBase().toString();
      this.Field54 = this;
      this.setLayout(new BorderLayout());
      (new Thread(this)).start();
   }

   public final void run() {
      a();
      String var1 = this.a("factory", (String)null);
      if(var1 != null && (double)a > 1.4D) {
         try {
            ac.Field13 = (ImageFactory)Class.forName(var1).newInstance();
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }

      Field50 = this.a("viewer", (String)null);
      this.Field55 = a(this.a("prop", (String)null));
      boolean var2 = this.a("debug", "false").equals("true");
      if(var2) {
         Method32(this.a("debug-file", (String)null));
      }

      Field51 = this.a("single-windows", "false").equals("true");
      this.a(this.a("base", this.Field52), this.a("url", new String()), this.a("destroy-action", (String)null), this.a("destroy-url", (String)null), this.a("destroy-encoding", "xml"), var2, this.a("console", "true").equals("true"), this.a("error-url", (String)null));
   }

   public static final void a() {
      if(Field59 == null || !Field59.isAlive()) {
         Field59 = new z();
      }

   }

   private final String a(String var1, String var2) {
      String var3 = null;
      if(Field49 != null) {
         var3 = this.getParameter(var1);
      } else {
         for(int var4 = 0; var4 <= this.Field53.length - 2; var4 += 2) {
            if(this.Field53[var4].substring(1).equals(var1)) {
               var3 = this.Field53[var4 + 1];
               break;
            }
         }
      }

      if(var3 == null && this.Field55 != null) {
         var3 = this.Field55.getProperty(var1);
      }

      return var3 == null?var2:var3;
   }

   public final void update(Graphics var1) {
      if(this.getComponentCount() == 0) {
         super.update(var1);
      } else {
         this.paint(var1);
      }

   }

   final void a(String var1, String var2, String var3, String var4, String var5, boolean var6, boolean var7, String var8) {
      Session var9 = new Session(this, var1, var2, var3, var4, var5, var6, var7, var8);
      this.Field56.addElement(var9);
   }

   final void a(Session var1) {
      this.Field56.removeElement(var1);
      if(this.Field56.isEmpty() && Field48 && this.Field54 == null) {
         System.exit(0);
      }

   }

   final void Method31(String var1) {
      Vector var2 = this.Field56;
      synchronized(this.Field56) {
         for(int var3 = 0; var3 < this.Field56.size(); ++var3) {
            Session var4 = (Session)this.Field56.elementAt(var3);
            if(var1.equals(var4.Field92.u)) {
               aq var5 = new aq((Session)null);
               var5._action.u = "_Session/REFRESH";
               var4.a(var5);
               return;
            }
         }

      }
   }

   public final void destroy() {
      this.Field57 = true;
      int var1 = this.Field56.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ((Session)this.Field56.elementAt(0)).a(this.Field58);
      }

   }

   public final void doLayout() {
      super.doLayout();
      Component[] var1 = this.getComponents();
      if(var1.length != 0 && var1[0] instanceof ac) {
         ((ac)var1[0]).Method7();
      }

   }

   private static final Properties a(String var0) {
      if(var0 != null) {
         FileInputStream var1 = null;

         Properties var3;
         try {
            var1 = new FileInputStream(var0 + ".properties");
            Properties var2 = new Properties();
            var2.load(var1);
            var3 = var2;
         } catch (Exception var12) {
            var12.printStackTrace();
            return null;
         } finally {
            if(var1 != null) {
               try {
                  var1.close();
               } catch (Exception var11) {
                  ;
               }
            }

         }

         return var3;
      } else {
         return null;
      }
   }

   private static final void Method32(String var0) {
      try {
         if(var0 != null) {
            PrintStream var1 = new PrintStream(new FileOutputStream(var0 + "out.log"));
            PrintStream var2 = new PrintStream(new FileOutputStream(var0 + "err.log"));
            System.setOut(var1);
            System.setErr(var2);
         }
      } catch (Exception var3) {
         ;
      }

   }
}
