package hu.polygon.jform.client;

import hu.polygon.jform.client.LIST;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.y;
import java.awt.FontMetrics;

public final class RADIOBOX extends LIST {
   public final y _horizontal;

   public RADIOBOX(Session var1) {
      super(var1);
      this._horizontal = new y(this, var1, false);
      super.ad = "#RADIOBOX";
      super._part_items.ad = "#RADIOBOX-ITEM";
      super._part_items._selected_border.b8 = 7;
      super._part_content._border.b8 = 7;
      super._part_content._transparent.D = true;
      super._part_items._selected_icon.k = c.f;
      super._part_items._icon.k = c.e;
      super._part_items._half_transparent.D = false;
      super._part_items._transparent.D = true;
   }

   public final void Method13() {
      if(String.valueOf(super._part_items._selected_icon.k).indexOf(35) != -1) {
         super._part_items._selected_icon.k = super._selection_name.u == null?c.g:c.f;
      }

      if(String.valueOf(super._part_items._icon.k).indexOf(35) != -1) {
         super._part_items._icon.k = super._selection_name.u == null?c.c:c.e;
      }

      super.Method13();
   }

   public final void c() {
      af var1 = (af)super._part_content;
      if(!var1.aA.isEmpty()) {
         super.aB = super._part_vertical._visible.D?super.O - 16 - super._spacing.y * 2 - super._border_tickness.y * 2:super.O - super._spacing.y * 2 - super._border_tickness.y * 2;
         FontMetrics var2 = super.T.getFontMetrics(super._part_items._font.C);
         int var3 = var2.getHeight() + 2;
         int var4 = super.J - super._spacing.y * 2 - super._border_tickness.y * 2;
         var4 = var4 % var1.aA.size() == 0?var4 - 1:var4;
         int var5 = (this._horizontal.D?super.aB - super._spacing.y:var4) / var1.aA.size();
         if(var5 < var3) {
            var5 = var3;
         }

         for(int var6 = 0; var6 < var1.aA.size(); ++var6) {
            aq var7 = (aq)var1.aA.elementAt(var6);
            if(this._horizontal.D) {
               var7.a(var5 * var6 + super._border_tickness.y + super._spacing.y, super._border_tickness.y + super._spacing.y, var5, var4);
            } else {
               var7.a(super._border_tickness.y + super._spacing.y, var5 * var6 + super._border_tickness.y + super._spacing.y, super.aB, var5);
            }
         }

         this.b();
      }
   }
}
