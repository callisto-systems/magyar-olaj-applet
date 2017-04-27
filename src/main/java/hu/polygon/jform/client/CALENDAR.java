package hu.polygon.jform.client;

import hu.polygon.jform.client.OPTIONBOX;
import hu.polygon.jform.client.SPINBOX;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.ak;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.w;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.GregorianCalendar;

public final class CALENDAR extends af {
   private static final String[] a8 = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
   private static final String[] a1 = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   private static final int[] a5 = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   public final i _date;
   public final w _font;
   public final g _foreground;
   public final g _highlight;
   public final ak _days;
   public final ak _months;
   public final i _mask;
   public final i _model_mask;
   public final ak _model_months;
   public final SPINBOX _part_years;
   public final OPTIONBOX _part_months;
   private int a0;
   private int a7;
   private int aZ;
   private int a3;
   private int a6;
   public int a2 = 2002;
   public int ba = 12;
   public int a9 = 20;
   boolean a4;

   public CALENDAR(Session var1) {
      super(var1);
      this._part_years = new SPINBOX(var1);
      this._part_months = new OPTIONBOX(var1);
      this._part_years.ad = "#CALENDAR-YEARS";
      this._part_months.ad = "#CALENDAR-MONTHS";
      this._part_years._part_text._separator.u = null;
      this._part_years._transparent.D = true;
      this._part_months._transparent.D = true;
      this._part_years._part_text._focusable.D = false;
      this._part_months._part_text._focusable.D = false;
      this._part_years._border.b8 = 7;
      this._part_months._border.b8 = 7;
      this._part_years._part_text._alignment.b8 = 1;
      this._part_months._part_text._alignment.b8 = 1;
      this._part_years._part_text._maximum.u = "9999";
      this.a((aq)this._part_years);
      this.a((aq)this._part_months);
      this._date = new i(this, var1, "");
      this._font = new w(this, var1);
      this._foreground = new g(this, var1, Color.black);
      this._highlight = new g(this, var1, g.p);
      this._days = new ak(this, var1, a8, 7);
      this._months = new ak(this, var1, a1, 12);
      this._model_months = new ak(this, var1, a1, 12);
      this._mask = new i(this, var1, "d/m/Y");
      this._model_mask = new i(this, var1, "Cymd");
      super.ad = "#CALENDAR";
      super._enabled = this._part_years._part_text._enabled = this._part_years._enabled = this._part_months._enabled;
      this._part_years._part_text._id = this._part_months._part_text._id = super._id;
      super._focusable.D = true;
      super._background.s = Color.white;
      super._border.b8 = 10;
      super.X = this;
      this._part_years.W = this;
      this._part_months.W = this;
   }

   public final void Method13() {
      FontMetrics var1 = super.T.getFontMetrics(this._font.C);
      this.a3 = var1.getHeight();
      this.aZ = this.a3 / 3 * 4;
      super.L = super._enabled.D?1:0;
      this._part_months._choices.v.removeAllElements();
      this._part_months._choices.w.removeAllElements();

      for(int var2 = 0; var2 < this._months.F.length; ++var2) {
         this._part_months._choices.v.addElement(this._months.F[var2]);
         this._part_months._choices.w.addElement(this._months.F[var2]);
      }

      if(this._date.u.length() != 0) {
         this._date.u = this.a((String)this._date.u, (String[])this._model_months.F, (String)this._model_mask.u, (String[])null, "Ymd");
      }

      this.n();
      super.Method13();
   }

   public final void Method0() {
      this._part_years.a(super.ac.x + 3, super.ac.y + 3, super.O / 3, this.a3 + 6);
      this._part_months.a(super.ac.x + super.O / 3 + 3, super.ac.y + 3, super.O - super.O / 3 - super.ac.x * 2 - 6, this.a3 + 6);
      this.a6 = super.O / 7;
      super.Method0();
   }

   final void n() {
      GregorianCalendar var1 = new GregorianCalendar();
      if(this._date.u.length() != 0) {
         this.a2 = Integer.parseInt(this._date.u.substring(0, 4));
         this.ba = Integer.parseInt(this._date.u.substring(4, 6));
         this.a9 = Integer.parseInt(this._date.u.substring(6, 8));
         var1.set(this.a2, this.ba - 1, 1);
      } else {
         this.a2 = var1.get(1);
         this.ba = var1.get(2) + 1;
         this.a9 = var1.get(5);
         var1.set(5, 1);
      }

      this._part_years._part_text._text.u = Integer.toString(this.a2);
      if(this.ba > 0 && this.ba < 13) {
         this._part_months._selection.v.removeAllElements();
         this._part_months._selection.v.addElement(this._part_months._choices.v.elementAt(this.ba - 1));
         this._part_months._part_text._text.u = (String)this._part_months._choices.v.elementAt(this.ba - 1);
         this._part_months.aW = this.ba - 1;
         this.a7 = var1.isLeapYear(this.a2) && this.ba == 2?29:a5[this.ba - 1];
         if(this.a7 < this.a9) {
            this.a9 = this.a7;
            this.a4 = false;
         } else {
            this.a4 = true;
         }
      } else {
         this.a4 = false;
      }

      this.a0 = var1.get(7);
      this.a0 = this.a0 == 1?6:this.a0 - 2;
   }

