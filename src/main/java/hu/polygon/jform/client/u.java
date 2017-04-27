package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.af;
import java.util.Vector;

public final class u {
   final Vector Field125 = new Vector();
   af a;

   final void a(BUTTON var1) {
      var1.Method80(true);
      var1.a(false, false);

      for(int var2 = 0; var2 < this.Field125.size(); ++var2) {
         BUTTON var3 = (BUTTON)this.Field125.elementAt(var2);
         if(var3 != var1 && var3.w()) {
            var3.M = false;
            var3.Method80(false);
            var3.a(false, false);
         }
      }

      if(this.a.Y != null) {
         this.a.Method40(false, false);
         this.a.Method38();
         var1.T.Field2 = this.a;
         this.a.a(true);
      }

   }

   final void a(boolean var1) {
      for(int var2 = 0; var2 < this.Field125.size(); ++var2) {
         BUTTON var3 = (BUTTON)this.Field125.elementAt(var2);
         if(var3.w()) {
            var3.M = false;
            var3.Method80(false);
            if(var1) {
               var3.a(false, false);
               var3.a(false);
            }
         }
      }

   }
}
