package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ab;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.x;

public final class TEXTAREA extends m {
   public TEXTAREA(Session var1) {
      super(var1, new x(var1));
      super._id = super._part_content._id;
      super.ad = "#TEXTAREA";
      super._part_horizontal._enabled.D = false;
      super.aD = false;
   }

   public final void Method5() {
      super.Method5();
      this.Method35();
   }

   public final void c() {
      if(super.P != super.O) {
         x var1 = (x)super._part_content;
         super.X = var1;
         var1.b2 = super.T.getFontMetrics(var1._font.C);
         var1.bY = var1._text.u;
         var1.b4 = var1.b2.getHeight();
         var1.b0 = var1.b2.getAscent();
         var1.bZ = new ab(var1.b2);
         var1.b1 = var1._alignment.b8 == 3;
         super.aB = super._part_content._width.y = super._part_vertical._visible.D?super.O - 16:super.O;
         super._part_content.ac = aq.a(super._part_content._border.b8, super._part_content._border_tickness.y, 0, 0, super._part_content._width.y, super._part_content._height.y);
         var1.bZ.a.removeAllElements();
         var1.b3 = 0;
         var1.M();
         super.aC = Math.max(super._height.y, (var1.bZ.a.size() + 2) * var1.b4 / 10 * 10);
      }
   }
}
