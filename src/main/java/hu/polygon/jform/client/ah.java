package hu.polygon.jform.client;

import hu.polygon.jform.client.f;

public final class ah {
   private final StringBuffer Field75 = new StringBuffer();
   private final char[] a;
   private int Field76;
   private char Field77;

   public ah(f var1, String var2) throws Exception {
      this.a = var2.toCharArray();

      while(true) {
         this.Method53();
         if(this.Field77 != 60) {
            throw new Exception("Missing leader \'<\' character!");
         }

         this.Method54();
         if(this.Field77 != 33 && this.Field77 != 63) {
            --this.Field76;
            this.a(var1);
            return;
         }

         this.Method56();
      }
   }

   private final void a(f var1) throws Exception {
      String var2 = this.Method52();
      var1 = var1.a(var2);
      this.Method53();

      while(this.Field77 != 62 && this.Field77 != 47) {
         --this.Field76;
         String var3 = this.Method52();
         this.Method53();
         if(this.Field77 != 61) {
            throw new Exception("Invalid attribute-definition. Missing \'=\' character (" + var3 + ")!");
         }

         this.Method53();
         --this.Field76;
         var1.a(var3, this.a());
         this.Method53();
      }

      if(this.Field77 == 47) {
         this.Method54();
         if(this.Field77 != 62) {
            throw new Exception("Invalid closing-element syntax. Missing \'/>\' characters (" + var2 + ")!");
         } else {
            var1.a();
         }
      } else {
         this.Method53();
         String var4;
         if(this.Field77 != 60) {
            --this.Field76;
            var4 = this.Method50();
         } else {
            while(true) {
               this.Method54();
               if(this.Field77 != 33) {
                  var4 = null;
                  break;
               }

               this.Method56();
               this.Method53();
               if(this.Field77 != 60) {
                  --this.Field76;
                  var4 = this.Method50();
                  break;
               }
            }
         }

         if(var4 != null) {
            var1.Method31(var4);
         } else {
            while(true) {
               if(this.Field77 == 47) {
                  --this.Field76;
                  break;
               }

               if(this.Field77 == 33) {
                  this.Method54();
                  if(this.Field77 != 45) {
                     throw new Exception("Invalid comment syntax. Missing \'-\' character!");
                  }

                  this.Method54();
                  if(this.Field77 != 45) {
                     throw new Exception("Invalid comment syntax. Missing \'-\' character!");
                  }

                  this.Method55();
               } else if(this.Field77 == 63) {
                  while(this.Field77 != 62) {
                     this.Method53();
                  }
               } else {
                  --this.Field76;
                  this.a(var1);
               }

               this.Method53();
               if(this.Field77 != 60) {
                  throw new Exception("Expected XML syntax. Missing \'<\' character!");
               }

               this.Method54();
            }
         }

         this.Method54();
         if(this.Field77 != 47) {
            throw new Exception("Expected XML syntax!");
         } else {
            this.Method53();
            --this.Field76;
            var1.a();
            if(!var2.equals(this.Method52())) {
               throw new Exception("Invalid end-tag (" + var2 + ")!");
            } else {
               this.Method53();
               if(this.Field77 != 62) {
                  throw new Exception("Expected end-tag syntax. Missing \'>\' character!");
               }
            }
         }
      }
   }

   private final String a() throws Exception {
      this.Field75.setLength(0);
      this.Method54();
      if(this.Field77 != 39 && this.Field77 != 34) {
         throw new Exception("Invalid attribute delimiter!");
      } else {
         char var1 = this.Field77;

         while(true) {
            this.Method54();
            if(this.Field77 == var1) {
               return this.Field75.toString().trim();
            }

            if(this.Field77 == 38) {
               this.Method51();
            } else {
               this.Field75.append(this.Field77);
            }
         }
      }
   }

