package hu.polygon.jform.client;

import hu.polygon.jform.client.SCROLLPANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.aa;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.ap;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.as;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.p;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class TABLE extends SCROLLPANEL {
   public final ap _columns;
   public final ap _rows;
   public final q _row_height;
   public final q _cell_width;
   public final i _row_name;
   public final p _selection;
   public final i _selection_name;
   public final i _key_column;
   public final i _focused_column;
   public final g _highlight;
   public final y _single_action;
   public final as _part_cells;
   private Color[][] aO;
   int aP;
   private final Vector aN = new Vector();
   private boolean aQ;
   private String aM;

   public TABLE(Session var1) {
      super(var1);
      this._columns = new ap(this, var1);
      this._rows = new ap(this, var1);
      this._row_height = new q(this, var1, 20);
      this._cell_width = new q(this, var1, 150);
      this._row_name = new i(this, var1, "row");
      this._highlight = new g(this, var1, g.p);
      this._selection = new p(this, var1);
      this._selection_name = new i(this, var1, (String)null);
      this._key_column = new i(this, var1, (String)null);
      this._focused_column = new i(this, var1, (String)null);
      this._single_action = new y(this, var1, true);
      this._part_cells = new as(super.Field123);
      super.ad = "#TABLE";
      super._id = super._part_content._id;
      super._part_content._background.s = Color.white;
      super._part_content._border.b8 = 10;
      super._focusable.D = true;
      super._part_header.J = 20;
      super.Field123.a((String)this._part_cells.ad, (aq)this._part_cells);
   }

   public final void Method5() {
      super._content.ci.Method2();
      super._content.ci.aA.removeAllElements();
      this.aN.removeAllElements();
      if(super.Field120) {
         this._rows.Method5();
         this._columns.Method5();
         this._selection.Method5();
      }

      super.Method5();
      this.Method35();
   }

   public final void Method13() {
      if(!super._content.ci.aA.isEmpty()) {
         super._content.ci.Method2();
         super._content.ci.aA.removeAllElements();
         this.aN.removeAllElements();
      }

      int var1 = this._rows.G.cf.size();
      int var2 = this._columns.G.cf.size();
      this.aO = new Color[var1][var2];
      int var3 = super._spacing.y;
      int[] var4 = super.Field123.Method68(this);
      super._part_header.ai = new String[var2];
      super._part_header.aq = new String[var2];
      super._part_header.at = new URL[var2];
      super._part_header.an = new String[var2];
      super._part_header.am = new int[var2];

      int var5;
      ao var6;
      int var7;
      for(var5 = 0; var5 < var2; ++var5) {
         var6 = (ao)this._columns.G.cf.elementAt(var5);
         var7 = this._cell_width.y;
         String var8;
         if(var4 != null && var4.length > var5) {
            var7 = var4[var5];
         } else {
            var8 = (String)var6.cd.get("width");
            if(var8 != null) {
               try {
                  var7 = Integer.parseInt(var8);
               } catch (Exception var19) {
                  super.Field123.Method62("Invalid column width: " + var8);
               }
            }
         }

         super._part_header.ai[var5] = var6.Method44("hint", "");
         super._part_header.aq[var5] = var6.Method44("text", "");
         super._part_header.an[var5] = var6.Method44("action", "");
         super._part_header.am[var5] = var7;
         var8 = var6.Method44("header", "#EMPTY");
         if(!var8.equals("#EMPTY")) {
            try {
               super._part_header.at[var5] = super.Field123.a(var8);
            } catch (Exception var18) {
               super.Field123.Method62("Invalid header icon URL: " + var8);
            }
         }
      }

      this.aM = null;
      this.aP = 0;

      for(var5 = 0; var5 < var1; ++var5) {
         var6 = (ao)this._rows.G.cf.elementAt(var5);
         boolean var21 = false;
         if(var6.ce.equals(this._row_name.u)) {
            int var22 = super._spacing.y;

            for(int var9 = 0; var9 < var2; ++var9) {
               ao var10 = (ao)this._columns.G.cf.elementAt(var9);
               as var11 = (as)this._part_cells.clone();
               var11.ad = null;
               var11.T = super.T;
               var11._part_menu = super._part_content._part_menu;
               var11._x.y = var22;
               var11._y.y = var3;
               var11._width.y = this._cell_width.y;
               var11._height.y = this._row_height.y;
               ao var12 = var10.Method46("header", false);
               if(var12 != null) {
                  var10.cf.removeElement(var12);
               }

               hu.polygon.jform.client.aa.a(var11, var10, true, true);
               if(var12 != null) {
                  var10.cf.addElement(var12);
               }

               var11._id = super._part_content._id;
               this.a(this.aP, var9, var11, var6.cd);
               if(var4 != null && var4.length > var9) {
                  var11._width.y = var4[var9];
               }

               String var13 = (String)var10.cd.get("id");
               ao var14 = var6.Method46(var13, false);
               var11._action.u = var13;
               if(var14 == null) {
                  var11._text.u = "";
               } else {
                  String var15 = (String)var14.cd.get("header");
                  if(var15 != null) {
                     var14.cd.remove("header");
                     if(var15.equals("#EMPTY")) {
                        super._part_header.at[var9] = null;
                     } else {
                        try {
                           super._part_header.at[var9] = super.Field123.a(var15);
                        } catch (Exception var17) {
                           super.Field123.Method62("Invalid header icon URL: " + var15);
                        }
                     }
                  }

                  this.a(this.aP, var9, var11, var14.cd);
                  if(var15 != null) {
                     var14.cd.put("header", var15);
                  }

                  var11._text.u = var14.ch;
                  if(this.aM == null) {
                     if(this._key_column.u != null && this._key_column.u.charAt(0) != 35) {
                        this.aM = this._key_column.u;
                     } else {
                        this.aM = var14.ce;
                     }
                  }
               }

               var11.ah = this;
               var11._model.u = String.valueOf(this.aP);
               var22 += var11._width.y + super._spacing.y;
               if(var11._hint.u == null) {
                  var11._hint.u = super._part_content._hint.u;
               }

               super._content.ci.a((aq)var11);
               this.aO[this.aP][var9] = var11._background.s;
            }

            var3 += this._row_height.y + super._spacing.y;
            ++this.aP;
         }
      }

      this.aQ = this._key_column.u != null && this._key_column.u.charAt(0) == 35;
      var5 = 0;

      for(int var20 = 0; var20 < this.aP; ++var20) {
         for(var7 = 0; var7 < var2; ++var7) {
            as var23 = (as)super._content.ci.aA.elementAt(var5++);
            if(this.aQ) {
               if(this._selection.v.contains(var23._model.u)) {
                  var23._background.s = this._highlight.s;
                  if(!this.aN.contains(var23._model.u)) {
                     this.aN.addElement(var23._model.u);
                  }
               }
            } else if(this.aM.equals(var23._action.u) && this._selection.v.contains(var23._text.u)) {
               this.a(var23._model.u, true, false);
               if(!this.aN.contains(var23._model.u)) {
                  this.aN.addElement(var23._model.u);
               }
            }
         }
      }

      if(this.aN.isEmpty() && !super._content.ci.aA.isEmpty() && this._selection_name.u == null) {
         this.a("0", true, false);
         this.aN.addElement("0");
         this.d();
      }

      super.X = super._content.ci.aA.isEmpty()?null:(aq)super._content.ci.aA.elementAt(0);
      super.Method13();
   }

   private final void a(int var1, int var2, aq var3, Hashtable var4) {
      if(!var4.isEmpty()) {
         Enumeration var5 = var4.keys();

         while(var5.hasMoreElements()) {
            String var6 = (String)var5.nextElement();
            var3.a(var6, (String)var4.get(var6));
         }
      }

   }

   public final boolean a(ag var1) {
      if(super._part_content._enabled.D && var1.a == 1001) {
         if(var1.Field86 == null) {
            as var2 = (as)var1.Field78;
            if(this._selection_name.u == null) {
               if(this.aN.contains(var2._model.u)) {
                  return super.a(var1);
               }

               if(this._selection_name.u == null && !this.aN.isEmpty()) {
                  String var3 = (String)this.aN.firstElement();
                  this.a(var3, false, true);
                  this.aN.removeAllElements();
               }

               this.a(var2._model.u, true, true);
               this.aN.addElement(var2._model.u);
            } else {
               boolean var4 = this.aN.contains(var2._model.u);
               this.a(var2._model.u, !var4, true);
               if(var4) {
                  this.aN.removeElement(var2._model.u);
               } else {
                  this.aN.addElement(var2._model.u);
               }
            }

            super.X = var2;
            super._content.ci.Method38();
            super.T.Field2 = this;
            super._content.ci.a(true);
            this.d();
            if(!this._single_action.D) {
               return true;
            }
         }

         super._part_content.Method30((String)null);
      }

      return super.a(var1);
   }

   private final void d() {
      ao var1 = this._selection.Method85();
      if(var1 != null && this.aM != null) {
         var1.cf.removeAllElements();
         var1.ch = null;

         for(int var2 = 0; var2 < super._content.ci.aA.size(); ++var2) {
            as var3 = (as)super._content.ci.aA.elementAt(var2);
            if(var3.M) {
               ao var4 = this._focused_column.Method85();
               if(var4 != null) {
                  var4.ch = var3._action.u;
               }
            }

            if(this.aM.equals(var3._action.u)) {
               String var6 = null;
               if(this.aQ) {
                  if(this.aN.contains(var3._model.u)) {
                     var6 = var3._model.u;
                  }
               } else if(this.aN.contains(var3._model.u)) {
                  var6 = var3._text.u;
               }

               if(var6 != null) {
                  if(this._selection_name.u == null) {
                     var1.ch = var6;
                  } else {
                     ao var5 = new ao();
                     var5.ce = this._selection_name.u;
                     var5.ch = var6;
                     var1.cf.addElement(var5);
                  }
               }
            }
         }
      }

   }

   private final void a(String var1, boolean var2, boolean var3) {
      int var4 = 0;

      for(int var5 = 0; var5 < this.aP; ++var5) {
         for(int var6 = 0; var6 < this._columns.G.cf.size(); ++var6) {
            as var7 = (as)super._content.ci.aA.elementAt(var4++);
            if(var7._model.u.equals(var1)) {
               var7._background.s = var2?this._highlight.s:this.aO[var5][var6];
               if(var3) {
                  var7.a(false, false);
                  var7.a(false);
               }
            }
         }
      }

   }
}
