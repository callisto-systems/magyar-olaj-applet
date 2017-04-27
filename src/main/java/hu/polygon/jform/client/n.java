package hu.polygon.jform.client;

import hu.polygon.jform.client.IMAGE;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.a;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import java.awt.Graphics;

public final class n extends aq {
   IMAGE ay;
   a ax;
   int av;
   int aw;
   private boolean az;

   public n(Session var1) {
      super(var1);
   }

   public void a(Graphics var1) {
      int var2;
      if(this.ax.Field101 != null) {
         var2 = super._border_tickness.y + this.ay._spacing.y;
         var1.drawImage(this.ax.Field101, var2 - super.I, var2 - super.H, this.av, this.aw, super.T);
      }

      if(this.ay._show_crosshair.D) {
         var1.setColor(this.ay._highlight.s);

         for(var2 = (this.ay._y_position.y - super.H) % 10 - 13; var2 < super.J; var2 += 10) {
            var1.drawLine(this.ay._x_position.y - super.I, var2, this.ay._x_position.y - super.I, var2 + 6);
         }

         for(var2 = (this.ay._x_position.y - super.I) % 10 - 13; var2 < super.O; var2 += 10) {
            var1.drawLine(var2, this.ay._y_position.y - super.H, var2 + 6, this.ay._y_position.y - super.H);
         }
      }

   }

   public final boolean a(ag var1) {
      if(var1.a != 501 && var1.a != 506) {
         if(var1.a == 502 && !var1.a() && this.az) {
            this.Method30((String)null);
         }
      } else {
         var1.Field82 += super.I;
         var1.Field83 += super.H;
         int var2 = super._border_tickness.y + this.ay._spacing.y;
         if(var1.Field82 < var2) {
            var1.Field82 = var2;
         }

         if(var1.Field83 < var2) {
            var1.Field83 = var2;
         }

         if(var1.Field82 > this.av + var2 - 1) {
            var1.Field82 = this.av + var2 - 1;
         }

         if(var1.Field83 > this.aw + var2 - 1) {
            var1.Field83 = this.aw + var2 - 1;
         }

         this.ay._x_position.Method32(Integer.toString(var1.Field82));
         this.ay._y_position.Method32(Integer.toString(var1.Field83));
         this.ay._x_position.y = var1.Field82;
         this.ay._y_position.y = var1.Field83;
         this.az = true;
         if(this.ay._show_crosshair.D) {
            this.Method37();
         }
      }

      return super.a(var1);
   }
}
