package a.a.a;

import a.a.a.b;
import java.util.Hashtable;

public class a {
   char[] h = new char[128];
   int Field33 = 0;
   String g;
   int f;
   int Field34;
   int Field35;
   static final int Field36 = 0;
   static final int Field37 = 1;
   static final int Field38 = 2;
   static final char Field39 = '\ufff0';
   static final char Field40 = '\uffff';
   static final char Field41 = '\ufffe';
   static final char Field42 = '�';
   static final int d = 10;
   static int Field43 = 0;
   static int[] c = null;
   static int[] Field44 = null;
   static int[] b = null;
   static int[] a = null;
   static final int Field45 = -1;
   static final int Field46 = -2;
   static Hashtable e = new Hashtable();

   static {
      e.put("alnum", new Character('w'));
      e.put("alpha", new Character('a'));
      e.put("blank", new Character('b'));
      e.put("cntrl", new Character('c'));
      e.put("digit", new Character('d'));
      e.put("graph", new Character('g'));
      e.put("lower", new Character('l'));
      e.put("print", new Character('p'));
      e.put("punct", new Character('!'));
      e.put("space", new Character('s'));
      e.put("upper", new Character('u'));
      e.put("xdigit", new Character('x'));
      e.put("javastart", new Character('j'));
      e.put("javapart", new Character('k'));
   }

   void a(int var1) {
      int var2 = this.h.length;
      if(this.Field33 + var1 >= var2) {
         while(true) {
            if(this.Field33 + var1 < var2) {
               char[] var3 = new char[var2];
               System.arraycopy(this.h, 0, var3, 0, this.Field33);
               this.h = var3;
               break;
            }

            var2 *= 2;
         }
      }

   }

   void a(char var1) {
      this.a((int)1);
      this.h[this.Field33++] = var1;
   }

   void a(char var1, int var2, int var3) {
      this.a((int)3);
      System.arraycopy(this.h, var3, this.h, var3 + 3, this.Field33 - var3);
      this.h[var3 + 0] = var1;
      this.h[var3 + 1] = (char)var2;
      this.h[var3 + 2] = 0;
      this.Field33 += 3;
   }

   void a(int var1, int var2) {
      char var3;
      while((var3 = this.h[var1 + 2]) != 0) {
         var1 += var3;
      }

      this.h[var1 + 2] = (char)((short)(var2 - var1));
   }

   int a(char var1, int var2) {
      this.a((int)3);
      this.h[this.Field33 + 0] = var1;
      this.h[this.Field33 + 1] = (char)var2;
      this.h[this.Field33 + 2] = 0;
      this.Field33 += 3;
      return this.Field33 - 3;
   }

   void a() throws Error {
      throw new Error("Internal error!");
   }

   void a(String var1) throws Exception {
      throw new Exception(var1);
   }

   void Method21() {
      if(c == null) {
         c = new int[10];
         Field44 = new int[10];
         b = new int[10];
         a = new int[10];

         for(int var1 = 0; var1 < 10; ++var1) {
            c[var1] = Field44[var1] = b[var1] = a[var1] = -1;
         }
      }

   }

   void Method22() throws Exception {
      if(this.Field34 >= this.f || this.g.charAt(this.Field34++) != 123) {
         this.a();
      }

      if(this.Field34 >= this.f || !Character.isDigit(this.g.charAt(this.Field34))) {
         this.a("Expected digit");
      }

      StringBuffer var1 = new StringBuffer();

      while(this.Field34 < this.f && Character.isDigit(this.g.charAt(this.Field34))) {
         var1.append(this.g.charAt(this.Field34++));
      }

      try {
         b[Field43] = Integer.parseInt(var1.toString());
      } catch (NumberFormatException var4) {
         this.a("Expected valid number");
      }

      if(this.Field34 >= this.f) {
         this.a("Expected comma or right bracket");
      }

      if(this.g.charAt(this.Field34) == 125) {
         ++this.Field34;
         a[Field43] = 0;
      } else {
         if(this.Field34 >= this.f || this.g.charAt(this.Field34++) != 44) {
            this.a("Expected comma");
         }

         if(this.Field34 >= this.f) {
            this.a("Expected comma or right bracket");
         }

         if(this.g.charAt(this.Field34) == 125) {
            ++this.Field34;
            a[Field43] = -1;
         } else {
            if(this.Field34 >= this.f || !Character.isDigit(this.g.charAt(this.Field34))) {
               this.a("Expected digit");
            }

            var1.setLength(0);

            while(this.Field34 < this.f && Character.isDigit(this.g.charAt(this.Field34))) {
               var1.append(this.g.charAt(this.Field34++));
            }

            try {
               a[Field43] = Integer.parseInt(var1.toString()) - b[Field43];
            } catch (NumberFormatException var3) {
               this.a("Expected valid number");
            }

            if(a[Field43] <= 0) {
               this.a("Bad range");
            }

            if(this.Field34 >= this.f || this.g.charAt(this.Field34++) != 125) {
               this.a("Missing close brace");
            }

         }
      }
   }

