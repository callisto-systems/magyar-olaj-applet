package hu.polygon.jform.client;

import hu.polygon.jform.client.MENUBAR;
import hu.polygon.jform.client.MENUITEM;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.an;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import java.awt.Cursor;

public final class SUBMENU extends MENUITEM {
   public boolean bK = true;

   public SUBMENU(Session var1) {
      super(var1);
      super._part_menu = new an(var1);
      super._part_menu.Field122 = this;
      super.ad = "#SUBMENU";
      super._icon_left.D = false;
      super._icon_side.D = true;
      super._icon.k = c.l;
      super._part_menu.aT = 1;
   }

   public final boolean a(ag var1) {
      if(super._enabled.D) {
         switch(var1.a) {
         case 501:
            this.Method33();
            return true;
         case 502:
         case 503:
         default:
            break;
         case 504:
            if(this.bK) {
               this.z();
            }

            super.T.setCursor(Cursor.getPredefinedCursor(12));
            return true;
         case 505:
            if(this.bK) {
               super.bF.a(true);
            }

            return true;
         }
      }

      return super.a(var1);
   }

   public final void Method33() {
      boolean var1 = super.T.Method9(super._part_menu);
      if(!var1 && !super._part_menu._content.ci.aA.isEmpty()) {
         super.T.a((aq)this);
         this.z();
         if(super.aa instanceof MENUBAR) {
            ((MENUBAR)super.aa).Method88(true);
         }
      }

   }

   private final void z() {
      super.bF.a(this);
      if(!super.T.Method9(super._part_menu) && !super._part_menu._content.ci.aA.isEmpty()) {
         this.x();
         super._part_menu.a(this, true);
      }

   }

   final void y() {
      if(super.T.Method9(super._part_menu)) {
         super.T.a((aq)this, (aq)super._part_menu);
         af var1 = (af)super._part_menu._part_content;

         for(int var2 = 0; var2 < var1.aA.size(); ++var2) {
            aq var3 = (aq)var1.aA.elementAt(var2);
            if(var3 instanceof SUBMENU) {
               ((SUBMENU)var3).x();
            }
         }
      }

   }
}
