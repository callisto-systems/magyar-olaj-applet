package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TEXTFIELD;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.at;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.p;
import hu.polygon.jform.client.q;

public final class OPTIONBOX extends af implements at {
   public final TEXTFIELD _part_text;
   public final BUTTON _part_left;
   public final BUTTON _part_right;
   public final q _button_size;
   public final p _choices;
   public final p _selection;
   int aW;
   private int aX;
   private int aV;

   public OPTIONBOX(Session var1) {
      super(var1);
      this._part_left = new BUTTON(var1);
      this._part_right = new BUTTON(var1);
      this._part_text = new TEXTFIELD(var1);
      this._part_left.ad = "#OPTIONBOX-LEFT";
      this._part_right.ad = "#OPTIONBOX-RIGHT";
      this._part_text.ad = null;
      this._part_text._editable.D = false;
      this._part_left._focusable.D = false;
      this._part_left._icon.k = c.m;
      this._part_right._focusable.D = false;
      this._part_right._icon.k = c.l;
      this.a((aq)this._part_left);
      this.a((aq)this._part_right);
      this.a((aq)this._part_text);
      this._button_size = new q(this, var1, 16);
      this._choices = new p(this, var1);
      this._selection = new p(this, var1);
      super.ad = "#OPTIONBOX";
      super._enabled = this._part_text._enabled;
      super._id = this._part_text._id;
      super._transparent.D = true;
      this._part_left.W = this;
      this._part_left.U = false;
      this._part_left.bE = true;
      this._part_right.W = this;
      this._part_right.U = false;
      this._part_right.bE = true;
      this._part_text.W = this;
      this._part_text.bP = this;
      super.W = this;
      super.R = false;
   }

   public final f a(String var1) {
      return this.a(var1, this._part_text);
   }

   public final void Method5() {
      if(super.Field120) {
         this._choices.Method5();
         this._selection.Method5();
      }

      super.Method5();
   }

   public final void Method13() {
      this._part_text._text.Field117 = this._selection.Field117;
      if(!this._choices.v.isEmpty()) {
         if(!this._selection.v.isEmpty()) {
            String var1 = (String)this._selection.v.elementAt(0);
            this.aW = this._choices.w.indexOf(var1);
            if(this.aW != -1) {
               this._part_text._text.u = (String)this._choices.v.elementAt(this.aW);
            } else if(this._part_text._editable.D) {
               this._part_text._text.u = var1;
            } else {
               this._part_text._text.u = (String)this._choices.v.elementAt(this.aW = 0);
            }
         } else {
            this._part_text._text.u = (String)this._choices.v.elementAt(0);
         }
      }

      super.Method13();
   }

   public final void Method0() {
      int var1 = super._enabled.D && !this._choices.v.isEmpty()?this._button_size.y:0;
      this._part_text.a(0, 0, super.O - var1 * 2, super.J);
      this._part_left.a(super.O - var1 * 2, 0, var1, super.J);
      this._part_right.a(super.O - var1, 0, var1, super.J);
      super.Method0();
   }

   public final boolean a(ag var1) {
      if(var1.a == 1001) {
         if(var1.Field78 == this) {
            this._part_text.Method30(new String());
         } else if(var1.Field78 instanceof BUTTON) {
            if(super.W == null) {
               super.T.Method11(this._part_text);
            }

            if(this.aX == 0) {
               this.aX = var1.Field78 == this._part_left?1:2;
               this.aV = 0;
               this.run();
               Main.Field59.Method87(this);
            } else {
               this.aX = 0;
               Main.Field59.a(this);
               this.k();
            }
         } else if(var1.Field86 != null) {
            if(var1.Field86.equals("up")) {
               this.i();
            }

            if(var1.Field86.equals("down")) {
               this.j();
            }

            this.k();
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   private final void k() {
      this.Method30((String)null);
      this._part_text.Method30(new String());
   }

   private final void i() {
      --this.aW;
      if(this.aW < 0) {
         this.aW = this._choices.v.size() - 1;
      }

      this.l();
   }

   private final void j() {
      ++this.aW;
      if(this.aW > this._choices.v.size() - 1) {
         this.aW = 0;
      }

      this.l();
   }

   private final void l() {
      if(this.aW != -1) {
         this._part_text._text.u = (String)this._choices.v.elementAt(this.aW);
         this._part_text._start.y = 0;
         super.T.a((aq)this);
         this._part_text.Method79(false);
         this.g();
      }
   }

   public final void run() {
      ++this.aV;
      if(this.aV != 2 && this.aV != 3) {
         if(this.aX == 1) {
            this.i();
         } else {
            this.j();
         }

      }
   }

   public final void Method2() {
      Main.Field59.a(this);
      super.Method2();
   }

   public final void g() {
      int var1 = this._choices.v.indexOf(this._part_text._text.u);
      if(var1 == -1) {
         this._selection.Method32(this._part_text._text.u);
      } else {
         this._selection.Method32((String)this._choices.w.elementAt(var1));
      }

   }

   public final boolean f() {
      return true;
   }

   public final void h() {
   }
}
