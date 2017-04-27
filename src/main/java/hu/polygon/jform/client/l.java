package hu.polygon.jform.client;

import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.STYLE;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.ac;
import hu.polygon.jform.client.f;
import hu.polygon.jform.client.j;
import hu.polygon.jform.client.k;
import hu.polygon.jform.client.r;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public final class l extends f {
   private Session Field113;
   private boolean Field114;
   private boolean a;
   private boolean Field115;

   public l(Session var1) {
      this.Field113 = var1;
   }

   public final f a(String var1) {
      if(var1.equalsIgnoreCase("MODEL")) {
         return new r(this.Field113);
      } else if(var1.equals("SESSIONID")) {
         return this.Field113.Field92;
      } else if(var1.equals("SIGNATURE")) {
         return this.Field113.Field93;
      } else if(var1.equals("TIMEOUT")) {
         return this.Field113.Field95;
      } else if(var1.equals("TRANSFORM") && this.Field113.Field94.u == null) {
         return this.Field113.Field94;
      } else if(var1.equals("STYLE")) {
         return new STYLE(this.Field113);
      } else if(var1.equals("WINDOW")) {
         return new k(this.Field113);
      } else if(var1.equals("SESSION")) {
         return new j(this.Field113);
      } else if(var1.equals("CLOSE")) {
         this.Field114 = true;
         return this;
      } else if(var1.equals("REFRESH")) {
         this.Field115 = true;
         return this;
      } else if(var1.equals("DOWNLOAD")) {
         this.a = true;
         return this;
      } else {
         if(var1.equals("QUIT")) {
            this.Field113.a(false);
         } else {
            this.Field113.Method62("Unknown command: " + var1);
         }

         return new f();
      }
   }

   public final void Method31(String var1) {
      if(this.Field115) {
         this.Field113.Field89.Method31(var1);
      } else if(this.Field114) {
         if(var1.equals("#ALL")) {
            this.Field113.a();
         } else {
            ac var16 = this.Field113.Method59(var1);
            if(var16 == null) {
               this.Field113.Method62("Unable to close window: " + var1);
            } else {
               if(var16.Field0._modal.u != null) {
                  this.Field113.Method65(var16.Field0._modal.u, false);
               }

               this.Field113.Method32(var1);
            }
         }

         this.Field114 = false;
      } else {
         if(this.a) {
            this.a = false;

            try {
               SecurityManager var15 = System.getSecurityManager();
               if(var15 != null) {
                  var15.checkWrite("test");
               }

               URL var3 = this.Field113.a(var1);
               URLConnection var4 = var3.openConnection();
			   Session.out(new byte[0], false, false, "GET:" + var3.toString());
			   Session.in("excel file".getBytes(), false, false, var3.toString());
               var4.setUseCaches(false);
               var4.setDoInput(true);
               var4.setDoOutput(false);
               byte[] var5 = Session.a(var4.getInputStream());
               int var6 = var1.lastIndexOf(47);
               if(var6 > -1) {
                  var1 = var1.substring(var6 + 1);
               }

               var6 = var1.lastIndexOf(46);
               String var7 = null;
               if(var6 > -1) {
                  var7 = var1.substring(var6);
               }

               FileDialog var8 = new FileDialog(new Frame(), var1, 1);
               var8.setFile(var1);
               var8.validate();
               var8.setVisible(true);
               String var9 = var8.getDirectory();
               var1 = var8.getFile();
               var8.dispose();
               var6 = var1.replace('\\', '/').lastIndexOf(47);
               if(var6 > -1) {
                  var1 = var1.substring(var6 + 1);
               }

               if(var1 != null && var9 != null) {
                  File var10 = new File(var9, var1);
                  var9 = var10.getParent();
                  if(var9 != null) {
                     File var11 = new File(var9);
                     if(var11.isDirectory()) {
                        var1 = var10.getAbsolutePath();
                     } else {
                        var1 = var11.getAbsolutePath();
                     }

                     if(var1.indexOf(46) == -1) {
                        var1 = var1 + var7;
                     }

                     var10 = new File(var1);
                  }

                  try {
                     (new File(var10.getParent())).mkdirs();
                  } catch (Exception var13) {
                     ;
                  }

                  FileOutputStream var17 = new FileOutputStream(var10);
                  var17.write(var5);
                  var17.close();
               }

               return;
            } catch (Throwable var14) {
               this.Field113.Method31("Direct download disabled: " + var14);

               try {
                  URL var2 = this.Field113.a(var1);
                  if(Main.Field48) {
                     Runtime.getRuntime().exec(Main.Field50 + ' ' + var2);
                  } else {
                     Main.Field49.showDocument(var2, "download");
                  }
               } catch (Throwable var12) {
                  this.Field113.a("Unable to open document: " + var1, var12);
               }
            }
         }

      }
   }
}
