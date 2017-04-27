package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public final class SEPARATOR extends aq {
   public final y _horizontal;
   public final q _tickness;

   public SEPARATOR(Session var1) {
      super(var1);
      this._horizontal = new y(this, var1, true);
      this._tickness = new q(this, var1, 1);
      super.ad = "#SEPARATOR";
      super._transparent.D = true;
      super._border.b8 = 7;
   }

   public final void a(Graphics var1) {
      if(this._horizontal.D) {
         this.a(10, this._tickness.y, super.ac.x, super.ac.y + (super.ac.height - this._tickness.y) / 2, super.ac.width, this._tickness.y * 2, super._border_shadow.s, super._border_highlight.s, (Color)null, (String)null, (Font)null, 0);
      } else {
         this.a(10, this._tickness.y, super.ac.x + (super.ac.width - this._tickness.y) / 2, super.ac.y, this._tickness.y * 2, super.ac.height, super._border_shadow.s, super._border_highlight.s, (Color)null, (String)null, (Font)null, 0);
      }

   }
}
