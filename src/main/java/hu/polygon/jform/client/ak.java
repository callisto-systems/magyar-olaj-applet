package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;
import java.util.StringTokenizer;
import java.util.Vector;

public final class ak extends o {
   public final int E;
   public String[] F;

   public ak(o var1, Session var2, String[] var3, int var4) {
      super(var1, var2);
      this.F = var3;
      this.E = var4;
   }

   public final void Method31(String var1) {
      StringTokenizer var2 = new StringTokenizer(var1, ",");
      Vector var3 = new Vector();

      while(var2.hasMoreTokens()) {
         var3.addElement(var2.nextToken());
      }

      if(var3.size() < this.E) {
         super.Field123.Method62("Too few tokens:" + var3);
      } else {
         this.F = new String[var3.size()];
         var3.copyInto(this.F);
      }

   }
}
