package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.CALENDAR;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TEXTFIELD;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.ak;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.at;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.q;
import java.awt.Color;
import java.awt.Point;

public final class DATEFIELD extends af implements at {
   public final TEXTFIELD _part_text;
   public final BUTTON _part_button;
   public final CALENDAR _part_calendar;
   public final q _button_size;
   public final i _date;
   public final ak _days;
   public final ak _months;
   public final i _mask;
   public final i _model_mask;
   public final ak _model_months;

   public DATEFIELD(Session var1) {
      super(var1);
      this._part_button = new BUTTON(var1);
      this._part_calendar = new CALENDAR(var1);
      this._part_text = new TEXTFIELD(var1);
      this._part_button.ad = "#DATEFIELD-BUTTON";
      this._part_calendar.ad = "#DATEFIELD-CALENDAR";
      this._part_text.ad = null;
      this._part_button._focusable.D = false;
      this._part_button._icon.k = c.h;
      this._part_calendar._focusable.D = false;
      this._part_calendar._border.b8 = 14;
      this.a((aq)this._part_button);
      this.a((aq)this._part_text);
      this._button_size = new q(this, var1, 16);
      super._enabled = this._part_text._enabled;
      super._id = this._part_text._id;
      this._date = this._part_calendar._date;
      this._days = this._part_calendar._days;
      this._months = this._part_calendar._months;
      this._mask = this._part_calendar._mask;
      this._model_mask = this._part_calendar._model_mask;
      this._model_months = this._part_calendar._model_months;
      super.ad = "#DATEFIELD";
      super._border.b8 = 10;
      super._background.s = Color.white;
      this._part_calendar.a(0, 0, 200, 153);
      this._part_calendar.W = this;
      this._part_calendar.U = false;
      this._part_calendar.Field122 = this;
      this._part_calendar._part_months.U = false;
      this._part_calendar._part_months._part_text.U = false;
      this._part_calendar._part_months._part_left.U = false;
      this._part_calendar._part_months._part_right.U = false;
      this._part_calendar._part_years.U = false;
      this._part_calendar._part_years._part_text.U = false;
      this._part_calendar._part_years._part_down.U = false;
      this._part_calendar._part_years._part_up.U = false;
      this._part_button.W = this;
      this._part_button.U = false;
      this._part_text.bP = this;
      super._transparent.D = true;
      super.W = this;
      super.R = false;
   }

   public final f a(String var1) {
      return this.a(var1, this._part_text);
   }

   public final void a(ac var1) {
      this._part_calendar.a(var1);
      super.a(var1);
   }

   public final void Method5() {
      super.Method5();
      this._part_text.Method13();
   }

   public final void Method13() {
      this._part_text._text.u = this._part_calendar._date.u;
      this._part_text._text.Field117 = this._date.Field117;
      super.Method13();
   }

   public final void Method0() {
      int var1 = super._enabled.D?this._button_size.y:0;
      this._part_text.a(0, 0, super.O - var1, super.J);
      this._part_button.a(super.O - var1, 0, var1, super.J);
      super.Method0();
   }

   public final boolean a(ag var1) {
      if(var1.a == 1001) {
         if(var1.Field78 == this._part_button) {
            boolean var2 = super.T.Method9(this._part_calendar);
            super.T.a((aq)this);
            if(!var2) {
               this.f();
               Point var3 = hu.polygon.jform.client.ac.Method8(this);
               this._part_calendar._x.y = this._part_calendar.af = var3.x + super.O - this._part_calendar._width.y;
               this._part_calendar._y.y = this._part_calendar.ae = var3.y + super.J;
               this._part_calendar.Method35();
               if(super.T.Field10 == this._part_text) {
                  this._part_text.a(new ag(this._part_text, 1005));
                  super.T.Field10 = super.T.Field0;
               }

               super.T.Method10(this._part_calendar);
            }

            return true;
         } else {
            if(var1.Field78 != this) {
               this._part_text._start.y = this._part_text._end.y = 0;
               super.T.a((aq)this);
               this._part_text.bT = true;
               super.Field123.Field99.removeElement(this._part_text);
               super.T.Method11(this._part_text);
               this._part_text._text.u = this.a((String)this._part_calendar._date.u, (String[])null, (String)"Ymd", (String[])this._part_calendar._months.F, this._part_calendar._mask.u);
               this._part_text.Method37();
               this.g();
            }

            this._part_text.Method30((String)null);
            return true;
         }
      } else {
         return super.a(var1);
      }
   }

   public final boolean f() {
      String var1 = this.a((String)this._part_text._text.u, (String[])this._part_calendar._months.F, (String)this._part_calendar._mask.u, (String[])null, "Ymd");
      if(var1.length() != 0 && var1.length() <= 8) {
         this._part_calendar._date.u = var1;
         this._part_calendar.n();
         return this._part_calendar.a4;
      } else {
         return false;
      }
   }

   public final void g() {
      this._date.Method32(this.a(this._part_text._text.u, this._part_calendar._months.F, this._part_calendar._mask.u, this._part_calendar._model_months.F, this._part_calendar._model_mask.u));
   }

   public final void h() {
      if(this._part_text._text.u.length() != 0) {
         String var1 = this.a((String)this._part_calendar._date.u, (String[])null, (String)"Ymd", (String[])this._part_calendar._months.F, this._part_calendar._mask.u);
         if(var1.length() != 0) {
            this._part_text._text.u = var1;
         }
      } else {
         this._part_calendar._date.u = new String();
      }

   }
}
