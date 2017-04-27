package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.o;
import hu.polygon.jform.client.y;

public final class j extends o {
   public final i _base;
   public final i _url;
   public final i _destroy_action;
   public final i _destroy_url;
   public final i _destroy_encoding;
   public final y _debug;
   public final y _console;
   public final i _error_url;

   public j(Session var1) {
      super((o)null, var1);
      this._base = new i(this, var1, (String)null);
      this._url = new i(this, var1, (String)null);
      this._debug = new y(this, var1, false);
      this._console = new y(this, var1, true);
      this._destroy_action = new i(this, var1, (String)null);
      this._destroy_url = new i(this, var1, (String)null);
      this._destroy_encoding = new i(this, var1, "xml");
      this._error_url = new i(this, var1, (String)null);
   }

   public final void Method3() {
      super.Field123.Field89.a(this._base.u == null?super.Field123.f:this._base.u, this._url.u, this._destroy_action.u, this._destroy_url.u, this._destroy_encoding.u, this._debug.D, this._console.D, this._error_url.u);
   }
}
