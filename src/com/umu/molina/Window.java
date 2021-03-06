/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umu.molina;

import java.util.ArrayList;

/**
 *
 * @author MOLINA
 */
public class Window extends javax.swing.JFrame {

    private Tester tester;

    /**
     * Creates new form Window
     */
    public Window(Tester tester) {
        initComponents();
        setLocationRelativeTo(null);
        this.tester = tester;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showDataDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDataOutput = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        step12Panel = new javax.swing.JPanel();
        DataPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        startField = new javax.swing.JFormattedTextField();
        stopField = new javax.swing.JFormattedTextField();
        repField = new javax.swing.JFormattedTextField();
        stepsField = new javax.swing.JFormattedTextField();
        AlgorithmPanel = new javax.swing.JPanel();
        CheckboxHeapsort = new javax.swing.JCheckBox();
        CheckboxSimplemergesort = new javax.swing.JCheckBox();
        CheckboxQuicksort = new javax.swing.JCheckBox();
        CheckboxHybridsort = new javax.swing.JCheckBox();
        CheckboxMergesort = new javax.swing.JCheckBox();
        CheckboxJavasort = new javax.swing.JCheckBox();
        CheckboxPMergesort = new javax.swing.JCheckBox();
        ButtonRun = new javax.swing.JButton();
        step3Panel = new javax.swing.JPanel();
        DataPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        startField2 = new javax.swing.JFormattedTextField();
        stopField2 = new javax.swing.JFormattedTextField();
        repField2 = new javax.swing.JFormattedTextField();
        stepsField2 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lowField = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        hiField = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        numField = new javax.swing.JFormattedTextField();
        RunStep3 = new javax.swing.JButton();

        showDataDialog.setTitle("Results");
        showDataDialog.setMinimumSize(new java.awt.Dimension(500, 500));

        jTextAreaDataOutput.setColumns(20);
        jTextAreaDataOutput.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDataOutput);

