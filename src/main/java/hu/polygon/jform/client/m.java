package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ad;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.h;
import hu.polygon.jform.client.q;

public class m extends af {
   public final ad _part_horizontal;
   public final ad _part_vertical;
   public final aq _part_content;
   public final h _part_header;
   public final q _spacing;
   public final q _content_width;
   public final q _content_height;
   protected boolean aD = true;
   public int aB;
   public int aC;

   public m(Session var1, aq var2) {
      super(var1);
      this.a(this._part_content = var2);
      this.a((aq)(this._part_horizontal = new ad(var1, true, this, var2)));
      this.a((aq)(this._part_vertical = new ad(var1, false, this, var2)));
      this._spacing = new q(this, var1, 2);
      this._content_width = new q(this, var1, 0);
      this._content_height = new q(this, var1, 0);
      this._part_header = new h(var1, this._spacing);
      this._part_header.ad = "#HEADER";
      this.a((aq)this._part_header);
      super._transparent.D = true;
      super.R = false;
   }

   public final f a(String var1) {
      return this.a(var1, this._part_content);
   }

   public void c() {
      this.b();
   }

   protected final void b() {
      if(this._part_content instanceof af) {
         this.aB = this._content_width.y;
         this.aC = this._content_height.y;

         for(int var1 = 0; var1 < super._content.ci.aA.size(); ++var1) {
            aq var2 = (aq)super._content.ci.aA.elementAt(var1);
            if(var2._visible.D) {
               this.aB = Math.max(var2._x.y + var2._width.y + this._spacing.y, this.aB);
               this.aC = Math.max(var2._y.y + var2._height.y + this._spacing.y, this.aC);
            }
         }
      }

   }

   public void Method2() {
      super.Field123.a(this);
      super.Method2();
   }

   public final void Method36() {
      boolean var1 = this._part_horizontal._visible.D;
      boolean var2 = this._part_vertical._visible.D;
      super.Field123.Method66(this);

      while(true) {
         this.c();
         this._part_horizontal._visible.D = this.aB > super.O && this._part_horizontal._enabled.D;
         int var3 = this.aC + this._part_header.J;
         if(this._part_horizontal._visible.D) {
            var3 += 16;
         }

         this._part_vertical._visible.D = var3 > super.J && this._part_vertical._enabled.D;
         if(this._part_vertical._visible.D) {
            this._part_horizontal._visible.D = this.aB + 16 > super.O && this._part_horizontal._enabled.D;
         }

         var3 = super.J - this._part_header.J;
         if(this._part_horizontal._visible.D) {
            var3 -= 16;
         }

         int var4 = super.O;
         if(this._part_vertical._visible.D) {
            var4 -= 16;
         }

         if(this._part_horizontal._visible.D) {
            this._part_horizontal.ae = super.J - 16;
            this._part_horizontal.O = var4;
            this._part_horizontal.J = 16;
         } else {
            this._part_content.I = 0;
         }

         if(this._part_vertical._visible.D) {
            this._part_vertical.ae = this._part_header.J;
            this._part_vertical.af = super.O - 16;
            this._part_vertical.O = 16;
            this._part_vertical.J = var3;
         } else {
            this._part_content.H = 0;
         }

         this._part_content.ae = this._part_header.J;
         this._part_content.O = var4;
         this._part_content.J = var3;
         this._part_header.O = Math.max(super.O, this.aB);
         if(this.aB < this._part_content.I + this._part_content.O && this.aB > this._part_content.O) {
            this._part_content.I = this.aB - this._part_content.O;
         }

         if(this.aC < this._part_content.H + this._part_content.J && this.aC > this._part_content.J) {
            this._part_content.H = this.aC - this._part_content.J;
         }

         if(this.aB < var4) {
            this.aB = var4;
         }

         if(this.aC < var3) {
            this.aC = var3;
         }

         if(var1 == this._part_horizontal._visible.D && var2 == this._part_vertical._visible.D || this.aD) {
            this._part_header.I = this._part_content.I;
            this._part_horizontal.a(this._part_horizontal.af, this._part_horizontal.ae, this._part_horizontal.O, this._part_horizontal.J);
            this._part_vertical.a(this._part_vertical.af, this._part_vertical.ae, this._part_vertical.O, this._part_vertical.J);
            this._part_content.a(this._part_content.af, this._part_content.ae, this._part_content.O, this._part_content.J);
            this._part_header.a(this._part_header.af, this._part_header.ae, this._part_header.O, this._part_header.J);
            return;
         }

         var1 = this._part_horizontal._visible.D;
         var2 = this._part_vertical._visible.D;
      }
   }

   protected final boolean Method83(int var1, int var2) {
      if(var1 >= this.aB - this._part_content.O) {
         var1 = this.aB - this._part_content.O;
      } else {
         var1 = var1 / 10 * 10;
      }

      if(var2 >= this.aC - this._part_content.J) {
         var2 = this.aC - this._part_content.J;
      } else {
         var2 = var2 / 10 * 10;
      }

      if(var2 < 0) {
         var2 = 0;
      }

      if(var1 < 0) {
         var1 = 0;
      }

      if(this._part_content.I == var1 && this._part_content.H == var2) {
         return false;
      } else {
         this._part_content.I = var1;
         this._part_content.H = var2;
         if(this._part_horizontal._visible.D) {
            this._part_horizontal.a(true, false);
         }

         if(this._part_vertical._visible.D) {
            this._part_vertical.a(true, false);
         }

         if(this._part_header.J != 0) {
            this._part_header.I = var1;
            this._part_header.a(true, false);
         }

         this._part_content.a(true, false);
         this.Method40(false, true);
         super.T.Field2 = this;
         this.a(true);
         return true;
      }
   }

   protected final void Method84(aq var1) {
      int var2 = this._part_content.I;
      int var3 = this._part_content.H;
      if(var1.ae < this._part_content.H) {
         var3 = var1.ae;
      } else if(var1.ae + var1.J > this._part_content.H + this._part_content.J) {
         var3 = var1.ae + var1.J - this._part_content.J;
      }

      if(var1.af < this._part_content.I) {
         var2 = var1.af;
      } else if(var1.af > this._part_content.I + this._part_content.O) {
         var2 = var1.af - this._part_content.O;
      }

      this.Method83(var2, var3);
   }

   public boolean a(ag var1) {
      if(var1.Field85 != 0) {
         aq.ag.a(super.T, false);
         this.Method83(this._part_content.I, this._part_content.H + var1.Field85 * 20);
         return true;
      } else {
         return false;
      }
   }
}
