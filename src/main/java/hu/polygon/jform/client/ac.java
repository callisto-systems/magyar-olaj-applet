package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.ImageFactory;
import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.PAGE;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TEXTFIELD;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.au;
import hu.polygon.jform.client.d;
import hu.polygon.jform.client.k;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.t;
import hu.polygon.jform.client.x;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Vector;

public class ac extends Component {
   protected final Session a;
   public k Field0;
   public boolean Field1;
   public aq Field2;
   private int Field3;
   private int Field4;
   private int Field5;
   private int c;
   private String Field6;
   private boolean Field7 = true;
   private final Vector Field8 = new Vector();
   aq Field9;
   protected aq Field10;
   final Hashtable b = new Hashtable();
   boolean Field11;
   protected Point f;
   protected aq Field12;
   protected int e;
   protected int d;
   static ImageFactory Field13;

   public ac(Session var1) {
      this.a = var1;
      this.enableEvents(131132L);
   }

   public void Method3() {
      this.Field0.Method2();
      Container var1 = this.getParent();
      if(var1 != null) {
         if(this.a.Field89 != null && var1 == this.a.Field89.Field54) {
            var1.remove(this);
            var1.repaint(40L);
            var1.setCursor(Cursor.getDefaultCursor());
         } else {
            ((Window)var1).dispose();
         }
      }

   }

   public void Method4(boolean var1) {
      byte var2;
      if(var1) {
         var2 = 3;
         this.Field1 = false;
         this.a((aq)this.Field0);
      } else {
         var2 = 0;
         this.Field1 = true;
      }

      this.setCursor(Cursor.getPredefinedCursor(var2));
      if(this.getParent() != null) {
         this.getParent().setCursor(Cursor.getPredefinedCursor(var2));
      }

   }

   public final void a(k var1) {
      if(this.Field0 != null) {
         this.b.clear();
         this.Field0.Method2();
      }

      this.Field0 = var1;
      this.Field12 = this.Field10 = this.Field0;
   }

   public final Dimension getPreferredSize() {
      return new Dimension(this.Field0._width.y, this.Field0._height.y);
   }

   public final boolean imageUpdate(Image var1, int var2, int var3, int var4, int var5, int var6) {
      return (var2 & 160) == 0;
   }

