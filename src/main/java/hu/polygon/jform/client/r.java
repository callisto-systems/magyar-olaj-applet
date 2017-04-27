package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ap;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.o;
import hu.polygon.jform.client.y;

public final class r extends o {
   public final i _id;
   public final ap _instance;
   public final y _cached;
   long z;

   public r(Session var1) {
      super((o)null, var1);
      this._instance = new ap(this, var1);
      this._id = new i((o)null, var1, "");
      this._cached = new y((o)null, var1, false);
      super.Field119 = false;
   }

   public final void Method3() {
      this._instance.G.cd.put("id", this._id.u);
      this.z = this._instance.G.P();
      super.Field123.j.put(this._id.u, this);
   }

   public final boolean Method82() {
      return super.Field119 || this._cached.D;
   }
}
