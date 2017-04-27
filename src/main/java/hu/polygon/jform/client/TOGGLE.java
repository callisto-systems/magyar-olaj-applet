package hu.polygon.jform.client;

import hu.polygon.jform.client.BUTTON;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.g;

public class TOGGLE extends BUTTON {
   public TOGGLE(Session var1) {
      super(var1);
      super.ad = "#TOGGLE";
      super._selected_background.s = g.q;
      super.bH = true;
   }

   public final void Method13() {
      if(!this.w()) {
         super._state.Method32(super._false.u);
      }

      super.Method13();
   }
}
