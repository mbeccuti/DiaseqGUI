/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4seqgui;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import pkg4seqgui.MainFrame.MyTask;
import static pkg4seqgui.MainFrame.contextMenu;

/**
 *
 * @author user
 */
public class IndexingStarRSEM extends javax.swing.JPanel {

    /**
     * Creates new form IndexingStarRSEM
     */
    public IndexingStarRSEM() {
        initComponents();
        contextMenu.add(iThreadText);
        contextMenu.add(iGenomeURLText);
        contextMenu.add(iGTFURLText);
    }
    private static final long serialVersionUID = 57752123321L;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        IExecutionStarRSEM = new javax.swing.ButtonGroup();
        IndexingStarRSEMPanel = new javax.swing.JPanel();
        iCloseButton = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        iResetButton = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        iGenomeFolderText = new javax.swing.JTextField();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jLabel30 = new javax.swing.JLabel();
        iGenomeURLText = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        iGTFURLText = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        iSudoRadioButton = new javax.swing.JRadioButton();
        iDockerRadioButton = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        iThreadText = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        IndexingStarRSEMPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(30, 1, 1, 1), "Genome indexing STAR-RSEM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        IndexingStarRSEMPanel.setToolTipText(null);
        IndexingStarRSEMPanel.setLayout(new java.awt.GridBagLayout());

        iCloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/close.png"))); // NOI18N
        iCloseButton.setText("Close");
        iCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCloseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        IndexingStarRSEMPanel.add(iCloseButton, gridBagConstraints);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/exec.png"))); // NOI18N
        jButton12.setText("Execute");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        IndexingStarRSEMPanel.add(jButton12, gridBagConstraints);

        iResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/reset.png"))); // NOI18N
        iResetButton.setText("Reset");
        iResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iResetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        IndexingStarRSEMPanel.add(iResetButton, gridBagConstraints);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/86b.png"))); // NOI18N
        jButton14.setText("Save conf.");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        IndexingStarRSEMPanel.add(jButton14, gridBagConstraints);

        jPanel13.setBackground(new java.awt.Color(248, 248, 248));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel13.setToolTipText(null);
        jPanel13.setLayout(new java.awt.GridBagLayout());

        jLabel28.setText("Genome  folder:");
        jLabel28.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(jLabel28, gridBagConstraints);

        iGenomeFolderText.setEditable(false);
        iGenomeFolderText.setToolTipText("The folder that will contain the indexed genome.");
        iGenomeFolderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iGenomeFolderTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(iGenomeFolderText, gridBagConstraints);

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/52b.png"))); // NOI18N
        jToggleButton15.setText("Browse");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(jToggleButton15, gridBagConstraints);

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/33b.png"))); // NOI18N
        jToggleButton16.setText("Cancel");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(jToggleButton16, gridBagConstraints);

        jLabel30.setText("Genome url:");
        jLabel30.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(jLabel30, gridBagConstraints);

