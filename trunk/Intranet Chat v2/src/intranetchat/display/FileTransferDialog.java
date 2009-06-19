/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileTransferDialog.java
 *
 * Created on 07-Jun-2009, 21:51:09
 */

package intranetchat.display;

import intranetchat.core.FileClient;
import intranetchat.core.FileServer;
import intranetchat.saving.SavedValues;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Philip
 */
public class FileTransferDialog extends javax.swing.JDialog implements Observer{
    SavedValues values = SavedValues.getInstance();

    /** Creates new form FileTransferDialog */
    public FileTransferDialog(java.awt.Frame parent, boolean modal,Observable o) {
        super(parent, modal);
        initComponents();
        if(o instanceof FileClient){
            this.setStatus("Transfering ...");
        }
        o.addObserver(this);
        this.setLocation(values.x, values.y);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        sourceName = new javax.swing.JLabel();
        destinationName = new javax.swing.JLabel();
        fileName = new javax.swing.JLabel();
        currentStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Source Name : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Destination Name : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 3, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Filename : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 3, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Current Status : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 3, 0);
        getContentPane().add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        getContentPane().add(jProgressBar1, gridBagConstraints);

        jButton1.setText("Cancel");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 3);
        getContentPane().add(jButton1, gridBagConstraints);

        sourceName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sourceName.setText("s");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(sourceName, gridBagConstraints);

        destinationName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        destinationName.setText("d");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(destinationName, gridBagConstraints);

        fileName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fileName.setText("f");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(fileName, gridBagConstraints);

        currentStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        currentStatus.setText("Waiting for authorization");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(currentStatus, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentStatus;
    private javax.swing.JLabel destinationName;
    private javax.swing.JLabel fileName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel sourceName;
    // End of variables declaration//GEN-END:variables

    public void update(Observable o, Object arg) {
        if(o instanceof FileServer){
            FileServer fs = (FileServer)o;
            if(fs.getAuthenticated()){
                setStatus("Transfering ...");
            }
            jProgressBar1.setValue(fs.getPosition());
            if(jProgressBar1.getMaximum() == fs.getPosition()){
                setStatus("Transfer Complete !");
                currentStatus.setForeground(Color.GREEN);
            }
            

        }else if(o instanceof FileClient){
            FileClient fc = (FileClient)o;
            jProgressBar1.setValue(fc.getValues());
        }
            

    }

    public void setStatus(String status){
        currentStatus.setText(status);
    }

    public void setDisplay(String dest,String source,String filename,int size){
        destinationName.setText(dest);
        sourceName.setText(source);
        fileName.setText(filename);
        jProgressBar1.setMaximum(size);
        this.setVisible(true);
    }

}
