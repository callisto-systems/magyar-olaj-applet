package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.av;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.w;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.Graphics;
import java.net.URL;

public class LABEL extends aq {
   public i _text;
   public g _foreground;
   public g _shadow;
   public av _alignment;
   public final av _regulation;
   public w _font;
   public c _icon;
   public y _icon_left;
   public y _icon_side;
   public q _icon_gap;
   public final i _peer;

   public LABEL(Session var1) {
      super(var1);
      this._text = new i(this, var1, "");
      this._font = new w(this, var1);
      this._foreground = new g(this, var1, Color.black);
      this._shadow = new g(this, var1, (Color)null);
      this._alignment = new av(this, var1, (byte)0);
      this._regulation = new av(this, var1, (byte)5);
      this._icon = new c(this, var1, (URL)null);
      this._icon_left = new y(this, var1, true);
      this._icon_side = new y(this, var1, false);
      this._icon_gap = new q(this, var1, 3);
      this._peer = new i(this, var1, (String)null);
      super.ad = "#LABEL";
      super._border.b8 = 7;
      super._border_tickness.y = 0;
      super._transparent.D = true;
   }

   public void a(Graphics var1) {
      this.a(this._font.C, super.ac, this._text.u, false, super._shortcut.u, this._alignment.b8, this._regulation.b8, 0, 0, 0, (Color)null, this._foreground.s, this._shadow.s, this._icon.k, this._icon_left.D, this._icon_gap.y, super._enabled.D, this._icon_side.D, (String)null, (ag)null);
   }

   public void Method33() {
      if(this._peer.u != null && !super.T.a(this._peer.u)) {
         aq.N.beep();
      } else {
         this.Method30(new String());
      }

   }
}
