package hu.polygon.jform.client;

import hu.polygon.jform.client.ac;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;

public final class d extends Frame {
   private final ac a;

   public d(ac var1) {
      this.enableEvents(64L);
      this.add(var1, "Center");
      this.a = var1;
   }

   protected final void processWindowEvent(WindowEvent var1) {
      this.a.processEvent(var1);
   }

   public final void doLayout() {
      super.doLayout();
      this.a.Method7();
   }

   public final void update(Graphics var1) {
      this.a.a(var1);
   }
}
