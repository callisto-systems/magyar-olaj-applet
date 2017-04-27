package a.a.a;

public class b {
   static final int Field29 = 1;
   char[] a;
   int Field30;
   char[] Field31;
   int Field32;

   public b(char[] var1) {
      this(var1, var1.length);
   }

   public b(char[] var1, int var2) {
      this.a(var1, var2);
   }

   public char[] a() {
      if(this.Field30 != 0) {
         char[] var1 = new char[this.Field30];
         System.arraycopy(this.a, 0, var1, 0, this.Field30);
         return var1;
      } else {
         return null;
      }
   }

   public void a(char[] var1, int var2) {
      this.a = var1;
      this.Field30 = var2;
      this.Field32 = 0;
      this.Field31 = null;
      if(var1 != null && var2 != 0) {
         if(var2 >= 3 && var1[0] == 124) {
            char var3 = var1[2];
            if(var1[var3 + 0] == 69 && var2 >= 6 && var1[3] == 65) {
               char var4 = var1[4];
               this.Field31 = new char[var4];
               System.arraycopy(var1, 6, this.Field31, 0, var4);
            }
         }

         for(int var5 = 0; var5 < var2; var5 += 3) {
            switch(var1[var5 + 0]) {
            case '#':
               this.Field32 |= 1;
               return;
            case 'A':
               var5 += var1[var5 + 1];
               break;
            case '[':
               var5 += var1[var5 + 1] * 2;
            }
         }
      }

   }
}
