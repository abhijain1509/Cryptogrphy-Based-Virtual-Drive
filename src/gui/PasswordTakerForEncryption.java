package gui;

import core.EncryptorAndDecryptor;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class PasswordTakerForEncryption extends javax.swing.JFrame
{
    private File[] listOfFilesAndFolders;
    public PasswordTakerForEncryption(File[] listOfFilesAndFolders)
    {
        this.listOfFilesAndFolders = listOfFilesAndFolders;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ToBeEncryptedOrDecrypted.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        initComponents();
        setResizable(false);
        eightCharInstructionLabel.setVisible(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getRootPane().setDefaultButton(proceedButton);
        
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JFrame frame = (JFrame)e.getSource();
                Toolkit.getDefaultToolkit().beep();
                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION)
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    
    boolean verifyPasswords()
    {
        char password1[]=passwordField1.getPassword();
        char password2[]=passwordField2.getPassword();
        if(password1.length<8)
        {
            eightCharInstructionLabel.setText("PASSWORD MUST BE OF ATLEAST 8 CHARACTERS!!!");
            eightCharInstructionLabel.setVisible(true);
            return false;
        }
        if(password1.length>7)
        {
            eightCharInstructionLabel.setVisible(false);
            if(password1.length==password2.length)
            {
                eightCharInstructionLabel.setVisible(false);
                if(Arrays.equals(password1, password2))
                {
                    return true;
                }

            }
            eightCharInstructionLabel.setText("PASSWORD NOT MATCHING!!!");
            eightCharInstructionLabel.setVisible(true);
        }
        
        return false;
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        proceedButton = new javax.swing.JButton();
        eightCharInstructionLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENTER PASSWORD FOR ENCRYPTION");
        setMinimumSize(new java.awt.Dimension(920, 255));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter a password:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 31, 150, 17);

        passwordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordField1KeyReleased(evt);
            }
        });
        getContentPane().add(passwordField1);
        passwordField1.setBounds(6, 51, 500, 28);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Re-enter the password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 120, 190, 17);

        passwordField2.setToolTipText("");
        passwordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordField2KeyReleased(evt);
            }
        });
        getContentPane().add(passwordField2);
        passwordField2.setBounds(0, 140, 520, 28);

        proceedButton.setBackground(new java.awt.Color(0, 0, 0));
        proceedButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        proceedButton.setForeground(new java.awt.Color(255, 255, 255));
        proceedButton.setText("PROCEED");
        proceedButton.setEnabled(false);
        proceedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedButtonActionPerformed(evt);
            }
        });
        getContentPane().add(proceedButton);
        proceedButton.setBounds(44, 190, 80, 28);

        eightCharInstructionLabel.setForeground(new java.awt.Color(255, 0, 0));
        eightCharInstructionLabel.setText("For security reasons you must enter password of atleast 8 characters");
        eightCharInstructionLabel.setFocusable(false);
        getContentPane().add(eightCharInstructionLabel);
        eightCharInstructionLabel.setBounds(6, 145, 378, 16);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER PASSWORD FOR ENCRYPTION");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 10, 380, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Abhishek\\Pictures\\REGISTRATION2.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-100, 0, 1020, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordField2KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_passwordField2KeyReleased
    {//GEN-HEADEREND:event_passwordField2KeyReleased
        if(verifyPasswords())
        {
            proceedButton.setEnabled(true);
        }
        else
        {
            proceedButton.setEnabled(false);
        }
    }//GEN-LAST:event_passwordField2KeyReleased

    private void passwordField1KeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_passwordField1KeyReleased
    {//GEN-HEADEREND:event_passwordField1KeyReleased
        if(verifyPasswords())
        {
            proceedButton.setEnabled(true);
        }
        else
        {
            proceedButton.setEnabled(false);
        }
    }//GEN-LAST:event_passwordField1KeyReleased

    private void proceedButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_proceedButtonActionPerformed
    {//GEN-HEADEREND:event_proceedButtonActionPerformed
        setVisible(false);
        dispose();
        
        new EncryptorAndDecryptor(listOfFilesAndFolders, "encrypt", new String(passwordField1.getPassword())).execute();
        
    }//GEN-LAST:event_proceedButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eightCharInstructionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JButton proceedButton;
    // End of variables declaration//GEN-END:variables
}