   public synchronized void Method5() {
      try {
         boolean var1 = false;
         Object var2 = this.getParent();
         Container var3;
         if(var2 == null) {
            var1 = true;
         } else {
            if(this.Field0._mode.b8 == 27) {
               if(var2 instanceof t) {
                  var1 = true;
               } else if(var2 == this.a.Field89.Field54) {
                  var1 = true;
               }
            } else if(this.Field0._mode.b8 == 26) {
               if(!(var2 instanceof t)) {
                  var1 = true;
               }
            } else if(this.a.Field89.Field54 != null && this.a.Field89.Field54 != var2) {
               var1 = true;
            }

            if(!var1 && var2 instanceof Window) {
               var3 = ((Component)var2).getParent();
               if(var3 == null) {
                  if(this.Field0._modal.u != null) {
                     var1 = true;
                  }
               } else if(var3 instanceof d) {
                  if(this.Field0._modal.u == null) {
                     this.a.Method65(var3.getName(), false);
                     var1 = true;
                  } else if(!this.Field0._modal.u.equals(var3.getName())) {
                     this.a.Method65(var3.getName(), false);
                     var1 = true;
                  }
               }
            }
         }

         if(var1) {
            this.Field3 = this.Field4 = this.Field5 = this.c = 0;
            this.Field6 = "";
            if(var2 != null) {
               ((Container)var2).remove(this);
               if(var2 == this.a.Field89.Field54) {
                  ((Component)var2).repaint(40L);
               } else {
                  ((Window)var2).dispose();
               }
            }

            if(this.Field0._mode.b8 == 25 && this.a.Field89.Field54 != null) {
               var2 = this.a.Field89.Field54;
               ((Container)var2).removeAll();
               ((Container)var2).add(this, "Center");
               var3 = ((Component)var2).getParent();
               if(!(var3 instanceof Frame)) {
                  var3 = var3.getParent();
               }

               if(var3 != null) {
                  var3.setName(this.Field0._id.u);
               }

               ((Container)var2).validate();
            } else {
               Frame var9;
               if(this.Field0._modal.u == null) {
                  if(this.Field0._mode.b8 == 26) {
                     var9 = new Frame();
                     var9.setName((String)null);
                     var2 = new t(var9, this);
                  } else {
                     var2 = new d(this);
                  }
               } else {
                  var9 = null;
                  ac var4 = this.a.Method59(this.Field0._modal.u);
                  if(var4 != null) {
                     Container var5 = var4.getParent();
                     if(var5 instanceof Main) {
                        var5 = var5.getParent();
                        if(!(var5 instanceof Frame)) {
                           var5 = var5.getParent();
                        }
                     }

                     if(var5 != null && var5 instanceof Frame) {
                        var9 = (Frame)var5;
                        this.a.Method65(this.Field0._modal.u, true);
                     }
                  }

                  if(var9 == null) {
                     this.a.Method62("Missing parent window: " + this.Field0._modal.u);
                     var9 = new Frame();
                  }

                  if(this.Field0._mode.b8 == 26) {
                     var2 = new t(var9, this);
                  } else {
                     var2 = new au(var9, this);
                  }
               }
            }
         }

         ((Component)var2).setName(this.Field0._id.u);
         if(var2 == this.a.Field89.Field54) {
            this.setVisible(this.Field0._visible.D);
         } else {
            Window var12 = (Window)var2;
            String var10 = this.Field0._title.u;
            if(this.a.b) {
               var10 = var10 + " [DEBUG MODE]";
            }

            if(var12 instanceof Frame) {
               Frame var11 = (Frame)var12;
               if(!var11.getTitle().equals(var10)) {
                  var11.setTitle(var10);
               }

               if(var11.isResizable() != this.Field0._resizable.D) {
                  var11.setResizable(this.Field0._resizable.D);
               }

               String var6 = "" + this.Field0._icon.k;
               if(!var6.equals(this.Field6) && !var6.equals("null")) {
                  Image var7 = this.Field0.a(this.Field0._icon.k, false, 0).Field101;
                  if(var7 != null) {
                     var11.setIconImage(var7.getScaledInstance(16, 16, 2));
                  }

                  this.Field6 = var6;
               }
            } else if(var12 instanceof Dialog) {
               Dialog var13 = (Dialog)var12;
               if(!var13.getTitle().equals(var10)) {
                  var13.setTitle(var10);
               }

               if(var13.isResizable() != this.Field0._resizable.D) {
                  var13.setResizable(this.Field0._resizable.D);
               }
            }

            if(this.Field3 != this.Field0._x.y || this.Field4 != this.Field0._y.y || this.Field5 != this.Field0._width.y || this.c != this.Field0._height.y) {
               this.Field3 = this.Field0._x.y;
               this.Field4 = this.Field0._y.y;
               this.Field5 = this.Field0._width.y;
               this.c = this.Field0._height.y;
               Dimension var14 = aq.N.getScreenSize();
               if(this.Field0._x.y == -1) {
                  this.Field0.af = (var14.width - this.Field0._width.y - 8) / 2;
               } else {
                  this.Field0.af = this.Field0._x.y;
               }

               if(this.Field0._y.y == -1) {
                  this.Field0.ae = (var14.height - this.Field0._height.y - 70) / 2;
               } else {
                  this.Field0.ae = this.Field0._y.y;
               }

               var12.setEnabled(false);
               var12.setLocation(this.Field0.af, this.Field0.ae);
               var12.pack();
            }

            if(this.Field0._visible.D != var12.isVisible()) {
               var12.setVisible(this.Field0._visible.D);
            }

            var12.setEnabled(true);
         }

         if(var2 != null) {
            ((Component)var2).setBackground(this.Field0._background.s);
         }
      } catch (Exception var8) {
         this.a.a((String)"RootPanel error!", (Throwable)var8);
      }

   }

