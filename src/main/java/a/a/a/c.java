package a.a.a;

import a.a.a.a;
import a.a.a.b;

public class c {
   public static final int Field15 = 0;
   public static final int d = 2;
   public static final int I = 4;
   static final char E = 'E';
   static final char z = '^';
   static final char h = '$';
   static final char aa = '.';
   static final char M = '[';
   static final char L = '|';
   static final char O = 'A';
   static final char H = '*';
   static final char T = '+';
   static final char n = '?';
   static final char Field16 = '\\';
   static final char g = '(';
   static final char i = ')';
   static final char m = '#';
   static final char Field17 = 'G';
   static final char K = 'N';
   static final char o = '8';
   static final char x = '=';
   static final char R = '/';
   static final char B = 'P';
   static final char Field18 = 'w';
   static final char D = 'W';
   static final char s = 'b';
   static final char c = 'B';
   static final char Field19 = 's';
   static final char U = 'S';
   static final char y = 'd';
   static final char l = 'D';
   static final char Field20 = 'w';
   static final char e = 'a';
   static final char A = 'b';
   static final char C = 'c';
   static final char G = 'd';
   static final char Field21 = 'g';
   static final char q = 'l';
   static final char f = 'p';
   static final char r = '!';
   static final char k = 's';
   static final char b = 'u';
   static final char Field22 = 'x';
   static final char Field23 = 'j';
   static final char F = 'k';
   static final int Z = 65536;
   static final int j = 16;
   static final int X = 0;
   static final int J = 1;
   static final int Field24 = 2;
   static final int S = 3;
   static final String u = System.getProperty("line.separator");
   b a;
   char[] V;
   int Y;
   int Field25;
   int Field26;
   int Q;
   int w;
   int P;
   int v;
   int N;
   int t;
   int[] Field27;
   int[] W;
   int[] Field28;
   int[] p;

   public c(String var1) throws Exception {
      this(var1, 0);
   }

   public c(String var1, int var2) throws Exception {
      this.a = (new a()).Method29(var1);
      this.Field25 = var2;
   }

   public final int Method14(int var1) {
      if(var1 < this.Field26) {
         switch(var1) {
         case 0:
            return this.Q;
         case 1:
            return this.P;
         case 2:
            return this.N;
         default:
            if(this.Field27 == null) {
               this.a();
            }

            return this.Field27[var1];
         }
      } else {
         return -1;
      }
   }

   public final int Method15(int var1) {
      if(var1 < this.Field26) {
         switch(var1) {
         case 0:
            return this.w;
         case 1:
            return this.v;
         case 2:
            return this.t;
         default:
            if(this.W == null) {
               this.a();
            }

            return this.W[var1];
         }
      } else {
         return -1;
      }
   }

   public final int Method16(int var1) {
      return var1 < this.Field26?this.Method15(var1) - this.Method14(var1):-1;
   }

   protected final void Method17(int var1, int var2) {
      if(var1 < this.Field26) {
         switch(var1) {
         case 0:
            this.Q = var2;
            break;
         case 1:
            this.P = var2;
            break;
         case 2:
            this.N = var2;
            break;
         default:
            if(this.Field27 == null) {
               this.a();
            }

            this.Field27[var1] = var2;
         }
      }

   }

   protected final void a(int var1, int var2) {
      if(var1 < this.Field26) {
         switch(var1) {
         case 0:
            this.w = var2;
            break;
         case 1:
            this.v = var2;
            break;
         case 2:
            this.t = var2;
            break;
         default:
            if(this.W == null) {
               this.a();
            }

            this.W[var1] = var2;
         }
      }

   }

   protected void Method18(String var1) throws Error {
      throw new Error("RE internal error: " + var1);
   }

   private final void a() {
      this.Field27 = new int[16];
      this.W = new int[16];

      for(int var1 = 0; var1 < 16; ++var1) {
         this.Field27[var1] = -1;
         this.W[var1] = -1;
      }

   }

