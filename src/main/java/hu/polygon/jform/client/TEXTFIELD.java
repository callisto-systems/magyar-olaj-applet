package hu.polygon.jform.client;

import hu.polygon.jform.client.LABEL;
import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.PAGE;
import hu.polygon.jform.client.PANEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ab;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.al;
import hu.polygon.jform.client.am;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.at;
import hu.polygon.jform.client.av;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.x;
import hu.polygon.jform.client.y;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.math.BigInteger;
import java.net.URLEncoder;
import a.a.a.c;

public class TEXTFIELD extends LABEL {
   public final g _highlight;
   public final g _fault;
   public final q _start;
   public final q _end;
   public final i _pattern;
   public final av _case;
   public final i _include;
   public final i _exclude;
   public final q _length;
   public final y _required;
   public final i _alert;
   public final i _echo;
   public final y _editable;
   public final i _public_key;
   public boolean bT = true;
   at bP;
   protected int bM;
   protected boolean bW;
   protected int bO;
   protected int bN;
   protected boolean bX;
   protected boolean bV;
   private final StringBuffer bU = new StringBuffer();
   private int bR;
   private static Clipboard bS;
   private static String bQ = new String();

   static {
      if(Main.a <= 1.1F) {
         try {
            bS = (Clipboard)Class.forName("com.ms.awt.WClipboard").newInstance();
         } catch (Exception var2) {
            ;
         }
      }

      if(Main.a > 1.1F && bS == null) {
         try {
            System.getSecurityManager().checkSystemClipboardAccess();
            bS = aq.N.getSystemClipboard();
         } catch (Throwable var1) {
            ;
         }
      }

   }

   public TEXTFIELD(Session var1) {
      super(var1);
      this._highlight = new g(this, var1, g.p);
      this._fault = new g(this, var1, Color.red);
      this._start = new q(this, var1, 0);
      this._end = new q(this, var1, 0);
      this._pattern = new i(this, var1, (String)null);
      this._case = new av(this, var1, (byte)20);
      this._include = new i(this, var1, (String)null);
      this._exclude = new i(this, var1, (String)null);
      this._length = new q(this, var1, 0);
      this._required = new y(this, var1, false);
      this._alert = new i(this, var1, (String)null);
      this._echo = new i(this, var1, (String)null);
      this._editable = new y(this, var1, true);
      this._public_key = new i(this, var1, (String)null);
      super.ad = "#TEXTFIELD";
      super._border_tickness.y = 1;
      super._transparent.D = false;
      super._border.b8 = 10;
      super._background.s = Color.white;
      super._focusable.D = true;
   }

   public void I() {
      if(this.bP != null) {
         this.bP.h();
      }

   }

   public void H() {
   }

   public boolean K() {
      if(super._visible.D && super._enabled.D) {
         if(super._text.u.trim().length() == 0) {
            return !this._required.D;
         } else {
            if(this._pattern.u != null) {
               try {
                  c var1 = new c(this._pattern.u);
                  if(!var1.a(super._text.u) || var1.Method16(0) != super._text.u.length()) {
                     return false;
                  }
               } catch (Exception var2) {
                  this._pattern.u = null;
                  super.Field123.Method62("Invalid pattern syntax: " + this._pattern.u);
               }
            }

            return this.bP == null?true:this.bP.f();
         }
      } else {
         return true;
      }
   }

   public void L() {
      if(this.bP == null) {
         if(this._public_key.u != null && this._public_key.u.length() != 0) {
            try {
               int var1 = this._public_key.u.indexOf(45);
               BigInteger var2 = new BigInteger(this._public_key.u.substring(0, var1), 36);
               BigInteger var3 = new BigInteger(this._public_key.u.substring(var1 + 1), 36);
               byte[] var4 = URLEncoder.encode(super._text.u).getBytes();
               BigInteger var5 = new BigInteger(var4);
               BigInteger var6 = var5.modPow(var2, var3);
               super._text.Method32("rsa:" + var6.toString(36));
            } catch (Exception var7) {
               super.Field123.a((String)"Unable to encode password!", (Throwable)var7);
            }
         } else {
            super._text.Method32(super._text.u);
         }
      } else {
         this.bP.g();
      }

   }

