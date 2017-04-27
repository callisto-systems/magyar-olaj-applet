package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.PAGE;
import hu.polygon.jform.client.PANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.a;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.w;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;

public final class FOLDER extends PANEL {
   public final BUTTON _part_left;
   public final BUTTON _part_right;
   public final w _font;
   public final i _page;
   public final q _tab_height;
   public final q _button_size;
   public final y _icon_left;
   public final y _icon_side;
   public final q _icon_gap;
   public final q _tab_sinking;
   public final g _foreground;
   public final g _shadow;
   public FontMetrics bf;
   public int be = 2;
   int bd;
   private boolean bc;
   private int bg;

   public FOLDER(Session var1) {
      super(var1);
      this._part_left = new BUTTON(var1);
      this._part_right = new BUTTON(var1);
      this._part_left.ad = "#FOLDER-LEFT";
      this._part_right.ad = "#FOLDER-RIGHT";
      this._part_left._icon.k = c.m;
      this._part_right._icon.k = c.l;
      this._part_left._focusable.D = false;
      this._part_right._focusable.D = false;
      this.a((aq)this._part_left);
      this.a((aq)this._part_right);
      this._font = new w(this, var1);
      this._page = new i(this, var1, (String)null);
      this._tab_height = new q(this, var1, 20);
      this._button_size = new q(this, var1, 16);
      this._icon_left = new y(this, var1, true);
      this._icon_side = new y(this, var1, false);
      this._icon_gap = new q(this, var1, 3);
      this._foreground = new g(this, var1, Color.black);
      this._shadow = new g(this, var1, (Color)null);
      this._tab_sinking = new q(this, var1, 2);
      super.ad = "#FOLDER";
      super._transparent.D = true;
      this._part_left.W = this;
      this._part_right.W = this;
   }

   public final void a(aq var1) {
      var1._visible.D = false;
      super.a(var1);
   }

   public final void Method13() {
      if(super.T != null) {
         this.bd = 0;
         int var1;
         aq var2;
         if(this._page.u != null) {
            for(var1 = 2; var1 < super.aA.size(); ++var1) {
               var2 = (aq)super.aA.elementAt(var1);
               if(var2._id.u.equals(this._page.u)) {
                  if(var2._enabled.D) {
                     this.bd = var1;
                  }
                  break;
               }
            }
         }

         if(this.bd == 0) {
            for(var1 = 2; var1 < super.aA.size(); ++var1) {
               if(((aq)super.aA.elementAt(var1))._enabled.D) {
                  this.bd = var1;
                  break;
               }
            }
         }

         for(var1 = 2; var1 < super.aA.size(); ++var1) {
            var2 = (aq)super.aA.elementAt(var1);
            if(var2._visible.D = var1 == this.bd) {
               this._page.Method32(var2._id.u);
            }
         }

         this.bf = super.T.getFontMetrics(this._font.C);
         this._tab_height.y = Math.max(this._tab_height.y, this.bf.getAscent() + 10);
         super.Method13();
      }
   }

   public final void Method0() {
      this._part_left.a(super.O - this._button_size.y * 2, 0, this._button_size.y, this._button_size.y);
      this._part_right.a(super.O - this._button_size.y, 0, this._button_size.y, this._button_size.y);
      this._part_left._visible.D = false;
      this._part_right._visible.D = false;

      for(int var1 = 2; var1 < super.aA.size(); ++var1) {
         ((aq)super.aA.elementAt(var1)).a(1, this._tab_height.y + 1, super.O - 2, super.J - this._tab_height.y - 2);
      }

      if(super.O > this.bg && this.bg != 0) {
         this.be = 2;
      }

      super.Method0();
   }

   public final void Method38() {
      super.Y.Field102.setColor(super._border_highlight.s);
      super.Y.Field102.drawLine(0, this._tab_height.y, 0, super.J);
      if(this.bc) {
         super.Y.Field102.drawLine(0, this._tab_height.y, super.O, this._tab_height.y);
      }

      super.Y.Field102.setColor(super._border_shadow.s);
      super.Y.Field102.drawLine(super.O - 1, this._tab_height.y, super.O - 1, super.J);
      super.Y.Field102.drawLine(0, super.J - 1, super.O, super.J - 1);
   }

