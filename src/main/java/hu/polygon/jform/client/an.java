package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.CHECKBOX;
import hu.polygon.jform.client.MENUBAR;
import hu.polygon.jform.client.MENUITEM;
import hu.polygon.jform.client.SCROLLPANEL;
import hu.polygon.jform.client.SUBMENU;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.a;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.u;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Point;

public class an extends SCROLLPANEL {
   MENUBAR aR;
   public int aT;
   protected final u aS = new u();

   public an(Session var1) {
      super(var1);
      super.ad = "#MENU";
      super._part_content._background.s = Color.white;
      super._part_content._border.b8 = 14;
      super._part_content.U = false;
      super._part_horizontal.U = false;
      super._part_vertical.U = false;
      super._part_header.U = false;
      super._part_horizontal._part_down.U = false;
      super._part_horizontal._part_up.U = false;
      super._part_horizontal._part_slide.U = false;
      super._part_vertical._part_down.U = false;
      super._part_vertical._part_up.U = false;
      super._part_vertical._part_slide.U = false;
      super.U = false;
   }

   public final void a(aq var1, boolean var2) {
      this.a(0, var2);
      Point var3 = hu.polygon.jform.client.ac.Method8(var1);
      switch(this.aT) {
      case 0:
         super._x.y = super.T.e;
         super._y.y = super.T.d;
         break;
      case 1:
         Point var4 = hu.polygon.jform.client.ac.Method8((aq)var1.Field122.Field122);
         super._x.y = var4.x + ((aq)var1.Field122.Field122).O;
         super._y.y = var3.y;
         break;
      case 2:
         Point var5 = hu.polygon.jform.client.ac.Method8(var1.aa);
         super._x.y = var3.x;
         super._y.y = var5.y + var1.aa.J;
         break;
      case 3:
         super._x.y = var3.x;
         super._y.y = var3.y + var1.J;
         super._width.y = var1.O;
      }

      if(super.T.Field0.J < super._height.y + super._y.y && this.aT != 0) {
         if(super.T.Field0.J - super._y.y > super._y.y - var1.J) {
            super._height.y = super.T.Field0.J - super._y.y;
            if(this.aT == 1) {
               super._width.y += 16;
            }
         } else {
            if(this.aT == 1) {
               var3.y += var1.J;
            }

            super._height.y = Math.min(var3.y, super._height.y);
            super._y.y = var3.y - super._height.y;
         }
      }

      this.a(super._x.y, super._y.y, super._width.y, super._height.y);
      this.Method35();
      super.T.Method10(this);
   }

   protected final void a(int var1, boolean var2) {
      if(!super._content.ci.aA.isEmpty()) {
         if(var2) {
            this.aS.Field125.removeAllElements();
            this.aS.a = super._content.ci;
         }

         int var3 = super._spacing.y;
         int var4 = var1;

         int var5;
         aq var6;
         BUTTON var7;
         for(var5 = 0; var5 < super._content.ci.aA.size(); ++var5) {
            var6 = (aq)super._content.ci.aA.elementAt(var5);
            if(var6._visible.D) {
               if(this.aT != 3 && !(var6 instanceof CHECKBOX)) {
                  var6.U = false;
               }

               if(var1 == 0) {
                  var6._focusable.D = false;
               }

               if(var6 instanceof BUTTON) {
                  var7 = (BUTTON)var6;
                  if(var7 instanceof MENUITEM) {
                     var7.bF = this.aS;
                     this.aS.Field125.addElement(var7);
                  }

                  FontMetrics var8 = super.T.getFontMetrics(var7._font.C);
                  var7.J = var8.getHeight() + super._spacing.y + var7._border_tickness.y * 2;
                  int var9 = var8.stringWidth(var7._text.u) + 2 + var7._border_tickness.y * 2;
                  if(var7._icon.k != null) {
                     a var10 = this.a(var7._icon.k, false, 0);
                     var9 += var10.Field103 + var7._icon_gap.y;
                     if(var7.J < var10.a) {
                        var7.J = var10.a;
                     }
                  }

                  if(var9 > var4) {
                     var4 = var9;
                  }
               } else {
                  var6.J = 6 + var6._border_tickness.y * 2;
               }

               var6.ae = var3;
               var3 = var3 + var6.J + super._spacing.y;
            }
         }

         for(var5 = 0; var5 < super._content.ci.aA.size(); ++var5) {
            var6 = (aq)super._content.ci.aA.elementAt(var5);
            var6.a(super._border_tickness.y + super._spacing.y, var6.ae, var4, var6.J);
            if(var6 instanceof BUTTON) {
               var7 = (BUTTON)var6;
               if(var7.w()) {
                  super._part_content.H = var7._y.y - super._spacing.y;
               }
            }
         }

         if(var1 == 0) {
            super.O = super._width.y = var4 + super._border_tickness.y * 2 + super._spacing.y * 2;
            super.J = super._height.y = var3;
         }

      }
   }

   public final void Method2() {
      if(this.aR != null && !(super.T.Field9 instanceof SUBMENU)) {
         this.aR.Method88(false);
      }

      super.Method2();
   }
}
