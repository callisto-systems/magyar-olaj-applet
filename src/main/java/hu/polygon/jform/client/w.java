package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;
import java.awt.Font;
import java.util.StringTokenizer;

public final class w extends o {
   public static final Font B = new Font("Dialog", 0, 11);
   public Font C;

   public w(o var1, Session var2) {
      super(var1, var2);
      this.C = B;
   }

   public final void Method31(String var1) {
      try {
         StringTokenizer var2 = new StringTokenizer(var1, ",\n \t");
         String var3 = var2.nextToken();
         int var4 = Integer.parseInt(var2.nextToken());
         String var5 = var2.nextToken();
         byte var6 = 0;
         if(var5.equals("bold")) {
            var6 = 1;
         } else if(var5.equals("italic")) {
            var6 = 2;
         } else if(var5.equals("italicbold")) {
            var6 = 3;
         }

         this.C = new Font(var3, var6, var4);
      } catch (Exception var7) {
         super.Field123.Method62("Invalid font:" + var1);
      }

   }
}
