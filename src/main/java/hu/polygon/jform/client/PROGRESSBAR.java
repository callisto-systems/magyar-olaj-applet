package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
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
import java.math.BigDecimal;
import java.net.URL;

public final class PROGRESSBAR extends af {
   public final aq _part_bar;
   public final i _value;
   public final i _maximum;
   public final i _minimum;
   public final i _point;
   public final i _separator;
   public final q _integers;
   public final q _fractions;
   public final y _show_plus;
   public final y _nullable;
   public final i _model_point;
   public final i _model_separator;
   public final w _font;
   public final g _foreground;
   public final g _shadow;
   public final c _icon;
   public final y _icon_left;
   public final q _icon_gap;
   public final y _icon_side;
   public final av _alignment;
   public final av _regulation;
   public final y _percental_format;
   public final y _show_value;
   private double bD;
   private String bC;

   public PROGRESSBAR(Session var1) {
      super(var1);
      this._part_bar = new aq(var1);
      this._part_bar.ad = "#PROGRESSBAR-BAR";
      this._part_bar._background.s = g.p;
      this._part_bar._transparent.D = false;
      this.a(this._part_bar);
      this._maximum = new i(this, var1, "100");
      this._minimum = new i(this, var1, "0");
      this._value = new i(this, var1, this._minimum.u);
      this._point = new i(this, var1, ".");
      this._separator = new i(this, var1, "#SPACE");
      this._integers = new q(this, var1, -1);
      this._fractions = new q(this, var1, -1);
      this._show_plus = new y(this, var1, false);
      this._nullable = new y(this, var1, true);
      this._model_point = new i(this, var1, ".");
      this._model_separator = new i(this, var1, (String)null);
      this._percental_format = new y(this, var1, true);
      this._show_value = new y(this, var1, true);
      this._font = new w(this, var1);
      this._foreground = new g(this, var1, Color.black);
      this._shadow = new g(this, var1, (Color)null);
      this._icon = new c(this, var1, (URL)null);
      this._icon_left = new y(this, var1, true);
      this._icon_gap = new q(this, var1, 3);
      this._icon_side = new y(this, var1, false);
      this._alignment = new av(this, var1, (byte)1);
      this._regulation = new av(this, var1, (byte)5);
      super.ad = "#PROGRESSBAR";
      super._hint = this._part_bar._hint;
      super._border.b8 = 10;
      super._background.s = Color.white;
   }

   public final void Method0() {
      this._part_bar._part_menu = super._part_menu;
      if(this._separator.u != null && this._separator.u.equals("#SPACE")) {
         this._separator.u = " ";
      }

      if(this._model_separator.u != null && this._model_separator.u.equals("#SPACE")) {
         this._model_separator.u = " ";
      }

      String var1 = aq.a(this._value.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      this.bD = aq.a(var1, 0.0D);
      var1 = aq.a(this._maximum.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      double var2 = aq.a(var1, 0.0D);
      var1 = aq.a(this._minimum.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      double var4 = aq.a(var1, 0.0D);
      if(var4 < var2) {
         if(this.bD > var2) {
            this.bD = var2;
         } else if(this.bD < var4) {
            this.bD = var4;
         }

         int var6 = (int)((this.bD - var4) / (var2 - var4) * (double)super.ac.width);
         this._part_bar.a(super.ac.x, super.ac.y, var6, super.ac.height);
      } else {
         this._part_bar.a(super.ac.x, super.ac.y, 0, 0);
         this.bD = 0.0D;
      }

      this.bC = aq.a(String.valueOf(new BigDecimal(this._percental_format.D?(double)Math.round((this.bD - var4) / (var2 - var4) * 100.0D):this.bD)), this._model_separator.u, this._model_point.u, this._separator.u, this._point.u, this._integers.y, this._fractions.y, this._show_plus.D, this._nullable.D);
      if(this._percental_format.D) {
         this.bC = this.bC + '%';
      }

      super.Method0();
   }

   public void Method38() {
      super.Method38();
      if(this._show_value.D) {
         this.a(this._font.C, super.ac, this.bC, false, (String)null, this._alignment.b8, this._regulation.b8, 0, 0, 0, (Color)null, this._foreground.s, this._shadow.s, this._icon.k, this._icon_left.D, this._icon_gap.y, super._enabled.D, this._icon_side.D, (String)null, (ag)null);
      }

   }
}
