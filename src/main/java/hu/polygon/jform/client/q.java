package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;

public final class q extends o {
   public int y;

   public q(o var1, Session var2, int var3) {
      super(var1, var2);
      this.y = var3;
   }

   public final void Method31(String var1) {
      try {
         this.y = Integer.parseInt(var1);
      } catch (Exception var3) {
         super.Field123.Method62("Invalid integer:" + var1);
      }

   }
}
