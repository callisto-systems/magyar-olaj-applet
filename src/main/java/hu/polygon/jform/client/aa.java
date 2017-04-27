package hu.polygon.jform.client;

import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.f;
import java.util.Enumeration;

final class aa {
   public static final void a(f var0, ao var1, boolean var2, boolean var3) {
      if(!var1.cd.isEmpty()) {
         Enumeration var4 = var1.cd.keys();

         while(var4.hasMoreElements()) {
            String var5 = (String)var4.nextElement();
            var0.a(var5, (String)var1.cd.get(var5));
         }
      }

      if(!var1.cf.isEmpty()) {
         for(int var7 = 0; var7 < var1.cf.size(); ++var7) {
            ao var8 = (ao)var1.cf.elementAt(var7);
            if(var2) {
               f var6 = var0.a(var8.ce);
               a(var6, var8, true, true);
            } else {
               a(var0, var8, true, true);
            }
         }
      }

      if(var1.ch != null) {
         var0.Method31(var1.ch);
      }

      if(var3) {
         var0.a();
      }

   }
}
