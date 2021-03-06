import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jzy3d.analysis.AnalysisLauncher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Victoria
 */
public class MainFrame extends javax.swing.JFrame implements PropertyChangeListener {


    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGetSurface;
    private javax.swing.JButton jButtonOkDialog;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JDialog jDialog1;
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
    private javax.swing.JLabel jLabelDialog;
    private javax.swing.JPanel jPanelInputs;
    private javax.swing.JPanel jPanelLeftRightChart;
    private javax.swing.JPanel jPanelUpDownChart;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextFieldDown;
    private javax.swing.JTextField jTextFieldLeft;
    private javax.swing.JTextField jTextFieldM;
    private javax.swing.JTextField jTextFieldM0;
    private javax.swing.JTextField jTextFieldN;
    private javax.swing.JTextField jTextFieldN0;
    private javax.swing.JTextField jTextFieldNst;
    private javax.swing.JTextField jTextFieldRight;
    private javax.swing.JTextField jTextFieldSleep;
    private javax.swing.JTextField jTextFieldUp;
    private Core core;
    private ChartPanel upDownChart;
    private ChartPanel lrChart;
    private JFreeChart upDownBarChart;
    private JFreeChart lrBarChart;
    private boolean isStop = false;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDialog1 = new javax.swing.JDialog();
        jLabelDialog = new javax.swing.JLabel();
        jButtonOkDialog = new javax.swing.JButton();
        jPanelInputs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSleep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDown = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLeft = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRight = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldN0 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldM0 = new javax.swing.JTextField();
        jButtonRun = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jPanelUpDownChart = new javax.swing.JPanel();
        jPanelLeftRightChart = new javax.swing.JPanel();
        jButtonGetSurface = new javax.swing.JButton();

        jDialog1.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabelDialog.setPreferredSize(new java.awt.Dimension(50, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 317;
        gridBagConstraints.ipady = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        jDialog1.getContentPane().add(jLabelDialog, gridBagConstraints);

        jButtonOkDialog.setText("Ok");
        jButtonOkDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkDialogActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 250, 11, 10);
        jDialog1.getContentPane().add(jButtonOkDialog, gridBagConstraints);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelInputs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelInputs.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Sleep:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        jPanelInputs.add(jLabel1, gridBagConstraints);

        jTextFieldSleep.setMinimumSize(new java.awt.Dimension(59, 20));
        jTextFieldSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSleepActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        jPanelInputs.add(jTextFieldSleep, gridBagConstraints);

        jLabel2.setText("Up:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldUp, gridBagConstraints);

        jLabel3.setText("Down:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel3, gridBagConstraints);

        jTextFieldDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldDown, gridBagConstraints);

        jLabel4.setText("Left:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel4, gridBagConstraints);

        jTextFieldLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLeftActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldLeft, gridBagConstraints);

        jLabel5.setText("Right:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldRight, gridBagConstraints);

        jLabel6.setText("Nst:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldNst, gridBagConstraints);

        jLabel7.setText("N:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldN, gridBagConstraints);

        jLabel8.setText("M:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel8, gridBagConstraints);

        jTextFieldM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldM, gridBagConstraints);

        jLabel9.setText("n0:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 0);
        jPanelInputs.add(jLabel9, gridBagConstraints);

        jTextFieldN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldN0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanelInputs.add(jTextFieldN0, gridBagConstraints);

        jLabel10.setText("m0:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 6, 0, 12);
        jPanelInputs.add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 12);
        jPanelInputs.add(jTextFieldM0, gridBagConstraints);

        jButtonRun.setText("Run");
        jButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRunActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.insets = new java.awt.Insets(8, 6, 2, 12);
        jPanelInputs.add(jButtonRun, gridBagConstraints);

        jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanelInputs.add(jProgressBar1, gridBagConstraints);

        jButton1.setText("Stop");
        jButton1.setCursor(Cursor.getDefaultCursor());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });
        jButton1.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(51, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.insets = new java.awt.Insets(8, 6, 2, 0);
        jPanelInputs.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jPanelInputs, gridBagConstraints);

        jPanelUpDownChart.setBackground(new java.awt.Color(204, 204, 204));
        jPanelUpDownChart.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 356;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jPanelUpDownChart, gridBagConstraints);

        jPanelLeftRightChart.setBackground(new java.awt.Color(153, 153, 153));
        jPanelLeftRightChart.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 322;
        gridBagConstraints.ipady = 356;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jPanelLeftRightChart, gridBagConstraints);

        jButtonGetSurface.setText("Get surface");
        jButtonGetSurface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonGetSurfaceActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(7, 100, 0, 100);
        getContentPane().add(jButtonGetSurface, gridBagConstraints);

        upDownChart = new ChartPanel(upDownBarChart);
        upDownChart.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanelUpDownChart.add(upDownChart, gridBagConstraints);

        lrChart = new ChartPanel(lrBarChart);
        lrChart.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanelLeftRightChart.add(lrChart, gridBagConstraints);

        getContentPane().setPreferredSize(new Dimension(733, 570));
        pack();
    }// </editor-fold>

    private void jButtonStopActionPerformed(ActionEvent evt) {
        isStop = true;
        core.done();
    }

    private void jButtonRunActionPerformed(java.awt.event.ActionEvent evt) {
        jButtonRun.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (!isStop) {
            core = new Core(Double.parseDouble(jTextFieldUp.getText()),
                    Double.parseDouble(jTextFieldDown.getText()),
                    Double.parseDouble(jTextFieldLeft.getText()),
                    Double.parseDouble(jTextFieldRight.getText()),
                    Double.parseDouble(jTextFieldSleep.getText()),
                    Integer.parseInt(jTextFieldNst.getText()),
                    Integer.parseInt(jTextFieldN.getText()),
                    Integer.parseInt(jTextFieldM.getText()),
                    Integer.parseInt(jTextFieldN0.getText()),
                    Integer.parseInt(jTextFieldM0.getText()),
                    jButtonRun);


            jProgressBar1.setValue(jProgressBar1.getMinimum());
            core.addPropertyChangeListener(this);
            core.execute();
        } else {
            isStop = false;
        }

    }

    private void jButtonGetSurfaceActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
        AnalysisLauncher.open(new Surface3D(core));
    }