   public void a(Graphics var1) {
      this.bM = this.a(super._font.C, super.ac, super._text.u, super.M && this._editable.D && super._enabled.D, (String)null, super._alignment.b8, super._regulation.b8, this._start.y, this._end.y, this.bM, this._highlight.s, super._foreground.s, super._shadow.s, super._icon.k, super._icon_left.D, super._icon_gap.y, super._enabled.D, super._icon_side.D, this._echo.u, (ag)null);
   }

   public void Method38() {
      if(!this.bT) {
         this.a(14, 1, super.ac.x, super.ac.y, super.ac.width, super.ac.height, this._fault.s, (Color)null, (Color)null, (String)null, (Font)null, 0);
      }

      super.Method38();
   }

   public void Method13() {
      super.L = super._enabled.D?2:0;
      if(this._public_key.u != null && this._public_key.u.length() != 0) {
         super._text.u = "";
      }

      this.a((String)super._text.u, 0);
      this.I();
      this.Method70(this._start.y, this._end.y);
      af var1 = super.aa;

      while(var1 != null) {
         if(var1 instanceof PAGE) {
            if(!((PAGE)var1)._enabled.D) {
               break;
            }
         } else if(var1 instanceof PANEL && !((PANEL)var1)._visible.D) {
            break;
         }

         var1 = var1.aa;
         if(var1 == null) {
            this.bT = this.K();
            if(!this.bT && !super.Field123.Field99.contains(this)) {
               super.Field123.Field99.addElement(this);
            }
         }
      }

      super.Method13();
   }

   public void Method2() {
      super.Field123.Field99.removeElement(this);
      this.E();
      super.Method2();
   }

   private final int a(am var1, int var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1.Field61.size(); ++var4) {
         al var5 = (al)var1.Field61.elementAt(var4);
         if(var2 <= var5.a + var5.Field69) {
            for(int var6 = 0; var6 < var5.Field68; ++var6) {
               if(var2 <= ((x)this).b2.stringWidth(var5.Field67.substring(0, var6)) + var5.a) {
                  return var3 + var6;
               }
            }
         }

         var3 += var5.Field68;
      }

