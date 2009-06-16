/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Preference.java
 *
 * Created on 23-May-2009, 17:18:59
 */

package intranetchat.display;

import intranetchat.saving.SavedValues;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

/**
 *
 * @author Philip
 */
public class Preference extends javax.swing.JDialog {
    SavedValues values;

    /** Creates new form Preference */
    public Preference(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        values = SavedValues.getInstance();
        this.setLocation(values.x+50, values.y+50);
        initComponents();
        fontCombo.setRenderer(new FontComboRenderer());
        typeCombo.setRenderer(new FontComboRenderer());
        sizeCombo.setRenderer(new FontComboRenderer());
        collectData();
        this.getSavedData();
        this.setVisible(true);
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
        username = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        privateLog = new javax.swing.JCheckBox();
        publicLog = new javax.swing.JCheckBox();
        encrypted = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fontCombo = new javax.swing.JComboBox();
        typeCombo = new javax.swing.JComboBox();
        sizeCombo = new javax.swing.JComboBox();
        fontColour = new javax.swing.JButton();
        backColour = new javax.swing.JButton();
        bColorPanel = new javax.swing.JPanel();
        fColorPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        sysColorPanel = new javax.swing.JPanel();
        sysColour = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lfCombo = new javax.swing.JComboBox();
        sOnline = new javax.swing.JCheckBox();
        sMessage = new javax.swing.JCheckBox();
        autoAccept = new javax.swing.JCheckBox();
        savedLoc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preference");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 70));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Username :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabel1, gridBagConstraints);

        username.setPreferredSize(new java.awt.Dimension(300, 27));
        jPanel1.add(username, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Networking"));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 140));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Comm Port :");
        jPanel2.add(jLabel2, new java.awt.GridBagConstraints());

        privateLog.setText("Log private chat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(privateLog, gridBagConstraints);

        publicLog.setText("Log public chat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(publicLog, gridBagConstraints);

        encrypted.setText("Encrypt private chat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(encrypted, gridBagConstraints);

        jTextField1.setPreferredSize(new java.awt.Dimension(280, 27));
        jPanel2.add(jTextField1, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Font"));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 210));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Font Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Font Type :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Font Size :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Font Colour :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Background Colour :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel3.add(jLabel7, gridBagConstraints);

        fontCombo.setOpaque(false);
        fontCombo.setPreferredSize(new java.awt.Dimension(240, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        jPanel3.add(fontCombo, gridBagConstraints);

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plain", "Bold", "Italic" }));
        typeCombo.setPreferredSize(new java.awt.Dimension(240, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        jPanel3.add(typeCombo, gridBagConstraints);

        sizeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        sizeCombo.setPreferredSize(new java.awt.Dimension(240, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 0);
        jPanel3.add(sizeCombo, gridBagConstraints);

        fontColour.setText("Select Colour");
        fontColour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fontColourMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(fontColour, gridBagConstraints);

        backColour.setText("Select Colour");
        backColour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backColourMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(backColour, gridBagConstraints);

        bColorPanel.setPreferredSize(new java.awt.Dimension(100, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(bColorPanel, gridBagConstraints);

        fColorPanel.setPreferredSize(new java.awt.Dimension(100, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(fColorPanel, gridBagConstraints);

        jLabel9.setText("System Colour : ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel3.add(jLabel9, gridBagConstraints);

        sysColorPanel.setPreferredSize(new java.awt.Dimension(100, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel3.add(sysColorPanel, gridBagConstraints);

        sysColour.setText("Select Colour");
        sysColour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sysColourMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(sysColour, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jPanel3, gridBagConstraints);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Others"));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 190));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel8.setText("Program Look and Feel :");
        jPanel4.add(jLabel8, new java.awt.GridBagConstraints());

        lfCombo.setPreferredSize(new java.awt.Dimension(230, 27));
        jPanel4.add(lfCombo, new java.awt.GridBagConstraints());

        sOnline.setText("Alert when a user appears online");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(sOnline, gridBagConstraints);

        sMessage.setText("Alert when a new message appears");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel4.add(sMessage, gridBagConstraints);

        autoAccept.setText("Auto Accept Downloads");
        autoAccept.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                autoAcceptStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel4.add(autoAccept, gridBagConstraints);

        savedLoc.setPreferredSize(new java.awt.Dimension(250, 27));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jPanel4.add(savedLoc, gridBagConstraints);

        jButton3.setText("Browse");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel4.add(jButton3, gridBagConstraints);

        jLabel10.setText("Saved File Location :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel4.add(jLabel10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(jPanel4, gridBagConstraints);

        jButton1.setText("Ok");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Cancel");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 4, 3, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        this.dispose();
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        //send setting to saving class and updating
        this.saveData();
        values.ValuesChanged();
        this.dispose();
    }//GEN-LAST:event_jButton1MouseReleased

    private void fontColourMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fontColourMouseReleased
        Color fColor = JColorChooser.showDialog(this,"Choose Font Color",getBackground());
        if(fColor != null){
            fColorPanel.setBackground(fColor);
        }
}//GEN-LAST:event_fontColourMouseReleased

    private void backColourMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backColourMouseReleased
        Color bColor = JColorChooser.showDialog(this,"Choose Background Color",getBackground());
        if(bColor != null){
            bColorPanel.setBackground(bColor);
        }
}//GEN-LAST:event_backColourMouseReleased

    private void sysColourMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sysColourMousePressed
        Color sysColor = JColorChooser.showDialog(this,"Choose System Color",getBackground());
        if(sysColor != null){
            sysColorPanel.setBackground(sysColor);
        }
    }//GEN-LAST:event_sysColourMousePressed

    private void autoAcceptStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_autoAcceptStateChanged
        
    }//GEN-LAST:event_autoAcceptStateChanged

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = chooser.showOpenDialog(this);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            savedLoc.setText(f.getAbsolutePath()+"/");
        }

    }//GEN-LAST:event_jButton3MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoAccept;
    private javax.swing.JPanel bColorPanel;
    private javax.swing.JButton backColour;
    private javax.swing.JCheckBox encrypted;
    private javax.swing.JPanel fColorPanel;
    private javax.swing.JButton fontColour;
    private javax.swing.JComboBox fontCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox lfCombo;
    private javax.swing.JCheckBox privateLog;
    private javax.swing.JCheckBox publicLog;
    private javax.swing.JCheckBox sMessage;
    private javax.swing.JCheckBox sOnline;
    private javax.swing.JTextField savedLoc;
    private javax.swing.JComboBox sizeCombo;
    private javax.swing.JPanel sysColorPanel;
    private javax.swing.JButton sysColour;
    private javax.swing.JComboBox typeCombo;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void getSavedData(){
        username.setText(values.networkName);
        jTextField1.setText(values.port+"");
        privateLog.setSelected(values.privateLog);
        publicLog.setSelected(values.publicLog);
        encrypted.setSelected(values.encrypted);
        sOnline.setSelected(values.soundEntrance);
        sMessage.setSelected(values.soundMessage);
        fColorPanel.setBackground(values.foreGround);
        bColorPanel.setBackground(values.background);
        sysColorPanel.setBackground(values.systemColour);
        fontCombo.setSelectedItem(values.font.getName());
        sizeCombo.setSelectedItem(values.font.getSize()+"");
        if(values.font.isPlain()){
            typeCombo.setSelectedIndex(0);
        }else if(values.font.isBold()){
            typeCombo.setSelectedIndex(1);
        }else if(values.font.isItalic()){
            typeCombo.setSelectedIndex(2);
        }
        autoAccept.setSelected(values.autoAccept);
        savedLoc.setText(values.savedLocation);

        this.pack();


    }

    private void saveData(){
        values.networkName = username.getText();
        values.port = Integer.parseInt(jTextField1.getText());
        values.privateLog = privateLog.isSelected();
        values.publicLog = publicLog.isSelected();
        values.encrypted = encrypted.isSelected();
        values.soundEntrance = sOnline.isSelected();
        values.soundMessage = sMessage.isSelected();
        values.foreGround = fColorPanel.getBackground();
        values.background = bColorPanel.getBackground();
        values.systemColour = sysColorPanel.getBackground();
        values.landf = (String)lfCombo.getSelectedItem();
        values.font = Font.decode(fontCombo.getSelectedItem()+"-"+typeCombo.getSelectedItem()+"-"+sizeCombo.getSelectedItem());
        values.autoAccept = autoAccept.isSelected();
        values.savedLocation = savedLoc.getText();
    }

    private void collectData(){
        //font families
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] array = e.getAvailableFontFamilyNames();
        for(int i=0;i < array.length;i++){
            fontCombo.addItem(array[i]);
        }

        //Look and Feel
        UIManager.LookAndFeelInfo plaf[] = UIManager.getInstalledLookAndFeels();
        for (int i = 0, n = plaf.length; i < n; i++) {
            lfCombo.addItem(plaf[i].getName());
            if(plaf[i].getName().compareTo(values.landf)==0){
                lfCombo.setSelectedIndex(i);
            }
        }
    }
}
