package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.y;
import java.awt.Graphics;

public final class ad extends af {
   public final BUTTON _part_up;
   public final BUTTON _part_down;
   public final BUTTON _part_slide;
   public final y _proportional;
   boolean bo;
   int bp;
   int bj = 16;
   int bn;
   int bi;
   int bl;
   int bq;
   aq bm;
   m bk;

   public ad(Session var1, boolean var2, m var3, aq var4) {
      super(var1);
      this._part_up = new BUTTON(var1);
      this._part_down = new BUTTON(var1);
      this._part_slide = new BUTTON(var1);
      this._part_up._icon_side.D = false;
      this._part_down._icon_side.D = false;
      this._part_slide._icon_side.D = false;
      this._part_up._focusable.D = false;
      this._part_down._focusable.D = false;
      this._part_slide._focusable.D = false;
      if(var2) {
         super.ad = "#HORIZONTAL";
         this._part_down.ad = "#HORIZONTAL-RIGHT";
         this._part_slide.ad = "#HORIZONTAL-SLIDE";
         this._part_up.ad = "#HORIZONTAL-LEFT";
         this._part_down._icon.k = c.l;
         this._part_up._icon.k = c.m;
         this._part_slide._icon.k = c.Field106;
      } else {
         super.ad = "#VERTICAL";
         this._part_down.ad = "#VERTICAL-DOWN";
         this._part_slide.ad = "#VERTICAL-SLIDE";
         this._part_up.ad = "#VERTICAL-UP";
         this._part_up._icon.k = c.n;
         this._part_down._icon.k = c.h;
         this._part_slide._icon.k = c.b;
      }

      this.a((aq)this._part_up);
      this.a((aq)this._part_down);
      this.a((aq)this._part_slide);
      this._proportional = new y(this, var1, true);
      super._background.s = g.r;
      super._border.b8 = 7;
      super._border_tickness.y = 0;
      this._part_up.W = this;
      this._part_down.W = this;
      this._part_up.bE = true;
      this._part_down.bE = true;
      this._part_slide.bJ = this;
      this.bk = var3;
      this.bm = var4;
      this.bo = var2;
   }

   public final f a(String var1) {
      return (f)(var1.equals("part-left")?this._part_up:(var1.equals("part-right")?this._part_down:super.a(var1)));
   }

   public final void Method0() {
      this._part_up.a(0, 0, 16, 16);
      int var1;
      float var2;
      if(this.bo) {
         this._part_down.a(super.O - 16, 0, 16, 16);
         this.bn = this.bk.aB - this.bm.O;
         var1 = super.O - 32;
         var2 = (float)(this.bm.O - 16) / (float)this.bk.aB;
      } else {
         this._part_down.a(0, super.J - 16, 16, 16);
         this.bn = this.bk.aC - this.bm.J;
         var1 = super.J - 32;
         var2 = (float)(this.bm.J - 16) / (float)this.bk.aC;
      }

      this.bj = this._proportional.D?(int)(var2 * (float)var1):16;
      if(this.bj < 16) {
         this.bj = 16;
      }

      this.bi = var1 - this.bj;
      this.a((Graphics)null);
      super.Method0();
   }

   public final void a(Graphics var1) {
      this.bq = this.q();
      if(this.bo) {
         this._part_slide.a(this.bq, 0, this.bj, 16);
      } else {
         this._part_slide.a(0, this.bq, 16, this.bj);
      }

   }

   private final int Method1(ag var1) {
      int var2;
      int var3;
      float var4;
      if(this.bo) {
         var2 = super.O - 32 - this.bj;
         var3 = this.bk.aB - this.bm.O;
         var4 = (float)((double)(var1.Field82 - 16) - (double)this.bj * 0.5D) / (float)var2;
      } else {
         var2 = super.J - 32 - this.bj;
         var3 = this.bk.aC - this.bm.J;
         var4 = (float)((double)(var1.Field83 - 16) - (double)this.bj * 0.5D) / (float)var2;
      }

      if(var4 < 0.0F) {
         var4 = 0.0F;
      } else if(var4 > 1.0F) {
         var4 = 1.0F;
      }

      return (int)(var4 * (float)var3);
   }

   private final int q() {
      float var1;
      if(this.bo) {
         var1 = (float)this.bm.I / (float)this.bn;
      } else {
         var1 = (float)this.bm.H / (float)this.bn;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      return (int)(var1 * (float)this.bi) + 16;
   }

   public final boolean a(ag var1) {
      if(var1.a == 1001) {
         if(var1.Field86.equals("true")) {
            if(this.bo) {
               this.bp = var1.Field78 == this._part_up?0:1;
            } else {
               this.bp = var1.Field78 == this._part_up?2:3;
            }

            Main.Field59.Method87(this);
            this.run();
         } else {
            Main.Field59.a(this);
         }

         return true;
      } else if(super.a(var1) && var1.Field78 == this) {
         return true;
      } else {
         switch(var1.a) {
         case 501:
            this.bp = -1;
            this._part_slide.Method80(true);
            this._part_slide.a(false, false);
            if(this.bo) {
               this.bk.Method83(this.Method1(var1), this.bm.H);
               this.bl = this.bq + this.bj / 2 - var1.Field82;
            } else {
               this.bk.Method83(this.bm.I, this.Method1(var1));
               this.bl = this.bq + this.bj / 2 - var1.Field83;
            }
         case 502:
         case 503:
         case 504:
         default:
            break;
         case 505:
            if(this._part_slide.w()) {
               this._part_slide.Method81(false);
            }
            break;
         case 506:
            if(this.bo) {
               var1.Field82 += this.bl;
               if(var1.Field82 > 16 && var1.Field82 < super.O - 16) {
                  this.bk.Method83(this.Method1(var1), this.bm.H);
               }
            } else {
               var1.Field83 += this.bl;
               if(var1.Field83 > 16 && var1.Field83 < super.J - 16) {
                  this.bk.Method83(this.bm.I, this.Method1(var1));
               }
            }
         }

         return true;
      }
   }

   public final void run() {
      boolean var1 = false;
      switch(this.bp) {
      case 0:
         var1 = this.bk.Method83(this.bm.I - 10, this.bm.H);
         break;
      case 1:
         var1 = this.bk.Method83(this.bm.I + 10, this.bm.H);
         break;
      case 2:
         var1 = this.bk.Method83(this.bm.I, this.bm.H - 10);
         break;
      case 3:
         var1 = this.bk.Method83(this.bm.I, this.bm.H + 10);
      }

      if(!var1) {
         Main.Field59.a(this);
      }

   }

   public final void Method2() {
      Main.Field59.a(this);
      super.Method2();
   }
}