   public final void a(Graphics var1) {
      this.bc = true;
      int var2 = 0;

      int var3;
      for(var3 = this.be; var3 < super.aA.size(); ++var3) {
         Object var4 = super.aA.elementAt(var3);
         if(var4 instanceof PAGE) {
            PAGE var5 = (PAGE)var4;
            if(var5._enabled.D) {
               var5.bb = this.bf.stringWidth(var5._title.u) + 20;
               if(var5._icon.k != null) {
                  a var6 = this.a(var5._icon.k, false, 0);
                  var5.bb += this._icon_gap.y + var6.Field103;
               }

               if(var2 + var5.bb + 3 > super.O - this._button_size.y * 2) {
                  this.p();
                  this.bg = super.O;
                  break;
               }

               int var7 = var3 == this.bd?0:this._tab_sinking.y;
               var1.setColor(var3 == this.bd?var5._background.s:super._background.s);
               if(!var5._transparent.D) {
                  var1.fillRect(var2, var7, var5.bb, this._tab_height.y - var7);
               }

               if(var3 == this.bd) {
                  if(!var5._transparent.D) {
                     var1.drawLine(var2, this._tab_height.y, var2 + var5.bb, this._tab_height.y);
                  }

                  var1.setColor(super._border_highlight.s);
                  var1.drawLine(0, this._tab_height.y, var2, this._tab_height.y);
                  var1.drawLine(var2 + var5.bb, this._tab_height.y, super.O - 1, this._tab_height.y);
                  this.bc = false;
               }

               var1.setColor(super._border_highlight.s);
               var1.drawLine(var2, var7, var2 + var5.bb, var7);
               var1.drawLine(var2, var7, var2, this._tab_height.y);
               var1.setColor(super._border_shadow.s);
               var1.drawLine(var2 + var5.bb, var7, var2 + var5.bb, this._tab_height.y - 1);
               this.a(this._font.C, new Rectangle(var2, var7, var5.bb, this._tab_height.y), var5._title.u, false, (String)null, 1, 5, 0, 0, 0, (Color)null, this._foreground.s, this._shadow.s, var5._icon.k, this._icon_left.D, this._icon_gap.y, true, this._icon_side.D, (String)null, (ag)null);
               var2 += var5.bb + 3;
            }
         }
      }

      if(!this._part_left._visible.D && this.be != 2) {
         this.p();
      }

      this._part_left._enabled.D = this.be != 2;
      this._part_right._enabled.D = var3 < super.aA.size();
   }

   private final void p() {
      this._part_left._visible.D = true;
      this._part_right._visible.D = true;
      if(this._part_left.Y == null) {
         this._part_left.Method35();
         this._part_right.Method35();
      }

   }

   public final boolean a(ag var1) {
      if(var1.a == 1001) {
         if(var1.Field78 == this._part_right) {
            ++this.be;
         } else {
            --this.be;
         }

         this.Method37();
         return true;
      } else {
         if(super._enabled.D && var1.a == 501 && var1.Field83 < this._tab_height.y) {
            int var2 = 0;

            for(int var3 = this.be; var3 < super.aA.size(); ++var3) {
               PAGE var4 = (PAGE)super.aA.elementAt(var3);
               if(var2 + var4.bb + 3 > super.O - this._button_size.y * 2) {
                  break;
               }

               if(var1.Field82 > var2 && var1.Field82 < var2 + var4.bb && this.bd != var3) {
                  this.Method32(this._page.u = var4._id.u);
                  this.Method49(var3, true);
                  break;
               }

               var2 += var4.bb + 3;
            }
         }

         return super.a(var1);
      }
   }

   public final boolean Method49(int var1, boolean var2) {
      if(var1 != this.bd) {
         PAGE var3 = (PAGE)super.aA.elementAt(this.bd);
         var3._visible.D = false;
         var3.Method34(true);
         this.bd = var1;
         var3 = (PAGE)super.aA.elementAt(this.bd);
         var3._visible.D = true;
         var3._width.y = super.O - 2;
         var3._height.y = super.J - this._tab_height.y - 2;
         var3.Method35();
         if(var2) {
            this.Method37();
            this._page.Method32(var3._id.u);
            this.Method30((String)null);
         }

         return true;
      } else {
         return false;
      }
   }
}
