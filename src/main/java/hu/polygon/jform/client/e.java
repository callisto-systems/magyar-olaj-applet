package hu.polygon.jform.client;

import hu.polygon.jform.client.Main;
import hu.polygon.jform.client.Session;
import hu.polygon.jform.client.aq;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public final class e extends Frame implements ActionListener {
   public final Button Field108 = new Button("Terminate Session");
   private final TextArea Field109 = new TextArea("", 1, 1, 1);
   private final Button Field110 = new Button("Clear Console");
   private final Button Field111 = new Button("Hide Console");
   private final Session Field112;
   private final StringBuffer a = new StringBuffer();

   public e(Session var1) {
      super("Console");
      this.enableEvents(64L);
      this.setLayout(new BorderLayout());
      Dimension var2 = aq.N.getScreenSize();
      this.Field112 = var1;
      this.setBounds(var2.width / 6, var2.height / 6, var2.width / 3 * 2, var2.height / 3 * 2);
      this.add(this.Field109, "Center");
      this.Field109.setEditable(false);
      this.Field109.setBackground(Color.white);
      this.Field109.setFont(new Font("Monospaced", 0, 12));
      Panel var3 = new Panel(new FlowLayout(2));
      var3.setBackground(Color.lightGray);
      var3.add(this.Field110);
      var3.add(this.Field108);
      var3.add(this.Field111);
      this.add(var3, "South");
      this.Field110.addActionListener(this);
      this.Field108.addActionListener(this);
      this.Field111.addActionListener(this);
      this.a();
   }

   protected final void processWindowEvent(WindowEvent var1) {
      super.processWindowEvent(var1);
      if(var1.getID() == 205) {
         this.Field111.requestFocus();
      }

      if(var1.getID() == 201) {
         this.setVisible(false);
      }

   }

   public final void a() {
      this.a.setLength(0);
      this.a.append("# JFORM GUI ENGINE - VERSION 5.0.17\n# COPYRIGHT (C) POLYGON INFORMATICS LTD. 2003\n# JAVA VERSION: " + Main.a + " from " + System.getProperty("java.vendor") + '\n');
      this.Field109.setText(this.a.toString());
   }

   private final void Method3() {
      this.Field112.a(false);
   }

   public final void a(String var1) {
      this.a.append('\n').append(var1);
      if(this.isVisible()) {
         this.Field109.setText(this.a.toString());
         this.Field109.setSelectionStart(this.a.length());
      }

   }

   public final void setVisible(boolean var1) {
      super.setVisible(var1);
      if(var1) {
         this.Field109.setText(this.a.toString());
         this.Field109.setSelectionStart(this.a.length());
      } else {
         this.Field109.setText(" ");
      }

   }

   public final void actionPerformed(ActionEvent var1) {
      if(var1.getSource() == this.Field110) {
         this.a();
      } else if(var1.getSource() == this.Field108) {
         this.Method3();
      } else {
         this.setVisible(false);
      }
   }
}