   protected int a(int var1, int var2, int var3) {
      int var4 = var3;
      char[] var5 = this.a.a;
      int var6 = var1;

      while(var6 < var2) {
         int var8;
         char var7 = var5[var6 + 0];
         var8 = var6 + (short)var5[var6 + 2];
         char var9 = var5[var6 + 1];
         int var11;
         int var13;
         char var18;
         int var20;
         int var21;
         label353:
         switch(var7) {
         case '#':
            var20 = this.Field28[var9];
            var21 = this.p[var9];
            if(var20 == -1 || var21 == -1) {
               return -1;
            }

            if(var20 != var21) {
               var13 = var21 - var20;
               if(this.Method20(var4 + var13 - 1)) {
                  return -1;
               }

               for(int var22 = 0; var22 < var13; ++var22) {
                  if(this.V[var4++] != this.V[var20 + var22]) {
                     return -1;
                  }
               }
            }
            break;
         case '$':
            if(!this.Method20(0) && !this.Method20(var4)) {
               if((this.Field25 & 2) != 2) {
                  return -1;
               }

               if(!this.Method19(var4)) {
                  return -1;
               }
            }
            break;
         case '(':
            if((this.a.Field32 & 1) != 0) {
               this.Field28[var9] = var4;
            }

            if((var11 = this.a(var8, 65536, var4)) != -1) {
               if(var9 + 1 > this.Field26) {
                  this.Field26 = var9 + 1;
               }

               if(this.Method14(var9) == -1) {
                  this.Method17(var9, var4);
               }
            }

            return var11;
         case ')':
            if((this.a.Field32 & 1) != 0) {
               this.p[var9] = var4;
            }

            if((var11 = this.a(var8, 65536, var4)) != -1) {
               if(var9 + 1 > this.Field26) {
                  this.Field26 = var9 + 1;
               }

               if(this.Method15(var9) == -1) {
                  this.a(var9, var4);
               }
            }

            return var11;
         case '.':
            if((this.Field25 & 4) == 4) {
               if(this.Method20(var4)) {
                  return -1;
               }

               ++var4;
            } else if(this.Method20(var4) || this.V[var4++] == 10) {
               return -1;
            }
            break;
         case '/':
            var20 = 0;

            do {
               if((var11 = this.a(var8, 65536, var4)) != -1) {
                  return var11;
               }
            } while(var20++ == 0 && (var4 = this.a(var6 + 3, var8, var4)) != -1);

            return -1;
         case '8':
            while((var11 = this.a(var8, 65536, var4)) == -1) {
               if((var4 = this.a(var6 + 3, var8, var4)) == -1) {
                  return -1;
               }
            }

            return var11;
         case '=':
            while((var4 = this.a(var6 + 3, var8, var4)) != -1) {
               if((var11 = this.a(var8, 65536, var4)) != -1) {
                  return var11;
               }
            }

            return -1;
         case 'A':
            if(this.Method20(var4)) {
               return -1;
            }

            var18 = var9;
            var21 = var6 + 3;
            if(this.Method20(var9 + var4 - 1)) {
               return -1;
            }

            var13 = 0;

            while(true) {
               if(var13 >= var18) {
                  break label353;
               }

               if(this.V[var4++] != var5[var21 + var13]) {
                  return -1;
               }

               ++var13;
            }
         case 'E':
            this.a(0, var4);
            return var4;
         case 'G':
         case 'N':
            break;
         case 'P':
            if(this.Method20(var4)) {
               return -1;
            }

            label302:
            switch(var9) {
            case '!':
               var20 = Character.getType(this.V[var4]);
               switch(var20) {
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
                  break label302;
               default:
                  return -1;
               }
            case 'a':
               if(!Character.isLetter(this.V[var4])) {
                  return -1;
               }
               break;
            case 'b':
               if(!Character.isSpaceChar(this.V[var4])) {
                  return -1;
               }
               break;
            case 'c':
               if(Character.getType(this.V[var4]) != 15) {
                  return -1;
               }
               break;
            case 'd':
               if(!Character.isDigit(this.V[var4])) {
                  return -1;
               }
               break;
            case 'g':
               switch(Character.getType(this.V[var4])) {
               case 25:
               case 26:
               case 27:
               case 28:
                  break label302;
               default:
                  return -1;
               }
            case 'j':
               if(!Character.isJavaIdentifierStart(this.V[var4])) {
                  return -1;
               }
               break;
            case 'k':
               if(!Character.isJavaIdentifierPart(this.V[var4])) {
                  return -1;
               }
               break;
            case 'l':
               if(Character.getType(this.V[var4]) != 2) {
                  return -1;
               }
               break;
            case 'p':
               if(Character.getType(this.V[var4]) == 15) {
                  return -1;
               }
               break;
            case 's':
               if(!Character.isWhitespace(this.V[var4])) {
                  return -1;
               }
               break;
            case 'u':
               if(Character.getType(this.V[var4]) != 1) {
                  return -1;
               }
               break;
            case 'w':
               if(!Character.isLetterOrDigit(this.V[var4])) {
                  return -1;
               }
               break;
            case 'x':
               boolean var19 = this.V[var4] >= 48 && this.V[var4] <= 57 || this.V[var4] >= 97 && this.V[var4] <= 102 || this.V[var4] >= 65 && this.V[var4] <= 70;
               if(!var19) {
                  return -1;
               }
               break;
            default:
               this.Method18("Bad posix class");
            }

            ++var4;
            break;
         case '[':
            if(this.Method20(var4)) {
               return -1;
            }

            var18 = this.V[var4];
            var21 = var6 + 3;
            var13 = var21 + var9 * 2;
            boolean var14 = false;
            int var15 = var21;

            while(var15 < var13) {
               char var16 = var5[var15++];
               char var17 = var5[var15++];
               if(var18 >= var16 && var18 <= var17) {
                  var14 = true;
                  break;
               }
            }

            if(!var14) {
               return -1;
            }

            ++var4;
            break;
         case '\\':
            switch(var9) {
            case 'B':
            case 'b':
               var18 = var4 == this.Method14(0)?10:this.V[var4 - 1];
               char var12 = this.Method20(var4)?10:this.V[var4];
               if(Character.isLetterOrDigit(var18) == Character.isLetterOrDigit(var12) == (var9 == 98)) {
                  return -1;
               }
               break label353;
            case 'D':
            case 'S':
            case 'W':
            case 'd':
            case 's':
            case 'w':
               if(this.Method20(var4)) {
                  return -1;
               }

               switch(var9) {
               case 'D':
               case 'd':
                  if(Character.isDigit(this.V[var4]) != (var9 == 100)) {
                     return -1;
                  }
                  break;
               case 'S':
               case 's':
                  if(Character.isWhitespace(this.V[var4]) != (var9 == 115)) {
                     return -1;
                  }
                  break;
               case 'W':
               case 'w':
                  if(Character.isLetterOrDigit(this.V[var4]) != (var9 == 119)) {
                     return -1;
                  }
               }

               ++var4;
               break label353;
            default:
               this.Method18("Unrecognized escape \'" + var9 + "\'");
               break label353;
            }
         case '^':
            if(var4 != 0) {
               if((this.Field25 & 2) != 2) {
                  return -1;
               }

               if(var4 <= 0 || !this.Method19(var4 - 1)) {
                  return -1;
               }
            }
            break;
         case '|':
            if(var5[var8 + 0] == 124) {
               short var10;
               do {
                  if((var11 = this.a(var6 + 3, 65536, var4)) != -1) {
                     return var11;
                  }

                  var10 = (short)var5[var6 + 2];
                  var6 += var10;
               } while(var10 != 0 && var5[var6 + 0] == 124);

               return -1;
            }

            var6 += 3;
            continue;
         default:
            this.Method18("Invalid opcode \'" + var7 + "\'");
         }

         var6 = var8;
      }

      this.Method18("Corrupt program");
      return -1;
   }

