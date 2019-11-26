/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HolmgreenTest;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author Claudinei
 */
public class HolmgreenDeuteranopia extends javax.swing.JPanel {
    public JDesktopPane jDesktopPane;
    public int soma = 0;
    
    /**
     * Creates new form OpcoesTeste3
     */
    public HolmgreenDeuteranopia(JDesktopPane jDesktop) {
        initComponents();
        this.jDesktopPane = jDesktop;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width,screenSize.height);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDeuteranopia = new javax.swing.JLabel();
        btnLã1 = new javax.swing.JButton();
        btnLã2 = new javax.swing.JButton();
        btnLã3 = new javax.swing.JButton();
        btnLã4 = new javax.swing.JButton();
        btnLã5 = new javax.swing.JButton();
        btnLã6 = new javax.swing.JButton();
        btnLã7 = new javax.swing.JButton();
        btnLã8 = new javax.swing.JButton();
        btnLã9 = new javax.swing.JButton();
        btnLã10 = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblInformacoes = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        lblDeuteranopia.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblDeuteranopia.setText("TESTE DE DEUTERANOPIA");
        jPanel1.add(lblDeuteranopia);
        lblDeuteranopia.setBounds(360, 50, 630, 80);

        btnLã1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button01.png"))); // NOI18N
        btnLã1.setBorder(null);
        btnLã1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLã1MouseClicked(evt);
            }
        });
        btnLã1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã1);
        btnLã1.setBounds(80, 180, 200, 110);

        btnLã2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button02.png"))); // NOI18N
        btnLã2.setBorder(null);
        btnLã2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã2);
        btnLã2.setBounds(330, 180, 200, 110);

        btnLã3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button03.png"))); // NOI18N
        btnLã3.setBorder(null);
        btnLã3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã3);
        btnLã3.setBounds(580, 180, 200, 110);

        btnLã4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button04.png"))); // NOI18N
        btnLã4.setBorder(null);
        btnLã4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã4);
        btnLã4.setBounds(830, 180, 200, 110);

        btnLã5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button05.png"))); // NOI18N
        btnLã5.setBorder(null);
        btnLã5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã5);
        btnLã5.setBounds(1080, 180, 200, 110);

        btnLã6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button06.png"))); // NOI18N
        btnLã6.setBorder(null);
        btnLã6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã6);
        btnLã6.setBounds(80, 340, 200, 110);

        btnLã7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button07.png"))); // NOI18N
        btnLã7.setBorder(null);
        btnLã7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã7);
        btnLã7.setBounds(330, 340, 200, 110);

        btnLã8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button08.png"))); // NOI18N
        btnLã8.setBorder(null);
        btnLã8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã8);
        btnLã8.setBounds(580, 340, 200, 110);

        btnLã9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button09.png"))); // NOI18N
        btnLã9.setBorder(null);
        btnLã9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã9);
        btnLã9.setBounds(830, 340, 200, 110);

        btnLã10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLã10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonsDeut/Button10.png"))); // NOI18N
        btnLã10.setBorder(null);
        btnLã10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLã10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLã10);
        btnLã10.setBounds(1080, 340, 200, 110);

        btnVerificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVerificar.setText("VERIFICAR");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerificar);
        btnVerificar.setBounds(720, 570, 210, 90);

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReset.setText("RECOMEÇAR");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(420, 570, 210, 90);

        lblInformacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblInformacoes.setText("Selecione as lãs que determinar como sendo de diferentes tonalidades da cor verde");
        jPanel1.add(lblInformacoes);
        lblInformacoes.setBounds(340, 100, 690, 60);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/background.jpg"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLã1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã1ActionPerformed
        this.btnLã1.setVisible(false);
        soma += 5;
    }//GEN-LAST:event_btnLã1ActionPerformed

    private void btnLã2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã2ActionPerformed
        this.btnLã2.setVisible(false);
        soma += 100;
    }//GEN-LAST:event_btnLã2ActionPerformed

    private void btnLã3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã3ActionPerformed
        this.btnLã3.setVisible(false);
        soma += 100;
    }//GEN-LAST:event_btnLã3ActionPerformed

    private void btnLã4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã4ActionPerformed
        this.btnLã4.setVisible(false);
        soma += 5;
    }//GEN-LAST:event_btnLã4ActionPerformed

    private void btnLã5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã5ActionPerformed
        this.btnLã5.setVisible(false);
        soma += 100;
    }//GEN-LAST:event_btnLã5ActionPerformed

    private void btnLã6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã6ActionPerformed
        this.btnLã6.setVisible(false);
        soma += 100;
    }//GEN-LAST:event_btnLã6ActionPerformed

    private void btnLã7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã7ActionPerformed
        this.btnLã7.setVisible(false);
        soma += 5;
    }//GEN-LAST:event_btnLã7ActionPerformed

    private void btnLã8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã8ActionPerformed
        this.btnLã8.setVisible(false);
        soma += 100;
    }//GEN-LAST:event_btnLã8ActionPerformed

    private void btnLã9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã9ActionPerformed
        this.btnLã9.setVisible(false);
        soma += 100;
    }//GEN-LAST:event_btnLã9ActionPerformed

    private void btnLã10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLã10ActionPerformed
        this.btnLã10.setVisible(false);
        soma += 5;
    }//GEN-LAST:event_btnLã10ActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (soma == 20) {
            jDesktopPane.removeAll();
            DeutResultNegativo TelaResNeg = new DeutResultNegativo(jDesktopPane);
            jDesktopPane.add(TelaResNeg);
            TelaResNeg.setVisible(true);
        } else {
            jDesktopPane.removeAll();
            DeutResultPositivo TelaResPos = new DeutResultPositivo(jDesktopPane);
            jDesktopPane.add(TelaResPos);
            TelaResPos.setVisible(true);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.btnLã1.setVisible(true);
        this.btnLã2.setVisible(true);
        this.btnLã3.setVisible(true);
        this.btnLã4.setVisible(true);
        this.btnLã5.setVisible(true);
        this.btnLã6.setVisible(true);
        this.btnLã7.setVisible(true);
        this.btnLã8.setVisible(true);
        this.btnLã9.setVisible(true);
        this.btnLã10.setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnLã1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLã1MouseClicked
    }//GEN-LAST:event_btnLã1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLã1;
    private javax.swing.JButton btnLã10;
    private javax.swing.JButton btnLã2;
    private javax.swing.JButton btnLã3;
    private javax.swing.JButton btnLã4;
    private javax.swing.JButton btnLã5;
    private javax.swing.JButton btnLã6;
    private javax.swing.JButton btnLã7;
    private javax.swing.JButton btnLã8;
    private javax.swing.JButton btnLã9;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblDeuteranopia;
    private javax.swing.JLabel lblInformacoes;
    // End of variables declaration//GEN-END:variables
}
