package hu.polygon.jform.client;

import hu.polygon.jform.client.LABEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.g;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.net.URL;

public final class aj extends LABEL {
   public final g _hint_color;
   String bL;

   public aj(Session var1) {
      super(var1);
      this._hint_color = new g(this, var1, Color.gray);
      super.ad = "#HINT";
      super._transparent.D = false;
      super._border_tickness.y = 1;
      super._background.s = g.t;
      super._border.b8 = 14;
      super._width.y = super._height.y = 10;
   }

   public final void Method36() {
      FontMetrics var1 = super.T.getFontMetrics(super._font.C);
      super.O = var1.stringWidth(super._text.u) + super._border_tickness.y + 2;
      super.J = var1.getHeight() + super._border_tickness.y + 2;
      if(this.bL != null) {
         super.O += var1.stringWidth(this.bL) + super._border_tickness.y + var1.getAscent() / 2;
      } else {
         super.O += super._border_tickness.y + 4;
      }

      if(super.T.Field0.O - 20 < super.O) {
         super.O = super.T.Field0.O - 20;
         this.bL = null;
      }

   }

   public final void a(Graphics var1) {
      this.a(super._font.C, super.ac, super._text.u, false, (String)null, 0, super._regulation.b8, 0, 0, 0, (Color)null, super._foreground.s, super._shadow.s, (URL)null, false, 0, true, true, (String)null, (ag)null);
      if(this.bL != null) {
         this.a(super._font.C, super.ac, this.bL, false, (String)null, 2, super._regulation.b8, 0, 0, 0, (Color)null, this._hint_color.s, super._shadow.s, (URL)null, false, 0, true, true, (String)null, (ag)null);
      }

   }
}
