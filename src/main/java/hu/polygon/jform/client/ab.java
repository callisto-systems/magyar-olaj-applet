package hu.polygon.jform.client;

import hu.polygon.jform.client.am;
import java.awt.FontMetrics;
import java.util.Vector;

final class ab {
   final Vector a = new Vector(10);
   final FontMetrics Field14;

   ab(FontMetrics var1) {
      this.Field14 = var1;
   }

   final void a(String var1, boolean var2, boolean var3) {
      am var4 = new am(this.Field14, var1, var2, var3);
      if(!this.a.isEmpty()) {
         am var5 = (am)this.a.elementAt(this.a.size() - 1);
         var4.Field65 = var5.Field65 + var5.Field62;
         if(var5.Field63) {
            ++var4.Field65;
         }
      }

      this.a.addElement(var4);
   }
}
