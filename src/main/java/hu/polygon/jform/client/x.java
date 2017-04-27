package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TEXTFIELD;
import hu.polygon.jform.client.ab;
import hu.polygon.jform.client.al;
import hu.polygon.jform.client.am;
import hu.polygon.jform.client.m;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.StringTokenizer;

public final class x extends TEXTFIELD {
   int b3;
   FontMetrics b2;
   ab bZ;
   boolean b1;
   int b4;
   int b0;
   String bY;
   int b5;

   public x(Session var1) {
      super(var1);
      super.ad = null;
      super._regulation.b8 = 4;
      super.bW = true;
   }

   public final void a(Graphics var1) {
      boolean var2 = false;
      int var3 = this.bZ.a.size();
      var1.setFont(super._font.C);

      for(int var4 = 0; var4 < var3; ++var4) {
         am var5 = (am)this.bZ.a.elementAt(var4);
         if(var5.Field66 - super.H >= 0) {
            if(var5.Field66 - super.H > super._height.y + this.b4) {
               break;
            }

            int var9;
            int var10;
            int var12;
            int var13;
            if(super._alignment.b8 == 3) {
               int var6 = var5.Field65;

               for(int var7 = 0; var7 < var5.Field61.size(); ++var7) {
                  al var8 = (al)var5.Field61.elementAt(var7);
                  var9 = 0;
                  var10 = 0;
                  boolean var11 = false;
                  if(super.M && super._start.y != super._end.y) {
                     var6 += var8.Field68;
                     if(super._start.y < var6 && super._start.y >= var6 - var8.Field68) {
                        var9 = super._start.y - var6 + var8.Field68;
                     }

                     if(super._end.y < var6 && super._end.y >= var6 - var8.Field68) {
                        var10 = super._end.y - var6 + var8.Field68;
                     } else if(super._start.y < var6 - var8.Field68 && super._end.y >= var6) {
                        var10 = var8.Field68;
                        var11 = true;
                     } else if(super._start.y < var6 && super._end.y >= var6) {
                        var9 = super._start.y - var6 + var8.Field68;
                        var10 = var8.Field68;
                        var11 = true;
                     }

                     if(var10 != 0) {
                        var12 = this.b2.stringWidth(var8.Field67.substring(0, var9)) + var8.a;
                        var13 = this.b2.stringWidth(var8.Field67.substring(var9, var10));
                        if(var11 && var7 != var5.Field61.size() - 1) {
                           var13 += ((al)var5.Field61.elementAt(var7 + 1)).a - var8.a - var8.Field69;
                        }

                        var1.setColor(super._highlight.s);
                        var1.fillRect(var12, var8.Field70 - this.b4 + 3 - super.H, var13, this.b4);
                     }
                  }

                  if(super._shadow.s != null) {
                     var1.setColor(super._shadow.s);
                     var1.drawString(var8.Field67, var8.a + this.b4 / 10, var8.Field70 + this.b4 / 10 - super.H);
                  }

                  var1.setColor(super._foreground.s);
                  var1.drawString(var8.Field67, var8.a, var8.Field70 - super.H);
               }

               if(!var2) {
                  var2 = this.a(var1, var5, var4, var3);
               }
            } else {
               if(super.M && super._start.y != super._end.y) {
                  var12 = var5.a;
                  var13 = 0;
                  if(super._start.y >= var5.Field65 && super._start.y <= var5.Field65 + var5.Field62) {
                     var12 += this.b2.stringWidth(var5.Field60.substring(0, super._start.y - var5.Field65));
                     var13 = this.b2.stringWidth(var5.Field60.substring(super._start.y - var5.Field65, var5.Field62));
                  }

                  if(super._end.y >= var5.Field65 && super._end.y <= var5.Field65 + var5.Field62) {
                     var9 = super._start.y - var5.Field65;
                     var10 = super._end.y - var5.Field65;
                     if(var9 < 0) {
                        var9 = 0;
                     }

                     var13 = this.b2.stringWidth(var5.Field60.substring(var9, var10));
                  } else if(super._start.y <= var5.Field65 && super._end.y >= var5.Field65 + var5.Field62) {
                     var13 = var5.Field64;
                  }

                  if(var13 != 0) {
                     var1.setColor(super._highlight.s);
                     var1.fillRect(var12, var5.Field66 - this.b4 + 3 - super.H, var13, this.b4);
                  }
               }

               if(super._shadow.s != null) {
                  var1.setColor(super._shadow.s);
                  var1.drawString(var5.Field60, var5.a + this.b4 / 10, var5.Field66 + this.b4 / 10 - super.H);
               }

               var1.setColor(super._foreground.s);
               var1.drawString(var5.Field60, var5.a, var5.Field66 - super.H);
               if(!var2) {
                  var2 = this.a(var1, var5, var4, var3);
               }
            }
         }
      }

   }

