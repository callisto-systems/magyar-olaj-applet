package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ao;
import hu.polygon.jform.client.ap;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.w;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Polygon;

public final class CHART extends aq {
   public final ap _series;
   public final ap _rows;
   public final y _horizontal_lines;
   public final y _vertical_lines;
   public final g _line_color;
   public final g _foreground;
   public final g _axis;
   public final w _font;

   public CHART(Session var1) {
      super(var1);
      this._series = new ap(this, var1);
      this._rows = new ap(this, var1);
      this._horizontal_lines = new y(this, var1, true);
      this._vertical_lines = new y(this, var1, true);
      this._line_color = new g(this, var1, Color.lightGray);
      this._foreground = new g(this, var1, Color.black);
      this._axis = new g(this, var1, Color.black);
      this._font = new w(this, var1);
      super.ad = "#CHART";
      super._border.b8 = 10;
      super._background.s = Color.white;
   }

   public final void a(Graphics var1) {
      FontMetrics var2 = super.T.getFontMetrics(this._font.C);
      int var3 = var2.getHeight() + 8;
      var1.setFont(this._font.C);
      int var4;
      if(this._vertical_lines.D) {
         var1.setColor(this._line_color.s);

         for(var4 = 6; var4 < super.ac.width - 6; var4 += 23) {
            var1.drawLine(super.ac.x + var4, super.ac.y + 6, super.ac.x + var4, super.ac.y + super.ac.height - var3 - 1);
         }

         if(this._horizontal_lines.D) {
            var1.drawLine(super.ac.x + super.ac.width - 6, super.ac.y + 6, super.ac.x + super.ac.width - 6, super.ac.y + super.ac.height - var3 - 1);
         }
      }

      if(this._horizontal_lines.D) {
         var1.setColor(this._line_color.s);

         for(var4 = 6; var4 < super.ac.height - var3 - 1; var4 += 25) {
            var1.drawLine(super.ac.x + 6, super.ac.y + var4, super.ac.x + super.ac.width - 6, super.ac.y + var4);
         }

         if(this._vertical_lines.D) {
            var1.drawLine(super.ac.x + 6, super.ac.y + super.ac.height - var3 - 1, super.ac.x + super.ac.width - 6, super.ac.y + super.ac.height - var3 - 1);
         }
      }

      double var5 = 0.0D;
      double var7 = Double.MIN_VALUE;

      for(int var9 = 0; var9 < this._rows.G.cf.size(); ++var9) {
         ao var10 = (ao)this._rows.G.cf.elementAt(var9);

         for(int var11 = 0; var11 < var10.cf.size(); ++var11) {
            double var12 = Double.valueOf(((ao)var10.cf.elementAt(var11)).ch).doubleValue();
            if(var5 > var12) {
               var5 = var12;
            }

            if(var7 < var12) {
               var7 = var12;
            }
         }
      }

      if(var5 != var7 && !this._rows.G.cf.isEmpty()) {
         double var14 = (double)(super.ac.height - var3 - 6) / (var7 - var5);
         double var16 = (double)((super.ac.width - 12) / this._rows.G.cf.size());
         int var18 = super.ac.width / this._series.G.cf.size();

         for(int var19 = 0; var19 < this._series.G.cf.size(); ++var19) {
            ao var20 = (ao)this._series.G.cf.elementAt(var19);
            boolean var21 = var20.Method44("show-value", "false").equals("true");
            int var22 = -1;
            int var23 = -1;
            byte var24 = 0;
            String var25 = var20.Method44("type", "line");
            g var26 = new g(this, (Session)null, Color.red);
            var26.Method31(var20.Method44("color", ""));
            if(var25.equals("dotline")) {
               var24 = 1;
            } else if(var25.equals("line")) {
               var24 = 2;
            } else if(var25.equals("area")) {
               var24 = 3;
            } else if(var25.equals("bar")) {
               var24 = 4;
            } else if(var25.equals("3dbar")) {
               var24 = 5;
            }

            var1.setColor(var26.s);

            for(int var27 = 0; var27 < this._rows.G.cf.size(); ++var27) {
               ao var28 = (ao)this._rows.G.cf.elementAt(var27);
               ao var29 = var28.Method46((String)var20.cd.get("id"), false);
               String var30 = "";
               if(var29 != null && var29.ch != null) {
                  var30 = var29.ch;
               }

               if(var30.length() != 0) {
                  double var31 = Double.valueOf(var30).doubleValue();
                  var30 = (String)var29.cd.get("text");
                  int var33 = super.ac.x + (int)((double)var27 * var16) + 6;
                  int var34 = super.ac.y + super.ac.height - (int)((var31 - var5) * var14) - var3;
                  if(var24 < 3) {
                     var33 = (int)((double)var33 + var16 / 2.0D);
                     if(var24 != 2) {
                        var1.fill3DRect(var33 - 3, var34 - 3, 6, 6, true);
                     }

                     if(var24 != 0 && var22 != -1) {
                        var1.drawLine(var22, var23, var33, var34);
                     }
                  }

                  if(var24 == 3) {
                     var33 = (int)((double)var33 + var16 / 2.0D);
                     if(var22 != -1) {
                        Polygon var35 = new Polygon();
                        var35.addPoint(var22, var23);
                        var35.addPoint(var33, var34);
                        var35.addPoint(var33, super.ac.y + (int)((double)super.ac.height + var5 * var14 - (double)var3));
                        var35.addPoint(var22, super.ac.y + (int)((double)super.ac.height + var5 * var14 - (double)var3));
                        var1.fillPolygon(var35);
                     }
                  }

                  if(var24 == 4) {
                     if(var31 > 0.0D) {
                        var1.fill3DRect(var33, var34, (int)(var16 * 0.9D), (int)(var31 * var14), true);
                     } else {
                        var1.fill3DRect(var33, (int)((double)var34 + var31 * var14), (int)(var16 * 0.9D), (int)(-var31 * var14), true);
                     }
                  }

                  if(var24 == 5) {
                     int var40 = (int)(var16 * 0.9D);
                     int var36 = (int)(var31 * var14);
                     int var37 = var34;
                     if(var31 < 0.0D) {
                        var37 = (int)((double)var34 + var31 * var14);
                        var36 = -var36;
                     }

                     Polygon var38 = new Polygon();
                     var38.addPoint(var33, var37);
                     var38.addPoint(var33 + 5, var37 - 5);
                     var38.addPoint(var33 + var40 + 5, var37 - 5);
                     var38.addPoint(var33 + var40 + 5, var37 + var36 - 5);
                     var38.addPoint(var33 + var40, var37 + var36);
                     var38.addPoint(var33 + var40, var37);
                     var1.setColor(var26.s.darker());
                     var1.fillPolygon(var38);
                     var1.setColor(var26.s);
                     var1.fill3DRect(var33, var37, var40, var36, true);
                  }

                  if(var21 || var30 != null) {
                     var1.setColor(this._foreground.s);
                     if(var30 == null) {
                        var30 = String.valueOf(var31);
                     } else if(var21) {
                        var30 = var31 + " " + var30;
                     }

                     if(var34 + var3 / 2 > super.ac.y + super.ac.height - var3 * 3 / 2 - 4) {
                        var1.drawString(var30, var33 + 3, var34 - 5);
                     } else {
                        var1.drawString(var30, var33 + 3, var34 + var3 / 2);
                     }

                     var1.setColor(var26.s);
                  }

                  var22 = var33;
                  var23 = var34;
               }
            }

            var1.fill3DRect(super.ac.x + var18 * var19 + 6, super.ac.y + super.ac.height - 3 - (var3 - 8) / 2, 9, 9, true);
            var1.setColor(this._foreground.s);
            String var39 = var20.Method44("text", "");
            if(var2.stringWidth(var39) > var18 - 18) {
               while(var2.stringWidth(var39 + "...") > var18 - 18 && var39.length() != 0) {
                  var39 = var39.substring(0, var39.length() - 1);
               }

               var39 = var39 + "...";
            }

            var1.drawString(var39, super.ac.x + var18 * var19 + 17, super.ac.y + super.ac.height - 5);
            var1.setColor(var26.s);
         }

         var1.setColor(this._axis.s);
         var1.drawLine(super.ac.x + 6, super.ac.y + 6, super.ac.x + 6, super.ac.y + super.ac.height - var3 - 1);
         var1.drawLine(super.ac.x + 6, super.ac.y + (int)((double)super.ac.height + var14 - (double)var3), super.ac.x + super.ac.width - 6, super.ac.y + (int)((double)super.ac.height + var14 - (double)var3));
         var1.setColor(this._foreground.s);
         var1.drawString(String.valueOf(var7), super.ac.x + 8, super.ac.y + var3 / 2 + 6);
         var1.drawString("0", super.ac.x + 8, super.ac.y + (int)((double)super.ac.height + var5 * var14 - (double)var3 - 4.0D));
         if((double)super.ac.height + var5 * var14 > 30.0D) {
            var1.drawString(String.valueOf(var5), super.ac.x + 8, super.ac.y + super.ac.height - var3 - 4);
         }
      }

   }
}