   public final void a(Graphics var1) {
      Insets var2 = this.getParent().getInsets();
      var1.translate(var2.left, var2.top);
      this.paint(var1);
   }

   public synchronized void paint(Graphics var1) {
      if(this.Field0.Y != null) {
         var1.drawImage(this.Field0.Y.Field101, 0, 0, this);
         this.Field7 = true;
      }

   }

   public void Method6() {
      Point var1 = Method8(this.Field2);
      this.repaint(50L, var1.x, var1.y, this.Field2.O + 1, this.Field2.J + 1);
   }

   public final void Method7() {
      Dimension var1 = this.getSize();
      if(this.Field1 && (this.Field0.O != var1.width || this.Field0.J != var1.height)) {
         this.doLayout();
         this.a.Method4(true);
      }

   }

   public void doLayout() {
      Dimension var1 = this.getSize();
      if(var1.height > 0) {
         this.a((aq)this.Field0);
         this.Field8.removeAllElements();
         this.Field0.O = var1.width;
         this.Field0.J = var1.height;
         this.Field0.Method35();
         this.Field0.a(true, true);
      }

   }

   public static final Point Method8(aq var0) {
      if(var0 != null && ((aq)var0).aa != null) {
         Point var1;
         for(var1 = new Point(((aq)var0).af, ((aq)var0).ae); ((aq)var0).aa != null && ((aq)var0).aa.aa != null; var1.y += ((aq)var0).ae - ((aq)var0).H) {
            var0 = ((aq)var0).aa;
            var1.x += ((aq)var0).af - ((aq)var0).I;
         }

         return var1;
      } else {
         return new Point();
      }
   }

   final boolean Method9(aq var1) {
      return this.Field8.contains(var1);
   }

   protected final boolean a() {
      return !this.Field8.isEmpty();
   }

   protected final void Method10(aq var1) {
      if(!this.Field8.contains(var1)) {
         this.Field0.a(var1);
         this.Field8.addElement(var1);
         if(var1.af < 0) {
            var1.af = 0;
         }

         if(var1.ae < 0) {
            var1.ae = 0;
         }

         if(var1.af + var1.O > this.Field0.O) {
            var1.af = this.Field0.O - var1.O;
         }

         if(var1.ae + var1.J > this.Field0.J) {
            var1.ae = this.Field0.J - var1.J;
         }

         var1.Method37();
      }

   }

   final void a(aq var1, aq var2) {
      if(this.Field8.removeElement(var2)) {
         this.Field0.aA.removeElement(var2);
         this.Field9 = var1;
         var2.Method2();
         this.Field0.a(false, false);
         this.Field2 = var2;
         this.Method6();
      }

   }

   protected final void a(aq var1) {
      aq.ag.a(var1.T, false);
      if(var1.U && !this.Field8.isEmpty()) {
         while(!this.Field8.isEmpty()) {
            this.a(var1, (aq)this.Field8.elementAt(0));
         }
      }

   }

   public final void transferFocus() {
      if(this.Field1) {
         this.Field10.a(new ag(this.Field10, 401, 9, false, 0));
      }

   }

   public final void transferFocusBackward() {
      if(this.Field10 != null && this.Field10.M && this.Field1 && (double)Main.a > 1.3D) {
         this.Field10.a(new ag(this.Field10, 401, 9, false, 1));
      }

   }

   public final void requestFocus() {
      this.transferFocusBackward();
   }

   public final boolean isFocusTraversable() {
      return true;
   }

   final boolean Method11(aq var1) {
      if(var1 == this.Field10 || !var1._visible.D || !var1._enabled.D || !var1._focusable.D && !(var1 instanceof TEXTFIELD)) {
         return false;
      } else {
         if(this.Field10.T != null) {
            this.Field10.a(new ag(this.Field10, 1005));
         } else {
            this.Field10.M = false;
         }

         this.Field10 = var1;
         this.Field0._focus_owner.Method32(var1._id.u);
         if(this.Field10.T != null) {
            this.Field10.a(new ag(this.Field10, 1004));
         } else {
            this.Field10.M = true;
         }

         return true;
      }
   }