   private final String Method50() throws Exception {
      this.Field75.setLength(0);

      while(true) {
         while(true) {
            while(true) {
               this.Method54();
               if(this.Field77 == 60) {
                  this.Method54();
                  if(this.Field77 == 33) {
                     this.Method56();
                  } else {
                     if(this.Field77 != 63) {
                        --this.Field76;
                        return this.Field75.toString().trim();
                     }

                     while(this.Field77 != 62) {
                        this.Method53();
                     }
                  }
               } else if(this.Field77 == 38) {
                  this.Method51();
               } else {
                  this.Field75.append(this.Field77);
               }
            }
         }
      }
   }

   private final void Method51() throws Exception {
      int var1 = this.Field76;

      do {
         this.Method54();
      } while(this.Field77 != 59);

      String var2 = new String(this.a, var1, this.Field76 - var1 - 1);
      if(var2.charAt(0) == 35) {
         try {
            if(var2.charAt(1) == 120) {
               this.Field77 = (char)Integer.parseInt(var2.substring(2), 16);
            } else {
               this.Field77 = (char)Integer.parseInt(var2.substring(1), 10);
            }
         } catch (NumberFormatException var4) {
            throw new Exception("Unknown entity:" + var2 + '!');
         }

         this.Field75.append(this.Field77);
      } else if(var2.equals("amp")) {
         this.Field75.append('&');
      } else if(var2.equals("lt")) {
         this.Field75.append('<');
      } else if(var2.equals("gt")) {
         this.Field75.append('>');
      } else if(var2.equals("quot")) {
         this.Field75.append('\"');
      } else {
         if(!var2.equals("apos")) {
            throw new Exception("Unknown entity:" + var2 + '!');
         }

         this.Field75.append('\'');
      }

   }

   private final String Method52() throws Exception {
      int var1 = this.Field76;

      while(true) {
         while(true) {
            this.Method54();
            if(this.Field77 == 58) {
               var1 = this.Field76;
            } else if((this.Field77 < 65 || this.Field77 > 90) && (this.Field77 < 97 || this.Field77 > 122) && (this.Field77 < 48 || this.Field77 > 57) && this.Field77 != 95 && this.Field77 != 46 && this.Field77 != 45 && this.Field77 <= 126) {
               --this.Field76;
               return new String(this.a, var1, this.Field76 - var1);
            }
         }
      }
   }

   private final void Method53() throws Exception {
      while(true) {
         this.Method54();
         switch(this.Field77) {
         case '\t':
         case '\n':
         case '\r':
         case ' ':
            break;
         default:
            return;
         }
      }
   }

   private final void Method54() throws Exception {
      if(this.Field76 == this.a.length) {
         throw new Exception("Unexpected end of XML!");
      } else {
         this.Field77 = this.a[this.Field76++];
      }
   }

   private final void Method55() throws Exception {
      int var1 = 2;

      while(var1 > 0) {
         this.Method54();
         if(this.Field77 == 45) {
            --var1;
         } else {
            var1 = 2;
         }
      }

      this.Method54();
      if(this.Field77 != 62) {
         throw new Exception("Invalid comment-syntax. Missing \'>\' character!");
      }
   }

   private final void Method56() throws Exception {
      int var1 = 1;
      char var2 = 0;
      int var3 = 0;
      this.Method54();
      if(this.Field77 == 91) {
         ++var3;
      } else if(this.Field77 == 45) {
         this.Method54();
         if(this.Field77 == 91) {
            ++var3;
         } else if(this.Field77 == 93) {
            --var3;
         } else if(this.Field77 == 45) {
            this.Method55();
            return;
         }
      }

      while(true) {
         while(var1 > 0) {
            this.Method54();
            if(var2 == 0) {
               if(this.Field77 != 34 && this.Field77 != 39) {
                  if(var3 <= 0) {
                     if(this.Field77 == 60) {
                        ++var1;
                     } else if(this.Field77 == 62) {
                        --var1;
                     }
                  }
               } else {
                  var2 = this.Field77;
               }

               if(this.Field77 == 91) {
                  ++var3;
               } else if(this.Field77 == 93) {
                  --var3;
               }
            } else if(this.Field77 == var2) {
               var2 = 0;
            }
         }

         return;
      }
   }
}
