package hu.polygon.jform.client;

import java.util.Vector;

final class z extends Thread {
   private final Vector a = new Vector();

   z() {
      super("TIMER");
      this.setDaemon(true);
      this.start();
   }

   public final void run() {
      while(true) {
         try {
            while(true) {
               Thread.sleep(100L);
               synchronized(this) {
                  for(int var2 = 0; var2 < this.a.size(); ++var2) {
                     ((Runnable)this.a.elementAt(var2)).run();
                  }

                  while(this.a.isEmpty()) {
                     this.wait();
                  }
               }
            }
         } catch (InterruptedException var4) {
            return;
         } catch (Throwable var5) {
            var5.printStackTrace();
         }
      }
   }

   final synchronized void Method87(Runnable var1) {
      if(!this.a.contains(var1)) {
         this.a.addElement(var1);
      }

      this.notify();
   }

   final synchronized void a(Runnable var1) {
      if(this.a.contains(var1)) {
         this.a.removeElement(var1);
      }

   }
}
