package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.a;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.ai;
import hu.polygon.jform.client.an;
import hu.polygon.jform.client.av;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.o;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.s;
import hu.polygon.jform.client.v;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

public class aq extends o implements Runnable {
   public static final ai ag = new ai();
   public String ad;
   public i _id;
   public q _x;
   public q _y;
   public q _width;
   public q _height;
   public final av _horizontal_fixing;
   public final av _vertical_fixing;
   public final y _close;
   public final y _send;
   public final c _url;
   public i _frame;
   public final av _method;
   public final av _encoding;
   public i _action;
   public i _model;
   public final i _shortcut;
   public y _visible;
   public y _enabled;
   public av _border;
   public q _border_tickness;
   public g _border_highlight;
   public g _border_shadow;
   public final y _rollovered;
   public g _background;
   public y _transparent;
   public c _wallpaper;
   public final av _wallpaper_mode;
   public final y _focusable;
   public final q _index;
   public i _hint;
   public final v _style;
   public final y _validated;
   public an _part_menu;
   public final g _disabled_background;
   public int I;
   public int H;
   public af aa;
   public a Y;
   public a Z;
   public int O;
   public int J;
   public int L = 0;
   protected ac T;
   boolean S;
   Rectangle ac;
   int P;
   int V;
   int af;
   int ae;
   boolean R = true;
   public boolean M;
   public aq X;
   public aq W;
   public aq ah;
   public boolean U = true;
   static final Vector K = new Vector();
   static volatile int Q;
   public static final Toolkit N = Toolkit.getDefaultToolkit();
   static final Hashtable ab = new Hashtable();

   public aq(Session var1) {
      super((o)null, var1);
      this._id = new i(this, var1, "");
      this._x = new q(this, var1, 0);
      this._y = new q(this, var1, 0);
      this._width = new q(this, var1, 0);
      this._height = new q(this, var1, 0);
      this._horizontal_fixing = new av(this, var1, (byte)17);
      this._vertical_fixing = new av(this, var1, (byte)17);
      this._close = new y(this, var1, false);
      this._send = new y(this, var1, true);
      this._url = new c(this, var1, (URL)null);
      this._frame = new i(this, var1, (String)null);
      this._method = new av(this, var1, (byte)23);
      this._encoding = new av(this, var1, (byte)28);
      this._action = new i(this, var1, (String)null);
      this._model = new i(this, var1, "");
      this._shortcut = new i(this, var1, (String)null);
      this._visible = new y(this, var1, true);
      this._enabled = new y(this, var1, true);
      this._border = new av(this, var1, (byte)9);
      this._border_tickness = new q(this, var1, 1);
      this._border_shadow = new g(this, var1, Color.gray);
      this._border_highlight = new g(this, var1, g.r);
      this._rollovered = new y(this, var1, false);
      this._background = new g(this, var1, Color.lightGray);
      this._transparent = new y(this, var1, false);
      this._wallpaper = new c(this, var1, (URL)null);
      this._wallpaper_mode = new av(this, var1, (byte)32);
      this._disabled_background = new g(this, var1, Color.lightGray);
      this._focusable = new y(this, var1, false);
      this._index = new q(this, var1, -1);
      this._style = new v(this, var1);
      this._validated = new y(this, var1, true);
      this._hint = new i(this, var1, (String)null);
   }

   public f a(String var1) {
      if(var1.equals("part-menu") && this._part_menu == null) {
         this._part_menu = new an(super.Field123);
         this._part_menu.Field122 = this;
         return this._part_menu;
      } else {
         return super.a(var1);
      }
   }

   public void Method5() {
      super.Method5();
      this.Method13();
   }

   public void a(ac var1) {
      this.T = var1;
      if(this._part_menu != null) {
         this._part_menu.a(var1);
      }

      this.Method13();
   }

   public void Method13() {
      if(this._shortcut.u != null) {
         this.T.b.put(this._shortcut.u, this);
      }

      if(this._rollovered.D) {
         this.R = false;
      }

      if(this._part_menu != null) {
         this._part_menu.Method13();
      }

   }

   public void Method2() {
      this.Method34(true);
   }

   protected void Method4(boolean var1) {
      if(this.O > 0 && this.J > 0 && this._visible.D) {
         if(this.Y != null) {
            this.Y.Field104 = false;
         }

         this.Y = this.a(this.O, this.J);
         this.Y.Field105 = null;
         if(this.S) {
            if(this.Z != null) {
               this.Z.Field104 = false;
            }

            this.Z = this.a(this.O, this.J);
         }
      }

   }

   protected void Method34(boolean var1) {
      if(var1 && this.Y != null) {
         this.Y.Field104 = false;
         this.Y = null;
      }

      if(this.Z != null) {
         this.Z.Field104 = false;
         this.Z = null;
      }

      this.P = 0;
   }

   public final void a(af var1) {
      super.Field122 = this.aa = var1;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this._x.y = this.af = var1;
      this._y.y = this.ae = var2;
      this._width.y = this.O = var3;
      this._height.y = this.J = var4;
   }

