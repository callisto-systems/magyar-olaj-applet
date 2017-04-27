package hu.polygon.jform.client;

import hu.polygon.jform.client.ac;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;

public final class au extends Dialog {
   private final ac a;

   public au(Frame var1, ac var2) {
      super(var1);
      this.enableEvents(64L);
      this.add(var2, "Center");
      this.a = var2;
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