   char Method23() throws Exception {
      if(this.g.charAt(this.Field34) != 92) {
         this.a();
      }

      if(this.Field34 + 1 == this.f) {
         this.a("Escape terminates string");
      }

      this.Field34 += 2;
      char var1 = this.g.charAt(this.Field34 - 1);
      int var2;
      switch(var1) {
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
         if((this.Field34 >= this.f || !Character.isDigit(this.g.charAt(this.Field34))) && var1 != 48) {
            return '\uffff';
         } else {
            var2 = var1 - 48;
            if(this.Field34 < this.f && Character.isDigit(this.g.charAt(this.Field34))) {
               var2 = (var2 << 3) + (this.g.charAt(this.Field34++) - 48);
               if(this.Field34 < this.f && Character.isDigit(this.g.charAt(this.Field34))) {
                  var2 = (var2 << 3) + (this.g.charAt(this.Field34++) - 48);
               }
            }

            return (char)var2;
         }
      case 'B':
      case 'b':
         return '\ufffe';
      case 'D':
      case 'S':
      case 'W':
      case 'd':
      case 's':
      case 'w':
         return '�';
      case 'f':
         return '\f';
      case 'n':
         return '\n';
      case 'r':
         return '\r';
      case 't':
         return '\t';
      case 'u':
      case 'x':
         var2 = var1 == 117?4:2;

         int var3;
         for(var3 = 0; this.Field34 < this.f && var2-- > 0; ++this.Field34) {
            char var4 = this.g.charAt(this.Field34);
            if(var4 >= 48 && var4 <= 57) {
               var3 = (var3 << 4) + var4 - 48;
            } else {
               var4 = Character.toLowerCase(var4);
               if(var4 >= 97 && var4 <= 102) {
                  var3 = (var3 << 4) + (var4 - 97) + 10;
               } else {
                  this.a("Expected " + var2 + " hexadecimal digits after \\" + var1);
               }
            }
         }

         return (char)var3;
      default:
         return var1;
      }
   }

   int Method24() throws Exception {
      if(this.g.charAt(this.Field34) != 91) {
         this.a();
      }

      if(this.Field34 + 1 >= this.f || this.g.charAt(++this.Field34) == 93) {
         this.a("Empty or unterminated class");
      }

      int var1;
      if(this.Field34 < this.f && this.g.charAt(this.Field34) == 58) {
         ++this.Field34;

         for(var1 = this.Field34; this.Field34 < this.f && this.g.charAt(this.Field34) >= 97 && this.g.charAt(this.Field34) <= 122; ++this.Field34) {
            ;
         }

         if(this.Field34 + 1 < this.f && this.g.charAt(this.Field34) == 58 && this.g.charAt(this.Field34 + 1) == 93) {
            String var2 = this.g.substring(var1, this.Field34);
            Character var3 = (Character)e.get(var2);
            if(var3 != null) {
               this.Field34 += 2;
               return this.a((char)'P', var3.charValue());
            }

            this.a("Invalid POSIX character class \'" + var2 + "\'");
         }

         this.a("Invalid POSIX character class syntax");
      }

      var1 = this.a((char)'[', 0);
      char var12 = '\uffff';
      char var13 = var12;
      boolean var4 = false;
      boolean var5 = true;
      boolean var6 = false;
      int var7 = this.Field34;
      char var8 = 0;
      a.a_static var9 = new a.a_static();

      while(this.Field34 < this.f && this.g.charAt(this.Field34) != 93) {
         char var14;
         label105:
         switch(this.g.charAt(this.Field34)) {
         case '-':
            if(var6) {
               this.a("Bad class range");
            }

            var6 = true;
            var8 = var13 == var12?0:var13;
            if(this.Field34 + 1 >= this.f || this.g.charAt(++this.Field34) != 93) {
               continue;
            }

            var14 = '\uffff';
            break;
         case '\\':
            char var10;
            switch(var10 = this.Method23()) {
            case '\ufffe':
            case '\uffff':
               this.a("Bad character class");
            case '�':
               if(var6) {
                  this.a("Bad character class");
               }

               switch(this.g.charAt(this.Field34 - 1)) {
               case 'D':
               case 'S':
               case 'W':
                  this.a("Bad character class");
               case 's':
                  var9.a('\t', var5);
                  var9.a('\r', var5);
                  var9.a('\f', var5);
                  var9.a('\n', var5);
                  var9.a('\b', var5);
                  var9.a(' ', var5);
                  break;
               case 'w':
                  var9.a(97, 122, var5);
                  var9.a(65, 90, var5);
                  var9.a('_', var5);
               case 'd':
                  var9.a(48, 57, var5);
               }

               var13 = var12;
               continue;
            default:
               var14 = var10;
               break label105;
            }
         case '^':
            var5 = !var5;
            if(this.Field34 == var7) {
               var9.a(0, '\uffff', true);
            }

            ++this.Field34;
            continue;
         default:
            var14 = this.g.charAt(this.Field34++);
         }

         if(var6) {
            if(var8 >= var14) {
               this.a("Bad character class");
            }

            var9.a(var8, var14, var5);
            var13 = var12;
            var6 = false;
         } else {
            if(this.Field34 + 1 >= this.f || this.g.charAt(this.Field34 + 1) != 45) {
               var9.a(var14, var5);
            }

            var13 = var14;
         }
      }

      if(this.Field34 == this.f) {
         this.a("Unterminated character class");
      }

      ++this.Field34;
      this.h[var1 + 1] = (char)var9.Field129;

      for(int var15 = 0; var15 < var9.Field129; ++var15) {
         this.a((char)var9.a[var15]);
         this.a((char)var9.Field128[var15]);
      }

      return var1;
   }

