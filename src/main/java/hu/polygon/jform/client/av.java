package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;
import java.lang.reflect.Field;

public final class av extends o {
   public static final byte left = 0;
   public static final byte center = 1;
   public static final byte right = 2;
   public static final byte justify = 3;
   public static final byte top = 4;
   public static final byte middle = 5;
   public static final byte bottom = 6;
   public static final byte empty = 7;
   public static final byte etched = 8;
   public static final byte raised = 9;
   public static final byte lowered = 10;
   public static final byte underlined = 11;
   public static final byte doted = 12;
   public static final byte separated = 13;
   public static final byte lined = 14;
   public static final byte rounded = 15;
   public static final byte titled = 16;
   public static final byte none = 17;
   public static final byte move = 18;
   public static final byte stretch = 19;
   public static final byte unfiltered = 20;
   public static final byte upper = 21;
   public static final byte lower = 22;
   public static final byte post = 23;
   public static final byte get = 24;
   public static final byte embed = 25;
   public static final byte rimless = 26;
   public static final byte rimmed = 27;
   public static final byte xml = 28;
   public static final byte form = 29;
   public static final byte stretched = 30;
   public static final byte embossed = 31;
   public static final byte tiled = 32;
   public byte b8;

   public av(o var1, Session var2, byte var3) {
      super(var1, var2);
      this.b8 = var3;
   }

   public final void Method31(String var1) {
      try {
         Field var2 = this.getClass().getField(var1);
         this.b8 = var2.getByte(this);
      } catch (Exception var3) {
         if(super.Field123 != null) {
            super.Field123.Method62("Invalid constant:" + var1);
         }
      }

   }
}
