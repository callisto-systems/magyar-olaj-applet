package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ae;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.o;
import java.util.Vector;

public final class p extends o {
   public final Vector w = new Vector();
   public final Vector v = new Vector();
   private final ae x = new ae(this);

   public p(o var1, Session var2) {
      super(var1, var2);
   }

   public final f a(String var1) {
      this.x.cc.u = null;
      this.x.b9.u = "";
      this.x.ca = var1;
      return this.x;
   }

   public final void Method5() {
      this.w.removeAllElements();
      this.v.removeAllElements();
      super.Method5();
   }

   public final void Method31(String var1) {
      this.w.addElement(var1);
      this.v.addElement(var1);
   }

   public final int[] a(Vector var1) {
      Vector var2 = new Vector();

      for(int var3 = 0; var3 < var1.size(); ++var3) {
         String var4 = (String)var1.elementAt(var3);
         int var5 = this.w.indexOf(var4);
         if(var5 != -1) {
            var2.addElement(new Integer(var5));
         }
      }

      int[] var6 = new int[var2.size()];

      for(int var7 = 0; var7 < var2.size(); ++var7) {
         var6[var7] = ((Integer)var2.elementAt(var7)).intValue();
      }

      return var6;
   }
}
