package hu.polygon.jform.client;

import hu.polygon.jform.client.LABEL;
import hu.polygon.jform.client.LIST;
import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TREE;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.av;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.u;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.net.URL;

public class BUTTON extends LABEL {
   public final q _auto;
   public final i _true;
   public final i _false;
   public i _state;
   public av _selected_border;
   public g _selected_background;
   public g _selected_foreground;
   public g _selected_shadow;
   public c _selected_icon;
   public c _selected_wallpaper;
   public g _disabled_foreground;
   public g _disabled_shadow;
   public final c _disabled_icon;
   public y _half_transparent;
   int bI;
   u bF;
   aq bJ;
   boolean bH;
   public boolean bG;
   public boolean bE;

   public BUTTON(Session var1) {
      super(var1);
      this._true = new i(this, var1, "true");
      this._false = new i(this, var1, "false");
      this._state = new i(this, var1, "false");
      this._half_transparent = new y(this, var1, false);
      this._selected_border = new av(this, var1, (byte)10);
      this._selected_background = new g(this, var1, Color.lightGray);
      this._selected_foreground = new g(this, var1, Color.black);
      this._selected_icon = new c(this, var1, (URL)null);
      this._selected_shadow = new g(this, var1, (Color)null);
      this._selected_wallpaper = new c(this, var1, (URL)null);
      this._disabled_foreground = new g(this, var1, Color.gray);
      this._disabled_shadow = new g(this, var1, g.r);
      this._disabled_icon = new c(this, var1, (URL)null);
      this._auto = new q(this, var1, -1);
      super.ad = "#BUTTON";
      super._transparent.D = false;
      super._border.b8 = 9;
      super._alignment.b8 = 1;
      super._border_tickness.y = 2;
      super._focusable.D = true;
   }

   public void Method13() {
      if(super._enabled.D && super.W == null && this.bJ == null && !this.bH) {
         super.L = 12;
      } else {
         super.L = 0;
      }

      if(this._half_transparent.D) {
         super._transparent.D = !this.w();
      }

      if(this._auto.y > -1 && super._enabled.D) {
         Main.Field59.Method87(this);
      }

      super.Method13();
   }

   public void a(Graphics var1) {
      Color var2 = super._foreground.s;
      Color var3 = super._shadow.s;
      URL var4 = super._icon.k;
      this.bI = super._border.b8;
      if(this.w()) {
         if(this._selected_foreground.s != null) {
            var2 = this._selected_foreground.s;
         }

         if(this._selected_shadow.s != null) {
            var3 = this._selected_shadow.s;
         }

         if(this._selected_icon.k != null) {
            var4 = this._selected_icon.k;
         }

         this.bI = this._selected_border.b8;
      }

      if(!super._enabled.D) {
         if(this._disabled_icon.k != null) {
            var4 = this._disabled_icon.k;
         }

         if(this._disabled_shadow.s != null) {
            var3 = this._disabled_shadow.s;
         }

         if(this._disabled_foreground.s != null) {
            var2 = this._disabled_foreground.s;
         }
      }

      this.a(super._font.C, super.ac, super._text.u, false, super._shortcut.u, super._alignment.b8, super._regulation.b8, 0, 0, 0, (Color)null, var2, var3, var4, super._icon_left.D, super._icon_gap.y, super._enabled.D?true:this._disabled_icon.k != null, super._icon_side.D, (String)null, (ag)null);
   }

   public void Method38() {
      if(super.R) {
         this.a(this.bI, super._border_tickness.y, 0, 0, super.O, super.J, super._border_shadow.s, super._border_highlight.s, (Color)null, (String)null, (Font)null, 0);
      }

      if(super.M && super._focusable.D) {
         this.a(12, 1, super.ac.x, super.ac.y, super.ac.width, super.ac.height, super._border_shadow.s, (Color)null, (Color)null, (String)null, (Font)null, 0);
      }

   }