    private void jButtonOkDialogActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            jProgressBar1.setValue(progress);
        }
    }

    private void jTextFieldSleepActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldDownActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldLeftActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldMActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldN0ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    class Core extends SwingWorker<Void, Void> {
        private Double up;
        private Double down;
        private Double left;
        private Double right;
        private Double sleep;
        private Integer Nst;
        private Integer N;
        private Integer M;
        private Integer n0;
        private Integer m0;
        private int[] countUp;
        private int[] countDown;
        private int[] countLeft;
        private int[] countRight;
        private Map<String, Double> countSleep;
        private JButton jButtonRun;

        public Core(Double up, Double down, Double left, Double right, Double sleep,
                    Integer nst, Integer n, Integer m, Integer n0, Integer m0,
                    JButton jButtonRun) {
            this.up = up;
            this.down = down;
            this.left = left;
            this.right = right;
            this.sleep = sleep;
            Nst = nst;
            N = n;
            M = m;
            this.n0 = n0;
            this.m0 = m0;
            this.countUp = new int[N];
            this.countDown = new int[N];
            this.countLeft = new int[M];
            this.countRight = new int[M];
            countSleep = new TreeMap<String, Double>();
            this.jButtonRun = jButtonRun;
        }

        private void getProbabilityOfSleep() {
            Double count = 0.0;
            for (Double value : countSleep.values()) {
                count += value;
            }

            Double index = 1 / count;
            for (String key : countSleep.keySet()) {
                countSleep.put(key, countSleep.get(key) * index);
            }

        }

        public int[] getCountUp() {
            return countUp;
        }

        public int[] getCountDown() {
            return countDown;
        }

        public int[] getCountLeft() {
            return countLeft;
        }

        public int[] getCountRight() {
            return countRight;
        }

        public Integer getN() {
            return N;
        }

        public Integer getM() {
            return M;
        }

        public Double getSumProb() {
            double result = 0.0;
            for (int i = 0; i < countUp.length; i++) {
                result += countUp[i];
            }

            for (int i = 0; i < countDown.length; i++) {
                result += countDown[i];
            }

            for (int i = 0; i < countLeft.length; i++) {
                result += countLeft[i];
            }

            for (int i = 0; i < countRight.length; i++) {
                result += countRight[i];
            }
            return result;
        }

        public Map<String, Double> getCountSleep() {
            return countSleep;
        }

        protected Void doInBackground() throws Exception {
            MethodOfIntervals methodOfIntervals = new MethodOfIntervals(up, down, left, right, sleep);
            setProgress(0);
            int countIteration = Nst / 100;
            int countProgress = 0;
            for (int i = 0; i < Nst; i++) {
                while (isStop) {
                    Thread.sleep(1000);
                }
                if (i == countIteration) {
                    countIteration += Nst / 100;
                    countProgress++;
                    setProgress(countProgress);
                }
                int tmpN = n0;
                int tmpM = m0;
                while (true) {
                    Steps step = methodOfIntervals.getStep(methodOfIntervals.getIntervals());
                    boolean flag = false;
                    switch (step.getNumberOfField()) {
                        case 1: {
                            tmpM++;
                            break;
                        }
                        case 2: {
                            tmpM--;
                            break;
                        }
                        case 3: {
                            tmpN--;
                            break;
                        }
                        case 4: {
                            tmpN++;
                            break;
                        }
                        case 5: {
                            flag = true;
                            String key = tmpN + "," + tmpM;
                            if (countSleep.containsKey(key)) {
                                countSleep.put(key, countSleep.get(key) + 1);
                            } else {
                                countSleep.put(key, 1.0);
                            }
                            break;
                        }
                    }

                    if (flag) {
                        break;
                    }

                    if (tmpM > M) {
                        countUp[tmpN-1]+=1;
                        break;
                    } else {
                        if (tmpM < 0) {
                            countDown[tmpN-1]+=1;
                            break;
                        } else {
                            if (tmpN > N) {
                                countRight[tmpM-1]+=1;
                                break;
                            } else {
                                if (tmpN < 0) {
                                    countLeft[tmpM-1]+=1;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            getProbabilityOfSleep();
            setProgress(100);

            return null;
        }

        @Override
        public void done() {
            if (!isStop) {
                Toolkit.getDefaultToolkit().beep();
            }
            setCursor(null);
            jButtonRun.setEnabled(true);

            final String left = "Left";
            final String right = "Right";
            final String up = "Up";
            final String down = "Down";
            final DefaultCategoryDataset datasetUpDown = new DefaultCategoryDataset();
            final DefaultCategoryDataset datasetRL = new DefaultCategoryDataset();
            Double sum=getSumProb();

            for (int i = 0; i < countUp.length; i++) {
                datasetUpDown.addValue(countUp[i] / sum, up, (i + 1) + "");
            }

            for (int i = 0; i < countDown.length; i++) {
                datasetUpDown.addValue(countDown[i] / sum, down, (i + 1) + "");
            }

            for (int i = 0; i < countLeft.length; i++) {
                datasetRL.addValue(countLeft[i] / sum, left, (i + 1) + "");
            }

            for (int i = 0; i < countRight.length; i++) {
                datasetRL.addValue(countRight[i] / sum, right, (i + 1) + "");
            }
            upDownBarChart = ChartFactory.createBarChart3D("",
                    "Boundary",
                    "Probability of stopping",
                    datasetUpDown,
                    PlotOrientation.VERTICAL,
                    true, true, false);


            upDownChart.setChart(upDownBarChart);
            jPanelUpDownChart.validate();

            lrBarChart = ChartFactory.createBarChart3D("",
                    "Boundary",
                    "Probability of stopping",
                    datasetRL,
                    PlotOrientation.VERTICAL,
                    true, true, false);

            lrChart.setChart(lrBarChart);
            jPanelLeftRightChart.validate();
        }

    }
}
