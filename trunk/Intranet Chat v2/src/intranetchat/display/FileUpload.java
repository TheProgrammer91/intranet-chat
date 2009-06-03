/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileUpload.java
 *
 * Created on 30-May-2009, 12:02:26
 */

package intranetchat.display;

import intranetchat.core.UserCollection;
import intranetchat.core.Users;
import intranetchat.saving.SavedValues;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Philip
 */
public class FileUpload extends javax.swing.JDialog {
    byte[] trans;

    /** Creates new form FileUpload */
    public FileUpload(java.awt.Frame parent, boolean modal, String userID) {
        super(parent, modal);
        //Starts the JFileChooser so a file can be selected
        JFileChooser chooser  = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if(!(returnVal == JFileChooser.APPROVE_OPTION)) {
            this.dispose();
        }

        File f = chooser.getSelectedFile();
        UserCollection users = UserCollection.getInstance();
        SavedValues values = SavedValues.getInstance();

        Users u = users.getUser(userID);
        //Determines whether or not the destination program is the of the valid version
        if(u.getIpAddress().length() > 15){
            JOptionPane.showMessageDialog(this,"Destination version not compatible", "ERROR",JOptionPane.WARNING_MESSAGE);
        }
        initComponents();
        details.setText("Waiting for other user to accept...");
        localID.setText(values.networkName);
        destID.setText(u.getUsername());
        filename.setText(f.getName());
        this.setVisible(true);
        this.startNetworkTransfer(f,u.getIpAddress());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        localID = new javax.swing.JLabel();
        destID = new javax.swing.JLabel();
        filename = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        details = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Source Location :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 3, 3);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Destination Location :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 2);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Filename :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 3);
        jPanel1.add(jLabel3, gridBagConstraints);

        localID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        localID.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(localID, gridBagConstraints);

        destID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        destID.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(destID, gridBagConstraints);

        filename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        filename.setText("jLabel6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(filename, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jPanel1.add(progress, gridBagConstraints);

        jButton1.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        details.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        details.setText("jLabel4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 0);
        jPanel1.add(details, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 4, 4);
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel destID;
    private javax.swing.JLabel details;
    private javax.swing.JLabel filename;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel localID;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables

    private void startNetworkTransfer(File file,String networkAddress){
        try {
            Socket fileTransfer = new Socket(networkAddress, 4000);
            byte[] trans = new byte[(int)file.length()];
            InputStream is = fileTransfer.getInputStream();
            FileOutputStream fs = new FileOutputStream(file);
            BufferedOutputStream bs = new BufferedOutputStream(fs);
            int bytesRead = 0;
            while(bytesRead < (int)file.length()){
                
            }

        } catch (UnknownHostException ex) {

        } catch (IOException ex) {

        }
    }
}
