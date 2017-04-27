package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.a;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.c;
import hu.polygon.jform.client.g;
import hu.polygon.jform.client.i;
import hu.polygon.jform.client.m;
import hu.polygon.jform.client.n;
import hu.polygon.jform.client.q;
import hu.polygon.jform.client.y;
import java.awt.MediaTracker;
import java.net.URL;

public final class IMAGE extends m {
   public final n _part_image;
   public final c _source;
   public final q _zoom;
   public final i _base64_data;
   public final y _stretched;
   public final q _x_position;
   public final q _y_position;
   public final y _show_crosshair;
   public final g _highlight;
   private static final byte[] aE = new byte[256];

   static {
      int var0;
      for(var0 = 0; var0 < 256; ++var0) {
         aE[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         aE[var0] = (byte)(var0 - 65);
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         aE[var0] = (byte)(26 + var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         aE[var0] = (byte)(52 + var0 - 48);
      }

      aE[43] = 62;
      aE[47] = 63;
   }

   public IMAGE(Session var1) {
      super(var1, new n(var1));
      this._part_image = (n)super._part_content;
      this._part_image.ay = this;
      this._source = new c(this, var1, (URL)null);
      this._zoom = new q(this, var1, 100);
      this._base64_data = new i(this, var1, (String)null);
      this._stretched = new y(this, var1, false);
      this._x_position = new q(this, var1, -1);
      this._y_position = new q(this, var1, -1);
      this._show_crosshair = new y(this, var1, false);
      this._highlight = new g(this, var1, g.p);
      super.ad = "#IMAGE";
      super._border.b8 = this._part_image._border.b8 = 7;
      super._border_tickness.y = this._part_image._border_tickness.y = 0;
      this._part_image._transparent.D = true;
      super._spacing.y = 0;
      this._part_image._border.b8 = 7;
   }

   public final void Method5() {
      super.Method5();
      this.Method35();
   }

   public final void c() {
      if(this._show_crosshair.D) {
         this._part_image.L = 1;
      } else if(this._part_image._action.u == null) {
         this._part_image.L = 0;
      } else {
         this._part_image.L = 12;
      }

      this._part_image.ax = new a();
      if(this._source.k != null) {
         this._part_image.ax = this.a(this._source.k, false, 0);
      } else if(this._base64_data.u != null) {
         char[] var1 = this._base64_data.u.toCharArray();
         int var2 = var1.length;

         int var3;
         for(var3 = 0; var3 < var1.length; ++var3) {
            if(var1[var3] > 255 || aE[var1[var3]] < 0) {
               --var2;
            }
         }

         var3 = var2 / 4 * 3;
         if(var2 % 4 == 3) {
            var3 += 2;
         }

         if(var2 % 4 == 2) {
            ++var3;
         }

         byte[] var4 = new byte[var3];
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;

         for(int var8 = 0; var8 < var1.length; ++var8) {
            byte var9 = var1[var8] > 255?-1:aE[var1[var8]];
            if(var9 >= 0) {
               var6 <<= 6;
               var5 += 6;
               var6 |= var9;
               if(var5 >= 8) {
                  var5 -= 8;
                  var4[var7++] = (byte)(var6 >> var5 & 255);
               }
            }
         }

         try {
            this._part_image.ax.Field101 = aq.N.createImage(var4);
            MediaTracker var12 = new MediaTracker(super.T);
            var12.addImage(this._part_image.ax.Field101, 0);
            var12.waitForAll();
            this._part_image.ax.Field103 = this._part_image.ax.Field101.getWidth(super.T);
            this._part_image.ax.a = this._part_image.ax.Field101.getHeight(super.T);
         } catch (Exception var10) {
            super.Field123.Method62(var10.toString());
         }
      }

      int var11 = (this._part_image._border_tickness.y + super._spacing.y) * 2;
      if(this._stretched.D) {
         this._part_image.av = super.O - var11;
         this._part_image.aw = super.J - var11;
      } else if(this._zoom.y != 100 && this._zoom.y > 0) {
         this._part_image.av = this._part_image.ax.Field103 * this._zoom.y / 100;
         this._part_image.aw = this._part_image.ax.a * this._zoom.y / 100;
      } else {
         this._part_image.av = this._part_image.ax.Field103;
         this._part_image.aw = this._part_image.ax.a;
      }

      super.aB = this._part_image.av + var11;
      super.aC = this._part_image.aw + var11;
   }
}
