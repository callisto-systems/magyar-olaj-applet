package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.TABLE;
import hu.polygon.jform.client.TEXTFIELD;
import hu.polygon.jform.client.a;
import hu.polygon.jform.client.aa;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.ah;
import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.ar;
import hu.polygon.jform.client.e;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.k;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.o;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.r;
import java.awt.Point;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Session extends Thread {
   public static String Field87;
   private String Field88;
   Main Field89;
   boolean b;
   private aq i;
   protected aq Field90;
   final Hashtable j;
   protected final Hashtable Field91;
   private final Vector e;
   protected i Field92;
   protected i Field93;
   protected i Field94;
   protected q Field95;
   protected e c;
   protected String f;
   private URL h;
   public final Vector Field96;
   public final Vector Field97;
   private long a;
   int Field98;
   final Vector Field99;
   protected final Hashtable Field100;
   private final Hashtable g;
   private final Hashtable d;

   static {
      try {
         Field87 = new String("8859_2".getBytes("8859_2"));
      } catch (Exception var3) {
         try {
            Field87 = new String("Cp1250".getBytes("Cp1250"));
         } catch (Exception var2) {
            Field87 = "UTF8";
         }
      }

   }

   public Session(Main var1, String var2, String var3, String var4, String var5, String var6, boolean var7, boolean var8, String var9) {
      this.Field88 = Field87;
      this.j = new Hashtable();
      this.Field91 = new Hashtable();
      this.e = new Vector();
      this.Field96 = new Vector();
      this.Field97 = new Vector();
      this.a = System.currentTimeMillis();
      this.Field99 = new Vector();
      this.Field100 = new Hashtable();
      this.g = new Hashtable();
      this.d = new Hashtable();
      this.Field92 = new i((o)null, this, (String)null);
      this.Field93 = new i((o)null, this, (String)null);
      this.Field94 = new i((o)null, this, (String)null);
      this.Field95 = new q((o)null, this, -1);
      this.b = var7;

      try {
         if(var2 == null) {
            this.f = var3;
         } else {
            this.f = var2;
         }

         if(var8) {
            this.c = new e(this);
         }

         this.Field89 = var1;
         if(var3.endsWith("#DESIGNER")) {
            return;
         }

         if(var4 != null) {
            this.i = new aq((Session)null);
            this.i._action.u = var4;
            if(var5 != null) {
               this.i._url.k = this.a(var5);
            }

            this.i._encoding.Method31(var6);
            this.i._model.u = "#DESTROY";
            this.i._id = this.i._model;
         }

         if(var9 != null) {
            this.h = this.a(var9);
         }

         this.Method61("SESSION STARTED.");
         this.setPriority(1);
         this.start();
         if(var3.length() == 0) {
            throw new Exception("Missing required \"url\" parameter!");
         }

         try {
            int var10 = var3.indexOf("#LOCALHOST");
            if(var10 != -1) {
               var3 = var3.substring(0, var10) + URLEncoder.encode(InetAddress.getLocalHost().getHostName()) + var3.substring(var10 + 10);
            }
         } catch (Exception var11) {
            this.Method61(var11.getMessage());
         }

         this.a(this.a(var3), (String)null, false);
      } catch (Exception var12) {
         this.a((String)"Client initalization failed!", (Throwable)var12);
      }

      this.Method3();
   }

   public final ac Method59(String var1) {
      for(int var2 = 0; var2 < this.Field97.size(); ++var2) {
         ac var3 = (ac)this.Field97.elementAt(var2);
         if(var3.Field0._id.u.equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   final void Method32(String var1) {
      for(int var2 = 0; var2 < this.Field97.size(); ++var2) {
         ac var3 = (ac)this.Field97.elementAt(var2);
         if(var3.Field0._id.u.equals(var1)) {
            var3.Method3();
            this.Field97.removeElementAt(var2);
            break;
         }
      }

   }

   protected ac a(String var1, k var2) {
      ac var3 = this.Method59(var1);
      if(var3 == null) {
         var3 = new ac(this);
         this.Field97.addElement(var3);
      }

      var3.a(var2);
      if(!this.Field96.contains(var1)) {
         this.Field96.addElement(var1);
      }

      return var3;
   }

   final r Method60(String var1) {
      r var2 = (r)this.j.get(var1);
      if(var2 == null) {
         var2 = new r(this);
         var2._id.u = var1;
         this.j.put(var1, var2);
         var2._instance.G.cd.put("id", var1);
      }

      return var2;
   }

   final ao a(String var1, boolean var2) {
      ao var3 = var2?(ao)this.Field91.get(var1):null;
      if(var3 == null) {
         var3 = new ao();

         try {
            String var4 = this.f;
            String var5 = this.Field88;
            String var6 = this.Method63(this.a(var1), (String)null, false);
            this.Field88 = var5;
            this.f = var4;

            try {
               new ah(var3, var6);
               if(var2) {
                  if(this.Field91.size() > 40) {
                     this.Field91.clear();
                  }

                  this.Field91.put(var1, var3);
               } else {
                  this.Field91.remove(var1);
               }
            } catch (Exception var8) {
               this.a((String)"Unable to parse page!", (Throwable)var8);
            }
         } catch (Exception var9) {
            this.a((String)"Unable to load page!", (Throwable)var9);
         }
      }

      return var3;
   }

   public final void Method5() {
      if(this.c != null) {
         this.c.setVisible(true);
      }

   }

   public final void Method61(String var1) {
      if(this.c != null) {
         var1 = (this.b?Long.toString(System.currentTimeMillis()) + " msec: ":String.valueOf(new Date()) + ' ') + var1;
         this.c.a(var1);
      }

   }

   final void Method31(String var1) {
      if(this.b) {
         this.Method61(var1);
      }

   }

   final void Method62(String var1) {
      if(this.b) {
         this.Method61("WARNING! " + var1);
         ++this.Field98;
      }

   }

   protected void a(String var1, Throwable var2) {
      if(this.c == null) {
         var2.printStackTrace();
      } else {
         String var3 = var2.getMessage();
         if(var3 == null || var3.length() < 10) {
            var3 = var2.getClass().getName();
            int var4 = var3.lastIndexOf(46);
            if(var4 != -1) {
               var3 = var3.substring(var4 + 1) + " has occured: " + var2.getMessage();
            } else {
               var3 = "Unknown error.";
            }
         }

         StringWriter var8 = new StringWriter();
         PrintWriter var5 = new PrintWriter(var8);
         var2.printStackTrace(var5);
         this.Method61("Error: " + var1 + "\nDescription: " + var3 + "\nError Trace: " + var8);

         try {
            new ah(new ar(this), "<JFORM version=\"4.0\"><WINDOW id=\"#MSG\" width=\"300\" height=\"120\"><title>Client Error Message</title><close>true</close><url>#EMPTY</url><action>x</action><content><LABEL id=\"m\" width=\"260\" x=\"20\" y=\"20\" height=\"20\"><text>" + var1 + "</text><style>stressed</style></LABEL><LABEL id=\"d\" width=\"260\" x=\"20\" y=\"50\" height=\"20\"><text>" + ao.Method48(var3) + "</text></LABEL><BUTTON id=\"b\" width=\"100\" x=\"180\" y=\"90\" height=\"20\"><text>Ok</text><action>x</action><close>true</close><url>#EMPTY</url></BUTTON></content></WINDOW></JFORM>");
         } catch (Throwable var7) {
            var7.printStackTrace();
         }
      }

   }

   public final URL a(String var1) throws Exception {
      String var2 = "";
      if(var1 != null) {
         if(var1.indexOf(58) == -1) {
            int var3;
            if(var1.charAt(0) == 46) {
               var3 = 0;
               int var4 = this.f.indexOf("//");
               var2 = this.f.substring(0, this.f.lastIndexOf(47));

               while(var1.indexOf("..", var3) != -1) {
                  var3 += 2;
                  int var5 = var2.lastIndexOf(47);
                  if(var5 > var4 + 1) {
                     var2 = var2.substring(0, var5);
                  }
               }

               return new URL(var2 + var1.substring(var3, var1.length()));
            } else if(var1.charAt(0) == 47) {
               var3 = this.f.indexOf("//");
               var3 = this.f.indexOf(47, var3 + 2);
               var2 = this.f;
               if(var3 == -1) {
                  var3 = this.f.length();
                  var2 = var2 + '/';
               }

               return new URL(var2.substring(0, var3) + var1);
            } else {
               return new URL(this.f.substring(0, this.f.lastIndexOf(47)) + '/' + var1);
            }
         } else {
            return new URL(var1);
         }
      } else {
         return new URL(this.f);
      }
   }

   protected void a(URL var1, String var2, boolean var3) throws Exception {
      String var4 = this.Method63(var1, var2, var3);
      if(this.Field89 == null || !this.Field89.Field57) {
         this.f = var1.toString();
         int var5 = this.f.indexOf("?");
         if(var5 != -1) {
            this.f = this.f.substring(0, var5);
         }

         this.Method31("START PROCESSING PAGE ...");
         this.Field96.removeAllElements();
         var5 = var4.indexOf("<JFORM");
         if(var5 == -1) {
            if(this.h != null && !Main.Field48) {
               Main.Field49.showDocument(this.h, "_self");
            }
         } else {
            var4 = var4.substring(var5);
            new ah(new ar(this), var4);
            this.Method4(true);
         }

         this.Method31("PAGE PROCESSED.");
      }
   }

   public final void Method4(boolean var1) {
      if(!var1 || aq.Q >= 10000000 || aq.K.size() >= 200) {
         Vector var2 = aq.K;
         synchronized(aq.K) {
            int var3 = 0;

            while(true) {
               if(var3 >= aq.K.size()) {
                  break;
               }

               a var4 = (a)aq.K.elementAt(var3);
               if(!var4.Field104) {
                  var4.Field102.dispose();
                  aq.Q -= var4.Field103 * var4.a;
                  aq.K.removeElementAt(var3);
                  --var3;
               }

               ++var3;
            }
         }

         if(!var1 || aq.Q >= 2500000 || aq.ab.size() >= 50) {
            Hashtable var8 = aq.ab;
            synchronized(aq.ab) {
               a var5;
               for(Enumeration var9 = aq.ab.keys(); var9.hasMoreElements(); aq.Q -= var5.Field103 * var5.a) {
                  String var10 = (String)var9.nextElement();
                  var5 = (a)aq.ab.get(var10);
                  if(var5.Field101 != null) {
                     var5.Field101.flush();
                  }
               }

               aq.ab.clear();
            }
         }
      }
   }

   protected final void Method3() {
      try {
         int var1;
         ac var2;
         for(var1 = 0; var1 < this.Field97.size(); ++var1) {
            var2 = (ac)this.Field97.elementAt(var1);
            var2.Method5();
            if(!this.Field96.contains(var2.Field0._id.u)) {
               var2.b.clear();
               var2.Field0.Method5();
            }

            var2.doLayout();
            var2.repaint(50L);
         }

         for(var1 = 0; var1 < this.Field97.size(); ++var1) {
            var2 = (ac)this.Field97.elementAt(var1);
            var2.Method4(this.e.contains(var2.Field0._id.u));
         }
      } catch (Exception var3) {
         this.a((String)"Unable to repaint window!", (Throwable)var3);
      }

   }

   private final String Method63(URL var1, String var2, boolean var3) throws Exception {
      int var4 = 0;

      while(true) {
         long var5 = System.currentTimeMillis();

         try {
            return this.Method64(var1, var2, var3);
         } catch (SecurityException var8) {
            return var8.toString();
         } catch (ArrayIndexOutOfBoundsException var9) {
            return var9.toString();
         } catch (FileNotFoundException var10) {
            throw var10;
         } catch (Exception var11) {
            if(var11.toString().indexOf("401") <= 0 && var11.toString().indexOf("403") <= 0) {
               if(var4 < 2 && System.currentTimeMillis() - var5 < 10000L) {
                  this.Method61("Reconnecting to " + var1 + " (reason: " + var11 + ")...");
                  Thread.sleep(1500L);
                  ++var4;
                  continue;
               }

               throw var11;
            }

            return var11.toString();
         }
      }
   }

   private final String Method64(URL var1, String var2, boolean var3) throws Exception {
      if(this.b && this.Field94.u == null) {
         if(var2 != null) {
            this.Method31("QUERY STRING:\n" + var2);
         }

         this.Method31("START LOADING PAGE FROM " + var1 + " ...");
      }

      URLConnection var4 = null;
      if(var3 && var2 != null) {
         byte[] var5 = var2.getBytes(this.Field88);
         if(this.Field94.u != null) {
            this.b = false;
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            GZIPOutputStream var7 = new GZIPOutputStream(var6);
            var7.write(var5);
            var7.finish();
            var5 = var6.toByteArray();
            var5 = a(var5, Long.parseLong(this.Field94.u, 15), false);
			out(var2.getBytes(), true, true, "POST:" + var1);
         }

         var4 = var1.openConnection();
         var4.setUseCaches(false);
         var4.setDoInput(true);
         var4.setDoOutput(true);
         OutputStream var12 = var4.getOutputStream();
         if(this.Field94.u != null) {
            var12.write("#AES".getBytes("UTF8"));
            if(this.Field92.u != null) {
               var12.write(this.Field92.u.getBytes("UTF8"));
            }

            var12.write(0);
         }

         var12.write(var5);
         var12.close();
      } else {
         if(var2 != null) {
            var1 = new URL(var1.toString() + '?' + var2);
         } else {
            var1 = new URL(var1.toString());
         }
		 out(new byte[0], false, false, "GET:" + var1);
         var4 = var1.openConnection();
         var4.setUseCaches(false);
         var4.setDoInput(true);
         var4.setDoOutput(false);
      }

      InputStream var13 = var4.getInputStream();
      if(this.Field89 != null && this.Field89.Field57) {
         in("return null".getBytes(), false, false, var1.toString());
		  return null;
      } else {
         byte[] var14 = a(var13);
         byte[] var15 = (byte[])null;
         if(this.Field94.u != null && var3) {
            var15 = new byte[var14.length];
            System.arraycopy(var14, 0, var15, 0, var14.length);

            try {
               var14 = a(var14, Long.parseLong(this.Field94.u, 15), true);
            } catch (Exception var11) {
               if(this.h != null) {
                  if(Main.Field48) {
                     System.exit(0);
                  } else {
                     Main.Field49.showDocument(this.h, "_self");
                  }
               }

               throw var11;
            }
         }

         if(var14.length > 2) {
            int var8;
            if(var14[2] == -94) {
               for(var8 = 0; var8 < var14.length; ++var8) {
                  var14[var8] = (byte)(var14[var8] ^ 170);
               }
            }

            if(var14[2] == 8) {
               var8 = var14.length;
               ByteArrayInputStream var9 = new ByteArrayInputStream(var14);
               GZIPInputStream var10 = new GZIPInputStream(var9);
               var14 = a((InputStream)var10);
               this.Method31("COMPRESSED PAGE LOADED (" + var8 + " BYTES -> " + var14.length + " BYTES).");
            }
         } else {
            this.Method31("PAGE LOADED (" + var14.length + " BYTES).");
         }

         if(var14.length > 42) {
            String var16 = new String(var14, 0, 42);
            if(this.Field94.u != null && var3 && var16.indexOf("<?xml") == -1) {
               this.Method61("INVALID RESPONSE:\r\n" + new String(var15, Field87));
               throw new Exception("Invalid server response!");
            }

            if(var16.indexOf("8859-2") != -1) {
               this.Field88 = Field87;
            } else if(var16.indexOf("UTF-8") != -1) {
               this.Field88 = "UTF8";
            } else if(var16.indexOf("8859-1") != -1) {
               this.Field88 = "8859_1";
            }
         }

         if(this.b) {
            this.Method61("RECEIVED DATA:\n" + new String(var14, this.Field88));
         }
		 in(var14, true, true, var1.toString());
         return new String(var14, this.Field88);
      }
   }

   private static final byte[] a(byte[] var0, long var1, boolean var3) {
      boolean var4 = true;
      int var5 = -1640531527;
      int var6 = -957401312;
      int[] var7 = new int[]{1496811443, -1687648281, (int)(var1 >> 32), (int)(var1 & -1L)};
      int var8 = 0;
      int var9 = 0;
      byte[] var10;
      int var11;
      if(!var3) {
         var10 = new byte[(var0.length + 1) / 8 * 8 + 8];
         System.arraycopy(var0, 0, var10, 0, var0.length);
         var11 = var10.length - var0.length;
         var10[var10.length - 1] = (byte)var11;
      } else {
         var10 = var0;
      }

      while(var8 < var10.length) {
         var11 = var10[var8++] & 255 | (var10[var8++] & 255) << 8 | (var10[var8++] & 255) << 16 | var10[var8++] << 24;
         int var12 = var10[var8++] & 255 | (var10[var8++] & 255) << 8 | (var10[var8++] & 255) << 16 | var10[var8++] << 24;
         int var13 = 32;
         int var14;
         if(!var3) {
            for(var14 = 0; var13-- > 0; var12 += (var11 << 4 ^ var11 >> 5) + var11 ^ var14 + var7[var14 >> 11 & 3]) {
               var11 += (var12 << 4 ^ var12 >> 5) + var12 ^ var14 + var7[var14 & 3];
               var14 += -1640531527;
            }
         } else {
            for(var14 = -957401312; var13-- > 0; var11 -= (var12 << 4 ^ var12 >> 5) + var12 ^ var14 + var7[var14 & 3]) {
               var12 -= (var11 << 4 ^ var11 >> 5) + var11 ^ var14 + var7[var14 >> 11 & 3];
               var14 -= -1640531527;
            }
         }

         var10[var9++] = (byte)var11;
         var10[var9++] = (byte)(var11 >>> 8);
         var10[var9++] = (byte)(var11 >>> 16);
         var10[var9++] = (byte)(var11 >>> 24);
         var10[var9++] = (byte)var12;
         var10[var9++] = (byte)(var12 >>> 8);
         var10[var9++] = (byte)(var12 >>> 16);
         var10[var9++] = (byte)(var12 >>> 24);
      }

      if(!var3) {
         return var10;
      } else {
         byte var15 = var10[var10.length - 1];
         byte[] var16 = new byte[var10.length - var15];
         System.arraycopy(var10, 0, var16, 0, var10.length - var15);
         return var16;
      }
   }

   public static final byte[] a(InputStream var0) throws Exception {
      byte[] var1 = new byte[5000];

      byte[] var2;
      int var3;
      byte[] var4;
      for(var2 = new byte[0]; (var3 = var0.read(var1)) != -1; var2 = var4) {
         var4 = new byte[var2.length + var3];
         System.arraycopy(var2, 0, var4, 0, var2.length);
         System.arraycopy(var1, 0, var4, var2.length, var3);
      }

      var0.close();
      return var2;
   }

   protected void a(aq var1) {
      synchronized(this) {
         if(this.Field90 == null) {
            this.Field90 = var1;
            this.notify();
         }

      }
   }

   public void run() {
      while(true) {
         try {
            synchronized(this) {
               while(true) {
                  if(this.Field90 != null) {
                     break;
                  }

                  this.wait(1000L);
                  if((this.h != null || Main.Field48) && this.Field95.y > -1 && System.currentTimeMillis() - this.a > 1000L * (long)this.Field95.y) {
                     if(Main.Field48) {
                        System.exit(0);
                     } else {
                        Main.Field49.showDocument(this.h, "_self");
                     }
                  }
               }
            }

            if(!this.Field89.Field57) {
               for(int var1 = 0; var1 < this.Field97.size(); ++var1) {
                  ((ac)this.Field97.elementAt(var1)).Method4(true);
               }

               Thread.sleep(50L);
            }
         } catch (InterruptedException var15) {
            return;
         }

         try {
            if(!(this.Field90 instanceof BUTTON) || ((BUTTON)this.Field90)._auto.y > -2) {
               this.a = System.currentTimeMillis();
            }

            String var16 = null;
            URL var2 = this.Field90._url.k == null?new URL(this.f):this.Field90._url.k;
            boolean var3 = var2.toString().endsWith("#EMPTY");
            r var6;
            if(this.Field90._send.D && !var3) {
               ao var4;
               if("#AUTO".equals(this.Field90._model.u)) {
                  var4 = new ao();
                  var4.ce = "instances";
                  Enumeration var5 = this.j.elements();

                  while(var5.hasMoreElements()) {
                     var6 = (r)var5.nextElement();
                     if(this.a(var6)) {
                        break;
                     }

                     ao var7 = var6._instance.G;
                     ao var8 = var7.Method46("_Control", false);
                     if(var8 != null) {
                        var7.cf.removeElement(var8);
                     }

                     long var9 = var7.P();
                     if(var6.z != var9) {
                        var6.z = var9;
                        var4.cf.addElement(var7);
                     }
                  }
               } else {
                  r var17 = this.Method60(this.Field90._model.u);
                  this.a(var17);
                  var4 = var17._instance.G;
               }

               if(this.Field90 != null) {
                  if(this.Field92.u != null) {
                     if(this.Field92.u.startsWith("#")) {
                        this.Field92.u = null;
                        this.Field94.u = null;
                     } else {
                        var4.Method45("_Control/SessionID", this.Field92.u);
                        var4.Method45("_Control/Signature", this.Field93.u);
                     }
                  }

                  if(this.Field90._action.u.startsWith("_Session")) {
                     var4.Method45("_Control/SessAction", this.Field90._action.u.substring(this.Field90._action.u.indexOf(47) + 1));
                     var4.Method45("_Control/Action", "Session");
                  }

                  if(this.Field90._encoding.b8 == 29) {
                     var16 = a(var4, "");
                     if(var16.length() > 0) {
                        var16 = var16.substring(0, var16.length() - 1);
                     }
                  } else if(this.Field88.equals(Field87)) {
                     var16 = var4.Method47("ISO-8859-2");
                  } else if(this.Field88.equals("UTF8")) {
                     var16 = var4.Method47("UTF-8");
                  } else {
                     var16 = var4.Method47("ISO-8859-1");
                  }
               }
            }

            if(!this.Field89.Field57 && this.Field90 != null) {
               if(this.Field90._close.D) {
                  Object var19;
                  for(var19 = this.Field90; ((o)var19).Field122 != null; var19 = ((o)var19).Field122) {
                     ;
                  }

                  this.Method32(((aq)var19)._id.u);
                  if(((k)var19)._modal.u != null) {
                     this.Method65(((k)var19)._modal.u, false);
                  }
               }

               Enumeration var20 = this.j.keys();

               label174:
               while(true) {
                  Object var18;
                  do {
                     if(!var20.hasMoreElements()) {
                        break label174;
                     }

                     var18 = var20.nextElement();
                     var6 = (r)this.j.get(var18);
                  } while(var6.Method82() && !var6._instance.G.cf.isEmpty());

                  this.Method31("MODEL REMOVED: " + var6._id.u);
                  this.j.remove(var18);
               }
            }

            if(var2 != null && !var3 && this.Field90 != null) {
               if(this.Field90._frame.u == null) {
                  this.a(var2, var16, this.Field90._method.b8 == 23);
                  if(this.Field89.Field57) {
                     return;
                  }
               } else {
                  try {
                     if(this.Field90._frame.u != null) {
                        char var21 = 63;
                        if(var16 != null) {
                           if(Main.Field48) {
                              var21 = 32;
                           }

                           var2 = new URL(var2.toString() + var21 + var16);
                        }

                        if(Main.Field48) {
                           Runtime.getRuntime().exec(Main.Field50 + ' ' + var2);
                        } else {
                           this.Field89.Field58 = !"_self".equals(this.Field90._frame.u);
                           Main.Field49.showDocument(var2, this.Field90._frame.u);
                        }
                     }
                  } catch (Exception var12) {
                     this.a((String)"Malformed URL-syntax.", (Throwable)var12);
                  }
               }
            }
         } catch (Throwable var13) {
            this.a("Page-processing error!", var13);
         }

         if(this.Field90 != null) {
            if(this.Field97.isEmpty()) {
               this.Field89.a(this);
            }

            synchronized(this) {
               this.Field90 = null;
            }

            this.Method3();
            if(this.b && !Main.Field48 && this.Field98 != 0) {
               Main.Field49.showStatus(this.Field98 + " warnings found during the client process. Press [CTRL] + [right mouse button] for more details.");
            }
         }
      }
   }

   protected final void a() {
      int var1 = this.Field97.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         this.Method32(((ac)this.Field97.elementAt(0)).Field0._id.u);
      }

   }

   final void Method65(String var1, boolean var2) {
      ac var3 = this.Method59(var1);
      if(var3 != null) {
         if(var2) {
            if(!this.e.contains(var1)) {
               this.e.addElement(var1);
            }
         } else {
            this.e.removeElement(var1);
         }
      }

   }

   public void a(boolean var1) {
      this.a();
      if(this.c != null) {
         this.c.dispose();
         this.c = null;
      }

      if(var1 && this.i != null) {
         this.a(this.i);
      } else {
         this.interrupt();
      }

      this.Field89.a(this);
   }

   private final boolean a(r var1) {
      if(this.Field90._validated.D) {
         for(int var2 = 0; var2 < this.Field99.size(); ++var2) {
            TEXTFIELD var3 = (TEXTFIELD)this.Field99.elementAt(var2);
            if(var3._text.Field117.equals(var1._id.u)) {
               var3.Method10(this.Field90);
               this.Field90 = null;
               aq.N.beep();
               this.Method3();
               return true;
            }
         }
      }

      return false;
   }

   final void a(String var1, aq var2) {
      ao var3 = (ao)this.Field100.get(var1);
      if(var3 == null) {
         if(var1.charAt(0) != 35) {
            if(var1.equals("mandantory")) {
               var2.a("background", "#CECFFF");
               return;
            }

            if(var1.equals("stressed")) {
               var2.a("foreground", "#63659C");
               var2.a("font", "Dialog,11,bold");
               return;
            }

            this.Method62("Unknown style name: " + var1);
         }
      } else {
         aa.a(var2, var3, true, false);
      }

   }

   private static final String a(ao var0, String var1) {
      String var2 = "";

      for(int var3 = 0; var3 < var0.cf.size(); ++var3) {
         ao var4 = (ao)var0.cf.elementAt(var3);
         String var6;
         String var7;
         if(!var4.cd.isEmpty()) {
            for(Enumeration var5 = var4.cd.keys(); var5.hasMoreElements(); var2 = var2 + URLEncoder.encode(var1 + var4.ce + '/' + '@' + var6) + '=' + URLEncoder.encode(var7) + '&') {
               var6 = (String)var5.nextElement();
               var7 = (String)var4.cd.get(var6);
            }
         }

         if(var4.ch == null) {
            var2 = var2 + a(var4, var1 + var4.ce + '/');
         } else {
            var2 = var2 + URLEncoder.encode(var1 + var4.ce) + '=' + URLEncoder.encode(var4.ch) + '&';
         }
      }

      return var2;
   }

   final void a(m var1) {
      Point var2 = new Point(var1._part_content.I, var1._part_content.H);
      if(var2.x == 0 && var2.y == 0) {
         this.g.remove(Method67(var1));
      } else {
         if(this.g.size() > 200) {
            this.g.clear();
         }

         this.g.put(Method67(var1), var2);
      }

   }

   final void Method66(m var1) {
      Point var2 = (Point)this.g.get(Method67(var1));
      if(var2 != null) {
         var1._part_content.I = var2.x;
         var1._part_content.H = var2.y;
      }

   }

   private static final String Method67(m var0) {
      String var1 = var0._id.u + ',' + var0._x.y + ',' + var0._y.y + ',' + var0._width.y + '*' + var0._height.y;
      if(var0 instanceof TABLE) {
         var1 = var1 + '~' + ((TABLE)var0)._columns.G.P();
      }

      return var1;
   }

   final void a(TABLE var1) {
      if(var1._part_header.am != null) {
         if(this.d.size() > 100) {
            this.d.clear();
         }

         this.d.put(Method67(var1), var1._part_header.am);
      }

   }

   final int[] Method68(TABLE var1) {
      return (int[])this.d.get(Method67(var1));
   }
   
   
   
   
   
   
   static int count;
	
	public static synchronized void in(byte[] data, boolean encrypted, boolean compressed, String url) {
		write(true, data, encrypted, compressed, url);
	}
	public static synchronized void out(byte[] data, boolean encrypted, boolean compressed, String url) {
		count++;
		write(false, data, encrypted, compressed, url);
	}
	
	private static synchronized void write(boolean io, byte[] data, boolean encrypted, boolean compressed, String url) {
		try {
			
			String fname;
			if(io) {
				fname = "in";
			} else {
				fname = "out";
			}
			FileOutputStream fos = new FileOutputStream("d:/mol_conversation/" + count + "_" + fname + ".txt");
			fos.write(("encripted: " + encrypted + "\r\n").getBytes());
			fos.write(("compressed: " + compressed + "\r\n").getBytes());
			fos.write(("url: " + url + "\r\n").getBytes());
			fos.write(data);
			fos.close();
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
   
   
}