   public final void a(Graphics var1) {
      var1.setColor(this._foreground.s);
      var1.setFont(this._font.C);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         var1.drawString(this._days.F[var2], super.ac.x + 3 + var2 * this.a6, super.ac.y + this.a3 * 2 + 11);
      }

      var1.drawLine(super.ac.x + 3, super.ac.y + this.a3 * 2 + 16, super.O - super.ac.x * 2 - 6, super.ac.y + this.a3 * 2 + 16);
      var2 = super.ac.x + 3 + this.a0 * this.a6;
      int var3 = super.ac.y + this.a3 * 3 + 16;

      for(int var4 = 0; var4 < this.a7; ++var4) {
         if(var4 + 1 == this.a9) {
            var1.setColor(this._highlight.s);
            var1.fillRect(var2 - 2, var3 - this.a3 + 2, this.aZ + 2, this.a3 + 2);
            var1.setColor(this._foreground.s);
         }

         var1.drawString(String.valueOf(var4 + 1), var2, var3);
         var2 += this.a6;
         if(var2 > super.O - super.ac.x * 2 - 6) {
            var2 = super.ac.x + 3;
            var3 += this.a3 + 2;
         }
      }

   }

   public final boolean a(ag var1) {
      if(super._enabled.D) {
         if(var1.a == 1001) {
            if(super.T.Field10 != this._part_months._part_text && super.T.Field10 != this._part_years._part_text) {
               super.T.Method11(this);
            }

            if(var1.Field78 == this._part_months) {
               if(this.ba == 1 && this._part_months.aW == 11) {
                  this._part_years.t();
               }

               if(this.ba == 12 && this._part_months.aW == 0) {
                  this._part_years.r();
               }
            }

            this._date.u = this._part_years._part_text._text.u + (this._part_months.aW < 9?"0" + (this._part_months.aW + 1):String.valueOf(this._part_months.aW + 1)) + (this.a9 < 10?"0" + this.a9:String.valueOf(this.a9));
            this.n();
            this.m();
            this.Method37();
         } else if(var1.a == 501 && !var1.a()) {
            int var2 = super.ac.x + 3 + this.a0 * this.a6;
            int var3 = super.ac.y + this.a3 * 3 + 16;

            for(int var4 = 0; var4 < this.a7; ++var4) {
               int var5 = var1.Field82 - var2;
               int var6 = var3 - var1.Field83;
               if(var5 < this.aZ + 2 && var5 > -1 && var6 < this.a3 + 2 && var6 > -1) {
                  this.a9 = var4 + 1;
                  this._date.u = this.a2 + (this._part_months.aW < 9?"0" + (this._part_months.aW + 1):String.valueOf(this._part_months.aW + 1)) + (this.a9 < 10?"0" + this.a9:String.valueOf(this.a9));
                  this.m();
                  this.Method37();
                  this.Method30((String)null);
                  break;
               }

               var2 += this.a6;
               if(var2 > super.O - super.ac.x * 2 - 6) {
                  var2 = super.ac.x + 3;
                  var3 += this.a3 + 2;
               }
            }
         } else if(var1.a == 401 && var1.Field81) {
            if(var1.Field80 == 38 && this.a9 > 7) {
               this.a9 -= 7;
            } else if(var1.Field80 == 40 && this.a9 < this.a7 - 6) {
               this.a9 += 7;
            } else if(var1.Field80 == 37 && this.a9 > 1) {
               --this.a9;
            } else if(var1.Field80 == 39 && this.a9 < this.a7) {
               ++this.a9;
            }

            this._date.u = this.a2 + (this._part_months.aW < 9?"0" + (this._part_months.aW + 1):String.valueOf(this._part_months.aW + 1)) + (this.a9 < 10?"0" + this.a9:String.valueOf(this.a9));
            this.m();
            this.Method37();
            this.Method30((String)null);
         }
      }

      return super.a(var1);
   }

   public final void m() {
      this._date.Method32(this.a(this._date.u, this._months.F, "Ymd", this._model_months.F, this._model_mask.u));
   }
}
