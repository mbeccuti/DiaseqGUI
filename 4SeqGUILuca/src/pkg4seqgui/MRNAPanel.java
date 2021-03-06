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
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import pkg4seqgui.MainFrame.MyTask;
/**
 *
 * @author user
 */
public class MRNAPanel extends javax.swing.JPanel {

    /**
     * Creates new form MRNAPanel
     */
    public MRNAPanel() {
        initComponents();

        
    }

    private static final long serialVersionUID = 57756111321L;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mAdapter = new javax.swing.ButtonGroup();
        mExecution = new javax.swing.ButtonGroup();
        mDownload = new javax.swing.ButtonGroup();
        mTrimmed = new javax.swing.ButtonGroup();
        mRNAPanel = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        vCloseButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        mmiRBaseText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mDTrueRadioButton = new javax.swing.JRadioButton();
        mDFalseRadioButton = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        mANEBRadioButton = new javax.swing.JRadioButton();
        mAILLUMINARadioButton = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        mTTrueRadioButton = new javax.swing.JRadioButton();
        mTFalseRadioButton = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        mFastQFolderText = new javax.swing.JTextField();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        mOutputFolderText = new javax.swing.JTextField();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        mSudoRadioButton = new javax.swing.JRadioButton();
        mDockerRadioButton = new javax.swing.JRadioButton();

        setLayout(new java.awt.GridBagLayout());

        mRNAPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(30, 1, 1, 1), "miRNA counting", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(141, 38, 56))); // NOI18N
        mRNAPanel.setLayout(new java.awt.GridBagLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/exec.png"))); // NOI18N
        jButton6.setText("Execute");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        mRNAPanel.add(jButton6, gridBagConstraints);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/86b.png"))); // NOI18N
        jButton8.setText("Save conf.");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        mRNAPanel.add(jButton8, gridBagConstraints);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/reset.png"))); // NOI18N
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        mRNAPanel.add(jButton7, gridBagConstraints);

        vCloseButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/close.png"))); // NOI18N
        vCloseButton1.setText("Close");
        vCloseButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vCloseButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        mRNAPanel.add(vCloseButton1, gridBagConstraints);

        jPanel9.setBackground(new java.awt.Color(248, 248, 248));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jLabel17.setText("miRBase organism:");
        jLabel17.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(jLabel17, gridBagConstraints);

        mmiRBaseText.setText("hsa");
        mmiRBaseText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mmiRBaseTextFocusLost(evt);
            }
        });
        mmiRBaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiRBaseTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(mmiRBaseText, gridBagConstraints);

        jLabel20.setText("mirBase donwload: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(jLabel20, gridBagConstraints);

        mDTrueRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mDownload.add(mDTrueRadioButton);
        mDTrueRadioButton.setText("True");
        mDTrueRadioButton.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(mDTrueRadioButton, gridBagConstraints);

        mDFalseRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mDownload.add(mDFalseRadioButton);
        mDFalseRadioButton.setText("False");
        mDFalseRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDFalseRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(mDFalseRadioButton, gridBagConstraints);

        jLabel23.setText("Adapter type:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(jLabel23, gridBagConstraints);

        mANEBRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mAdapter.add(mANEBRadioButton);
        mANEBRadioButton.setText("NEB");
        mANEBRadioButton.setToolTipText("");
        mANEBRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mANEBRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(mANEBRadioButton, gridBagConstraints);

        mAILLUMINARadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mAdapter.add(mAILLUMINARadioButton);
        mAILLUMINARadioButton.setText("ILLUMINA");
        mAILLUMINARadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAILLUMINARadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(mAILLUMINARadioButton, gridBagConstraints);

        jLabel25.setText("Save trimmed Fastq:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(jLabel25, gridBagConstraints);

        mTTrueRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mTrimmed.add(mTTrueRadioButton);
        mTTrueRadioButton.setText("True");
        mTTrueRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTTrueRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(mTTrueRadioButton, gridBagConstraints);

        mTFalseRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mTrimmed.add(mTFalseRadioButton);
        mTFalseRadioButton.setText("False");
        mTFalseRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTFalseRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel9.add(mTFalseRadioButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        mRNAPanel.add(jPanel9, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(248, 248, 248));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel15.setText("FastQ  folder:");
        jLabel15.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel8.add(jLabel15, gridBagConstraints);

        mFastQFolderText.setEditable(false);
        mFastQFolderText.setToolTipText("The folder containing the input reads");
        mFastQFolderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFastQFolderTextActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 10);
        jPanel8.add(mFastQFolderText, gridBagConstraints);

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/52b.png"))); // NOI18N
        jToggleButton8.setText("Browse");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel8.add(jToggleButton8, gridBagConstraints);

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/33b.png"))); // NOI18N
        jToggleButton7.setText("Cancel");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel8.add(jToggleButton7, gridBagConstraints);

        mOutputFolderText.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 10);
        jPanel8.add(mOutputFolderText, gridBagConstraints);

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/33b.png"))); // NOI18N
        jToggleButton9.setText("Cancel");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel8.add(jToggleButton9, gridBagConstraints);

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg4seqgui/images/52b.png"))); // NOI18N
        jToggleButton10.setText("Browse");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_TRAILING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel8.add(jToggleButton10, gridBagConstraints);

        jLabel16.setText("Scratch folder:");
        jLabel16.setToolTipText("This folder will be mounted in the docker container");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel8.add(jLabel16, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        mRNAPanel.add(jPanel8, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(248, 248, 248));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jLabel14.setText("Execution:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel7.add(jLabel14, gridBagConstraints);

        mSudoRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mExecution.add(mSudoRadioButton);
        mSudoRadioButton.setText("sudo");
        mSudoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSudoRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(10, 85, 10, 10);
        jPanel7.add(mSudoRadioButton, gridBagConstraints);

        mDockerRadioButton.setBackground(new java.awt.Color(248, 248, 248));
        mExecution.add(mDockerRadioButton);
        mDockerRadioButton.setText("docker");
        mDockerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDockerRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE_LEADING;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel7.add(mDockerRadioButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        mRNAPanel.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(mRNAPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (mFastQFolderText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have to specified an input folder","Error: FastQ  folder",JOptionPane.ERROR_MESSAGE);
            //mFastQFolderText.requestFocusInWindow();
            //return;
        }
        else
        if (mOutputFolderText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "You have to specified an output folder","Error: Output folder",JOptionPane.ERROR_MESSAGE);
            //mOutputFolderText.requestFocusInWindow();
            //return;
        }
        else
        if (!MainFrame.miRBase.matcher(mmiRBaseText.getText()).matches()){
            JOptionPane.showMessageDialog(this, "The specified miRBase  id is not valid.","Error: miRBase",JOptionPane.ERROR_MESSAGE);
            mmiRBaseText.requestFocusInWindow();
        }
        else
        {
            //execute code
            Runtime rt = Runtime.getRuntime();
            try{
                String[] cmd = {"/bin/bash","-c"," bash ./execmirna.sh "};
                if (mSudoRadioButton.isSelected()){
                    cmd[2]+= "group=\\\"sudo\\\"";
                }
                else{
                    cmd[2]+= "group=\\\"docker\\\"";
                }
                cmd[2]+= " fastq.folder=\\\""+mFastQFolderText.getText()+"\\\" scratch.folder=\\\""+mOutputFolderText.getText()+"\\\" mirbase.id=\\\""+mmiRBaseText.getText()+"\\\"";
                if (mDTrueRadioButton.isSelected()){
                    cmd[2]+= " download.status=TRUE";
                }
                else{
                    cmd[2]+= " download.status=FALSE";
                }
                if (mANEBRadioButton.isSelected())
                cmd[2]+= " adapter.type=\\\"NEB\\\"";
                else
                cmd[2]+= " adapter.type=\\\"ILLUMINA\\\"";
                if (mTTrueRadioButton.isSelected())
                cmd[2]+= " trimmed.fastq=TRUE";
                else
                cmd[2]+= " trimmed.fastq=FALSE";

                cmd[2]+=" "+mFastQFolderText.getText() +" >& "+mFastQFolderText.getText()+"/outputExecution ";

                if (MainFrame.listProcRunning.size()<MainFrame.GS.getMaxSizelistProcRunning()){
                    Process pr = rt.exec(cmd);
                    MainFrame.ElProcRunning tmp= new MainFrame.ElProcRunning("miRNA counting ", mFastQFolderText.getText(),pr,MainFrame.listModel.getSize());
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
                    MainFrame.ElProcWaiting tmp= new MainFrame.ElProcWaiting("miRNA counting", mFastQFolderText.getText(),cmd,MainFrame.listModel.getSize());
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
            JOptionPane.showMessageDialog(this, "miRNA counting task was scheduled","Confermation",JOptionPane.INFORMATION_MESSAGE);
        }
        //execute code
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //saveAsMenuItemActionPerformed(evt);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        mDockerRadioButton.setSelected(true);
        mFastQFolderText.setText("");
        mOutputFolderText.setText("");
        mmiRBaseText.setText("hsa");
        mDFalseRadioButton.setSelected(true);
        mAILLUMINARadioButton.setSelected(true);
        mTFalseRadioButton.setSelected(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void vCloseButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vCloseButton1ActionPerformed
        mDockerRadioButton.setSelected(true);
        mFastQFolderText.setText("");
        mOutputFolderText.setText("");
        mmiRBaseText.setText("hsa");
        mDFalseRadioButton.setSelected(true);
        mAILLUMINARadioButton.setSelected(true);
        mTFalseRadioButton.setSelected(true);
        //RESET FIELDS
        CardLayout card = (CardLayout)MainFrame.MainPanel.getLayout();
        card.show(MainFrame.MainPanel, "Empty");
        MainFrame.CurrentLayout="Empty";
        //        AnalysisTree.clearSelection();
    }//GEN-LAST:event_vCloseButton1ActionPerformed

    private void mmiRBaseTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mmiRBaseTextFocusLost
        if (mmiRBaseText.getText().isEmpty())
        return;
        mmiRBaseText.setForeground(Color.black);
        if (!MainFrame.miRBase.matcher(mmiRBaseText.getText()).matches()){
            mmiRBaseText.setForeground(Color.red);
            
        }
    }//GEN-LAST:event_mmiRBaseTextFocusLost

    private void mmiRBaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiRBaseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmiRBaseTextActionPerformed

    private void mDFalseRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDFalseRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mDFalseRadioButtonActionPerformed

    private void mANEBRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mANEBRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mANEBRadioButtonActionPerformed

    private void mAILLUMINARadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAILLUMINARadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mAILLUMINARadioButtonActionPerformed

    private void mTTrueRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTTrueRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTTrueRadioButtonActionPerformed

    private void mTFalseRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTFalseRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mTFalseRadioButtonActionPerformed

    private void mFastQFolderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFastQFolderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mFastQFolderTextActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        JFileChooser openDir = new JFileChooser();
        if (!(mFastQFolderText.getText().equals(""))){
            File file =new File(mFastQFolderText.getText());
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
            mFastQFolderText.setText(String.valueOf(f));
        }
        MainFrame.getPreferences().put("open-dir",openDir.getCurrentDirectory().getAbsolutePath());
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        mFastQFolderText.setText("");
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        mOutputFolderText.setText("");
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        JFileChooser openDir = new JFileChooser();
        if (!(mOutputFolderText.getText().equals(""))){
            File file =new File(mOutputFolderText.getText());
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
            mOutputFolderText.setText(String.valueOf(f));
        }
        MainFrame.getPreferences().put("open-dir",openDir.getCurrentDirectory().getAbsolutePath());
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void mSudoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSudoRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mSudoRadioButtonActionPerformed

    private void mDockerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDockerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mDockerRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    public static javax.swing.JRadioButton mAILLUMINARadioButton;
    public static javax.swing.JRadioButton mANEBRadioButton;
    private javax.swing.ButtonGroup mAdapter;
    public static javax.swing.JRadioButton mDFalseRadioButton;
    public static javax.swing.JRadioButton mDTrueRadioButton;
    public static javax.swing.JRadioButton mDockerRadioButton;
    private javax.swing.ButtonGroup mDownload;
    private javax.swing.ButtonGroup mExecution;
    public static javax.swing.JTextField mFastQFolderText;
    public static javax.swing.JTextField mOutputFolderText;
    private javax.swing.JPanel mRNAPanel;
    public static javax.swing.JRadioButton mSudoRadioButton;
    public static javax.swing.JRadioButton mTFalseRadioButton;
    public static javax.swing.JRadioButton mTTrueRadioButton;
    private javax.swing.ButtonGroup mTrimmed;
    public static javax.swing.JTextField mmiRBaseText;
    private javax.swing.JButton vCloseButton1;
    // End of variables declaration//GEN-END:variables
}
