package hu.polygon.jform.client;

import hu.polygon.jform.client.PANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.av;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.w;
import java.awt.Color;

public final class GROUPBOX extends PANEL {
   public final i _title;
   public final w _font;
   public final g _foreground;
   public final av _alignment;

   public GROUPBOX(Session var1) {
      super(var1);
      this._title = new i(this, var1, "");
      this._font = new w(this, var1);
      this._foreground = new g(this, var1, Color.darkGray);
      this._alignment = new av(this, var1, (byte)0);
      super.ad = "#GROUPBOX";
      super._transparent.D = true;
   }

   public final void Method38() {
      if(super.R) {
         this.a(16, super._border_tickness.y, 0, 0, super.O, super.J, super._border_shadow.s, super._border_highlight.s, this._foreground.s, this._title.u, this._font.C, this._alignment.b8);
      }

   }
}