   public boolean Method39() {
      Color var1 = super._background.s;
      URL var2 = super._wallpaper.k;
      if(this.w()) {
         if(this._selected_background.s != null) {
            var1 = this._selected_background.s;
         }

         if(this._selected_wallpaper.k != null) {
            var2 = this._selected_wallpaper.k;
         }
      }

      return this.a(var1, var2);
   }

   public boolean w() {
      return this._state.u.equals(this._true.u);
   }

   public void Method80(boolean var1) {
      if(this.w() != var1) {
         this._state.u = var1?this._true.u:this._false.u;
         if(var1 && super.Field122 != null && super.Field122.Field122 instanceof m) {
            ((m)super.Field122.Field122).X = this;
         }

         if(this._half_transparent.D) {
            super._transparent.D = !var1;
         }

      }
   }

   public void Method81(boolean var1) {
      if(this.w() != var1) {
         if(this.bF == null) {
            this.Method80(var1);
            this.Method37();
         } else {
            this.bF.a(this);
         }

      }
   }

   public void Method33() {
      if(this._auto.y > -1) {
         this._auto.y = -1;
      }

      if(this.bH) {
         this.Method81(!this.w());
         this._state.Method32(this.w()?this._true.u:this._false.u);
      } else if(this.bF != null && !this.w()) {
         this.bF.a(this);
      }

      if(this.bJ == null) {
         this.Method30(String.valueOf(this.w()));
      }

   }

   public void run() {
      Session var1 = super.Field123;
      synchronized(super.Field123) {
         if(!super.T.Field1) {
            return;
         }
      }

      if(this._auto.y == 0) {
         Main.Field59.a(this);
         this._auto.y = -2;
         this.Method33();
      } else {
         --this._auto.y;
      }

   }

   public void Method2() {
      Main.Field59.a(this);
      super.Method2();
   }

   public boolean a(ag var1) {
      if(super._enabled.D) {
         label140: {
            switch(var1.a) {
            case 401:
               if(var1.Field81) {
                  if(var1.Field80 != 38 && var1.Field80 != 37) {
                     if(var1.Field80 != 40 && var1.Field80 != 39 || super.aa.aA.indexOf(this) == super.aa.aA.size() - 1) {
                        break label140;
                     }

                     super.T.a(false);
                     if(super.aa.Field122 instanceof LIST || super.aa.Field122 instanceof TREE) {
                        ((af)super.aa.Field122).X = super.T.Field10;
                     }
                     break label140;
                  }

                  if(super.aa.aA.indexOf(this) == 0) {
                     break label140;
                  }

                  super.T.a(true);
                  if(super.aa.Field122 instanceof LIST || super.aa.Field122 instanceof TREE) {
                     ((af)super.aa.Field122).X = super.T.Field10;
                  }
                  break label140;
               }

               if(var1.Field80 == 9 && this.bG) {
                  super.T.a((aq)this);
                  super.M = false;
                  super.T.Field10 = (aq)(super.Field122.Field122 instanceof m?super.Field122.Field122:super.Field122);
                  this.Method37();
                  super.T.a(var1.Method57());
                  return true;
               }

               if(var1.Field80 != 10 && var1.Field80 != 32) {
                  break label140;
               }
            case 501:
               break;
            case 506:
               if(var1.Field82 > 0 && var1.Field83 > 0 && var1.Field82 < super.O && var1.Field83 < super.J || this.bJ != null) {
                  break label140;
               }

               super.T.setCursor(Cursor.getDefaultCursor());
            case 402:
            case 502:
               if(!this.bH && this.bF == null && !var1.a() && this.w()) {
                  this.Method81(false);
                  if(var1.a != 506 || this.bE) {
                     this.Method33();
                  }
               }
            default:
               break label140;
            }

            if((!this.w() || this.bF == null) && (!var1.a() || super.W == null)) {
               if(this.bH) {
                  this.Method33();
               } else {
                  this.Method81(!this.w());
                  if(this.bE) {
                     this.Method33();
                  }
               }
            } else {
               this.Method33();
            }
         }

         if(this.bJ != null) {
            var1.Field82 += super.af;
            var1.Field83 += super.ae;
            this.bJ.a(var1);
         }
      }

      return super.a(var1);
   }
}
