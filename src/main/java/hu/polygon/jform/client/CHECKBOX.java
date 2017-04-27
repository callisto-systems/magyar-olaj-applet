package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TOGGLE;
import hu.polygon.jform.client.c;

public final class CHECKBOX extends TOGGLE {
   public CHECKBOX(Session var1) {
      super(var1);
      super.ad = "#CHECKBOX";
      super._border_tickness.y = 0;
      super._transparent.D = true;
      super._icon_left.D = true;
      super._icon_side.D = true;
      super._icon.k = c.e;
      super._selected_icon.k = c.f;
      super._border.b8 = 7;
      super._selected_border.b8 = 7;
      super._alignment.b8 = 0;
   }
}