   private final boolean a(Graphics var1, am var2, int var3, int var4) {
      if(super.M && super._enabled.D && super._start.y == super._end.y && super._start.y >= var2.Field65 && (super._start.y <= var2.Field65 + var2.Field62 && var2.Field63 || super._start.y < var2.Field65 + var2.Field62 && !var2.Field63 || var3 == var4 - 1)) {
         int var5 = 0;
         int var6 = 0;
         int var7 = var2.a;
         if(super._start.y == super._text.u.length() && var2.Field63) {
            var6 = this.b4;
            if(super._alignment.b8 == 1) {
               var7 = super.ac.x + super.ac.width / 2;
            } else if(super._alignment.b8 == 2) {
               var7 = super.ac.x + super.ac.width - 3;
            } else if(super._alignment.b8 == 3) {
               var7 = super.ac.x + 3;
            }
         } else if(super._alignment.b8 == 3) {
            int var8 = 0;
            int var9 = super._start.y - var2.Field65;
            var5 = 3;

            for(int var10 = 0; var10 < var2.Field61.size(); ++var10) {
               al var11 = (al)var2.Field61.elementAt(var10);
               var8 += var11.Field68;
               if(var9 <= var8) {
                  var5 = var11.a + this.b2.stringWidth(var11.Field67.substring(0, var9 - var8 + var11.Field68));
                  break;
               }
            }
         } else {
            var5 = this.b2.stringWidth(var2.Field60.substring(0, super._start.y - var2.Field65));
         }

         var1.drawLine(var7 + var5, var2.Field66 + 2 - super.H + var6, var7 + var5, var2.Field66 - this.b4 + 3 - super.H + var6);
         return true;
      } else {
         return false;
      }
   }

   protected final boolean Method86(int var1) {
      am var2 = null;

      for(int var3 = 0; var3 < this.bZ.a.size(); ++var3) {
         var2 = (am)this.bZ.a.elementAt(var3);
         if(var2.Field65 > var1) {
            break;
         }
      }

      return var2.Field66 > super.H + super.J - this.b4?(super._start.y == super._text.u.length() && var2.Field63?((m)super.Field122).Method83(0, (var2.Field66 - super.J + this.b4 * 2) / 10 * 10):((m)super.Field122).Method83(0, (var2.Field66 - super.J + this.b4) / 10 * 10)):(var2.Field66 - this.b4 * 2 < super.H?((m)super.Field122).Method83(0, (var2.Field66 - this.b4 * 2) / 10 * 10):false);
   }

   private final void O() {
      if(!this.bY.equals(super._text.u)) {
         int var1 = this.bZ.a.size();
         this.b3 = 0;

         for(int var2 = var1 - 1; var2 != -1; --var2) {
            am var3 = (am)this.bZ.a.elementAt(var2);
            this.bZ.a.removeElementAt(var2);
            if(var3.Field65 < super._start.y) {
               if(var2 != 0) {
                  var3 = (am)this.bZ.a.elementAt(var2 - 1);
                  this.bZ.a.removeElementAt(var2 - 1);
               }

               this.b3 = var3.Field65;
               break;
            }
         }

         this.bY = super._text.u;
      }

   }

