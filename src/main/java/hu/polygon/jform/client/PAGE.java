package hu.polygon.jform.client;

import hu.polygon.jform.client.FOLDER;
import hu.polygon.jform.client.PANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.i;
import java.net.URL;

public final class PAGE extends PANEL {
   public final i _title;
   public final c _icon;
   public int bb;

   public PAGE(Session var1) {
      super(var1);
      this._title = new i(this, var1, "");
      this._icon = new c(this, var1, (URL)null);
      super.ad = "#PAGE";
      super._border.b8 = 7;
   }

   public final void Method0() {
      super._width.y = super.aa._width.y - 2;
      super._height.y = super.aa._height.y - ((FOLDER)super.aa)._tab_height.y - 2;
      super.Method0();
   }

   public final void Method33() {
      int var1 = ((FOLDER)super.aa).aA.indexOf(this);
      if(((FOLDER)super.aa).bd != var1) {
         ((FOLDER)super.aa).Method49(var1, true);
      } else {
         aq.N.beep();
      }

   }

   public final f a(String var1) {
      return (f)(var1.equals("visible")?super._enabled:super.a(var1));
   }
}
