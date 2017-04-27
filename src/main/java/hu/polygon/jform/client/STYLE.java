package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.ap;
import hu.polygon.jform.client.o;

public final class STYLE extends ap {
   public STYLE(Session var1) {
      super((o)null, var1);
   }

   public final void Method3() {
      ao var1 = super.G.Method46("id", false);
      if(var1 != null && var1.ch.length() != 0) {
         if(super.G.cf.isEmpty()) {
            super.Field123.Field100.remove(var1.ch);
         } else {
            super.G.cf.removeElement(var1);
            super.Field123.Field100.put(var1.ch, super.G);
         }
      } else if(super.G.cf.isEmpty()) {
         super.Field123.Field100.clear();
      } else {
         super.Field123.Method62("Missing \"id\" attribute in the \"STYLE\" element!");
      }

   }
}
