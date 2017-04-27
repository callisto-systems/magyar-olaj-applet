package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TABLE;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.w;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.net.URL;

public final class h extends aq {
   public final w _font;
   public final g _foreground;
   public final g _shadow;
   String[] ai;
   String[] aq;
   URL[] at;
   String[] an;
   int[] am;
   private q as;
   private boolean aj;
   private int ar = -1;
   private int al;
   private int ap;
   private int ao;
   private int au;
   private String ak;

   public h(Session var1, q var2) {
      super(var1);
      this.as = var2;
      this._font = new w(this, var1);
      this._foreground = new g(this, var1, Color.black);
      this._shadow = new g(this, var1, (Color)null);
      super.R = false;
   }

   public final void a(Graphics var1) {
      int var2 = this.as.y - super.I;

      for(int var3 = 0; var3 < this.aq.length; ++var3) {
         if(this.am[var3] > 0) {
            this.a(super._border.b8, super._border_tickness.y, var2, 0, this.am[var3], super.J, super._border_shadow.s, super._border_highlight.s, (Color)null, (String)null, (Font)null, 0);
            this.a(this._font.C, new Rectangle(var2 + super._border_tickness.y, 0, this.am[var3] - 2 * super._border_tickness.y, super.J), this.aq[var3], false, (String)null, 1, 5, 0, 0, 0, (Color)null, this._foreground.s, this._shadow.s, this.at[var3], true, 3, true, false, (String)null, (ag)null);
         }

         var2 += this.am[var3] + this.as.y;
      }

   }

   public final boolean a(ag var1) {
      if(super._enabled.D) {
         int var2;
         int var3;
         switch(var1.a) {
         case 501:
            this.aj = this.ar == -1;
            if(!this.aj) {
               this.ap = var1.Field82;
            }
            break;
         case 503:
            var2 = this.as.y - super.I;
            super.L = 0;

            for(var3 = 0; var3 < this.aq.length; ++var3) {
               this.al = this.am[var3];
               var2 += this.al + this.as.y;
               if(this.al > 0) {
                  if(var2 > var1.Field82 + 5 && this.an[var3].length() != 0) {
                     super.L = 12;
                     break;
                  }

                  if(Math.abs(var2 - var1.Field82) < 5) {
                     super.T.setCursor(Cursor.getPredefinedCursor(11));
                     this.ar = var3;
                     this.au = 0;
                     return true;
                  }
               }

               if(var2 > var1.Field82 + 5) {
                  if(!this.ai[var3].equals(this.ak)) {
                     this.ak = this.ai[var3];
                     if(this.ak.length() != 0) {
                        hu.polygon.jform.client.aq.ag.a(super.T, false);
                        hu.polygon.jform.client.aq.ag.a(super.T, (String)null, this.ak, false);
                     }
                  }
                  break;
               }
            }

            super.T.setCursor(Cursor.getPredefinedCursor(super.L));
            this.ar = -1;
         case 504:
         default:
            break;
         case 505:
            hu.polygon.jform.client.aq.ag.a(super.T, false);
            this.ak = null;
         case 502:
            if(this.au == 0) {
               if(var1.a == 502 && this.aj) {
                  var2 = this.as.y - super.I;

                  for(var3 = 0; var3 < this.aq.length; ++var3) {
                     var2 += this.am[var3] + this.as.y;
                     if(var2 > var1.Field82 + 5) {
                        super._action.u = this.an[var3];
                        if(super._action.u.length() != 0) {
                           this.Method30((String)null);
                           return true;
                        }

                        return super.a(var1);
                     }
                  }
               }
            } else {
               if(this.ar != -1) {
                  TABLE var8 = (TABLE)super.aa;
                  int var4 = 0;

                  for(int var5 = 0; var5 < var8.aP; ++var5) {
                     for(int var6 = 0; var6 < var8._columns.G.cf.size(); ++var6) {
                        aq var7;
                        if(this.ar == var6) {
                           var7 = (aq)var8._content.ci.aA.elementAt(var4);
                           var7._part_menu = null;
                           var7.Method2();
                           var7._width.y = var7.O = this.ao;
                           var7.Method35();
                           var7._part_menu = var8._part_content._part_menu;
                        } else if(this.ar < var6) {
                           var7 = (aq)var8._content.ci.aA.elementAt(var4);
                           var7._x.y = var7.af = var7._x.y + this.au;
                        }

                        ++var4;
                     }
                  }

                  var8.Method35();
                  super.I = var8._content.ci.I;
                  var8.Method37();
                  super.Field123.a(var8);
                  super.T.setCursor(Cursor.getPredefinedCursor(super.L));
                  this.au = 0;
                  return true;
               }

               this.au = 0;
               this.ar = -1;
            }
            break;
         case 506:
            if(this.ar != -1) {
               this.au = var1.Field82 - this.ap;
               this.ao = this.al + this.au;
               if(this.ao < super.J) {
                  this.ao = super.J;
                  this.au = super.J - this.al;
               }

               this.am[this.ar] = this.ao;
               this.Method37();
            }
         }
      }

      return super.a(var1);
   }
}