   public final void Method35() {
      if(super.Field122 != null) {
         switch(this._horizontal_fixing.b8) {
         case 18:
            this.af = this.aa.O - this.aa._width.y + this._x.y;
            this.O = this._width.y;
            break;
         case 19:
            this.af = this._x.y;
            this.O = this.aa.O - this.aa._width.y + this._x.y + this._width.y - this.af;
            break;
         default:
            this.af = this._x.y;
            this.O = this._width.y;
         }

         switch(this._vertical_fixing.b8) {
         case 18:
            this.ae = this.aa.J - this.aa._height.y + this._y.y;
            this.J = this._height.y;
            break;
         case 19:
            this.ae = this._y.y;
            this.J = this.aa.J - this.aa._height.y + this._y.y + this._height.y - this.ae;
            break;
         default:
            this.ae = this._y.y;
            this.J = this._height.y;
         }
      }

      if(this.O < 0 || this.J < 0) {
         this.O = this.J = 0;
         this.Method34(true);
      }

      if(this.O > 0 && this.J > 0 && this._visible.D) {
         this.Method36();
         if(this.P != this.O || this.V != this.J) {
            this.ac = a(this._border.b8, this._border_tickness.y, 0, 0, this.O, this.J);
            this.Method4(false);
            this.P = this.O;
            this.V = this.J;
         }

         this.Method0();
      }

   }

   public void Method36() {
   }

   public void Method0() {
   }

   public final void Method37() {
      if(this.T != null && this.T.Field1 && this._visible.D) {
         this.T.Field2 = this;
         this.a(true, true);
         this.a(true);
      }

   }

   public final void a(boolean var1, boolean var2) {
      if(this.T == null && this.aa != null) {
         this.T = this.aa.T;
      }

      if(this.Y != null && this.Y.Field102 != null) {
         this.Method39();
         this.a(this.Y.Field102);
         this.Method40(var1, var2);
         this.Method38();
      }

   }

   public void Method38() {
      if(this.Y != null) {
         if(this.R) {
            this.a(this._border.b8, this._border_tickness.y, 0, 0, this.O, this.J, this._border_shadow.s, this._border_highlight.s, (Color)null, (String)null, (Font)null, 0);
         }

         if(this.M && super.Field122 != null) {
            this.a(12, 1, this.ac.x, this.ac.y, this.ac.width, this.ac.height, this._border_shadow.s, (Color)null, (Color)null, (String)null, (Font)null, 0);
         }
      }

   }

   public boolean Method39() {
      return this.a(this._background.s, this._wallpaper.k);
   }

   protected final boolean a(Color var1, URL var2) {
      if(this.Y != null && this.Y.Field102 != null) {
         String var3 = null;
         if(this._transparent.D || this._border.b8 == 15) {
            if(this.aa != null && this.aa.Z != null) {
               Image var4 = this.aa.Z.Field101;
               if(this.T.Method9(this)) {
                  var4 = this.aa.Y.Field101;
               }

               this.Y.Field102.drawImage(var4, -this.af + this.aa.I, -this.ae + this.aa.H, this.T);
            }

            if(this.Z != null) {
               this.Z.Field105 = null;
            }
         }

         if(!this._transparent.D) {
            if(!this._enabled.D) {
               var1 = this._disabled_background.s;
            }

            var3 = String.valueOf(var1) + var2;
            if(this.Z != null) {
               if(var3.equals(this.Z.Field105)) {
                  this.Y.Field102.drawImage(this.Z.Field101, 0, 0, this.T);
                  return false;
               }

               this.Z.Field105 = var3;
            }

            this.Y.Field102.setColor(var1);
            if(this._border.b8 == 15) {
               this.Y.Field102.fillRoundRect(0, 0, this.O - 1, this.J - 1, this._border_tickness.y, this._border_tickness.y);
            } else {
               this.Y.Field102.fillRect(0, 0, this.O, this.J);
            }
         }

         if(var2 != null) {
            a var16 = this.a(var2, false, 0);
            if(var16.Field101 != null) {
               if(this._wallpaper_mode.b8 == 31) {
                  a var5 = this.a(var2, false, 1);
                  a var6 = this.a(var2, false, 2);
                  a var7 = this.a(var2, false, 3);
                  a var8 = this.a(var2, false, 4);
                  a var9 = this.a(var2, false, 5);
                  a var10 = this.a(var2, false, 6);
                  a var11 = this.a(var2, false, 7);
                  a var12 = this.a(var2, false, 8);
                  a var13 = this.a(var2, false, 9);
                  int var14 = this.O - var5.Field103 - var7.Field103;
                  int var15 = this.J - var5.a - var11.a;
                  this.Y.Field102.drawImage(var5.Field101, 0, 0, var5.Field103, var5.a, this.T);
                  this.Y.Field102.drawImage(var6.Field101, var5.Field103, 0, var14, var5.a, this.T);
                  this.Y.Field102.drawImage(var7.Field101, this.O - var7.Field103, 0, var7.Field103, var7.a, this.T);
                  this.Y.Field102.drawImage(var8.Field101, 0, var5.a, var8.Field103, var15, this.T);
                  this.Y.Field102.drawImage(var9.Field101, var5.Field103, var5.a, var14, var15, this.T);
                  this.Y.Field102.drawImage(var10.Field101, this.O - var7.Field103, var5.a, var7.Field103, var15, this.T);
                  this.Y.Field102.drawImage(var11.Field101, 0, this.J - var11.a, var11.Field103, var11.a, this.T);
                  this.Y.Field102.drawImage(var12.Field101, var11.Field103, this.J - var11.a, var14, var11.a, this.T);
                  this.Y.Field102.drawImage(var13.Field101, this.O - var7.Field103, this.J - var11.a, var11.Field103, var11.a, this.T);
               } else if(this._wallpaper_mode.b8 == 32) {
                  for(int var18 = 0; var18 < this.O; var18 += var16.Field103) {
                     for(int var17 = 0; var17 < this.J; var17 += var16.a) {
                        this.Y.Field102.drawImage(var16.Field101, var18, var17, this.T);
                     }
                  }
               } else {
                  this.Y.Field102.drawImage(var16.Field101, 0, 0, this.O, this.J, this.T);
               }
            }
         }
      }

      return true;
   }

