/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hrishikeshwarrier
 */
public class LandingPanel extends javax.swing.JPanel {

      int x=0;
        int y=100;
        int a=400;
        int b=200;
    /**
     * Creates new form LandingPanel
     */
    public LandingPanel() {
        initComponents();
    }
    
    
     public void paint(Graphics gp)
    
 
 {
        
        super.paint(gp);
        Graphics2D g2d= (Graphics2D) gp;
        //g2d.setColor(Color.black);
        //g2d.setFont(new Font("BOLD", ITALIC, 50));
             
        //g2d.drawString("Every Child Deserves A Home & Love", x, y);
      //  g2d.drawString("CodeGuid.Com", a, b);
       //g2d.drawString("THANKS ", x, 300);
                try {
            Thread.sleep(200);
            x+=20;
            a-=20;
            
            if(x>getWidth())
        {
        
            x=0;
        }
            if(a<0)
        {
        
            a=400;
        }
        repaint();
                      
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 26, 29));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adoption.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(304, 192));
        jLabel3.setMinimumSize(new java.awt.Dimension(304, 192));
        jLabel3.setPreferredSize(new java.awt.Dimension(304, 192));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(516, 516, 516)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1424, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    
}
