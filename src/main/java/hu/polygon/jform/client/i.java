package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;
import java.io.CharArrayWriter;

public final class i extends o {
   public String u;

   public i(o var1, Session var2, String var3) {
      super(var1, var2);
      this.u = var3;
   }

   public final void Method31(String var1) {
      if(var1 == null) {
         this.u = null;
      } else if(var1.indexOf(13) == -1 && var1.indexOf(9) == -1) {
         if(var1.equals("#NULL")) {
            this.u = null;
         } else {
            this.u = var1;
         }
      } else {
         int var2 = var1.length();
         CharArrayWriter var3 = new CharArrayWriter(var2);

         for(int var4 = 0; var4 < var2; ++var4) {
            char var5 = var1.charAt(var4);
            if(var5 == 9) {
               var3.write(32);
            } else if(var5 != 13) {
               var3.write(var5);
            }
         }

         this.u = var3.toString();
      }

   }
}