   private final void Method65(String var1, boolean var2) {
      for(int var3 = this.b2.stringWidth(var1); var3 > super.ac.width - 6; var3 = this.b2.stringWidth(var1)) {
         for(int var4 = 1; var4 < var1.length() + 1; ++var4) {
            String var5 = var1.substring(0, var4);
            var3 = this.b2.stringWidth(var5);
            if(var3 > super.ac.width - 6) {
               this.bZ.a(var1.substring(0, var4 - 1), this.b1, false);
               var1 = var1.substring(var4 - 1, var1.length());
               break;
            }
         }
      }

      this.bZ.a(var1, this.b1, var2);
   }

   final void M() {
      int var1 = this.bZ.a.size();
      String var2;
      if(this.b3 != super._text.u.length()) {
         var2 = super._text.u.substring(this.b3, super._text.u.length());
         StringTokenizer var3 = new StringTokenizer(var2, " \n\r", true);
         String var4 = new String();

         while(var3.hasMoreTokens()) {
            String var5 = var3.nextToken();
            if(!var5.equals("\r")) {
               if(var5.equals("\n")) {
                  this.Method65(var4, true);
                  var4 = new String();
               } else {
                  int var6 = this.b2.stringWidth(var4 + var5);
                  if(var6 > super.ac.width - 6 && var4.length() > 0) {
                     this.Method65(var4, false);
                     var4 = new String();
                  }

                  var4 = var4 + var5;
               }
            }
         }

         if(var4.length() != 0) {
            this.Method65(var4, false);
         }

         this.b3 = super._text.u.length();
      }

      if(this.bZ.a.isEmpty()) {
         this.bZ.a(new String(), this.b1, false);
      }

      var2 = null;
      int var10 = this.bZ.a.size();

      for(int var12 = var1; var12 < var10; ++var12) {
         am var9 = (am)this.bZ.a.elementAt(var12);
         if(super._regulation.b8 == 5) {
            var9.Field66 = this.b4 * var12 + (super.ac.height - var10 * this.b4) / 2;
         } else if(super._regulation.b8 == 4) {
            var9.Field66 = this.b4 * var12 + 3;
         } else {
            var9.Field66 = this.b4 * var12 + (super.ac.height - var10 * this.b4) - 3;
         }

         var9.Field66 += super.ac.y + this.b0;
         if(super._alignment.b8 != 3) {
            if(super._alignment.b8 == 1) {
               var9.a = (super.ac.width - var9.Field64) / 2;
            } else if(super._alignment.b8 == 2) {
               var9.a = super.ac.width - var9.Field64 - 3;
            } else {
               var9.a = 3;
            }

            var9.a += super.ac.x;
         } else {
            float var11 = 0.0F;
            if(var9.Field61.size() != 1) {
               var11 = (float)(super.ac.width - var9.Field64 - 6) / (float)(var9.Field61.size() - 1);
            }

            if(var11 > (float)(this.b2.charWidth(' ') * 2)) {
               var11 = 0.0F;
            }

            float var13 = (float)(super.ac.x + 2);

            for(int var7 = 0; var7 < var9.Field61.size(); ++var7) {
               al var8 = (al)var9.Field61.elementAt(var7);
               var8.Field70 = var9.Field66;
               var8.a = (int)var13;
               var13 += (float)var8.Field69 + var11;
            }
         }
      }

   }

   final void N() {
      this.O();
      this.M();
      int var1 = this.bZ.a.size();
      if(this.b5 != var1) {
         super.aa.P = -1;
         super.aa.Method35();
         this.b5 = var1;
      }

   }
}