   final boolean a(String var1) {
      aq var2 = this.a((af)this.Field0, (String)var1);
      return var2 == null?false:this.Method11(var2);
   }

   private final aq a(af var1, String var2) {
      aq var3 = null;

      for(int var4 = 0; var4 < var1.aA.size(); ++var4) {
         aq var5 = (aq)var1.aA.elementAt(var4);
         if(var5._id.u.equals(var2)) {
            var3 = a(var5, false);
            break;
         }

         if(var5 instanceof af) {
            var3 = this.a((af)var5, var2);
            if(var3 != null) {
               break;
            }
         }
      }

      return var3;
   }

   public void a(boolean var1) {
      Object var2 = this.Field10 == this.Field0?this.Field0:this.Field10.aa;
      int var3 = this.Field10 == this.Field0?(var1?Integer.MAX_VALUE:-1):Method12(this.Field10);

      aq var4;
      for(var4 = a((af)var2, var3, var1); var4 == null && ((aq)var2).aa != null; var4 = a((af)var2, var3, var1)) {
         var3 = Method12((aq)var2);
         var2 = ((aq)var2).aa;
      }

      if(var4 == null) {
         var4 = a(this.Field0, var1?Integer.MAX_VALUE:-1, var1);
      }

      if(var4 != null) {
         this.Method11(var4);
      }

   }

   private static final aq a(af var0, int var1, boolean var2) {
      aq var3 = null;
      int var4 = var2?-1:Integer.MAX_VALUE;

      for(int var5 = 0; var5 < var0.aA.size(); ++var5) {
         aq var6 = (aq)var0.aA.elementAt(var5);
         if(var6._visible.D) {
            int var7 = Method12(var6);
            if(var2 && var7 < var1 && var7 > var4 || !var2 && var7 > var1 && var7 < var4) {
               aq var8 = a(var6, var2);
               if(var8 != null) {
                  var4 = var7;
                  var3 = var8;
               }
            }
         }
      }

      return var3;
   }

   private static final aq a(aq var0, boolean var1) {
      aq var2 = null;
      if(var0._focusable.D && var0._enabled.D) {
         return var0 instanceof af?var0.X:var0;
      } else {
         if(var0 instanceof af) {
            var2 = a((af)var0, var1?Integer.MAX_VALUE:-1, var1);
         }

         return var2;
      }
   }

   private static final int Method12(aq var0) {
      return var0._index.y == -1?(var0.aa == null?-1:var0._x.y + var0._y.y * var0.aa._width.y):var0._index.y;
   }

