package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TEXTFIELD;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.y;

public final class NUMBERFIELD extends TEXTFIELD {
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
   public final q _model_integers;
   public final q _model_fractions;
   public final y _model_show_plus;
   public final y _model_nullable;
   double b6;
   double b7;

   public NUMBERFIELD(Session var1) {
      super(var1);
      this._value = super._text;
      this._maximum = new i(this, var1, "1000000000");
      this._minimum = new i(this, var1, "-1000000000");
      this._point = new i(this, var1, ".");
      this._separator = new i(this, var1, "#SPACE");
      this._integers = new q(this, var1, -1);
      this._fractions = new q(this, var1, -1);
      this._show_plus = new y(this, var1, false);
      this._nullable = new y(this, var1, true);
      this._model_point = new i(this, var1, ".");
      this._model_separator = new i(this, var1, (String)null);
      this._model_integers = new q(this, var1, -1);
      this._model_fractions = new q(this, var1, -1);
      this._model_show_plus = new y(this, var1, false);
      this._model_nullable = new y(this, var1, true);
      super.ad = "#NUMBERFIELD";
      super._alignment.b8 = 2;
   }

   public final void Method5() {
      if(this._separator.u != null) {
         super._text.u = super._text.u.replace(this._separator.u.charAt(0), ' ');
      }

      if(this._point.u != null && this._model_point.u != null) {
         super._text.u = super._text.u.replace(this._point.u.charAt(0), this._model_point.u.charAt(0));
      }

      super.Method5();
   }

   public final void Method13() {
      if(this._separator.u != null && this._separator.u.equals("#SPACE")) {
         this._separator.u = " ";
      }

      if(this._model_separator.u != null && this._model_separator.u.equals("#SPACE")) {
         this._model_separator.u = " ";
      }

      String var1 = aq.a(this._maximum.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      this.b6 = aq.a(var1, 0.0D);
      var1 = aq.a(this._minimum.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      this.b7 = aq.a(var1, 0.0D);
      super._include.u = null;
      super._pattern.u = null;
      super.Method13();
      super._include.u = "0123456789-+" + this._point.u;
      super._pattern.u = "[+-]?\\d*";
      if(this._separator.u != null && !this._separator.u.equals("#NULL")) {
         super._pattern.u = super._pattern.u + '(' + this._separator.u + "\\d+)*";
         super._include.u = super._include.u + this._separator.u;
      }

      super._pattern.u = super._pattern.u + "(";
      if(this._point.u.equals(".")) {
         super._pattern.u = super._pattern.u + "\\";
      }

      super._pattern.u = super._pattern.u + this._point.u + "\\d+)?( *)";
      if(this._model_nullable.D && this._value.Method85() != null && this._value.Method85().ch == null) {
         this.L();
      }

      if(super.M) {
         this.H();
      }

   }

   public final void H() {
      super._text.u = aq.a(super._text.u, this._separator.u, this._point.u, (String)null, this._point.u, -1, -1, false, false);
      if(super._start.y > super._text.u.length()) {
         super._end.y = super._start.y = super._text.u.length();
      }

   }

   public final void I() {
      super._text.u = aq.a(super._text.u, super._include.u == null?this._model_separator.u:this._separator.u, super._include.u == null?this._model_point.u:this._point.u, this._separator.u, this._point.u, this._integers.y, this._fractions.y, this._show_plus.D, this._nullable.D);
   }

   public final boolean K() {
      if(super._text.u.trim().length() != 0 && super._visible.D && super._enabled.D) {
         String var1 = aq.a(super._text.u, this._separator.u, this._point.u, (String)null, ".", -1, -1, false, false);
         double var2 = aq.a(var1, 0.0D);
         if(var2 > this.b6) {
            return false;
         }

         if(var2 < this.b7) {
            return false;
         }
      }

      return super.K();
   }

   public final void L() {
      this._value.Method32(aq.a(super._text.u, this._separator.u, this._point.u, this._model_separator.u, this._model_point.u, this._model_integers.y, this._model_fractions.y, this._model_show_plus.D, this._model_nullable.D));
   }
}
