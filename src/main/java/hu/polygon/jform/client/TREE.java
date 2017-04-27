package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.SCROLLPANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.ap;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.p;
import hu.polygon.jform.client.u;
import java.awt.Color;
import java.awt.FontMetrics;
import java.util.Enumeration;
import java.util.Hashtable;

public final class TREE extends SCROLLPANEL {
   public final p _selection;
   public final ap _nodes;
   public final c _leaf_icon;
   public final c _opened_icon;
   public final c _closed_icon;
   public final i _selection_name;
   public final BUTTON _part_nodes;
   private final u aL = new u();
   private final Hashtable aG = new Hashtable();
   private int aI;
   private int aK;
   private int aJ;
   private boolean aF;
   private boolean aH;

   public TREE(Session var1) {
      super(var1);
      this._selection = new p(this, var1);
      this._nodes = new ap(this, var1);
      this._opened_icon = new c(this, var1, c.o);
      this._closed_icon = new c(this, var1, c.Field107);
      this._leaf_icon = new c(this, var1, c.j);
      this._selection_name = new i(this, var1, (String)null);
      super._id = super._part_content._id;
      this._part_nodes = new BUTTON(var1);
      this._part_nodes.bG = true;
      this._part_nodes.bH = true;
      this._part_nodes.ad = "#TREE-NODE";
      this._part_nodes._border_tickness.y = 1;
      this._part_nodes._icon_side.D = true;
      this._part_nodes._selected_background.s = g.p;
      this._part_nodes._border.b8 = 7;
      this._part_nodes._selected_border.b8 = 7;
      this._part_nodes._disabled_foreground.s = Color.black;
      this._part_nodes._disabled_shadow.s = null;
      this._part_nodes._half_transparent.D = true;
      this._part_nodes._transparent.D = true;
      this._part_nodes._enabled = super._part_content._enabled;
      this._part_nodes._id = super._part_content._id;
      super.ad = "#TREE";
      super._part_content._border.b8 = 10;
      super._part_content._background.s = Color.white;
      super._focusable.D = true;
      super._spacing.y = 2;
      super.aD = false;
      this.aL.a = super._content.ci;
   }

   public final void Method5() {
      this.Method2();
      super._content.ci.aA.removeAllElements();
      this.aL.Field125.removeAllElements();
      this.aG.clear();
      if(super.Field120) {
         this._nodes.Method5();
         this._selection.Method5();
      }

      super.Method5();
      this.Method35();
   }

   public final void Method13() {
      super.X = null;
      if(!this._nodes.G.cf.isEmpty()) {
         this.aJ = super._spacing.y + super._border_tickness.y;
         this.aH = false;
         ao var1 = this._nodes.Method85();
         if(var1 == null) {
            var1 = this._nodes.G;
         }

         this.aF = false;
         this.a(var1, (String)null, this.aJ, true);
         if(this._selection_name.u == null && !this.aH) {
            BUTTON var2 = (BUTTON)this.aL.Field125.elementAt(0);
            aq var3 = super.X;
            var2.Method80(true);
            if(var3 != null) {
               super.X = var3;
            }

            this._selection.Method32(var2._model.u);
         }
      }

      if(super.X == null) {
         super.X = super._content.ci.aA.isEmpty()?null:(aq)super._content.ci.aA.elementAt(0);
      }

      super.Method13();
   }

   private final void a(ao var1, String var2, int var3, boolean var4) {
      int var5 = 0;
      if(this.aF) {
         BUTTON var6 = (BUTTON)this._part_nodes.clone();
         var6.W = this;
         var6.T = super.T;
         var6._enabled = super._part_content._enabled;
         var6._part_menu = super._part_content._part_menu;
         if(var2 == null) {
            var2 = var1.ce;
         } else {
            var2 = var2 + '/' + var1.ce;
         }

         var6._model.u = var2;
         if(var1.cf.isEmpty()) {
            var6._icon.k = this._leaf_icon.k;
            var6._frame.u = "";
            if(this._selection_name.u == null) {
               var6.bF = this.aL;
               this.aL.Field125.addElement(var6);
            }

            if(this._selection.v.contains(var2)) {
               var6.Method80(true);
               this.aH = true;
               if(super.X == null) {
                  super.X = var6;
               }
            }
         } else {
            var6._half_transparent.D = false;
            var6._icon.k = this._opened_icon.k;
            var6._selected_icon.k = this._closed_icon.k;
            this.aG.put(var6, var1);
            if(super.X == null && this._selection.v.contains(var2)) {
               super.X = var6;
            }
         }

         Enumeration var7 = var1.cd.keys();

         while(var7.hasMoreElements()) {
            String var8 = (String)var7.nextElement();
            var6.a(var8, (String)var1.cd.get(var8));
         }

         if(var6._text.u.length() == 0) {
            var6._text.u = var1.ch == null?var1.ce:var1.ch;
         }

         FontMetrics var11 = super.T.getFontMetrics(var6._font.C);
         var5 = var11.getHeight() + super._spacing.y + 4;
         int var9 = this.a(var6._icon.k, false, 0).Field103;
         var6.a(var3, this.aJ, var11.stringWidth(var6._text.u) + var9 + var6._icon_gap.y + var6._border_tickness.y * 2 + 7, var5);
         if(var4) {
            this.aJ += var5;
         }

         super._content.ci.a((aq)var6);
         var6._visible.D = var4;
         if(var6._frame.u == null) {
            var6._selected_wallpaper.k = null;
            var6._selected_border.b8 = 7;
            var6._border.b8 = 7;
            if(var4 && var6.w()) {
               var4 = false;
            }
         }
      } else {
         this.aF = true;
      }

      var3 += var5;

      for(int var10 = 0; var10 < var1.cf.size(); ++var10) {
         this.a((ao)var1.cf.elementAt(var10), var2, var3, var4);
      }

   }

   public final boolean a(ag var1) {
      if(var1.a == 1001) {
         BUTTON var2 = (BUTTON)var1.Field78;
         if(var2._frame.u != null) {
            ao var3 = this._selection.Method85();
            if(var3 != null) {
               if(this._selection_name.u == null) {
                  var3.ch = var2._model.u;
                  var3.cf.removeAllElements();
               } else {
                  ao var4 = new ao();
                  var4.ce = this._selection_name.u;
                  var4.ch = var2._model.u;
                  if(var2.w()) {
                     var3.cf.addElement(var4);
                  } else {
                     var3.cf.removeElement(var4);
                  }

                  var3.ch = null;
               }
            }

            super._part_content.Method30((String)null);
         } else {
            int var7 = 0;
            int var8 = var2._y.y;

            for(int var5 = super._content.ci.aA.indexOf(var2); var5 < super._content.ci.aA.size(); ++var5) {
               BUTTON var6 = (BUTTON)super._content.ci.aA.elementAt(var5);
               if(var7 != 0) {
                  if(var6._x.y > var7) {
                     var6._visible.D = false;
                     continue;
                  }

                  var6._visible.D = true;
                  var7 = 0;
               }

               if(!var6._visible.D) {
                  var6._visible.D = true;
               }

               if(var6.w()) {
                  var7 = var6._x.y;
               }

               var6.a(var6._x.y, var8, var6._width.y, var6._height.y);
               var8 += super.T.getFontMetrics(var2._font.C).getHeight() + super._spacing.y + 4;
            }

            ((ao)this.aG.get(var2)).cd.put("state", String.valueOf(var2.w()));
            this.Method35();
            this.Method37();
         }
      }

      return super.a(var1);
   }
}