   int Method25() throws Exception {
      int var1 = this.a((char)'A', 0);
      int var2 = 0;

      label46:
      while(this.Field34 < this.f) {
         if(this.Field34 + 1 < this.f) {
            char var3 = this.g.charAt(this.Field34 + 1);
            if(this.g.charAt(this.Field34) == 92) {
               int var4 = this.Field34;
               this.Method23();
               if(this.Field34 < this.f) {
                  var3 = this.g.charAt(this.Field34);
               }

               this.Field34 = var4;
            }

            switch(var3) {
            case '*':
            case '+':
            case '?':
            case '{':
               if(var2 != 0) {
                  break label46;
               }
            }
         }

         switch(this.g.charAt(this.Field34)) {
         case '$':
         case '(':
         case ')':
         case '.':
         case '[':
         case ']':
         case '^':
         case '|':
            break label46;
         case '*':
         case '+':
         case '?':
         case '{':
            if(var2 == 0) {
               this.a("Missing operand to closure");
            }
            break label46;
         case '\\':
            int var5 = this.Field34;
            char var6 = this.Method23();
            if((var6 & '\ufff0') == '\ufff0') {
               this.Field34 = var5;
               break label46;
            }

            this.a(var6);
            ++var2;
            break;
         default:
            this.a(this.g.charAt(this.Field34++));
            ++var2;
         }
      }

      if(var2 == 0) {
         this.a();
      }

      this.h[var1 + 1] = (char)var2;
      return var1;
   }

   int Method26(int[] var1) throws Exception {
      switch(this.g.charAt(this.Field34)) {
      case '$':
      case '.':
      case '^':
         return this.a((char)this.g.charAt(this.Field34++), 0);
      case '(':
         return this.a(var1);
      case ')':
         this.a("Unexpected close paren");
      case '|':
         this.a();
      case ']':
         this.a("Mismatched class");
      case '\u0000':
         this.a("Unexpected end of input");
      case '*':
      case '+':
      case '?':
      case '{':
         this.a("Missing operand to closure");
      case '\\':
         int var2 = this.Field34;
         switch(this.Method23()) {
         case '�':
         case '\ufffe':
            var1[0] &= -2;
            return this.a((char)'\\', this.g.charAt(this.Field34 - 1));
         case '\uffff':
            char var3 = (char)(this.g.charAt(this.Field34 - 1) - 48);
            if(this.Field35 <= var3) {
               this.a("Bad backreference");
            }

            var1[0] |= 1;
            return this.a((char)'#', var3);
         default:
            this.Field34 = var2;
            var1[0] &= -2;
         }
      default:
         var1[0] &= -2;
         return this.Method25();
      case '[':
         return this.Method24();
      }
   }

