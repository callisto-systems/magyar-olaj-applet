package hu.polygon.jform.client;

import hu.polygon.jform.client.LABEL;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.TABLE;
import hu.polygon.jform.client.ag;
import hu.polygon.jform.client.aq;
import hu.polygon.jform.client.g;

public final class as extends LABEL {
   public as(Session var1) {
      super(var1);
      super.ad = "#TABLE-CELL";
      super._border_tickness.y = 2;
      super._transparent.D = false;
      super._background.s = g.r;
      super._focusable.D = true;
   }

   public final boolean a(ag var1) {
      switch(var1.a) {
      case 401:
         if(var1.Field80 != 32 && var1.Field80 != 10) {
            if(var1.Field80 == 9) {
               super.T.a((aq)this);
               super.M = false;
               super.T.Field10 = super.aa.aa;
               this.Method37();
               super.T.a(var1.Method57());
               return true;
            }

            if(var1.Field81) {
               int var2;
               switch(var1.Field80) {
               case 37:
                  if(super.aa.aA.indexOf(this) > 0) {
                     super.T.a(true);
                  }
                  break;
               case 38:
                  var2 = super.aa.aA.indexOf(this) - ((TABLE)super.aa.aa)._columns.G.cf.size();
                  if(var2 > -1) {
                     super.T.Method11((aq)super.aa.aA.elementAt(var2));
                  }
                  break;
               case 39:
                  if(super.aa.aA.indexOf(this) < super.aa.aA.size() - 1) {
                     super.T.a(false);
                  }
                  break;
               case 40:
                  var2 = super.aa.aA.indexOf(this) + ((TABLE)super.aa.aa)._columns.G.cf.size();
                  if(var2 < super.aa.aA.size()) {
                     super.T.Method11((aq)super.aa.aA.elementAt(var2));
                  }
               }

               super.aa.aa.X = super.T.Field10;
               return true;
            }
            break;
         }

         super.ah.a(new ag(this, (String)null));
         return true;
      case 501:
         if(var1.Field84 > 1) {
            super.ah.a(new ag(this, ""));
         }
      }

      return super.a(var1);
   }
}
