package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.an;
import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.p;
import java.awt.Color;

public class LIST extends an {
   public p _choices;
   public p _selection;
   public final i _selection_name;
   public final BUTTON _part_items;
   private boolean aU;

   public LIST(Session var1) {
      super(var1);
      this._choices = new p(this, var1);
      this._selection = new p(this, var1);
      this._selection_name = new i(this, var1, (String)null);
      this._part_items = new BUTTON(var1);
      this._part_items.bG = true;
      this._part_items.bH = true;
      this._part_items.ad = "#LIST-ITEM";
      this._part_items._alignment.b8 = 0;
      this._part_items._border_tickness.y = 1;
      this._part_items._icon_side.D = true;
      this._part_items._selected_background.s = g.p;
      this._part_items._border.b8 = 7;
      this._part_items._disabled_foreground.s = Color.black;
      this._part_items._disabled_shadow.s = null;
      this._part_items._half_transparent.D = true;
      super._id = super._part_content._id;
      this._part_items._enabled = super._part_content._enabled;
      this._part_items._hint = super._part_content._hint;
      this._part_items._id = super._part_content._id;
      super.ad = "#LIST";
      super._part_content._border.b8 = 10;
      super._part_content._background.s = Color.white;
      super._focusable.D = true;
      super.aD = false;
      super.aT = 3;
      super.aS.a = super._content.ci;
   }

   public final void Method5() {
      super._content.ci.Method2();
      super._content.ci.aA.removeAllElements();
      super.aS.Field125.removeAllElements();
      if(super.Field120) {
         this._choices.Method5();
         this._selection.Method5();
      }

      super.Method5();

      for(int var1 = 0; var1 < super._content.ci.aA.size(); ++var1) {
         ((BUTTON)super._content.ci.aA.elementAt(var1)).Method13();
      }

      this.Method35();
   }

   public void Method13() {
      this._part_items.T = super.T;
      this._part_items.W = (aq)(super.W == null?this:super.W);

      for(int var1 = 0; var1 < this._choices.w.size(); ++var1) {
         BUTTON var2 = (BUTTON)this._part_items.clone();
         var2._text.u = (String)this._choices.v.elementAt(var1);
         if(this._selection_name.u == null) {
            super.aS.Field125.addElement(var2);
            var2.bF = super.aS;
         }

         var2._part_menu = super._part_content._part_menu;
         super._content.ci.a((aq)var2);
      }

      this.aU = this._selection_name.u != null && this._selection_name.u.charAt(0) == 35;
      int[] var4 = this._choices.a(this.aU?this._selection.w:this._selection.v);
      if(var4.length == 0) {
         if(!this._choices.w.isEmpty() && this._selection_name.u == null) {
            ((BUTTON)super._content.ci.aA.elementAt(0)).Method80(true);
            this.e();
         }
      } else {
         int var5 = this._selection_name.u == null?1:var4.length;

         for(int var3 = 0; var3 < var5; ++var3) {
            ((BUTTON)super._content.ci.aA.elementAt(var4[var3])).Method80(true);
         }
      }

      super.X = super._content.ci.aA.isEmpty()?null:(aq)super._content.ci.aA.elementAt(0);
      super.Method13();
   }

   public void c() {
      super.aB = super._part_vertical._visible.D?super.O - 16 - super._spacing.y * 2:super.O - super._spacing.y * 2;
      this.a(super.aB - super._spacing.y, false);
      this.b();
   }

   public final boolean a(ag var1) {
      if(var1.a == 1001) {
         this.e();
         super._part_content.Method30((String)null);
         return true;
      } else {
         return super.a(var1);
      }
   }

   private final void e() {
      ao var1 = this._selection.Method85();
      if(var1 != null) {
         var1.cf.removeAllElements();

         for(int var2 = 0; var2 < super._content.ci.aA.size(); ++var2) {
            if(((BUTTON)super._content.ci.aA.elementAt(var2)).w()) {
               if(this._selection_name.u == null) {
                  var1.ch = (String)this._choices.w.elementAt(var2);
                  break;
               }

               ao var3 = new ao();
               if(this.aU) {
                  var3.ce = (String)this._choices.w.elementAt(var2);
                  var3.ch = (String)this._choices.v.elementAt(var2);
               } else {
                  var3.ce = this._selection_name.u;
                  var3.ch = (String)this._choices.w.elementAt(var2);
               }

               var1.cf.addElement(var3);
            }
         }
      }

   }
}