   public void a(Graphics var1) {
   }

   public void Method40(boolean var1, boolean var2) {
   }

   public final void a(boolean var1) {
      if(this.Y != null) {
         if(this.aa == null) {
            this.T.Method6();
         } else if(this.aa._visible.D && this.aa.Y != null) {
            if(super.Field122 instanceof m && (((m)super.Field122)._part_vertical._visible.D || ((m)super.Field122)._part_horizontal._visible.D)) {
               this.T.Field2 = this;
            }

            this.aa.Y.Field102.drawImage(this.Y.Field101, this.af - this.aa.I, this.ae - this.aa.H, this.T);
            this.aa.Method38();
            if(var1) {
               this.aa.a(true);
            }
         }
      }

   }

   public void Method33() {
      this.T.Method11(this);
   }

   public final void Method30(String var1) {
      if(this.T.Field1) {
         if(this.W == null || var1 != null && var1.length() == 0) {
            if(this._action.u != null) {
               if(this._enabled.D) {
                  ag.a(this.T, true);
                  this.T.Field10.a(new ag(this.T.Field10, 505, 0, 0, 0, 0, 0));
                  super.Field123.a(this);
               } else {
                  N.beep();
               }
            }
         } else {
            this.W.a(new ag(this, var1));
         }
      }

   }

   public boolean a(ag var1) {
      switch(var1.a) {
      case 401:
         this.T.a(this);
         if(var1.Field80 == 9) {
            this.T.a(var1.Method57());
            return true;
         }
         break;
      case 501:
         this.T.a(this);
         if(var1.a()) {
            if(this._part_menu != null) {
               this._part_menu.a(this, true);
            }
         } else {
            this.T.Method11(this);
            if(this.ah != null) {
               this.ah.a(new ag(this, (String)null));
            }
         }
         break;
      case 503:
         if(this._hint.u != null) {
            ag.a(this.T);
         }
         break;
      case 504:
         if(this._hint.u != null) {
            ag.a(this.T, this._shortcut.u, this._hint.u, false);
         }

         if(this._rollovered.D) {
            this.R = true;
            if(this.aa != null && this.aa.U && this.T.a()) {
               this.T.a(this);
            }

            this.Method37();
         }

         this.T.setCursor(Cursor.getPredefinedCursor(this.L));
         break;
      case 505:
         if(this._rollovered.D) {
            this.R = false;
            this.Method37();
         }

         if(this._hint.u != null) {
            ag.a(this.T, false);
         }
         break;
      case 1004:
         if(!this._focusable.D) {
            return false;
         }
      case 1005:
         this.M = var1.a == 1004;
         this.T.a(this);
         if(super.Field122 != null && this.M && this.aa.Field122 != null && this.aa.Field122 instanceof m) {
            ((m)this.aa.Field122).Method84(this);
         }

         if(this._rollovered.D) {
            this.R = false;
         }

         this.Method37();
      }

      return false;
   }