   protected boolean a(int var1) {
      this.Q = -1;
      this.w = -1;
      this.P = -1;
      this.v = -1;
      this.N = -1;
      this.t = -1;
      this.Field27 = null;
      this.W = null;
      this.Field26 = 1;
      this.Method17(0, var1);
      if((this.a.Field32 & 1) != 0) {
         this.Field28 = new int[16];
         this.p = new int[16];
      }

      int var2;
      if((var2 = this.a(0, 65536, var1)) != -1) {
         this.a(0, var2);
         return true;
      } else {
         this.Field26 = 0;
         return false;
      }
   }

   public boolean a(String var1, int var2) {
      if(this.a == null) {
         this.Method18("No RE program to run!");
      }

      this.V = var1.toCharArray();
      if(this.a.Field31 == null) {
         while(!this.Method20(var2 - 1)) {
            if(this.a(var2)) {
               return true;
            }

            ++var2;
         }

         return false;
      } else {
         for(char[] var3 = this.a.Field31; !this.Method20(var2 + var3.length - 1); ++var2) {
            boolean var4 = false;
            var4 = this.V[var2] == var3[0];
            if(var4) {
               int var5 = var2++;
               int var6 = 1;

               while(var6 < var3.length) {
                  var4 = this.V[var2++] == var3[var6++];
                  if(!var4) {
                     break;
                  }
               }

               if(var6 == var3.length && this.a(var5)) {
                  return true;
               }

               var2 = var5;
            }
         }

         return false;
      }
   }

   public boolean a(String var1) {
      return this.a(var1, 0);
   }

   private boolean Method19(int var1) {
      if(var1 < u.length() - 1) {
         return false;
      } else if(this.V[var1] == 10) {
         return true;
      } else {
         for(int var2 = u.length() - 1; var2 >= 0; --var1) {
            if(u.charAt(var2) != this.V[var1]) {
               return false;
            }

            --var2;
         }

         return true;
      }
   }

   private boolean Method20(int var1) {
      return var1 >= this.V.length;
   }
}