      return var1.Field62;
   }

   public final void run() {
      switch(this.bN) {
      case 0:
         if(this._start.y > 0) {
            this.Method71(true);
         } else {
            this.E();
         }
         break;
      case 1:
         if(this._end.y < super._text.u.length()) {
            this.Method72(true);
         } else {
            this.E();
         }
         break;
      case 2:
         if(this._start.y > 0) {
            this.Method73(true);
         } else {
            this.E();
         }
         break;
      case 3:
         if(this._end.y < super._text.u.length()) {
            this.b(true);
         } else {
            this.E();
         }
      }

   }

   private final void a(int var1) {
      this.bN = var1;
      Main.Field59.Method87(this);
   }

   public final void E() {
      Main.Field59.a(this);
   }

   public final void Method70(int var1, int var2) {
      if(this._start.y != var1 || this._end.y != var2) {
         int var3 = super._text.u.length();
         if(var2 < var1) {
            int var4 = var1;
            var1 = var2;
            var2 = var4;
         }

         if(var1 < 0) {
            var1 = 0;
         }

         if(var1 > var3) {
            var1 = var3;
         }

         if(var2 > var3) {
            var2 = var3;
         }

         this._start.y = var1;
         this._end.y = var2;
         this._start.Method32(Integer.toString(var1));
         this._end.Method32(Integer.toString(var2));
      }

   }

   private final void Method71(boolean var1) {
      if(this._start.y <= this.bO && this._end.y == this.bO) {
         this.Method70(this._start.y - 1, this._end.y);
      } else {
         this.Method70(this._start.y, this._end.y - 1);
      }

      if(!var1) {
         this.bO = this._end.y = this._start.y;
      }

      this.a(false, this._start.y <= this.bO?this._start.y:this._end.y);
   }

   private final void Method72(boolean var1) {
      if(this._end.y >= this.bO && this._start.y == this.bO) {
         this.Method70(this._start.y, this._end.y + 1);
      } else {
         this.Method70(this._start.y + 1, this._end.y);
      }

      if(!var1) {
         this.bO = this._start.y = this._end.y;
      }

      this.a(false, this._end.y >= this.bO?this._end.y:this._start.y);
   }

   private final void a(boolean var1, int var2) {
      if(this.bW) {
         if(var1) {
            ((x)this).N();
         }

         boolean var3 = ((m)super.Field122)._part_vertical._visible.D;
         if(var3 && (this.bX != var3 || var1)) {
            ((m)super.Field122)._part_vertical.Method37();
         }

         this.bX = var3;
         if(((x)this).Method86(var2)) {
            return;
         }
      }

      this.Method37();
   }

   private final void Method73(boolean var1) {
      int var2 = 0;
      int var3 = super._text.u.length();

      for(int var4 = super._text.u.indexOf(10); var4 > -1 && var4 < var3 && var4 < this._start.y - 1; var4 = super._text.u.indexOf(10, var2)) {
         var2 = var4 + 1;
      }

      if(var2 >= this._start.y && this._start.y > 0) {
         var2 = 0;
      }

      if(var1) {
         this.Method70(var2, this._end.y);
      } else {
         this.Method70(var2, var2);
      }

      this.bV = true;
      this.a(false, var2);
   }

   private final void b(boolean var1) {
      int var2 = 0;
      int var3 = super._text.u.length();
      int var4 = var1?this._end.y:this._start.y;

      int var5;
      for(var5 = super._text.u.indexOf(10); var5 > -1 && var5 < var3 && var5 < var4 + 1; var5 = super._text.u.indexOf(10, var2)) {
         var2 = var5 + 1;
      }

      var5 = super._text.u.indexOf(10, var2);
      if(var5 <= 0) {
         var5 = var3;
      }

      if(var1) {
         this.Method70(this._start.y, var5);
      } else {
         this.Method70(var5, var5);
      }

      this.bV = false;
      this.a(false, var5);
   }

   private final void F() {
      if(this._start.y != this._end.y && this._editable.D && this._echo.u == null) {
         Method62(super._text.u.substring(this._start.y, this._end.y));
         this.G();
      }

   }

   private final void J() {
      if(this._start.y != this._end.y && this._echo.u == null) {
         Method62(super._text.u.substring(this._start.y, this._end.y));
      }

   }

   private final void Method74(boolean var1) {
      if(this._editable.D) {
         String var2 = D();
         if(var2.length() != 0) {
            if(this._start.y != this._end.y) {
               this.G();
            }

            if(var1 && var2.indexOf("\n") != -1) {
               var2 = var2.substring(0, var2.indexOf("\n"));
            }

            this.a(var2.trim(), false);
         }
      }

   }

   private final void Method75(boolean var1) {
      int var2 = super._text.u.lastIndexOf("\n", this._end.y - 1);
      if(var2 < 1) {
         this.Method73(var1);
      } else {
         int var3 = super._text.u.lastIndexOf("\n", var2 - 1);
         if(var3 == -1) {
            var3 = 0;
         }

         int var4 = this._start.y - var2;
         this._start.y = var2 - var3 < var4?var2:var3 + var4;
         if(!var1) {
            this.bO = this._end.y = this._start.y;
         }

         this.a(false, this._start.y);
      }
   }

   private final void Method76(boolean var1) {
      int var2 = super._text.u.lastIndexOf("\n", this._end.y - 1);
      if(var2 == -1) {
         var2 = 0;
      }

      int var3 = super._text.u.indexOf("\n", this._end.y);
      if(var3 == -1) {
         this.b(var1);
      } else {
         this.Method70(this._start.y, var3 + this._end.y - var2);
         if(!var1) {
            this.bO = this._start.y = this._end.y;
         }

         this.a(false, this._end.y);
      }
   }

   private final void c(boolean var1) {
      int var2 = 0;
      int var3 = super._text.u.length();

      for(int var4 = super._text.u.indexOf(32); var4 > -1 && var4 < var3 && var4 < this._start.y - 1; var4 = super._text.u.indexOf(32, var2)) {
         var2 = var4 + 1;
      }

      if(var2 >= this._start.y && this._start.y > 0) {
         var2 = 0;
      }

      if(var1) {
         this.Method70(var2, this._end.y);
      } else {
         this.Method70(var2, var2);
      }

      this.a(false, var2);
   }

   private final void Method77(boolean var1) {
      int var2 = 0;
      int var3 = super._text.u.length();

      int var4;
      for(var4 = super._text.u.indexOf(32); var4 > -1 && var4 < var3 && var4 < this._end.y; var4 = super._text.u.indexOf(32, var2)) {
         var2 = var4 + 1;
      }

      var4 = super._text.u.indexOf(32, var2) + 1;
      if(var4 <= 0) {
         var4 = var3;
      }

      if(var1) {
         this.Method70(this._start.y, var4);
      } else {
         this.Method70(var4, var4);
      }

      this.a(false, var4);
   }

   private final void G() {
      this.Method78(super._text.u.substring(0, this._start.y) + super._text.u.substring(this._end.y, super._text.u.length()), 0);
   }

   private final void B() {
      if(this._start.y < super._text.u.length()) {
         this.Method78(super._text.u.substring(0, this._start.y) + super._text.u.substring(this._start.y + 1, super._text.u.length()), 0);
      }

   }

   private final void A() {
      if(this._start.y > 0) {
         this.Method78(super._text.u.substring(0, this._start.y - 1) + super._text.u.substring(this._start.y, super._text.u.length()), -1);
      }

   }

   private final void a(char var1, boolean var2) {
      this.Method78(super._text.u.substring(0, this._start.y) + var1 + super._text.u.substring(this._start.y, super._text.u.length()), 1);
   }

   private final void a(String var1, boolean var2) {
      this.Method78(super._text.u.substring(0, this._start.y) + var1 + super._text.u.substring(this._end.y, super._text.u.length()), var1.length());
   }

   private final int a(String var1, int var2) {
      this.bU.setLength(0);
      int var3 = var1.length();
      if(this._length.y != 0 && var3 > this._length.y) {
         var3 = this._length.y;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var1.charAt(var4);
         if(this._case.b8 == 21) {
            var5 = Character.toUpperCase(var5);
         } else if(this._case.b8 == 22) {
            var5 = Character.toLowerCase(var5);
         }

         if(this._include.u != null && this._include.u.indexOf(var5) == -1) {
            --var2;
         } else if(this._exclude.u != null && this._exclude.u.indexOf(var5) != -1) {
            --var2;
         } else {
            this.bU.append(var5);
         }
      }

      super._text.u = this.bU.toString();
      return var2;
   }

   final void Method78(String var1, int var2) {
      int var3 = this.a(var1, var2);
      if(var3 != var2) {
         this.C();
      }

      this._start.y += var3;
      if(this._start.y > this.bU.length()) {
         this._start.y = this.bU.length();
         this.C();
      }

      this._start.Method32(Integer.toString(this._start.y));
      this.Method79(true);
   }

   final void Method79(boolean var1) {
      boolean var2 = this.K();
      if(var2) {
         super.Field123.Field99.removeElement(this);
         if(var1) {
            this.L();
         }
      } else {
         if(!super.Field123.Field99.contains(this)) {
            super.Field123.Field99.addElement(this);
         }

         if(this.bT) {
            this.Method10(this);
            this.C();
         }
      }

      this.bT = var2;
      this.bO = this._end.y = this._start.y;
      this.a(true, this.bO);
   }

   protected final void Method10(aq var1) {
      if(this._alert.u != null && (super.T.Field1 || var1 != this)) {
         Point var2 = hu.polygon.jform.client.ac.Method8(var1);
         super.T.e = var2.x;
         super.T.d = var2.y + var1.J - 18;
         aq.ag.a(super.T, (String)null, this._alert.u, true);
      }

   }

   private final void C() {
      aq.N.beep();
   }

   public final boolean a(ag var1) {
      if(!super._enabled.D) {
         return super.a(var1);
      } else if(var1.Field80 != 9 && super.W != null && (var1.a == 401 || var1.a == 400 || var1.a == 402) && !this._editable.D) {
         if(var1.Field81) {
            if(var1.a == 401 && (var1.Field80 == 38 || var1.Field80 == 40 || var1.Field80 == 37 || var1.Field80 == 39)) {
               super.W.a(new ag(this, var1.Field80 != 38 && var1.Field80 != 39?"down":"up"));
            }
         } else {
            if(var1.a != 401) {
               return false;
            }

            var1.a = 1001;
            super.W.a(var1);
         }

         return true;
      } else {
         ab var3;
         int var4;
         am var5;
         switch(var1.a) {
         case 401:
            if(var1.Field81) {
               switch(var1.Field80) {
               case 33:
                  if(this.bW) {
                     ((m)super.Field122).Method83(0, super.H - super.ac.height + ((x)this).b4);
                  }

                  return super.a(var1);
               case 34:
                  if(this.bW) {
                     ((m)super.Field122).Method83(0, super.H + super.ac.height - ((x)this).b4);
                  }

                  return super.a(var1);
               case 35:
                  this.b(var1.Method57());
                  return super.a(var1);
               case 36:
                  this.Method73(var1.Method57());
                  return super.a(var1);
               case 37:
                  if(this._start.y > 0) {
                     if(var1.Method58()) {
                        this.c(var1.Method57());
                     } else {
                        this.Method71(var1.Method57());
                     }

                     return super.a(var1);
                  }

                  return super.a(var1);
               case 38:
                  this.Method75(var1.Method57());
                  return super.a(var1);
               case 39:
                  if(this._start.y < super._text.u.length()) {
                     if(var1.Method58()) {
                        this.Method77(var1.Method57());
                     } else {
                        this.Method72(var1.Method57());
                     }

                     return super.a(var1);
                  }

                  return super.a(var1);
               case 40:
                  this.Method76(var1.Method57());
                  return super.a(var1);
               case 155:
                  if(var1.Method58()) {
                     this.J();
                  } else if(var1.Method57()) {
                     this.Method74(!this.bW);
                     return true;
                  }

                  return super.a(var1);
               default:
                  return super.a(var1);
               }
            } else {
               switch(var1.Field80) {
               case 3:
                  if(var1.Field79 == 2) {
                     this.J();
                  }

                  return true;
               case 8:
                  if(this._editable.D) {
                     if(this._end.y > this._start.y) {
                        this.G();
                     } else {
                        this.A();
                     }
                  } else {
                     this.C();
                  }
                  break;
               case 10:
                  if(this._editable.D) {
                     if(this.bW) {
                        this.a('\n', false);
                     } else if(this.bP != null) {
                        this.bP.Method30((String)null);
                     } else if(super.W == null) {
                        this.Method30((String)null);
                     } else {
                        super.W.Method30((String)null);
                     }
                  } else {
                     this.C();
                  }
                  break;
               case 22:
                  if(var1.Field79 == 2) {
                     this.Method74(!this.bW);
                  }
                  break;
               case 24:
                  if(var1.Field79 == 2) {
                     this.F();
                  }
                  break;
               case 127:
                  if(this._editable.D) {
                     if(var1.Method57()) {
                        this.F();
                     } else if(this._end.y > this._start.y) {
                        this.G();
                     } else {
                        this.B();
                     }
                  } else {
                     this.C();
                  }
               }
            }
         case 400:
            if(var1.Field80 > 31 && var1.Field80 < '\uffff' && var1.Field80 != 127) {
               if(var1.a == 400) {
                  if(var1.Field80 == this.bR) {
                     if(this._start.y > 0 && this._start.y == this._length.y) {
                        super.T.a(false);
                     }

                     return true;
                  }

                  this.bR = 0;
               } else {
                  this.bR = var1.Field80;
               }

               if(this._editable.D) {
                  if(this._end.y != this._start.y) {
                     this.G();
                  }

                  this.a((char)var1.Field80, false);
               } else {
                  this.C();
               }
            }
            break;
         case 501:
            if(!var1.a()) {
               if(var1.Field84 == 1) {
                  if(this.bW) {
                     var3 = ((x)this).bZ;
                     if(var3.a.isEmpty()) {
                        return super.a(var1);
                     }

                     var4 = (var1.Field83 + super.H) / ((x)this).b4;
                     if(var4 > var3.a.size() - 1) {
                        var4 = var3.a.size() - 1;
                     }

                     var5 = (am)var3.a.elementAt(var4);
                     if(super._alignment.b8 == 3) {
                        this.bO = this.a(var5, var1.Field82);
                     } else {
                        this.bO = this.a(super._font.C, super.ac, var5.Field60, false, (String)null, super._alignment.b8, super._regulation.b8, 0, 0, 0, (Color)null, (Color)null, (Color)null, super._icon.k, super._icon_left.D, super._icon_gap.y, true, super._icon_side.D, this._echo.u, var1);
                     }

                     this.bO += var5.Field65;
                  } else {
                     this.bO = this.a(super._font.C, super.ac, super._text.u, false, (String)null, super._alignment.b8, super._regulation.b8, this._start.y, this._end.y, this.bM, (Color)null, (Color)null, (Color)null, super._icon.k, super._icon_left.D, super._icon_gap.y, true, super._icon_side.D, this._echo.u, var1);
                  }

                  this.Method70(this.bO, this.bO);
               } else {
                  this.Method70(0, super._text.u.length());
               }

               this.a(false, this.bO);
            }
            break;
         case 502:
         case 505:
            this.E();
            break;
         case 506:
            boolean var2 = false;
            int var6;
            if(this.bW) {
               var3 = ((x)this).bZ;
               if(var3.a.isEmpty()) {
                  break;
               }

               var4 = (var1.Field83 + super.H) / ((x)this).b4;
               if(var4 > var3.a.size() - 1) {
                  var4 = var3.a.size() - 1;
               }

               if(var4 < 0) {
                  var4 = 0;
               }

               var5 = (am)var3.a.elementAt(var4);
               if(super._alignment.b8 == 3) {
                  var6 = this.a(var5, var1.Field82);
               } else {
                  var6 = this.a(super._font.C, super.ac, var5.Field60, false, (String)null, super._alignment.b8, super._regulation.b8, 0, 0, 0, (Color)null, (Color)null, (Color)null, super._icon.k, super._icon_left.D, super._icon_gap.y, true, super._icon_side.D, this._echo.u, var1);
               }

               var6 += var5.Field65;
            } else {
               var6 = this.a(super._font.C, super.ac, super._text.u, false, (String)null, super._alignment.b8, super._regulation.b8, this._start.y, this._end.y, this.bM, (Color)null, (Color)null, (Color)null, super._icon.k, super._icon_left.D, super._icon_gap.y, true, super._icon_side.D, this._echo.u, var1);
            }

            if(var1.Field82 < super.ac.x + 5) {
               if(!this.bW) {
                  this.a(0);
                  return true;
               }
            } else if(var1.Field82 > super.ac.x + super.ac.width - 5) {
               if(!this.bW) {
                  this.a(1);
                  return true;
               }
            } else if(var1.Field83 < super.ac.y + 5) {
               if(this.bW) {
                  this.a(2);
                  return true;
               }
            } else if(var1.Field83 > super.ac.y + super.ac.height - 5) {
               if(this.bW) {
                  this.a(3);
                  return true;
               }
            } else {
               this.E();
            }

            if(var6 < this.bO) {
               this.Method70(var6, this._end.y);
            } else if(var6 > this.bO) {
               this.Method70(this._start.y, var6);
            }

            this.Method37();
            break;
         case 1004:
            if(this._editable.D) {
               if(this.bT) {
                  this.H();
               } else {
                  this.Method10(this);
               }
            }
            break;
         case 1005:
            this._end.y = this._start.y;
            if(this._editable.D && this.bT) {
               this.I();
            }
         }

         return super.a(var1);
      }
   }

   public static final void Method62(String var0) {
      if(bS == null) {
         bQ = var0;
      } else {
         bS.setContents(new StringSelection(var0), (ClipboardOwner)null);
      }

   }

   public static final String D() {
      if(bS == null) {
         return bQ;
      } else {
         String var0 = new String();

         try {
            Transferable var1 = bS.getContents((Object)null);
            var0 = (String)var1.getTransferData(DataFlavor.stringFlavor);
            if(var0.length() > 10000) {
               var0 = var0.substring(0, 10000) + "...";
            }

            var0 = var0.replace('\t', ' ');
         } catch (Exception var2) {
            ;
         }

         return var0;
      }
   }
}
