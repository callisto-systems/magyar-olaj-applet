package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.b;
import hu.polygon.jform.client.f;
import java.util.Vector;

public class af extends aq {
   public b _content;
   public final Vector aA = new Vector();

   public af(Session var1) {
      super(var1);
      super.S = true;
   }

   public void a(ac var1) {
      super.a(var1);

      for(int var2 = 0; var2 < this.aA.size(); ++var2) {
         ((aq)this.aA.elementAt(var2)).a(var1);
      }

   }

   public void a(aq var1) {
      if(var1.ad != null && !super.Field123.Field100.isEmpty()) {
         super.Field123.a(var1.ad, var1);
      }

      this.aA.addElement(var1);
      var1.a(this);
   }

   protected final f a(String var1, aq var2) {
      if(var1.equals("part-menu")) {
         return var2.a(var1);
      } else {
         if(!var1.equals("id") && !var1.equals("x") && !var1.equals("y") && !var1.equals("width") && !var1.equals("height") && !var1.startsWith("part") && !var1.endsWith("fixing") && !var1.startsWith("content") && !var1.startsWith("style") && !var1.equals("visible") && !var1.equals("index")) {
            try {
               return (f)var2.getClass().getField('_' + var1.replace('-', '_')).get(var2);
            } catch (Exception var4) {
               ;
            }
         }

         return super.a(var1);
      }
   }

   public void Method40(boolean var1, boolean var2) {
      if(super.Y != null && super.Y.Field102 != null) {
         for(int var3 = 0; var3 < this.aA.size(); ++var3) {
            aq var4 = (aq)this.aA.elementAt(var3);
            if(var4._visible.D && var4.Y != null) {
               if(var1) {
                  if(var2) {
                     var4.a(true, true);
                  } else if(var4._transparent.D) {
                     var4.a(true, false);
                  }
               }

               int var5 = var4.af - super.I;
               int var6 = var4.ae - super.H;
               if(var5 + var4.O > 0 && var6 + var4.J > 0 && var5 < super.O && var6 < super.J) {
                  super.Y.Field102.drawImage(var4.Y.Field101, var5, var6, super.T);
               }
            }
         }
      }

   }

   public final boolean Method39() {
      boolean var1 = super.Method39();
      if(super.Z != null && var1) {
         super.Z.Field102.drawImage(super.Y.Field101, 0, 0, super.T);
      }

      return var1;
   }

   public void Method2() {
      super.Method2();

      for(int var1 = 0; var1 < this.aA.size(); ++var1) {
         ((aq)this.aA.elementAt(var1)).Method2();
      }

   }

   public void Method0() {
      for(int var1 = 0; var1 < this.aA.size(); ++var1) {
         ((aq)this.aA.elementAt(var1)).Method35();
      }

   }

   public void Method4(boolean var1) {
      super.Method4(var1);
      if(var1) {
         for(int var2 = 0; var2 < this.aA.size(); ++var2) {
            ((aq)this.aA.elementAt(var2)).Method4(var1);
         }
      }

   }

   public final void Method34(boolean var1) {
      super.Method34(var1);

      for(int var2 = 0; var2 < this.aA.size(); ++var2) {
         ((aq)this.aA.elementAt(var2)).Method34(true);
      }

   }
}