   protected final void a(int var1, int var2, int var3, int var4, int var5, int var6, Color var7, Color var8, Color var9, String var10, Font var11, int var12) {
      Graphics var13 = this.Y.Field102;
      var13.setColor(var7);
      switch(var1) {
      case 9:
      case 10:
         var13.setColor(var1 == 9?var8:var7);
         Method41(var13, var3, var4, var5, var2, true);
         a(var13, var3, var4, var6, var2, true);
         var13.setColor(var1 == 9?var7:var8);
         Method41(var13, var3, var4 + var6, var5, var2, false);
         a(var13, var3 + var5, var4, var6, var2, false);
         break;
      case 11:
         Method41(var13, var3, var4 + var6, var5, var2, false);
         a(var13, var3 + var5, var4 + var6 - var2 * 2, var2 * 2, var2, false);
         var13.setColor(var8);
         Method41(var13, var3, var4 + var6 - var2 * 2, var5, var2, true);
         a(var13, var3, var4 + var6 - var2 * 2, var2 * 2, var2, true);
         break;
      case 12:
         var13.setColor(var9);

         int var19;
         for(var19 = var3; var19 < var3 + var5 - var2; var19 += var2 * 3 + 2) {
            var13.fillRect(var19, var4, var2 * 2, var2);
            var13.fillRect(var19, var4 + var6 - var2, var2 * 2, var2);
         }

         for(var19 = var4; var19 < var4 + var6 - var2; var19 += var2 * 3 + 2) {
            var13.fillRect(var3, var19, var2, var2 * 2);
            var13.fillRect(var3 + var5 - var2, var19, var2, var2 * 2);
         }

         var13.fillRect(var3 + var5 - var2, var4 + var6 - var2, var2, var2);
         break;
      case 13:
         var13.drawLine(var3 + 1, var4 + 1, var3 + 4, var4 + 1);
         var13.drawLine(var3 + 1, var4 + 1, var3 + 1, var4 + 5);
         var13.drawLine(var3 + var5 - 2, var4 + var6 - 2, var3 + var5 - 5, var4 + var6 - 2);
         var13.drawLine(var3 + var5 - 2, var4 + var6 - 2, var3 + var5 - 2, var4 + var6 - 6);
         var13.setColor(var7.darker());
         var13.drawLine(var3 + 5, var4 + 1, var3 + 5, var4 + 2);
         var13.drawLine(var3 + 5, var4 + 2, var3 + 2, var4 + 2);
         var13.drawLine(var3 + 2, var4 + 2, var3 + 2, var4 + 6);
         var13.drawLine(var3 + 2, var4 + 6, var3 + 1, var4 + 6);
         var13.drawLine(var3 + var5 - 1, var4 + var6 - 1, var3 + var5 - 6, var4 + var6 - 1);
         var13.drawLine(var3 + var5 - 1, var4 + var6 - 1, var3 + var5 - 1, var4 + var6 - 7);
         var13.setColor(var8);
         var13.drawLine(var3 + 0, var4 + 0, var3 + 5, var4 + 0);
         var13.drawLine(var3 + 0, var4 + 0, var3 + 0, var4 + 6);
         var13.drawLine(var3 + var5 - 6, var4 + var6 - 2, var3 + var5 - 6, var4 + var6 - 3);
         var13.drawLine(var3 + var5 - 6, var4 + var6 - 3, var3 + var5 - 3, var4 + var6 - 3);
         var13.drawLine(var3 + var5 - 3, var4 + var6 - 3, var3 + var5 - 3, var4 + var6 - 7);
         var13.drawLine(var3 + var5 - 3, var4 + var6 - 7, var3 + var5 - 2, var4 + var6 - 7);
         break;
      case 14:
         var13.setColor(var9);
         Method41(var13, var3, var4, var5, var2, true);
         Method41(var13, var3, var4 + var6, var5, var2, false);
         a(var13, var3, var4, var6, var2, true);
         a(var13, var3 + var5, var4, var6, var2, false);
         break;
      case 15:
         var13.setColor(var9);
         var13.drawRoundRect(var3, var4, var5 - 1, var6 - 1, var2, var2);
         break;
      case 16:
         if(var10.length() != 0) {
            FontMetrics var14 = var13.getFontMetrics(var11);
            int var15 = var14.stringWidth(var10);
            int var16 = var14.getAscent();
            int var17 = var3 + 10 + var2 * 4;
            int var18 = var16 / 2;
            var4 += var18;
            var6 -= var18;
            if(var12 != 0) {
               if(var12 == 1) {
                  var17 = var3 + (var5 - var15) / 2;
               } else {
                  var17 = var3 + var5 - var15 - 10 - var2 * 2;
               }
            }

            Method41(var13, var3, var4 + var6, var5, var2, false);
            a(var13, var3 + var5, var4, var6, var2, false);
            a(var13, var3 + var2, var4 + var2, var6 - var2 * 2, var2, true);
            Method41(var13, var3 + var2, var4 + var2, var17 - var2 * 2 - var3 - 5, var2, true);
            Method41(var13, var17 + var15 + 5 + var2, var4 + var2, var5 - var17 + var3 - var15 - var2 * 2 - 5, var2, true);
            var13.setColor(var8);
            a(var13, var3, var4, var6, var2, true);
            Method41(var13, var3 + var2, var4 + var6 - var2, var5 - var2 * 2, var2, false);
            a(var13, var3 + var5 - var2, var4 + var2, var6 - var2 * 2, var2, false);
            Method41(var13, var3, var4, var17 - var3 - 5, var2, true);
            Method41(var13, var17 + var15 + 5, var4, var5 - var17 + var3 - var15 - 5, var2, true);
            var13.setColor(var9);
            var13.setFont(var11);
            var13.drawString(var10, var17, var4 + var16 - var18);
            break;
         }
      case 8:
         Method41(var13, var3, var4, var5, var2, true);
         a(var13, var3, var4, var6, var2, true);
         Method41(var13, var3 + var2, var4 + var6 - var2, var5 - var2 * 2, var2, false);
         a(var13, var3 + var5 - var2, var4 + var2, var6 - var2 * 2, var2, false);
         var13.setColor(var8);
         Method41(var13, var3, var4 + var6, var5, var2, false);
         a(var13, var3 + var5, var4, var6, var2, false);
         Method41(var13, var3 + var2, var4 + var2, var5 - var2 * 2, var2, true);
         a(var13, var3 + var2, var4 + var2, var6 - var2 * 2, var2, true);
      }

   }

   private static final void Method41(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      Polygon var6 = new Polygon();
      int var7 = var5?var4:-var4;
      var6.addPoint(var1, var2);
      var6.addPoint(var1 + var3, var2);
      var6.addPoint(var1 + var3 - var4, var2 + var7);
      var6.addPoint(var1 + var4, var2 + var7);
      var0.fillPolygon(var6);
   }

   private static final void a(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      Polygon var6 = new Polygon();
      int var7 = var5?var4:-var4;
      var6.addPoint(var1, var2);
      var6.addPoint(var1, var2 + var3);
      var6.addPoint(var1 + var7, var2 + var3 - var4);
      var6.addPoint(var1 + var7, var2 + var4);
      var0.fillPolygon(var6);
   }

   protected static final Rectangle a(int var0, int var1, int var2, int var3, int var4, int var5) {
      switch(var0) {
      case 8:
      case 16:
         var2 += var1 * 2;
         var3 += var1 * 2;
         var4 -= var1 * 4;
         var5 -= var1 * 3;
      case 11:
         var5 -= var1 * 2;
         break;
      case 9:
      case 10:
      case 12:
      case 14:
      default:
         var2 += var1;
         var3 += var1;
         var4 -= var1 * 2;
         var5 -= var1 * 2;
         break;
      case 13:
         var2 += 3;
         var3 += 3;
         var4 -= 6;
         var5 -= 6;
         break;
      case 15:
         var2 += var1 / 4;
         var3 += var1 / 4;
         var4 -= var1 / 2;
         var5 -= var1 / 2;
      }

      return new Rectangle(var2, var3, var4, var5);
   }

