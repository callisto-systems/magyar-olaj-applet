package hu.polygon.jform.client;

import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.o;
import java.net.URL;

public final class c extends o {
   public static URL d;
   public static URL i;
   public static URL m;
   public static URL l;
   public static URL n;
   public static URL h;
   public static URL Field106;
   public static URL b;
   public static URL f;
   public static URL e;
   public static URL g;
   public static URL c;
   public static URL Field107;
   public static URL o;
   public static URL j;
   public URL k;

   static {
      try {
         d = new URL("http://#EMPTY");
         i = new URL("http://#ICON");
         m = new URL("http://#ARROW-LEFT");
         l = new URL("http://#ARROW-RIGHT");
         n = new URL("http://#ARROW-UP");
         h = new URL("http://#ARROW-DOWN");
         Field106 = new URL("http://#SLIDE-HORIZONTAL");
         b = new URL("http://#SLIDE-VERTICAL");
         f = new URL("http://#CHECKBOX-TRUE");
         e = new URL("http://#CHECKBOX-FALSE");
         g = new URL("http://#RADIOBOX-TRUE");
         c = new URL("http://#RADIOBOX-FALSE");
         Field107 = new URL("http://#FOLDER-CLOSED");
         o = new URL("http://#FOLDER-OPENED");
         j = new URL("http://#FOLDER-LEAF");
      } catch (Exception var1) {
         ;
      }

   }

   public c(o var1, Session var2, URL var3) {
      super(var1, var2);
      this.k = var3;
   }

   public final void Method31(String var1) {
      try {
         if(var1.equals("#EMPTY")) {
            this.k = d;
         } else {
            this.k = super.Field123.a(var1);
         }
      } catch (Exception var3) {
         super.Field123.Method62("Invalid URL syntax: " + var1);
      }

   }
}
