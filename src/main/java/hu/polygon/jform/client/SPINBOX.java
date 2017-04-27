package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.NUMBERFIELD;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.q;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class SPINBOX extends af {
   public final NUMBERFIELD _part_text;
   public final BUTTON _part_up;
   public final BUTTON _part_down;
   public final q _button_size;
   public final i _step;
   private double bs;
   private double bu;
   private int bt;
   private int br;

   public SPINBOX(Session var1) {
      super(var1);
      this._part_up = new BUTTON(var1);
      this._part_down = new BUTTON(var1);
      this._part_text = new NUMBERFIELD(var1);
      this._part_up.ad = "#SPINBOX-UP";
      this._part_down.ad = "#SPINBOX-DOWN";
      this._part_text.ad = null;
      this._part_text._editable.D = false;
      this._part_text._maximum.u = "100";
      this._part_text._minimum.u = "1";
      this._part_text._text.u = "1";
      this._part_up._focusable.D = false;
      this._part_up._icon.k = c.n;
      this._part_down._focusable.D = false;
      this._part_down._icon.k = c.h;
      this.a((aq)this._part_up);
      this.a((aq)this._part_down);
      this.a((aq)this._part_text);
      this._button_size = new q(this, var1, 16);
      this._step = new i(this, var1, "1");
      super.ad = "#SPINBOX";
      super._enabled = this._part_text._enabled;
      super._id = this._part_text._id;
      super._transparent.D = true;
      this._part_up.W = this;
      this._part_up.U = false;
      this._part_up.bE = true;
      this._part_down.W = this;
      this._part_down.U = false;
      this._part_down.bE = true;
      this._part_text.W = this;
      super.W = this;
      super.R = false;
   }

   public final f a(String var1) {
      return this.a(var1, this._part_text);
   }

   public final void Method13() {
      super.Method13();
      String var1 = aq.a(this._step.u, this._part_text._model_separator.u, this._part_text._model_point.u, (String)null, ".", -1, -1, false, true);
      this.bs = aq.a(var1, 0.0D);
   }

   public final void Method0() {
      int var1 = super._enabled.D?this._button_size.y:0;
      this._part_text.a(0, 0, super.O - var1, super.J);
      this._part_up.a(super.O - var1, 0, var1, super.J / 2);
      this._part_down.a(super.O - var1, super.J / 2, var1, super.J / 2);
      super.Method0();
   }

   public final boolean a(ag var1) {
      if(var1.a == 1001) {
         if(var1.Field78 == this) {
            this._part_text.Method30(new String());
         } else if(var1.Field78 instanceof BUTTON) {
            if(super.W == null) {
               super.T.Method11(this._part_text);
            }

            if(this.bt == 0) {
               this.bt = var1.Field78 == this._part_up?1:2;
               this.br = 0;
               this.run();
               Main.Field59.Method87(this);
            } else {
               this.bt = 0;
               Main.Field59.a(this);
               this.u();
            }
         } else if(var1.Field86 != null) {
            if(var1.Field86.equals("up")) {
               this.r();
            }

            if(var1.Field86.equals("down")) {
               this.t();
            }

            this.u();
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   private final void u() {
      if(this._part_text.bT) {
         this.Method30((String)null);
         this._part_text.Method30(new String());
      }

   }

   private final void s() {
      String var1 = aq.a(this._part_text._text.u, this._part_text._separator.u, this._part_text._point.u, (String)null, ".", -1, -1, false, true);
      this.bu = aq.a(var1, 0.0D);
   }

   final void r() {
      this.s();
      this.bu += this.bs;
      if(this.bu > this._part_text.b6) {
         this.bu = this._part_text.b7;
      }

      this.v();
   }

   final void t() {
      this.s();
      this.bu -= this.bs;
      if(this.bu < this._part_text.b7) {
         this.bu = this._part_text.b6;
      }

      this.v();
   }

   private final void v() {
      DecimalFormatSymbols var1 = new DecimalFormatSymbols(Locale.ENGLISH);
      DecimalFormat var2 = new DecimalFormat("0.####", var1);
      String var3 = aq.a(var2.format(this.bu), " ", ".", this._part_text._editable.D?" ":this._part_text._separator.u, this._part_text._point.u, this._part_text._editable.D?-1:this._part_text._integers.y, this._part_text._editable.D?-1:this._part_text._fractions.y, this._part_text._editable.D?false:this._part_text._show_plus.D, true);
      this._part_text._text.u = "";
      this._part_text._start.y = 0;
      this._part_text.Method78(var3, var3.length());
      if(this._part_text.bT) {
         super.T.a((aq)this);
         this._part_text.L();
      }

   }

   public final void run() {
      ++this.br;
      if(this.br != 2 && this.br != 3) {
         if(this.bt == 1) {
            this.r();
         } else {
            this.t();
         }

      }
   }

   public final void Method2() {
      Main.Field59.a(this);
      super.Method2();
   }
}