   protected final int a(Font var1, Rectangle var2, String var3, boolean var4, String var5, int var6, int var7, int var8, int var9, int var10, Color var11, Color var12, Color var13, URL var14, boolean var15, int var16, boolean var17, boolean var18, String var19, ag var20) {
      if(var2 != null && var2.width >= 1 && var2.height >= 1 && this.Y != null) {
         Graphics var21 = this.Y.Field102;
         if(var3 == null) {
            var3 = "";
         }

         var3 = var3.replace('\n', ' ').replace('\r', ' ');
         int var23;
         if(var19 != null && var19.length() != 0) {
            int var22 = var3.length();
            var3 = "";

            for(var23 = 0; var23 < var22; ++var23) {
               var3 = var3 + var19.charAt(0);
            }
         }

         FontMetrics var36 = this.T.getFontMetrics(var1);
         var23 = -1;
         a var24 = null;
         int var25 = var36.getHeight();
         int var26 = var36.getAscent();
         int var27 = var36.stringWidth(var3);
         int var28 = 1;
         int var29 = 1;
         int var30 = 0;
         if(var14 != null) {
            try {
               var24 = this.a(var14, !var17, 0);
               if(var24.Field101 != null) {
                  if(var27 == 0 && !var4) {
                     var27 = var24.Field103;
                  } else {
                     var30 = var24.Field103 + var16;
                     var27 += var30;
                  }
               } else {
                  var24 = null;
               }
            } catch (Exception var35) {
               ;
            }
         }

         int var31;
         if(var27 >= var2.width - 1 && var3.length() != 0) {
            if(var2.width > var30) {
               var31 = var8;
               if(var10 <= var8) {
                  if(var8 != var9) {
                     var31 = var9;
                     var23 = var10;
                  }

                  while(var36.stringWidth(var3.substring(var10, var31)) > var2.width - 1 - var30) {
                     ++var10;
                  }
               } else if(var10 > var8) {
                  var10 = var8;
               }

               while(var31 < var3.length()) {
                  ++var31;
                  if(var36.stringWidth(var3.substring(var10, var31)) > var2.width - 1 - var30) {
                     --var31;
                     break;
                  }
               }

               var3 = var3.substring(var10, var31);
               if(var24 != null && !var15) {
                  var27 = var36.stringWidth(var3) + var30;
               }
            }
         } else {
            if(var6 == 1) {
               var28 = (var2.width - var27) / 2;
            } else if(var6 == 2) {
               var28 = var2.width - var27 - 1;
            }

            var10 = 0;
         }

         int var32;
         if(var20 != null) {
            var31 = var20.Field82 - var28 - var2.x;
            if(var24 != null && var15) {
               var31 -= var30;
            }

            for(var32 = var3.length() - 1; var32 >= 0 && var36.stringWidth(var3.substring(0, var32)) >= var31; --var32) {
               ;
            }

            return var10 + var32 + 1;
         } else {
            if(var7 == 5) {
               var29 = (var2.height - var25) / 2;
            } else if(var7 == 6) {
               var29 = var2.height - var25 - 1;
            }

            if(var24 != null) {
               var31 = 1;
               if(var7 == 5) {
                  var31 = (var2.height - var24.a) / 2;
               } else if(var7 == 6) {
                  var31 = var2.height - var24.a - 1;
               }

               if(var15) {
                  var21.drawImage(var24.Field101, var18?var2.x + 2:var2.x + var28, var2.y + var31, this.T);
               } else {
                  var21.drawImage(var24.Field101, var18?var2.x + var2.width - var24.Field103 - 2:var2.x + var28 + var27 - var24.Field103, var2.y + var31, this.T);
                  var30 = 0;
               }
            }

            int var34;
            if(var8 < var9) {
               var31 = var8 > var10?var8 - var10:0;
               var32 = var9 - var10 > var3.length()?var3.length():var9 - var10;
               int var33 = var36.stringWidth(var3.substring(0, var31));
               var34 = var36.stringWidth(var3.substring(var31, var32));
               var21.setColor(var11);
               var21.fillRect(var2.x + var28 + var33 + var30, var2.y + var29 + 1, var34, var26 + 1);
            }

            var21.setFont(var1);
            if(var13 != null) {
               var21.setColor(var13);
               var21.drawString(var3, var2.x + var28 + var25 / 10 + var30, var2.y + var26 + var29 + var25 / 10);
            }

            var21.setColor(var12);
            var21.drawString(var3, var2.x + var28 + var30, var2.y + var26 + var29);
            if(var4 && var8 == var9) {
               var21.setColor(Color.black);
               var31 = var36.stringWidth(var3.substring(0, var8 - var10));
               var21.drawLine(var2.x + var28 + var31 + var30, var2.y + var26 + var29, var2.x + var28 + var31 + var30, var2.y + var29 + 1);
            }

            if(var5 != null && var5.length() == 1) {
               char var38 = var5.charAt(0);

               for(var32 = 0; var32 < var3.length(); ++var32) {
                  char var37 = var3.toLowerCase().charAt(var32);
                  if(var37 == var38) {
                     var34 = var36.stringWidth(var3.substring(0, var32));
                     var21.drawLine(var2.x + var28 + var34 + var30, var2.y + var26 + var29 + 2, var2.x + var28 + var34 + var36.charWidth(var38) + var30, var2.y + var26 + var29 + 2);
                     break;
                  }
               }
            }

            return var23 == -1?var10:var23;
         }
      } else {
         return var10;
      }
   }

