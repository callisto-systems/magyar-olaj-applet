package hu.polygon.jform.client;

import hu.polygon.jform.client.ac;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Window;

public final class t extends Window {
   private final ac Field126;
   private Frame a;

   public t(Frame var1, ac var2) {
      super(var1);
      this.add(var2, "Center");
      this.Field126 = var2;
      this.a = var1.getName() == null?var1:null;
   }

   public final void doLayout() {
      super.doLayout();
      this.Field126.Method7();
      if(this.a != null) {
         this.a.setBounds(this.getBounds());
      }

   }

   public final void dispose() {
      if(this.a != null) {
         Frame var1 = this.a;
         this.a = null;
         var1.dispose();
      }

      super.dispose();
   }

   public final void setVisible(boolean var1) {
      if(this.a != null) {
         this.a.setVisible(var1);
      }

      super.setVisible(var1);
   }

   public final void update(Graphics var1) {
      this.Field126.a(var1);
   }
}
