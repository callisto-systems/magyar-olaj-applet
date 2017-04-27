package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;

public final class y extends o {
   public boolean D;

   public y(o var1, Session var2, boolean var3) {
      super(var1, var2);
      this.D = var3;
   }

   public final void Method31(String var1) {
      if(var1.equals("true")) {
         this.D = true;
      } else if(var1.equals("false")) {
         this.D = false;
      } else {
         super.Field123.Method62("Invalid boolean:" + var1);
      }

   }
}
