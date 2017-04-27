package hu.polygon.jform.client;

import hu.polygon.jform.client.f;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public final class ao extends f {
   public final Hashtable cd = new Hashtable();
   public final Vector cf = new Vector();
   public String ce = "instance";
   public String ch;
   public ao cg;

   public final String Method44(String var1, String var2) {
      ao var3 = this.Method46(var1, false);
      return var3 == null?var2:var3.ch;
   }

   public final void Method45(String var1, String var2) {
      this.Method46(var1, true).ch = var2;
   }

   public final ao Method46(String var1, boolean var2) {
      if(var1 != null && var1.length() != 0) {
         String var3 = null;
         ao var4 = null;
         ao var5 = this;
         if(var1.charAt(0) == 47) {
            for(var1 = var1.substring(1); var5.cg != null; var5 = var5.cg) {
               ;
            }
         }

         int var6 = var1.indexOf(47);
         String var7;
         if(var6 != -1) {
            var7 = var1.substring(0, var6);
            var3 = var1.substring(var6 + 1);
         } else {
            var7 = var1;
         }

         var6 = var7.indexOf(91);
         int var8;
         int var9;
         if(var6 != -1) {
            var8 = var7.indexOf(93, var6);
            if(var8 == -1) {
               return null;
            }

            var9 = Integer.parseInt(var7.substring(var6 + 1, var8));
            var7 = var7.substring(0, var6);
         } else {
            var9 = 0;
         }

         var8 = 0;

         for(var6 = 0; var6 < var5.cf.size(); ++var6) {
            var4 = (ao)var5.cf.elementAt(var6);
            if(var4.ce.equals(var7)) {
               if(var9 == var8) {
                  break;
               }

               ++var8;
            }
         }

         if(var6 == var5.cf.size()) {
            if(!var2) {
               return null;
            }

            var4 = new ao();
            var4.ce = var7;
            var4.cg = var5;
            var5.cf.addElement(var4);
         }

         return var3 != null?var4.Method46(var3, var2):var4;
      } else {
         return this;
      }
   }

   public final String Method47(String var1) {
      StringBuffer var2 = new StringBuffer("<?xml version=\"1.0\" encoding=\"");
      var2.append(var1);
      var2.append("\" ?>\n");
      a(var2, this);
      return var2.toString();
   }

   private static final void a(StringBuffer var0, ao var1) {
      var0.append('<');
      var0.append(var1.ce);
      if(!var1.cd.isEmpty()) {
         Enumeration var2 = var1.cd.keys();

         while(var2.hasMoreElements()) {
            String var3 = (String)var2.nextElement();
            var0.append(' ');
            var0.append(var3);
            var0.append('=');
            var0.append('\"');
            var0.append(Method48((String)var1.cd.get(var3)));
            var0.append('\"');
         }
      }

      if(var1.ch != null) {
         var0.append('>');
         var0.append(Method48(var1.ch));
         var0.append('<');
         var0.append('/');
         var0.append(var1.ce);
      } else if(var1.cf.isEmpty()) {
         var0.append('/');
      } else {
         var0.append('>');
         var0.append('\n');
         int var4 = var1.cf.size();

         for(int var5 = 0; var5 < var4; ++var5) {
            a(var0, (ao)var1.cf.elementAt(var5));
         }

         var0.append('<');
         var0.append('/');
         var0.append(var1.ce);
      }

      var0.append('>');
      var0.append('\n');
   }

   static final String Method48(String var0) {
      var0 = a('&', "&amp;", var0);
      var0 = a('<', "&lt;", var0);
      var0 = a('>', "&gt;", var0);
      var0 = a('\'', "&apos;", var0);
      var0 = a('\"', "&quot;", var0);
      return var0;
   }

   private static final String a(char var0, String var1, String var2) {
      for(int var3 = var2.indexOf(var0); var3 != -1; var3 = var2.indexOf(var0, var3 + 1)) {
         var2 = var2.substring(0, var3) + var1 + var2.substring(var3 + 1, var2.length());
      }

      return var2;
   }

   public final void a(String var1, String var2) {
      this.cd.put(var1, var2);
   }

   public final f a(String var1) {
      ao var2 = new ao();
      var2.cg = this;
      var2.ce = var1;
      this.cf.addElement(var2);
      return var2;
   }

   public final void Method31(String var1) {
      this.ch = var1;
   }

   public final void a() {
   }

   public final String toString() {
      return this.Method47("UTF-8");
   }

   public final boolean equals(Object var1) {
      return this.toString().equals(var1.toString());
   }

   public final int hashCode() {
      return (int)this.P();
   }

   final long P() {
      char[] var1 = this.toString().toCharArray();
      long var2 = 0L;

      for(int var4 = 0; var4 < var1.length; ++var4) {
         var2 = 31L * var2 + (long)var1[var4];
      }

      return var2;
   }
}
