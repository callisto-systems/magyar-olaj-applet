package hu.polygon.jform.client;

public final class ag {
   public Object Field78;
   public int a;
   public int Field79;
   public int Field80;
   public boolean Field81;
   public int Field82;
   public int Field83;
   public int Field84;
   public int Field85;
   public String Field86;

   public ag(Object var1, int var2) {
      this.Field78 = var1;
      this.a = var2;
   }

   public ag(Object var1, String var2) {
      this.Field78 = var1;
      this.a = 1001;
      this.Field86 = var2;
   }

   public ag(Object var1, int var2, int var3, boolean var4, int var5) {
      this.Field78 = var1;
      this.a = var2;
      this.Field80 = var3;
      this.Field81 = var4;
      this.Field79 = var5;
   }

   public ag(Object var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.Field78 = var1;
      this.a = var2;
      this.Field82 = var3;
      this.Field83 = var4;
      this.Field79 = var5;
      this.Field84 = var6;
      this.Field85 = var7;
   }

   public final boolean Method57() {
      return (this.Field79 & 1) != 0;
   }

   public final boolean a() {
      return (this.Field79 & 4) != 0;
   }

   public final boolean Method58() {
      return (this.Field79 & 2) != 0;
   }

   public final String toString() {
      return "JFORMEvent [id: " + this.a + ", x: " + this.Field82 + ", y: " + this.Field83 + ", code: " + this.Field80 + ", actionKey: " + this.Field81 + ", modifiers: " + this.Field79 + ", clickCount: " + this.Field84 + ", wheelRotation: " + this.Field85 + "]";
   }
}