   int Method27(int[] var1) throws Exception {
      int var2 = this.Field34;
      int[] var3 = new int[1];
      int var4 = this.Method26(var3);
      var1[0] |= var3[0];
      if(this.Field34 >= this.f) {
         return var4;
      } else {
         boolean var5 = true;
         char var6 = this.g.charAt(this.Field34);
         switch(var6) {
         case '*':
         case '?':
            var1[0] |= 1;
         case '+':
            ++this.Field34;
         case '{':
            char var7 = this.h[var4 + 0];
            if(var7 == 94 || var7 == 36) {
               this.a("Bad closure operand");
            }

            if((var3[0] & 1) != 0) {
               this.a("Closure operand can\'t be nullable");
            }
         default:
            if(this.Field34 < this.f && this.g.charAt(this.Field34) == 63) {
               ++this.Field34;
               var5 = false;
            }

            if(var5) {
               int var10;
               switch(var6) {
               case '+':
                  var10 = this.a((char)'|', 0);
                  this.a(var4, var10);
                  this.a(this.a((char)'G', 0), var4);
                  this.a(var10, this.a((char)'|', 0));
                  this.a(var4, this.a((char)'N', 0));
                  break;
               case '{':
                  boolean var9 = false;
                  this.Method21();

                  int var8;
                  for(var8 = 0; var8 < Field43; ++var8) {
                     if(c[var8] == this.Field34) {
                        var9 = true;
                        break;
                     }
                  }

                  if(!var9) {
                     if(Field43 >= 10) {
                        this.a("Too many bracketed closures (limit is 10)");
                     }

                     c[Field43] = this.Field34;
                     this.Method22();
                     Field44[Field43] = this.Field34;
                     var8 = Field43++;
                  }

                  if(--b[var8] > 0) {
                     this.Field34 = var2;
                     break;
                  } else if(a[var8] == -2) {
                     var6 = 42;
                     a[var8] = 0;
                     this.Field34 = Field44[var8];
                  } else if(a[var8] == -1) {
                     this.Field34 = var2;
                     a[var8] = -2;
                     break;
                  } else if(a[var8]-- <= 0) {
                     this.Field34 = Field44[var8];
                     break;
                  } else {
                     this.Field34 = var2;
                     var6 = 63;
                  }
               case '*':
               case '?':
                  if(var5) {
                     if(var6 == 63) {
                        this.a('|', 0, var4);
                        this.a(var4, this.a((char)'|', 0));
                        var10 = this.a((char)'N', 0);
                        this.a(var4, var10);
                        this.a(var4 + 3, var10);
                     }

                     if(var6 == 42) {
                        this.a('|', 0, var4);
                        this.a(var4 + 3, this.a((char)'|', 0));
                        this.a(var4 + 3, this.a((char)'G', 0));
                        this.a(var4 + 3, var4);
                        this.a(var4, this.a((char)'|', 0));
                        this.a(var4, this.a((char)'N', 0));
                     }
                  }
               }
            } else {
               this.a(var4, this.a((char)'E', 0));
               switch(var6) {
               case '*':
                  this.a('8', 0, var4);
                  break;
               case '+':
                  this.a('=', 0, var4);
                  break;
               case '?':
                  this.a('/', 0, var4);
               }

               this.a(var4, this.Field33);
            }

            return var4;
         }
      }
   }

   int Method28(int[] var1) throws Exception {
      int var2 = this.a((char)'|', 0);
      int var3 = -1;
      int[] var4 = new int[1];

      boolean var5;
      int var6;
      for(var5 = true; this.Field34 < this.f && this.g.charAt(this.Field34) != 124 && this.g.charAt(this.Field34) != 41; var3 = var6) {
         var4[0] = 0;
         var6 = this.Method27(var4);
         if(var4[0] == 0) {
            var5 = false;
         }

         if(var3 != -1) {
            this.a(var3, var6);
         }
      }

      if(var3 == -1) {
         this.a((char)'N', 0);
      }

      if(var5) {
         var1[0] |= 1;
      }

      return var2;
   }