        iGenomeURLText.setToolTipText("The URL which will be used to download the genome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(iGenomeURLText, gridBagConstraints);

        jLabel33.setText("GTF url:");
        jLabel33.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(jLabel33, gridBagConstraints);

        iGTFURLText.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel13.add(iGTFURLText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        IndexingStarRSEMPanel.add(jPanel13, gridBagConstraints);

        jPanel14.setBackground(new java.awt.Color(248, 248, 248));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel14.setToolTipText(null);
        jPanel14.setLayout(new java.awt.GridBagLayout());

        jLabel31.setText("Execution:");
        jLabel31.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel14.add(jLabel31, gridBagConstraints);

        iSudoRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        IExecutionStarRSEM.add(iSudoRadioButton);
        iSudoRadioButton.setText("sudo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel14.add(iSudoRadioButton, gridBagConstraints);

        iDockerRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        IExecutionStarRSEM.add(iDockerRadioButton);
        iDockerRadioButton.setSelected(true);
        iDockerRadioButton.setText("docker");
        iDockerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iDockerRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel14.add(iDockerRadioButton, gridBagConstraints);

        jLabel32.setText("Thread number:");
        jLabel32.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel14.add(jLabel32, gridBagConstraints);

        iThreadText.setText("8");
        iThreadText.setToolTipText("The number of threads which will be used during the computation.");
        iThreadText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                iThreadTextFocusLost(evt);
            }
        });
        iThreadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iThreadTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel14.add(iThreadText, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        IndexingStarRSEMPanel.add(jPanel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        add(IndexingStarRSEMPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void iCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCloseButtonActionPerformed
        iDockerRadioButton.setSelected(true);
        iGenomeFolderText.setText("");
        iThreadText.setText(Integer.toString(MainFrame.GS.getDefaultThread()));
        iGenomeURLText.setText("");
        iGTFURLText.setText("");
        //RESET FIELDS
        CardLayout card = (CardLayout)MainFrame.MainPanel.getLayout();
        card.show(MainFrame.MainPanel, "Empty");
        MainFrame.CurrentLayout="Empty";
        //        AnalysisTree.clearSelection();
    }//GEN-LAST:event_iCloseButtonActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (iGenomeFolderText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have to specified an Genome folder","Error: Genome folder",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        if (iGenomeURLText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have to specified an Genome URL ","Error: Genome URL",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        if (iGTFURLText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have to specified an GTF URL ","Error: GTF URL",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        if (iThreadText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have to specified the number of threads that will be used.","Error: Thread  number",JOptionPane.ERROR_MESSAGE);
            iThreadText.requestFocusInWindow();
            return;
        }
        try
        {
            Integer x = Integer.valueOf(iThreadText.getText());
            if (x<=0){
                JOptionPane.showMessageDialog(this, "You have to specified a value greater than 0.","Error: Thread  number",JOptionPane.ERROR_MESSAGE);
                iThreadText.requestFocusInWindow();
                return;
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You have to specified the number of threads that will be used.","Error: Thread  number",JOptionPane.ERROR_MESSAGE);
            iThreadText.requestFocusInWindow();
            return;
        }

        //execute code
        Runtime rt = Runtime.getRuntime();
        try{
            String[] cmd = {"/bin/bash","-c"," bash ./execIndexingSTAR.sh "};
            if (iSudoRadioButton.isSelected()){
                cmd[2]+= "group=\\\"sudo\\\"";
            }
            else{
                cmd[2]+= "group=\\\"docker\\\"";
            }
            cmd[2]+= " genome.folder=\\\""+iGenomeFolderText.getText()+"\\\" ensembl.urlgenome=\\\""+iGenomeURLText.getText()+"\\\" ensembl.urlgtf=\\\""+iGTFURLText.getText()+"\\\"";
            cmd[2]+= " threads="+iThreadText.getText()+ " "+iGenomeFolderText.getText() + " >& "+iGenomeFolderText.getText()+"/outputExecution ";
            //ProcessStatus.setText(pr.toString());
            if (MainFrame.listProcRunning.size()<MainFrame.GS.getMaxSizelistProcRunning()){
                Process pr = rt.exec(cmd);
                System.out.println("Runing PID:"+ MainFrame.getPidOfProcess(pr)+"\n");

                MainFrame.ElProcRunning tmp= new MainFrame.ElProcRunning("Genome indexing STAR-RSEM ", iGenomeFolderText.getText(),pr,MainFrame.listModel.getSize());
                MainFrame.listProcRunning.add(tmp);
                java.net.URL imgURL = getClass().getResource("/pkg4seqgui/images/running.png");
                ImageIcon image2 = new ImageIcon(imgURL);
                MainFrame.GL.setAvoidProcListValueChanged(-1);
                MainFrame.listModel.addElement(new MainFrame.ListEntry(" [Running]   "+tmp.toString(),"Running",tmp.path, image2 ));
                MainFrame.GL.setAvoidProcListValueChanged(0);
                if(MainFrame.listProcRunning.size()==1){
                    MainFrame.t=new Timer();
                    MainFrame.t.scheduleAtFixedRate(new MyTask(), 5000, 5000);
                }
            }
            else{
                MainFrame.ElProcWaiting tmp= new MainFrame.ElProcWaiting("Genome indexing STAR-RSEM ",iGenomeFolderText.getText(),cmd,MainFrame.listModel.getSize());
                MainFrame.listProcWaiting.add(tmp);
                java.net.URL imgURL = getClass().getResource("/pkg4seqgui/images/waiting.png");
                ImageIcon image2 = new ImageIcon(imgURL);
                MainFrame.GL.setAvoidProcListValueChanged(-1);
                MainFrame.listModel.addElement(new MainFrame.ListEntry(" [Waiting]   "+tmp.toString(),"Waiting",tmp.path,image2));
                MainFrame.GL.setAvoidProcListValueChanged(0);
            }
            MainFrame.GL.setAvoidProcListValueChanged(-1);
            MainFrame.ProcList.setModel(MainFrame.listModel);
            MainFrame.ProcList.setCellRenderer(new MainFrame.ListEntryCellRenderer());
            MainFrame.GL.setAvoidProcListValueChanged(0);
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(this, e.toString(),"Error execution",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        }

        JOptionPane.showMessageDialog(this, "Genome indexing STAR-RSEM task was scheduled","Confermation",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void iResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iResetButtonActionPerformed
        iDockerRadioButton.setSelected(true);
        iGenomeFolderText.setText("");
        iThreadText.setText(Integer.toString(MainFrame.GS.getDefaultThread()));
        iGenomeURLText.setText("");
        iGTFURLText.setText("");

    }//GEN-LAST:event_iResetButtonActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        //saveAsMenuItemActionPerformed(evt);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void iGenomeFolderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iGenomeFolderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iGenomeFolderTextActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        JFileChooser openDir = new JFileChooser();
        if (!(iGenomeFolderText.getText().equals(""))){
            File file =new File(iGenomeFolderText.getText());
            if (file.isDirectory())
            openDir.setCurrentDirectory(file);
        }
        else
        {
            String curDir = MainFrame.getPreferences().get("open-dir", null);
            openDir.setCurrentDirectory(curDir!=null ? new File(curDir) : null);
        }
        openDir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (openDir.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File f = openDir.getSelectedFile();
            iGenomeFolderText.setText(String.valueOf(f));
        }
        MainFrame.getPreferences().put("open-dir",openDir.getCurrentDirectory().getAbsolutePath());
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        iGenomeFolderText.setText("");
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void iDockerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iDockerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iDockerRadioButtonActionPerformed

    private void iThreadTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iThreadTextFocusLost
        if (iThreadText.getText().isEmpty())
        return;
        iThreadText.setForeground(Color.black);
        try
        {
            Integer x = Integer.valueOf(iThreadText.getText());
            if (x<=0){
                iThreadText.setForeground(Color.red);
            }
        }
        catch (NumberFormatException e) {
            iThreadText.setForeground(Color.red);
            iThreadText.setText("");
            //return;
        }    // TODO add your handling code here:
    }//GEN-LAST:event_iThreadTextFocusLost

    private void iThreadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iThreadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iThreadTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup IExecutionStarRSEM;
    private javax.swing.JPanel IndexingStarRSEMPanel;
    private javax.swing.JButton iCloseButton;
    public static javax.swing.JRadioButton iDockerRadioButton;
    private javax.swing.JTextField iGTFURLText;
    private javax.swing.JTextField iGenomeFolderText;
    private javax.swing.JTextField iGenomeURLText;
    private javax.swing.JButton iResetButton;
    public static javax.swing.JRadioButton iSudoRadioButton;
    public static javax.swing.JTextField iThreadText;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    // End of variables declaration//GEN-END:variables
}
