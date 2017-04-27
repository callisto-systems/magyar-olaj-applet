package hu.polygon.jform.client;

import hu.polygon.jform.client.PANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.aa;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.r;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Vector;

public abstract class o extends f {
   protected String Field116;
   protected String Field117 = "";
   private boolean Field118;
   protected boolean Field119 = true;
   protected boolean Field120;
   public String Field121;
   protected o Field122;
   protected final Session Field123;
   protected final Vector Field124 = new Vector();

   public o(o var1, Session var2) {
      this.Field122 = var1;
      this.Field123 = var2;
   }

   public f a(String var1) {
      try {
         return (f)this.getClass().getField('_' + var1.replace('-', '_')).get(this);
      } catch (Exception var4) {
         String var3 = this.toString();
         var3 = var3.substring(var3.lastIndexOf(46) + 1);
         this.Field123.Method62("Unknown \"" + var1 + "\" property in the " + var3 + " object.");
         return new f();
      }
   }

   public final void a(String var1, String var2) {
      if(var1.equals("ref")) {
         this.Field116 = var2;
      } else if(var1.equals("model")) {
         this.Field117 = var2;
      } else if(var1.equals("href")) {
         this.Field121 = var2;
      } else if(var1.equals("cached")) {
         this.Field119 = var2.equals("true");
      } else {
         f var3 = this.a(var1);
         var3.Method31(var2);
         var3.a();
      }

   }

   public void Method31(String var1) {
   }

   public final void a() {
      ao var2;
      if(this.Field116 != null && !this.Field118) {
         this.Field118 = true;
         r var3 = this.Field123.Method60(this.Field117);
         var2 = var3._instance.G.Method46(this.Field116, false);
         this.Method6();
         if(var2 != null) {
            aa.a(this, var2, true, true);
         }
      } else if(this.Field121 != null && !this.Field120) {
         af var1 = null;
         if(this instanceof PANEL) {
            var1 = (af)this;
            if(var1.aA.isEmpty()) {
               var1 = null;
            } else {
               var1.Method2();
               var1.aA.removeAllElements();
               this.Field124.removeAllElements();
            }
         }

         this.Field120 = true;
         var2 = this.Field123.a(this.Field121, this.Field119);
         if(var2 != null) {
            aa.a(this, var2, false, false);
            if(var1 != null) {
               var1.a(var1.T);
            }

            return;
         }
      } else {
         this.Method3();
      }

   }

   public void Method3() {
   }

   private final void Method6() {
      if(this.Field122 != null && !this.Field122.Field124.contains(this)) {
         this.Field122.Field124.addElement(this);
         this.Field122.Method6();
      }

   }

   public void Method5() {
      if(this.Field118 || this.Field120) {
         this.Field118 = this.Field120 = false;
         this.a();
      }

      for(int var1 = 0; var1 < this.Field124.size(); ++var1) {
         ((o)this.Field124.elementAt(var1)).Method5();
      }

   }

   protected final ao Method85() {
      return this.Field118?this.Field123.Method60(this.Field117)._instance.G.Method46(this.Field116, true):null;
   }

   protected final void Method32(String var1) {
      if(this.Field118) {
         this.Method85().ch = var1;
      }

   }

   public final Object clone() {
      try {
         Object var1 = super.clone();
         Field[] var2 = this.getClass().getFields();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Field var4 = var2[var3];
            if(var4.getName().charAt(0) == 95 && !Modifier.isFinal(var4.getModifiers()) && var4.get(var1) != null) {
               var4.set(var1, ((o)var4.get(var1)).clone());
            }
         }

         return var1;
      } catch (Exception var5) {
         return null;
      }
   }
}