        javax.swing.GroupLayout showDataDialogLayout = new javax.swing.GroupLayout(showDataDialog.getContentPane());
        showDataDialog.getContentPane().setLayout(showDataDialogLayout);
        showDataDialogLayout.setHorizontalGroup(
            showDataDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDataDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        showDataDialogLayout.setVerticalGroup(
            showDataDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDataDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorting Algorithms");
        setResizable(false);

        DataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel1.setText("Start");

        jLabel2.setText("Stop");

        jLabel3.setText("Steps");

        jLabel4.setText("Repetitions");

        startField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        startField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        startField.setText("1000");
        startField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startFieldActionPerformed(evt);
            }
        });

        stopField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        stopField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        stopField.setText("2000000");
        stopField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopFieldActionPerformed(evt);
            }
        });

        repField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        repField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        repField.setText("5");
        repField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repFieldActionPerformed(evt);
            }
        });

        stepsField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        stepsField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        stepsField.setText("20");
        stepsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepsFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DataPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repField))
                    .addGroup(DataPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stepsField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DataPanelLayout.setVerticalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(stopField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stepsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(repField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AlgorithmPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Algorithms"));

        CheckboxHeapsort.setSelected(true);
        CheckboxHeapsort.setText("Heapsort");

        CheckboxSimplemergesort.setText("Simple Mergesort");
        CheckboxSimplemergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckboxSimplemergesortActionPerformed(evt);
            }
        });

        CheckboxQuicksort.setText("Quicksort");

        CheckboxHybridsort.setText("HybridSorter");
        CheckboxHybridsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckboxHybridsortActionPerformed(evt);
            }
        });

        CheckboxMergesort.setText("Mergesort");

        CheckboxJavasort.setText("Javasort");
        CheckboxJavasort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckboxJavasortActionPerformed(evt);
            }
        });

        CheckboxPMergesort.setText("Parallel Mergesort");
        CheckboxPMergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckboxPMergesortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlgorithmPanelLayout = new javax.swing.GroupLayout(AlgorithmPanel);
        AlgorithmPanel.setLayout(AlgorithmPanelLayout);
        AlgorithmPanelLayout.setHorizontalGroup(
            AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckboxHeapsort)
                    .addComponent(CheckboxSimplemergesort)
                    .addComponent(CheckboxQuicksort)
                    .addComponent(CheckboxHybridsort)
                    .addComponent(CheckboxMergesort)
                    .addComponent(CheckboxJavasort)
                    .addComponent(CheckboxPMergesort))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        AlgorithmPanelLayout.setVerticalGroup(
            AlgorithmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlgorithmPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(CheckboxHeapsort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckboxSimplemergesort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckboxQuicksort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckboxMergesort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckboxHybridsort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckboxPMergesort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckboxJavasort))
        );

        ButtonRun.setText("Run");
        ButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout step12PanelLayout = new javax.swing.GroupLayout(step12Panel);
        step12Panel.setLayout(step12PanelLayout);
        step12PanelLayout.setHorizontalGroup(
            step12PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step12PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step12PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step12PanelLayout.createSequentialGroup()
                        .addComponent(DataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AlgorithmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ButtonRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        step12PanelLayout.setVerticalGroup(
            step12PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step12PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step12PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AlgorithmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonRun, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Steps 1 & 2", step12Panel);

        DataPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel8.setText("Start");

        jLabel9.setText("Stop");

        jLabel10.setText("Steps");

        jLabel11.setText("Repetitions");

        startField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        startField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        startField2.setText("1000");
        startField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startField2ActionPerformed(evt);
            }
        });

        stopField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        stopField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        stopField2.setText("2000000");
        stopField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopField2ActionPerformed(evt);
            }
        });

        repField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        repField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        repField2.setText("5");
        repField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repField2ActionPerformed(evt);
            }
        });

        stepsField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        stepsField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        stepsField2.setText("20");
        stepsField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepsField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DataPanel1Layout = new javax.swing.GroupLayout(DataPanel1);
        DataPanel1.setLayout(DataPanel1Layout);
        DataPanel1Layout.setHorizontalGroup(
            DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DataPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repField2))
                    .addGroup(DataPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stepsField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(DataPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DataPanel1Layout.setVerticalGroup(
            DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(startField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(stopField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(stepsField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(repField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Threshold"));

        jLabel5.setText("low");

        lowField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        lowField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lowField.setText("0");
        lowField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("hi");

        hiField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        hiField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hiField.setText("2147483647");
        hiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("num");

        numField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        numField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numField.setText("10");
        numField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lowField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hiField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(numField))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                    .addComponent(lowField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                    .addComponent(hiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                    .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        RunStep3.setText("Run");
        RunStep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunStep3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout step3PanelLayout = new javax.swing.GroupLayout(step3Panel);
        step3Panel.setLayout(step3PanelLayout);
        step3PanelLayout.setHorizontalGroup(
            step3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(step3PanelLayout.createSequentialGroup()
                        .addComponent(DataPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(RunStep3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        step3PanelLayout.setVerticalGroup(
            step3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(step3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(step3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DataPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RunStep3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Step 3", step3Panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckboxSimplemergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckboxSimplemergesortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckboxSimplemergesortActionPerformed

    private void ButtonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRunActionPerformed
        try {
            int start = Integer.parseInt(startField.getText());
            int stop = Integer.parseInt(stopField.getText());
            int steps = Integer.parseInt(stepsField.getText());
            int rep = Integer.parseInt(repField.getText());
            ArrayList<Sorter> list = new ArrayList<>();
            if (CheckboxHeapsort.isSelected()) {
                list.add(new Heapsorter());
            }
            if (CheckboxSimplemergesort.isSelected()) {
                list.add(new SimpleMergesorter());
            }
            if (CheckboxQuicksort.isSelected()) {
                list.add(new Quicksorter());
            }
            if (CheckboxHybridsort.isSelected()) {
                //that's the optimal value for what I have tested!
                list.add(new Hybridsorter(100));
            }
            if (CheckboxMergesort.isSelected()) {
                list.add(new Mergesorter());
            }
            if(CheckboxPMergesort.isSelected()){
                list.add(new ParallelMergesorter());
            }
            if(CheckboxJavasort.isSelected()){
                list.add(new Javasorter());
            }

            if (!list.isEmpty()) {
                tester.setStart(start);
                tester.setStop(stop);
                tester.setSteps(steps);
                tester.setRep(rep);
                tester.setSorter(list.toArray(new Sorter[list.size()]));


                ButtonRun.setEnabled(false);
                //tester.run(); //FIRST TIME TO AVOID JUST-IN-TIME COMPILER!
                long[][] times = tester.run();
                jTextAreaDataOutput.setText(tester.printResults(times));
                showDataDialog.setVisible(true);
                ButtonRun.setEnabled(true);
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_ButtonRunActionPerformed

    private void CheckboxHybridsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckboxHybridsortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckboxHybridsortActionPerformed

    private void stepsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stepsFieldActionPerformed

    private void repFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repFieldActionPerformed

    private void stopFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopFieldActionPerformed

    private void startFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startFieldActionPerformed

    private void lowFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowFieldActionPerformed

    private void hiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hiFieldActionPerformed

    private void numFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numFieldActionPerformed

    private void startField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startField2ActionPerformed

    private void stopField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopField2ActionPerformed

    private void repField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repField2ActionPerformed

    private void stepsField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepsField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stepsField2ActionPerformed

    private void RunStep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunStep3ActionPerformed
        try {
            int start = Integer.parseInt(startField2.getText());
            int stop = Integer.parseInt(stopField2.getText());
            int steps = Integer.parseInt(stepsField2.getText());
            int rep = Integer.parseInt(repField2.getText());
            int low = Integer.parseInt(lowField.getText());
            double hi = Double.parseDouble(hiField.getText());
            int num = Integer.parseInt(numField.getText());
            
            if(hi>Integer.MAX_VALUE){
                hi = Integer.MAX_VALUE;
            }

            tester.setStart(start);
            tester.setStop(stop);
            tester.setSteps(steps);
            tester.setRep(rep);
            tester.setLow(low);
            tester.setHi((int)hi);
            tester.setNum(num);


            RunStep3.setEnabled(false);
            //tester.run(); //FIRST TIME TO AVOID JUST-IN-TIME COMPILER!
            long[][] times = tester.runStep3();
            jTextAreaDataOutput.setText(tester.printResultsStep3(times));
            showDataDialog.setVisible(true);
            RunStep3.setEnabled(true);


        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_RunStep3ActionPerformed

    private void CheckboxJavasortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckboxJavasortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckboxJavasortActionPerformed

    private void CheckboxPMergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckboxPMergesortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckboxPMergesortActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlgorithmPanel;
    private javax.swing.JButton ButtonRun;
    private javax.swing.JCheckBox CheckboxHeapsort;
    private javax.swing.JCheckBox CheckboxHybridsort;
    private javax.swing.JCheckBox CheckboxJavasort;
    private javax.swing.JCheckBox CheckboxMergesort;
    private javax.swing.JCheckBox CheckboxPMergesort;
    private javax.swing.JCheckBox CheckboxQuicksort;
    private javax.swing.JCheckBox CheckboxSimplemergesort;
    private javax.swing.JPanel DataPanel;
    private javax.swing.JPanel DataPanel1;
    private javax.swing.JButton RunStep3;
    private javax.swing.JFormattedTextField hiField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextAreaDataOutput;
    private javax.swing.JFormattedTextField lowField;
    private javax.swing.JFormattedTextField numField;
    private javax.swing.JFormattedTextField repField;
    private javax.swing.JFormattedTextField repField2;
    private javax.swing.JDialog showDataDialog;
    private javax.swing.JFormattedTextField startField;
    private javax.swing.JFormattedTextField startField2;
    private javax.swing.JPanel step12Panel;
    private javax.swing.JPanel step3Panel;
    private javax.swing.JFormattedTextField stepsField;
    private javax.swing.JFormattedTextField stepsField2;
    private javax.swing.JFormattedTextField stopField;
    private javax.swing.JFormattedTextField stopField2;
    // End of variables declaration//GEN-END:variables
}