   int a(int[] var1) throws Exception {
      boolean var2 = false;
      int var3 = -1;
      int var4 = this.Field35;
      if((var1[0] & 2) == 0 && this.g.charAt(this.Field34) == 40) {
         ++this.Field34;
         var2 = true;
         var3 = this.a('(', this.Field35++);
      }

      var1[0] &= -3;
      int var5 = this.Method28(var1);
      if(var3 == -1) {
         var3 = var5;
      } else {
         this.a(var3, var5);
      }

      while(this.Field34 < this.f && this.g.charAt(this.Field34) == 124) {
         ++this.Field34;
         var5 = this.Method28(var1);
         this.a(var3, var5);
      }

      int var6;
      if(var2) {
         if(this.Field34 < this.f && this.g.charAt(this.Field34) == 41) {
            ++this.Field34;
         } else {
            this.a("Missing close paren");
         }

         var6 = this.a(')', var4);
      } else {
         var6 = this.a((char)'E', 0);
      }

      this.a(var3, var6);
      int var7 = -1;

      for(int var8 = var3; var7 != 0; var8 += var7) {
         if(this.h[var8 + 0] == 124) {
            this.a(var8 + 3, var6);
         }

         var7 = this.h[var8 + 2];
      }

      return var3;
   }

   public b Method29(String var1) throws Exception {
      this.g = var1;
      this.f = var1.length();
      this.Field34 = 0;
      this.Field33 = 0;
      this.Field35 = 1;
      Field43 = 0;
      int[] var2 = new int[]{2};
      this.a(var2);
      if(this.Field34 != this.f) {
         if(var1.charAt(this.Field34) == 41) {
            this.a("Unmatched close paren");
         }

         this.a("Unexpected input remains");
      }

      char[] var3 = new char[this.Field33];
      System.arraycopy(this.h, 0, var3, 0, this.Field33);
      return new b(var3);
   }

   class a_static {
      int Field127 = 16;
      int[] a;
      int[] Field128;
      int Field129;

      a_static() {
         this.a = new int[this.Field127];
         this.Field128 = new int[this.Field127];
         this.Field129 = 0;
      }

      void a(int var1) {
         if(this.Field129 != 0 && var1 < this.Field129) {
            while(var1++ < this.Field129) {
               if(var1 - 1 >= 0) {
                  this.a[var1 - 1] = this.a[var1];
                  this.Field128[var1 - 1] = this.Field128[var1];
               }
            }

            --this.Field129;
         }
      }

      void a(int var1, int var2) {
         for(int var3 = 0; var3 < this.Field129; ++var3) {
            if(var1 >= this.a[var3] && var2 <= this.Field128[var3]) {
               return;
            }

            if(var1 <= this.a[var3] && var2 >= this.Field128[var3]) {
               this.a(var3);
               this.a(var1, var2);
               return;
            }

            if(var1 >= this.a[var3] && var1 <= this.Field128[var3]) {
               this.a(var3);
               var1 = this.a[var3];
               this.a(var1, var2);
               return;
            }

            if(var2 >= this.a[var3] && var2 <= this.Field128[var3]) {
               this.a(var3);
               var2 = this.Field128[var3];
               this.a(var1, var2);
               return;
            }
         }

         if(this.Field129 >= this.Field127) {
            this.Field127 *= 2;
            int[] var5 = new int[this.Field127];
            int[] var4 = new int[this.Field127];
            System.arraycopy(this.a, 0, var5, 0, this.Field129);
            System.arraycopy(this.Field128, 0, var4, 0, this.Field129);
            this.a = var5;
            this.Field128 = var4;
         }

         this.a[this.Field129] = var1;
         this.Field128[this.Field129] = var2;
         ++this.Field129;
      }

      void Method89(int var1, int var2) {
         for(int var3 = 0; var3 < this.Field129; ++var3) {
            if(this.a[var3] >= var1 && this.Field128[var3] <= var2) {
               this.a(var3);
               --var3;
               return;
            }

            if(var1 >= this.a[var3] && var2 <= this.Field128[var3]) {
               int var4 = this.a[var3];
               int var5 = this.Field128[var3];
               this.a(var3);
               if(var4 < var1 - 1) {
                  this.a(var4, var1 - 1);
               }

               if(var2 + 1 < var5) {
                  this.a(var2 + 1, var5);
               }

               return;
            }

            if(this.a[var3] >= var1 && this.a[var3] <= var2) {
               this.a[var3] = var2 + 1;
               return;
            }

            if(this.Field128[var3] >= var1 && this.Field128[var3] <= var2) {
               this.Field128[var3] = var1 - 1;
               return;
            }
         }

      }

      void a(int var1, int var2, boolean var3) {
         if(var3) {
            this.a(var1, var2);
         } else {
            this.Method89(var1, var2);
         }

      }

      void a(char var1, boolean var2) {
         this.a(var1, var1, var2);
      }
   }
}
