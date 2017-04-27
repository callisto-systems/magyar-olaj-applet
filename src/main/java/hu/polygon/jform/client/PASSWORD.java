package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TEXTFIELD;

public final class PASSWORD extends TEXTFIELD {
   public PASSWORD(Session var1) {
      super(var1);
      super.ad = "#PASSWORD";
      super._echo.u = "*";
   }
}
