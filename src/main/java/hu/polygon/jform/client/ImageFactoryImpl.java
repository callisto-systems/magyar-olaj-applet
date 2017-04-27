package hu.polygon.jform.client;

import hu.polygon.jform.client.ImageFactory;
import hu.polygon.jform.client.ac;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class ImageFactoryImpl implements ImageFactory {
   public final Image a(ac var1, int var2, int var3) {
      return new BufferedImage(var2, var3, 8);
   }
}
