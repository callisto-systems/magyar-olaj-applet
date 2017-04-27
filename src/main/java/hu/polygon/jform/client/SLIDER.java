package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.w;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.math.BigDecimal;

public final class SLIDER extends af {
   public final BUTTON _part_slide;
   public final y _horizontal;
   public final i _value;
   public final i _step;
   public final i _maximum;
   public final i _minimum;
   public final y _percental_format;
   public final y _show_value;
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
   public final w _font;
   public final q _tickness;
   public final g _foreground;
   public double by;
   public double bA;
   public double bz;
   public double bw;
   public String bx = "";
   private double bB;
   private String bv;

   public SLIDER(Session var1) {
      super(var1);
      this._part_slide = new BUTTON(var1);
      this._part_slide.ad = "#SLIDER-SLIDE";
      this.a((aq)this._part_slide);
      this._value = new i(this, var1, "50");
      this._maximum = new i(this, var1, "100");
      this._minimum = new i(this, var1, "0");
      this._step = new i(this, var1, "10");
      this._font = new w(this, var1);
      this._tickness = new q(this, var1, 2);
      this._foreground = new g(this, var1, Color.black);
      this._horizontal = new y(this, var1, true);
      this._percental_format = new y(this, var1, true);
      this._show_value = new y(this, var1, true);
      this._point = new i(this, var1, ".");
      this._separator = new i(this, var1, "#SPACE");
      this._integers = new q(this, var1, -1);
      this._fractions = new q(this, var1, 0);
      this._show_plus = new y(this, var1, false);
      this._nullable = new y(this, var1, true);
      this._model_point = new i(this, var1, ".");
      this._model_separator = new i(this, var1, (String)null);
      this._model_integers = new q(this, var1, -1);
      this._model_fractions = new q(this, var1, -1);
      this._model_show_plus = new y(this, var1, false);
      this._model_nullable = new y(this, var1, true);
      super.ad = "#SLIDER";
      super._border.b8 = 7;
      super._transparent.D = true;
      this._part_slide.bG = true;
      super._id = this._part_slide._id;
      super._enabled = this._part_slide._enabled;
      this._part_slide.bJ = this;
   }

