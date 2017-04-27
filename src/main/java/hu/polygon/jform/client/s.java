package hu.polygon.jform.client;

import hu.polygon.jform.client.aq;
import java.awt.Image;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;

final class s extends RGBImageFilter {
   s() {
      super.canFilterIndexColorModel = true;
   }

   static final Image a(Image var0) {
      return aq.N.createImage(new FilteredImageSource(var0.getSource(), new s()));
   }

   public final int filterRGB(int var1, int var2, int var3) {
      int var4 = (int)((0.7D * (double)(var3 >> 16 & 255) + 0.7D * (double)(var3 >> 8 & 255) + 0.7D * (double)(var3 & 255)) / 3.0D);
      var4 = 255 - (255 - var4) * 50 / 100;
      if(var4 < 0) {
         var4 = 0;
      }

      if(var4 > 255) {
         var4 = 255;
      }

      return var3 & -16777216 | var4 << 16 | var4 << 8 | var4 << 0;
   }
}
