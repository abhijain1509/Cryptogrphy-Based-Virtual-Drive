package gui;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
import java.io.IOException;
import java.awt.Color;

/**
 *
 * @author Abhishek
 */
public class Main extends javax.swing.JFrame
{   
    public Main(boolean usedTheApplication)
    {
      
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       
 
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                  JFrame jframe = new JFrame("My JFrame Title");
                JFrame frame = (JFrame)e.getSource();
                Toolkit.getDefaultToolkit().beep();
                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION)
                {
                    if(usedTheApplication)
                    {
                        new ThankYouDialog(new javax.swing.JFrame(),true).setVisible(rootPaneCheckingEnabled);
                    }
             
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                    
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        encryptButton = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        cloud_btn = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        canvas2 = new java.awt.Canvas();
        heading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRYPTOGRAHYIC VIRTUAL DRIVE");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(400, 400, 400, 400));
        setMaximumSize(new java.awt.Dimension(710, 400));
        setMinimumSize(new java.awt.Dimension(710, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("I want to");
        jLabel1.setForeground(Color.WHITE);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 150, 133, 36);

        encryptButton.setBackground(new java.awt.Color(0, 0, 0));
        encryptButton.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        encryptButton.setForeground(new java.awt.Color(255, 255, 255));
        encryptButton.setText("ENCRYPT MY FILES");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(encryptButton);
        encryptButton.setBounds(70, 220, 210, 30);

        decryptButton.setBackground(new java.awt.Color(0, 0, 0));
        decryptButton.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        decryptButton.setForeground(new java.awt.Color(255, 255, 255));
        decryptButton.setText("DECRYPT MY FILES");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(decryptButton);
        decryptButton.setBounds(50, 276, 240, 30);
        decryptButton.getAccessibleContext().setAccessibleName("DECRYPT FILES");
        decryptButton.getAccessibleContext().setAccessibleDescription("");

        cloud_btn.setBackground(new java.awt.Color(0, 0, 0));
        cloud_btn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        cloud_btn.setForeground(new java.awt.Color(255, 255, 255));
        cloud_btn.setText("CONNECT TO DROPBOX");
        cloud_btn.setFont(new java.awt.Font("Vrinda Bold", 1, 14));
        cloud_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cloud_btnActionPerformed(evt);
            }
        });
        getContentPane().add(cloud_btn);
        cloud_btn.setBounds(40, 330, 260, 30);
        getContentPane().add(canvas1);
        canvas1.setBounds(402, 111, 0, 0);
        getContentPane().add(canvas2);
        canvas2.setBounds(457, 200, 0, 0);

        heading.setBackground(new java.awt.Color(0, 0, 0));
        heading.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setForeground(Color.WHITE);
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("WELCOME TO WORLD OF  DATA SECURITY");
        getContentPane().add(heading);
        heading.setBounds(-20, 0, 510, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Abhishek\\Pictures\\MAIN.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(710, 400));
        jLabel2.setMinimumSize(new java.awt.Dimension(710, 400));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-300, 0, 1000, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_encryptButtonActionPerformed
    {//GEN-HEADEREND:event_encryptButtonActionPerformed
        FileChooser fileChooser = new FileChooser("ENCRYPT");
        fileChooser.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_decryptButtonActionPerformed
    {//GEN-HEADEREND:event_decryptButtonActionPerformed
        FileChooser fileChooser = new FileChooser("DECRYPT");
        fileChooser.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void cloud_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cloud_btnActionPerformed
                  try { 
        String url = "https://www.dropbox.com";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
    } catch (java.io.IOException e) {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_cloud_btnActionPerformed

   /* public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main(true).setVisible(true);
            }
        });
    }
   */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private javax.swing.JButton cloud_btn;
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
