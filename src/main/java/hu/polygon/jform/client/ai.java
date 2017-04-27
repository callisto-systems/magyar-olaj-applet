package hu.polygon.jform.client;

import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.aj;
import hu.polygon.jform.client.aq;

public final class ai implements Runnable {
   private ac Field71;
   private aj Field72;
   private int a = -1;
   private boolean Field73;
   private static int Field74 = 0;

   public final void run() {
      ++this.a;
      if(this.a == 6) {
         Main.Field59.a(this);
         this.Field71.Method10(this.Field72);
      }

   }

   public final void a(ac var1, String var2, String var3, boolean var4) {
      if(this.Field72 != null) {
         this.Field72.Method2();
      }

      this.Field71 = var1;
      this.a = var4?5:0;
      this.Field72 = new aj(var1.Field0.Field123);
      this.Field72.ad = "#HINT";
      this.Field72._text.u = var3;
      if(var2 != null) {
         if(var2.length() == 1) {
            var2 = "[alt+" + var2 + "]";
         } else {
            var2 = "[" + var2.substring(1).replace('_', ' ') + "]";
         }
      }

      this.Field72.bL = var2;
      this.Field72.af = this.Field72._x.y = var1.e;
      this.Field72.ae = this.Field72._y.y = var1.d + 20;
      this.Field72.a(var1);
      this.Field72.Field122 = var1.Field0;
      this.Field72.Method35();
      this.Field73 = var4;
      Main.Field59.Method87(this);
   }

   final void a(ac var1) {
      if(this.Field72 != null && this.a != 6 && !this.Field73) {
         this.Field72.af = this.Field71.e;
         this.Field72.ae = this.Field71.d + 20;
      }

   }

   public final void a(ac var1, boolean var2) {
      if(this.Field72 != null && this.a != -1 && (!this.Field73 || var2)) {
         var1.a((aq)this.Field72, (aq)this.Field72);
         Main.Field59.a(this);
         this.a = 6;
      }

   }
}
