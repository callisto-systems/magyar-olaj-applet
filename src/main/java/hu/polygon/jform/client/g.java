package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;
import java.awt.Color;

public final class g extends o {
   public static final Color r = new Color(230, 230, 230);
   public static final Color q = new Color(210, 210, 210);
   public static final Color p = new Color(168, 186, 203);
   public static final Color t = new Color(255, 255, 225);
   public Color s;

   public g(o var1, Session var2, Color var3) {
      super(var1, var2);
      this.s = var3;
   }

   public final void Method31(String var1) {
      this.s = a(var1, this.s, super.Field123);
   }

   static final Color a(String var0, Color var1, Session var2) {
      try {
         int var3 = (Integer.parseInt(var0.substring(1, 3), 16) & 255) << 16 | (Integer.parseInt(var0.substring(3, 5), 16) & 255) << 8 | Integer.parseInt(var0.substring(5, 7), 16) & 255;
         return new Color(var3);
      } catch (Exception var4) {
         var2.Method62("Invalid color:" + var0);
         return var1;
      }
   }
}
