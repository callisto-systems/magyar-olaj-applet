package hu.polygon.jform.client;

import hu.polygon.jform.client.PANEL;
import hu.polygon.jform.client.SUBMENU;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.a;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.u;
import java.awt.FontMetrics;

public final class MENUBAR extends PANEL {
   private final u bh = new u();

   public MENUBAR(Session var1) {
      super(var1);
      super.ad = "#MENUBAR";
      super._background.s = g.r;
   }

   public final void a(aq var1) {
      if(var1 instanceof SUBMENU) {
         SUBMENU var2 = (SUBMENU)var1;
         var2._alignment.b8 = 1;
         var2._part_menu.aR = this;
         var2.bK = false;
         super.a((aq)var2);
         var2._icon.k = null;
      }

   }

   public final void Method0() {
      if(!super.aA.isEmpty()) {
         this.bh.Field125.removeAllElements();
         this.bh.a = this;
         int var1 = super.ac.x;

         for(int var2 = 0; var2 < super.aA.size(); ++var2) {
            aq var3 = (aq)super.aA.elementAt(var2);
            if(var3._visible.D) {
               var3._focusable.D = false;
               if(var3 instanceof SUBMENU) {
                  SUBMENU var4 = (SUBMENU)var3;
                  var4._part_menu.aT = 2;
                  var4.bF = this.bh;
                  this.bh.Field125.addElement(var4);
                  FontMetrics var5 = super.T.getFontMetrics(var4._font.C);
                  int var6 = var5.stringWidth(var4._text.u) + 10 + var4._border_tickness.y * 2;
                  if(var4._icon.k != null) {
                     a var7 = this.a(var4._icon.k, false, 0);
                     var6 += var7.Field103 + var4._icon_gap.y;
                  }

                  var4.ae = var4._y.y = super.ac.y;
                  var4.af = var4._x.y = var1;
                  var4.J = var4._height.y = super.ac.height - 1;
                  var4.O = var4._width.y = var6;
                  var1 += var6;
               }
            }
         }

         super.Method0();
      }
   }

   final void Method88(boolean var1) {
      for(int var2 = 0; var2 < super.aA.size(); ++var2) {
         Object var3 = super.aA.elementAt(var2);
         if(var3 instanceof SUBMENU) {
            SUBMENU var4 = (SUBMENU)var3;
            var4.bK = var1;
         }
      }

      if(!var1) {
         super.aa.Method37();
      }

   }
}
