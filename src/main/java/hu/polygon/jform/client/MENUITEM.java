package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.SUBMENU;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;
import java.awt.Color;

public class MENUITEM extends BUTTON {
   public MENUITEM(Session var1) {
      super(var1);
      super.ad = "#MENUITEM";
      super._alignment.b8 = 0;
      super._border.b8 = 7;
      super._selected_background.s = g.p;
      super._border_tickness.y = 1;
      super._focusable.D = false;
      super._half_transparent.D = true;
      super._disabled_foreground.s = Color.gray;
      super._disabled_shadow.s = null;
   }

   public boolean a(ag var1) {
      if(super._enabled.D) {
         switch(var1.a) {
         case 501:
            super.bF.a(false);
            this.Method33();
            super.T.a((aq)this);
            return true;
         case 502:
         case 503:
         default:
            break;
         case 504:
            super.bF.a(this);
            this.x();
            break;
         case 505:
            super.bF.a(true);
         }
      }

      return super.a(var1);
   }

   protected final void x() {
      for(int var1 = 0; var1 < super.aa.aA.size(); ++var1) {
         aq var2 = (aq)super.aa.aA.elementAt(var1);
         if(var2 instanceof SUBMENU) {
            ((SUBMENU)var2).y();
         }
      }

   }
}
