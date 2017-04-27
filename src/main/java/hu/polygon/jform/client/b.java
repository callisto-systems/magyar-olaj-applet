package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.f;
import java.lang.reflect.Constructor;

public final class b extends f {
   private static final Class[] ck = new Class[1];
   private final Session[] cj = new Session[1];
   final af ci;

   static {
      ck[0] = Session.class;
   }

   public b(Session var1, af var2) {
      this.cj[0] = var1;
      this.ci = var2;
   }

   public final f a(String var1) {
      try {
         Constructor var2 = Class.forName("hu.polygon.jform.client." + var1).getConstructor(ck);
         aq var3 = (aq)var2.newInstance(this.cj);
         this.ci.a(var3);
         return var3;
      } catch (Throwable var4) {
         this.cj[0].a("Unknown component: " + var1, var4);
         return new f();
      }
   }
}