   public final void Method13() {
      if(this._separator.u != null && this._separator.u.equals("#SPACE")) {
         this._separator.u = " ";
      }

      if(this._model_separator.u != null && this._model_separator.u.equals("#SPACE")) {
         this._model_separator.u = " ";
      }

      String var1 = aq.a(this._value.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      this.bz = aq.a(var1, 0.0D);
      var1 = aq.a(this._maximum.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      this.bA = aq.a(var1, 0.0D);
      var1 = aq.a(this._minimum.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      this.by = aq.a(var1, 0.0D);
      var1 = aq.a(this._step.u, this._model_separator.u, this._model_point.u, (String)null, ".", -1, -1, false, true);
      this.bw = aq.a(var1, 0.0D);
      this.bB = (this.bz - this.by) / (this.bA - this.by);
      this.Method69(false);
      super.Method13();
      this._part_slide._part_menu = super._part_menu;
   }

   public final void Method0() {
      this.a(super.Y.Field102);
      super.Method0();
   }

   public final void a(Graphics var1) {
      this.bB = (this.bz - this.by) / (this.bA - this.by);
      FontMetrics var2 = super.T.getFontMetrics(this._font.C);
      int var3;
      int var4;
      int var5;
      int var6;
      if(this._horizontal.D) {
         var3 = super.ac.y + super.ac.height - 22;
         this.a(10, this._tickness.y, super.ac.x, var3, super.ac.width, this._tickness.y * 2, super._border_shadow.s, super._border_highlight.s, (Color)null, (String)null, (Font)null, 0);
         var4 = super.ac.x + (int)(this.bB * (double)(super.ac.width - 10));
         var1.setColor(this._foreground.s);
         if(this._show_value.D) {
            var5 = var4 - var2.stringWidth(this.bx) / 2 + 5;
            if(var5 < super.ac.x + 2) {
               var5 = super.ac.x + 2;
            }

            if(var5 > super.ac.x + super.ac.width - var2.stringWidth(this.bx) - 2) {
               var5 = super.ac.x + super.ac.width - var2.stringWidth(this.bx) - 2;
            }

            var1.setFont(this._font.C);
            var1.drawString(this.bx, var5, var3 - 12);
         }

         for(var6 = super.ac.x; var6 < super.ac.x + super.ac.width; var6 += 10) {
            var1.drawLine(var6, var3 - 3, var6, var3 - 5);
            var1.drawLine(var6, var3 + this._tickness.y * 2 + 3, var6, var3 + this._tickness.y * 2 + 5);
         }

         this._part_slide.a(var4, var3 - 10, 10, (10 + this._tickness.y) * 2);
      } else {
         var3 = super.ac.x + 12;
         this.a(10, this._tickness.y, var3, super.ac.y, this._tickness.y * 2, super.ac.height, super._border_shadow.s, super._border_highlight.s, (Color)null, (String)null, (Font)null, 0);
         var4 = super.ac.y + (int)((1.0D - this.bB) * (double)(super.ac.height - 10));
         var1.setColor(this._foreground.s);
         if(this._show_value.D) {
            var5 = var4 + var2.getAscent() / 2 + 4;
            if(var5 < super.ac.y + var2.getAscent() + 1) {
               var5 = super.ac.y + var2.getAscent() + 1;
            }

            if(var5 > super.ac.y + super.ac.height - 2) {
               var5 = super.ac.y + super.ac.height - 2;
            }

            var1.setFont(this._font.C);
            var1.drawString(this.bx, var3 + 12 + this._tickness.y * 2, var5);
         }

         for(var6 = super.ac.y; var6 < super.ac.y + super.ac.height; var6 += 10) {
            var1.drawLine(var3 - 3, var6, var3 - 5, var6);
            var1.drawLine(var3 + this._tickness.y * 2 + 3, var6, var3 + this._tickness.y * 2 + 5, var6);
         }

         this._part_slide.a(var3 - 10, var4, (10 + this._tickness.y) * 2, 10);
      }

   }

   public final boolean a(ag var1) {
      if(super.a(var1) && var1.Field78 == this) {
         return true;
      } else {
         if(super._enabled.D && !var1.a()) {
            double var2;
            switch(var1.a) {
            case 401:
               if(var1.Field80 == 38 || var1.Field80 == 40 || var1.Field80 == 37 || var1.Field80 == 39) {
                  var2 = var1.Field80 != 40 && var1.Field80 != 37?this.bz + this.bw:this.bz - this.bw;
                  if(var2 < this.by) {
                     var2 = this.by;
                  }

                  if(var2 > this.bA) {
                     var2 = this.bA;
                  }

                  if(var2 != this.bz) {
                     this.bz = var2;
                     this.bB = (this.bz - this.by) / (this.bA - this.by);
                     this.Method69(true);
                     this.Method37();
                     this.Method30((String)null);
                  }
               }
               break;
            case 501:
               super.T.Method11(this._part_slide);
               this._part_slide.Method80(true);
               this.bv = this.bx;
            case 506:
               if(this._horizontal.D) {
                  this.bB = (double)((float)(var1.Field82 - super.ac.x - 4) / (float)(super.ac.width - 10));
               } else {
                  this.bB = (double)(1.0F - (float)(var1.Field83 - super.ac.y - 4) / (float)(super.ac.height - 10));
               }

               if(this.bB > 0.99D) {
                  this.bB = 1.0D;
               } else if(this.bB < 0.01D) {
                  this.bB = 0.0D;
               } else if(this.bB < 0.52D && this.bB > 0.48D) {
                  this.bB = 0.5D;
               }

               var2 = this.bB * (this.bA - this.by) + this.by;
               if(var2 != this.bz) {
                  this.bz = var2;
                  this.Method69(true);
                  this.Method37();
               }
               break;
            case 505:
               if(!this._part_slide.w()) {
                  break;
               }

               this._part_slide.Method81(false);
            case 502:
               if(!this.bx.equals(this.bv)) {
                  this.bv = this.bx;
                  this.Method30((String)null);
               }
            }
         }

         return true;
      }
   }

   private final void Method69(boolean var1) {
      this.bx = aq.a(String.valueOf(new BigDecimal(this._percental_format.D?(double)Math.round(this.bB * 100.0D):this.bz)), (String)null, ".", this._separator.u, this._point.u, this._integers.y, this._fractions.y, this._show_plus.D, this._nullable.D);
      if(this._percental_format.D) {
         this.bx = this.bx + '%';
      }

      if(var1) {
         this._value.Method32(aq.a(String.valueOf(new BigDecimal(this.bz)), (String)null, ".", this._model_separator.u, this._model_point.u, this._model_integers.y, this._model_fractions.y, this._model_show_plus.D, this._model_nullable.D));
      }

   }
}
