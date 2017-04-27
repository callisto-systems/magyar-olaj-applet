package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.LIST;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TEXTFIELD;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.at;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.p;
import hu.polygon.jform.client.q;
import java.util.Vector;

public final class COMBOBOX extends af implements at {
   public final TEXTFIELD _part_text;
   public final BUTTON _part_button;
   public final LIST _part_list;
   public final q _button_size;
   public final p _choices;
   public final p _selection;
   private int aY;

   public COMBOBOX(Session var1) {
      super(var1);
      this._part_button = new BUTTON(var1);
      this._part_text = new TEXTFIELD(var1);
      this._part_list = new LIST(var1);
      this._part_button.ad = "#COMBOBOX-BUTTON";
      this._part_list.ad = "#COMBOBOX-LIST";
      this._part_list._part_items.ad = "#COMBOBOX-LIST-ITEM";
      this._part_text._editable.D = false;
      this._part_text.ad = null;
      this._part_button._focusable.D = false;
      this._part_button._icon.k = c.h;
      this._part_list._part_content._border.b8 = 14;
      this.a((aq)this._part_button);
      this.a((aq)this._part_text);
      this._button_size = new q(this, var1, 16);
      super.ad = "#COMBOBOX";
      super._enabled = this._part_text._enabled;
      super._id = this._part_text._id;
      this._choices = this._part_list._choices;
      this._selection = this._part_list._selection;
      super._transparent.D = true;
      this._part_button.W = this;
      this._part_button.U = false;
      this._part_list.W = this;
      this._part_text.W = this;
      this._part_text.bP = this;
      super.W = this;
      super.R = false;
   }

   public final f a(String var1) {
      return this.a(var1, this._part_text);
   }

   public final void a(ac var1) {
      this._part_list._choices = this._choices;
      this._part_list._selection = this._selection;
      this._part_list.a(var1);
      super.a(var1);
   }

   public final void Method13() {
      this._part_text._text.Field117 = this._selection.Field117;
      boolean var1 = false;
      if(this._selection.v.isEmpty()) {
         var1 = true;
      } else {
         String var2 = (String)this._selection.v.elementAt(0);
         this.aY = this._choices.w.indexOf(var2);
         if(this.aY != -1) {
            this._part_text._text.u = (String)this._choices.v.elementAt(this.aY);
         } else if(this._part_text._editable.D) {
            this._part_text._text.u = var2;
         } else {
            var1 = true;
         }
      }

      if(var1 && !this._choices.v.isEmpty()) {
         this._part_text._text.u = (String)this._choices.v.elementAt(0);
         this.g();
      }

      super.Method13();
   }

   public final void Method0() {
      int var1 = super._enabled.D?this._button_size.y:0;
      this._part_text.a(0, 0, super.O - var1, super.J);
      this._part_button.a(super.O - var1, 0, var1, super.J);
      super.Method0();
   }

   public final boolean a(ag var1) {
      if(var1.a != 1001) {
         return super.a(var1);
      } else {
         if(var1.Field78 != this) {
            if(var1.Field78 == this._part_button) {
               boolean var7 = super.T.Method9(this._part_list);
               super.T.a((aq)this);
               if(!var7 && !this._part_list._content.ci.aA.isEmpty()) {
                  super.T.Method11(this._part_text);
                  this._part_list.aS.a(false);
                  this._part_list.a(this, false);
               }

               return true;
            }

            this._part_text._start.y = this._part_text._end.y = 0;
            String var2;
            if(var1.Field78 instanceof BUTTON) {
               var2 = ((BUTTON)var1.Field78)._text.u;
               if(this._part_text._text.u.equals(var2)) {
                  super.T.a((aq)this);
                  return false;
               }

               this._part_text._text.u = var2;
            } else {
               if(var1.Field86 == null) {
                  var2 = String.valueOf("" + (char)var1.Field80).toLowerCase();

                  for(int var3 = 0; var3 < this._choices.v.size(); ++var3) {
                     String var4 = ((String)this._choices.v.elementAt(var3)).toLowerCase();
                     if(var4.startsWith(var2)) {
                        this.aY = var3;
                        Vector var5 = ((af)this._part_list._part_content).aA;
                        BUTTON var6 = (BUTTON)var5.elementAt(var3);
                        var6.Method81(true);
                        this._part_list.Method84(var6);
                        break;
                     }
                  }

                  return true;
               }

               if(var1.Field86.equals("up")) {
                  --this.aY;
               }

               if(var1.Field86.equals("down")) {
                  ++this.aY;
               }

               if(this.aY < 0) {
                  this.aY = this._choices.v.size() - 1;
               } else if(this.aY > this._choices.v.size() - 1) {
                  this.aY = 0;
               }

               if(this.aY == -1) {
                  return true;
               }

               this._part_text._text.u = (String)this._choices.v.elementAt(this.aY);
            }

            super.T.a((aq)this);
            aq.ag.a(super.T, true);
         }

         this._part_text.Method79(true);
         this.g();
         this._part_text.Method30(new String());
         return true;
      }
   }

   public final void g() {
      int var1 = this._choices.v.indexOf(this._part_text._text.u);
      this._selection.Method32(var1 == -1?this._part_text._text.u:(String)this._choices.w.elementAt(var1));
   }

   public final boolean f() {
      return true;
   }

   public final void h() {
   }
}