   public final void processEvent(AWTEvent var1) {
      try {
         int var2 = var1.getID();
         if(var2 == 205) {
            if(this.Field0 != null && this.Field1) {
               this.Field0.Method4(true);
               this.Field0.a(true, true);
            }

            synchronized(this) {
               if(this.Field7) {
                  super.requestFocus();
                  this.Field7 = false;
               }

               return;
            }
         }

         if(this.Field1) {
            if(var2 == 206) {
               if(this.Field0 != null) {
                  this.Field0.Method34(false);
                  this.a.Method4(true);
               }

               return;
            }

            if(var2 == 201) {
               if(this.Field0._action.u == null) {
                  aq.N.beep();
               } else {
                  this.Field0.Method30((String)null);
               }

               return;
            }
         }

         int var4;
         if(var1 instanceof MouseEvent) {
            MouseEvent var17 = (MouseEvent)var1;
            if(var2 == 501 && var17.isControlDown() && var17.isMetaDown()) {
               this.a.Method5();
            } else if(this.Field1) {
               var4 = 0;
               if(var2 == 507) {
                  try {
                     Method var18 = var1.getClass().getMethod("getWheelRotation", new Class[0]);
                     var4 = ((Integer)var18.invoke(var1, new Object[0])).intValue();
                  } catch (Exception var13) {
                     ;
                  }
               } else {
                  this.e = var17.getX();
                  this.d = var17.getY();
               }

               ag var19 = new ag((Object)null, var17.getID(), var17.getX(), var17.getY(), var17.getModifiers(), var17.getClickCount(), var4);
               if(var19.a == 506) {
                  this.f = Method8(this.Field12);
                  var19.Field82 -= this.f.x;
                  var19.Field83 -= this.f.y;
                  var19.Field78 = this.Field12;
                  this.Field12.a(var19);
               } else {
                  if(var2 == 501 && this.getParent() == this.a.Field89.Field54) {
                     super.requestFocus();
                  }

                  this.a((af)this.Field0, (ag)var19);
               }
            }

            var17.consume();
            return;
         }

         if(var1 instanceof KeyEvent) {
            KeyEvent var3 = (KeyEvent)var1;
            if(this.Field1) {
               var4 = var3.getKeyCode();
               if(var4 != 16 && var4 != 17 && var4 != 18) {
                  boolean var5 = var3.isActionKey();
                  if(!var5 && var4 != 127) {
                     var4 = var3.getKeyChar();
                  }

                  if(var4 == 127 && var2 == 400) {
                     return;
                  }

                  if(!this.b.isEmpty() && var2 == 401 && (var5 || var3.isAltDown() || var4 == 27 || var4 == 10 && !(this.Field10 instanceof BUTTON) && !(this.Field10 instanceof x))) {
                     String var6 = String.valueOf((char)var4);
                     if(var5 || var4 == 27 || var4 == 10) {
                        try {
                           Field[] var7 = KeyEvent.class.getFields();

                           for(int var8 = 0; var8 < var7.length; ++var8) {
                              Field var9 = var7[var8];
                              String var10 = var9.getName();
                              if(var10.startsWith("VK_") && var9.getInt(KeyEvent.class) == var4) {
                                 var6 = '#' + var10.substring(3);
                                 break;
                              }
                           }
                        } catch (Exception var15) {
                           ;
                        }
                     }

                     aq var20 = (aq)this.b.get(var6);
                     if(var20 != null && (var20.Y != null || var20 instanceof PAGE && var20._enabled.D)) {
                        var3.consume();
                        var20.Method33();
                        return;
                     }
                  }

                  this.Field10.a(new ag(this.Field10, var2, var4, var5, var3.getModifiers()));
               }
            }

            var3.consume();
            return;
         }

         if(var1 instanceof FocusEvent) {
            this.Field11 = var2 == 1004;
            if(this.Field1) {
               this.Field10.a(new ag(this.Field10, var2));
            }
         }
      } catch (Exception var16) {
         this.a.a((String)"Event-processing error!", (Throwable)var16);
      }

   }

   protected final void a(af var1, ag var2) {
      for(int var3 = var1.aA.size() - 1; var3 != -1; --var3) {
         aq var4 = (aq)var1.aA.elementAt(var3);
         if(var4._visible.D && var2.Field82 > var4.af - var1.I && var2.Field83 > var4.ae - var1.H && var2.Field82 < var4.af + var4.O - var1.I && var2.Field83 < var4.ae + var4.J - var1.H) {
            var2.Field82 = var2.Field82 - var4.af + var1.I;
            var2.Field83 = var2.Field83 - var4.ae + var1.H;
            if(!(var4 instanceof af) || var2.Field85 != 0 && var4 instanceof m) {
               this.a(var4, var2);
            } else {
               this.a((af)var4, var2);
            }

            return;
         }
      }

      this.a((aq)var1, (ag)var2);
   }

   private final void a(aq var1, ag var2) {
      if((var2.a == 503 || var2.a == 502 || var2.a == 501 || var2.a == 505) && var1 != this.Field12) {
         ag var3 = new ag(this.Field12, 505, 0, 0, 0, 0, 0);
         ag var4 = new ag(var1, 504, var2.Field82, var2.Field83, 0, 0, 0);
         if(this.Field12 != null) {
            this.Field12.a(var3);
         }

         var1.a(var4);
      }

      var2.Field78 = var1;
      if(this.Field12 != var1) {
         this.Field12 = var1;
         this.f = Method8(var1);
      }

      var1.a(var2);
   }

   public Image createImage(int var1, int var2) {
      return Field13 == null?super.createImage(var1, var2):Field13.a(this, var1, var2);
   }
}
