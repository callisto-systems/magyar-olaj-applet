package hu.polygon.jform.client;

import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.PANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.av;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.y;

public final class k extends PANEL {
   public final i _modal;
   public final y _resizable;
   public final c _icon;
   public final i _title;
   public final av _mode;
   public final i _focus_owner;

   public k(Session var1) {
      super(var1);
      this._modal = new i(this, var1, (String)null);
      this._resizable = new y(this, var1, false);
      this._title = new i(this, var1, "");
      this._icon = new c(this, var1, c.i);
      this._mode = new av(this, var1, (byte)27);
      this._focus_owner = new i(this, var1, "");
      super._x.y = -1;
      super._y.y = -1;
      super._width.y = -1;
      super._height.y = -1;
      super._border.b8 = 7;
      super._validated.D = false;
      super.ad = "#WINDOW";
      super.Field123.a((String)super.ad, (aq)this);
   }

   public final void Method3() {
      if(Main.Field51) {
         super._id.u = "window";
         this._modal.u = null;
      }

      ac var1 = super.Field123.a(super._id.u, this);
      if(var1 != super.T) {
         this.a(var1);
      }

      if(var1.Field11 || this._mode.b8 != 25) {
         this.o();
      }

   }

   public final void Method5() {
      if(!super.Field124.isEmpty()) {
         super.Method5();
         this.o();
      }

   }

   private final void o() {
      if(this._focus_owner.u.length() == 0) {
         if(super.T.Field10 == this) {
            super.T.a(false);
         }
      } else if(!super.T.Field10._id.u.equals(this._focus_owner.u) && !super.T.a(this._focus_owner.u)) {
         super.T.a(false);
      }

   }

   public void Method33() {
      this.Method30((String)null);
   }
}
