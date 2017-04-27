package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.af;
import hu.polygon.jform.client.b;
import hu.polygon.jform.client.m;

public class SCROLLPANEL extends m {
   public SCROLLPANEL(Session var1) {
      super(var1, new af(var1));
      super._content = new b(var1, (af)super._part_content);
      super.ad = "#SCROLLPANEL";
   }
}
