package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.o;
import hu.polygon.jform.client.p;

public final class ae extends f {
   public final i cc = new i((o)null, (Session)null, (String)null);
   public final i b9 = new i((o)null, (Session)null, (String)null);
   private final p cb;
   public String ca;

   public ae(p var1) {
      this.cb = var1;
   }

   public final f a(String var1) {
      return (f)(!var1.equals("data") && !var1.equals("value")?(!var1.equals("text") && !var1.equals("caption")?new f():this.b9):this.cc);
   }

   public final void Method31(String var1) {
      this.b9.u = var1;
   }

   public final void a(String var1, String var2) {
      if(!var1.equals("data") && !var1.equals("value")) {
         if(var1.equals("text") || var1.equals("caption")) {
            this.b9.u = var2;
         }
      } else {
         this.cc.u = var2;
      }

   }

   public final void a() {
      if(this.cc.u == null) {
         this.cc.u = this.ca.equals("item")?this.b9.u:this.ca;
      }

      this.cb.v.addElement(this.b9.u);
      this.cb.w.addElement(this.cc.u);
   }
}
