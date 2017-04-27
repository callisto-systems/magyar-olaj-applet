package hu.polygon.jform.client;

import hu.polygon.jform.client.al;
import java.awt.FontMetrics;
import java.util.StringTokenizer;
import java.util.Vector;

final class am {
   final String Field60;
   final Vector Field61 = new Vector();
   final int Field62;
   final boolean Field63;
   int Field64;
   int Field65;
   int a;
   int Field66;

   am(FontMetrics var1, String var2, boolean var3, boolean var4) {
      this.Field60 = var2;
      this.Field62 = var2.length();
      this.Field63 = var4;
      if(var3) {
         this.Field64 = 0;

         al var6;
         for(StringTokenizer var5 = new StringTokenizer(var2, " ", true); var5.hasMoreTokens(); this.Field64 += var6.Field69) {
            var6 = new al(var1, var5.nextToken());
            this.Field61.addElement(var6);
         }
      } else {
         this.Field64 = var1.stringWidth(var2);
      }

   }
}