   final a a(int var1, int var2) {
      Vector var3 = K;
      synchronized(K) {
         a var5;
         for(int var4 = 0; var4 < K.size(); ++var4) {
            var5 = (a)K.elementAt(var4);
            if(!var5.Field104 && var5.Field103 == var1 && var5.a == var2) {
               var5.Field104 = true;
               return var5;
            }
         }

         var5 = new a();

         try {
            var5.Field101 = this.T.createImage(var1, var2);
         } catch (Throwable var6) {
            super.Field123.Method61(var6.toString());
            super.Field123.Method4(false);
            System.gc();
            var5.Field101 = this.T.createImage(var1, var2);
         }

         var5.Field102 = var5.Field101.getGraphics();
         var5.Field103 = var1;
         var5.a = var2;
         var5.Field104 = true;
         Q += var1 * var2;
         K.addElement(var5);
         return var5;
      }
   }

   public final a a(URL var1, boolean var2, int var3) {
      try {
         String var4 = Integer.toString(var3) + var2 + var1.toString();
         Hashtable var5 = ab;
         a var6;
         synchronized(ab) {
            var6 = (a)ab.get(var4);
            if(var6 == null) {
               MediaTracker var7 = new MediaTracker(this.T);
               Image var8 = null;
               int var9 = var4.indexOf(35);
               if(var9 != -1) {
                  if(var4.endsWith("EMPTY")) {
                     return new a();
                  }

                  URL var10 = Session.class.getResource("/hu/polygon/jform/client/" + var4.substring(var9 + 1) + ".gif");
                  if(var10 == null) {
                     return new a();
                  }

                  var8 = N.getImage(var10);
               } else {
                  if(var3 != 0) {
                     a var32 = this.a(var1, false, 0);
                     if(var32.Field101 != null) {
                        int var11 = var32.Field103;
                        int var12 = var32.a;
                        int var13 = (var11 - 1) / 2;
                        int var14 = var13 + 1;
                        int var15 = (var12 - 1) / 2;
                        int var16 = var15 + 1;
                        int var17 = var11 - var14;
                        int var18 = var12 - var16;
                        ImageProducer var19 = var32.Field101.getSource();
                        a var20 = new a();
                        var20.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(0, 0, var13, var15)));
                        var20.Field103 = var13;
                        var20.a = var15;
                        var7.addImage(var20.Field101, 1);
                        ab.put("1" + var2 + var1.toString(), var20);
                        a var21 = new a();
                        var21.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(var13, 0, 1, var15)));
                        var21.Field103 = 1;
                        var21.a = var15;
                        var7.addImage(var21.Field101, 2);
                        ab.put("2" + var2 + var1.toString(), var21);
                        a var22 = new a();
                        var22.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(var14, 0, var17, var15)));
                        var22.Field103 = var17;
                        var22.a = var15;
                        var7.addImage(var22.Field101, 3);
                        ab.put("3" + var2 + var1.toString(), var22);
                        a var23 = new a();
                        var23.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(0, var15, var13, 1)));
                        var23.Field103 = var13;
                        var23.a = 1;
                        var7.addImage(var23.Field101, 4);
                        ab.put("4" + var2 + var1.toString(), var23);
                        a var24 = new a();
                        var24.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(var13, var15, 1, 1)));
                        var24.Field103 = 1;
                        var24.a = 1;
                        var7.addImage(var24.Field101, 5);
                        ab.put("5" + var2 + var1.toString(), var24);
                        a var25 = new a();
                        var25.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(var14, var15, var17, 1)));
                        var25.Field103 = var17;
                        var25.a = 1;
                        var7.addImage(var25.Field101, 6);
                        ab.put("6" + var2 + var1.toString(), var25);
                        a var26 = new a();
                        var26.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(0, var16, var13, var18)));
                        var26.Field103 = var13;
                        var26.a = var18;
                        var7.addImage(var26.Field101, 7);
                        ab.put("7" + var2 + var1.toString(), var26);
                        a var27 = new a();
                        var27.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(var13, var16, 1, var18)));
                        var27.Field103 = 1;
                        var27.a = var18;
                        var7.addImage(var27.Field101, 8);
                        ab.put("8" + var2 + var1.toString(), var27);
                        a var28 = new a();
                        var28.Field101 = N.createImage(new FilteredImageSource(var19, new CropImageFilter(var14, var16, var17, var18)));
                        var28.Field103 = var17;
                        var28.a = var18;
                        var7.addImage(var28.Field101, 9);
                        ab.put("9" + var2 + var1.toString(), var28);
                        Q += var32.Field103 * var32.a * 2;
                        var7.waitForAll();
                        return (a)ab.get(var4);
                     }

                     return new a();
                  }

                  var8 = N.getImage(var1);
               }

               if(var2) {
                  var8 = s.a(var8);
               }

               var6 = new a();
               var7.addImage(var8, 0);
               var7.waitForAll();
               if(!var7.isErrorAny()) {
                  var6.Field103 = var8.getWidth(this.T);
                  var6.a = var8.getHeight(this.T);
                  var6.Field101 = var8;
                  Q += var6.Field103 * var6.a;
               } else {
                  super.Field123.Method62("Unable to load image: " + var1);
               }

               ab.put(var4, var6);
            }
         }

         return var6;
      } catch (Throwable var31) {
         super.Field123.a("Unable to load image: " + var1, var31);
         return new a();
      }
   }

   protected static final double a(String var0, double var1) {
      try {
         return Double.valueOf(var0).doubleValue();
      } catch (Exception var4) {
         return var1;
      }
   }

   protected static final String a(String var0, String var1, String var2, String var3, String var4, int var5, int var6, boolean var7, boolean var8) {
      if(var0.startsWith("0E")) {
         var0 = "0";
      }

      if(var1 != null && !var1.equals(" ")) {
         var0 = var0.replace(var1.charAt(0), ' ');
      }

      if(var2 != null) {
         var0 = var0.replace(var2.charAt(0), '.');
      }

      boolean var9 = var0.indexOf("-") != -1;
      String var10 = "";
      String var11 = "0123456789.";

      int var12;
      for(var12 = 0; var12 < var0.length(); ++var12) {
         char var13 = var0.charAt(var12);
         if(var11.indexOf(String.valueOf(var13)) != -1) {
            var10 = var10 + var13;
            if(var13 == 46) {
               var11 = "0123456789";
            }
         }
      }

      var12 = var10.indexOf(46);
      String var16 = "";
      if(var12 == -1) {
         var12 = var10.length();
      } else {
         for(var16 = var10.substring(var12 + 1, var10.length()); var16.endsWith("0"); var16 = var16.substring(0, var16.length() - 1)) {
            ;
         }
      }

      String var14;
      for(var14 = var10.substring(0, var12); var14.startsWith("0") && var14.length() > 1; var14 = var14.substring(1, var14.length())) {
         ;
      }

      if(var14.length() == 0) {
         if(!var8 && var16.length() == 0) {
            return "";
         }

         var14 = "0";
      }

      if(var16.length() == 0 && var14.equals("0")) {
         var9 = false;
      }

      if(var14.length() < var5) {
         for(var12 = var14.length(); var12 < var5; ++var12) {
            var14 = '0' + var14;
         }
      }

      if(var3 != null) {
         char var15 = var3.charAt(0);
         var10 = "";

         for(var12 = 0; var12 < var14.length(); ++var12) {
            var10 = var14.charAt(var14.length() - var12 - 1) + var10;
            if((var12 + 1) / 3 * 3 == var12 + 1) {
               var10 = var15 + var10;
            }
         }

         if(var10.startsWith(var3)) {
            var10 = var10.substring(1, var10.length());
         }

         var14 = var10;
      }

      if(var6 != -1) {
         if(var16.length() > var6) {
            var16 = var16.substring(0, var6);
         } else if(var16.length() < var6) {
            for(var12 = var16.length(); var12 < var6; ++var12) {
               var16 = var16 + '0';
            }
         }
      } else if(var16.length() == 0) {
         var6 = 0;
      }

      var0 = var14;
      if(var6 != 0) {
         var0 = var14 + var4 + var16;
      }

      if(var9) {
         var0 = '-' + var0;
      } else if(var7) {
         var0 = '+' + var0;
      }

      return var0;
   }

   final String a(String var1, String[] var2, String var3, String[] var4, String var5) {
      String var6 = "";
      if(var1 != null && var1.length() != 0) {
         boolean var7 = false;

         try {
            new Integer(var1);
            var7 = true;
         } catch (Exception var11) {
            ;
         }

         if(var7) {
            return var1.length() == 6?this.a(var2, var3, var4, var5, var1.substring(0, 2), var1.substring(2, 4), var1.substring(4, 6)):(var1.length() == 7?(var1.charAt(0) == 48?this.a(var4, var5, "19" + var1.substring(1, 3), var1.substring(3, 5), var1.substring(5, 7)):this.a(var4, var5, "20" + var1.substring(1, 3), var1.substring(3, 5), var1.substring(5, 7))):(var1.length() == 8?this.a(var2, var3, var4, var5, var1):var6));
         } else {
            StringTokenizer var8 = new StringTokenizer(var1, ".,:;- /");

            try {
               return this.a(var2, var3, var4, var5, var8.nextToken(), var8.nextToken(), var8.nextToken());
            } catch (Exception var10) {
               return var6;
            }
         }
      } else {
         return var6;
      }
   }

   private final String a(String[] var1, String var2, String var3, String var4, String var5) {
      if(var3 != null && var4 != null && var5 != null) {
         String var6 = "";

         for(int var7 = 0; var7 < var2.length(); ++var7) {
            char var8 = var2.charAt(var7);
            if(var8 == 121) {
               var6 = var6 + var3.substring(2, 4);
            } else if(var8 == 109) {
               var6 = var6 + var4;
            } else if(var8 == 89) {
               var6 = var6 + var3;
            } else if(var8 == 77) {
               try {
                  Integer var9 = new Integer(var4);
                  var6 = var6 + var1[var9.intValue() - 1];
               } catch (Exception var11) {
                  return null;
               }
            } else if(var8 == 100) {
               var6 = var6 + var5;
            } else if(var8 == 67) {
               try {
                  if(Integer.parseInt(var3) < 2000) {
                     var6 = var6 + '0';
                  } else {
                     var6 = var6 + '1';
                  }
               } catch (Exception var10) {
                  return null;
               }
            } else {
               var6 = var6 + var8;
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   private final String a(String[] var1, String var2, String[] var3, String var4, String var5, String var6, String var7) {
      int var8 = var2.toUpperCase().indexOf("Y");
      int var9 = var2.toUpperCase().indexOf("M");
      int var10 = var2.indexOf("d");
      String var11 = null;
      String var12 = null;
      String var13 = null;
      boolean var14 = false;
      int var18;
      if(var8 > var10) {
         var18 = var10;
         var10 = var8;
         var8 = var18;
      }

      if(var8 > var9) {
         var18 = var9;
         var9 = var8;
         var8 = var18;
      }

      if(var9 > var10) {
         var18 = var10;
         var10 = var9;
         var9 = var18;
      }

      if(var8 == var2.toUpperCase().indexOf("Y")) {
         var11 = var5;
      }

      if(var8 == var2.toUpperCase().indexOf("M")) {
         var12 = var5;
      }

      if(var8 == var2.indexOf("d")) {
         var13 = var5;
      }

      if(var9 == var2.toUpperCase().indexOf("Y")) {
         var11 = var6;
      }

      if(var9 == var2.toUpperCase().indexOf("M")) {
         var12 = var6;
      }

      if(var9 == var2.indexOf("d")) {
         var13 = var6;
      }

      if(var10 == var2.toUpperCase().indexOf("Y")) {
         var11 = var7;
      }

      if(var10 == var2.toUpperCase().indexOf("M")) {
         var12 = var7;
      }

      if(var10 == var2.indexOf("d")) {
         var13 = var7;
      }

      String var15 = this.Method42(var11);
      String var16 = this.a(var1, var12);
      String var17 = this.Method43(var13);
      return var15 != null && var16 != null && var17 != null?this.a(var3, var4, var15, var16, var17):"";
   }

   private final String a(String[] var1, String var2, String[] var3, String var4, String var5) {
      int var6 = var2.toUpperCase().indexOf("Y");
      int var7 = var2.toUpperCase().indexOf("M");
      int var8 = var2.indexOf("d");
      boolean var9 = false;
      int var10;
      if(var6 > var8) {
         var10 = var8;
         var8 = var6;
         var6 = var10;
      }

      if(var6 > var7) {
         var10 = var7;
         var7 = var6;
         var6 = var10;
      }

      if(var7 > var8) {
         var10 = var8;
         var8 = var7;
         var7 = var10;
      }

      return var6 == var2.toUpperCase().indexOf("Y")?this.a(var1, var2, var3, var4, var5.substring(0, 4), var5.substring(4, 6), var5.substring(6, 8)):(var7 == var2.toUpperCase().indexOf("Y")?this.a(var1, var2, var3, var4, var5.substring(0, 2), var5.substring(2, 6), var5.substring(6, 8)):(var8 == var2.toUpperCase().indexOf("Y")?this.a(var1, var2, var3, var4, var5.substring(0, 2), var5.substring(2, 4), var5.substring(4, 8)):""));
   }

   private final String Method42(String var1) {
      String var3;
      try {
         int var2 = Integer.parseInt(var1);
         if(var2 < 30) {
            if(var2 < 10) {
               var3 = "200" + var2;
            } else {
               var3 = "20" + var2;
            }
         } else if(var2 < 100) {
            var3 = "19" + var2;
         } else {
            var3 = String.valueOf(var2);
         }
      } catch (Exception var4) {
         return null;
      }

      if(var3.length() == 3) {
         var3 = "1" + var3;
      }

      return var3;
   }

   private final String a(String[] var1, String var2) {
      try {
         int var3 = Integer.parseInt(var2);
         if(var3 <= 12 && var3 >= 1) {
            if(var3 < 10) {
               var2 = "0" + var3;
            }

            return var2;
         } else {
            return null;
         }
      } catch (Exception var5) {
         try {
            if(var2.toUpperCase().startsWith(var1[0].toUpperCase().substring(0, 3))) {
               return "01";
            }

            if(var2.toUpperCase().startsWith(var1[1].toUpperCase().substring(0, 3))) {
               return "02";
            }

            if(var2.toUpperCase().startsWith(var1[2].toUpperCase().substring(0, 3))) {
               return "03";
            }

            if(var2.toUpperCase().startsWith(var1[3].toUpperCase().substring(0, 3))) {
               return "04";
            }

            if(var2.toUpperCase().startsWith(var1[4].toUpperCase().substring(0, 3))) {
               return "05";
            }

            if(var2.toUpperCase().startsWith(var1[5].toUpperCase().substring(0, 3))) {
               return "06";
            }

            if(var2.toUpperCase().startsWith(var1[6].toUpperCase().substring(0, 3))) {
               return "07";
            }

            if(var2.toUpperCase().startsWith(var1[7].toUpperCase().substring(0, 3))) {
               return "08";
            }

            if(var2.toUpperCase().startsWith(var1[8].toUpperCase().substring(0, 3))) {
               return "09";
            }

            if(var2.toUpperCase().startsWith(var1[9].toUpperCase().substring(0, 3))) {
               return "10";
            }

            if(var2.toUpperCase().startsWith(var1[10].toUpperCase().substring(0, 3))) {
               return "11";
            }

            if(var2.toUpperCase().startsWith(var1[11].toUpperCase().substring(0, 3))) {
               return "12";
            }
         } catch (Exception var4) {
            ;
         }

         return null;
      }
   }

   private final String Method43(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         return var2 <= 31 && var2 >= 1?(var2 < 10?"0" + var2:String.valueOf(var2)):null;
      } catch (Exception var3) {
         return null;
      }
   }

   public void run() {
   }

   public final String toString() {
      return super.toString() + '[' + this._id.u + ',' + this.af + ',' + this.ae + ',' + this.O + '*' + this.J + ']';
   }
}
