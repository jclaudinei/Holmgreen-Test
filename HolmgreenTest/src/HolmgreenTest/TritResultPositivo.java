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
public class TritResultPositivo extends javax.swing.JPanel {
    public JDesktopPane jDesktopPane;
    public int soma = 0;
    /**
     * Creates new form OpcoesTeste3
     */
    public TritResultPositivo(JDesktopPane jDesktop) {
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
        lblResultado = new javax.swing.JLabel();
        btnVoltarMenu = new javax.swing.JButton();
        lblTexto1 = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();
        lblTexto3 = new javax.swing.JLabel();
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

        lblResultado.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblResultado.setText("RESULTADO");
        jPanel1.add(lblResultado);
        lblResultado.setBounds(520, 70, 300, 40);

        btnVoltarMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVoltarMenu.setText("VOLTAR AO MENU DE TESTES");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltarMenu);
        btnVoltarMenu.setBounds(530, 530, 290, 80);

        lblTexto1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblTexto1.setText("O paciente possui um nível baixo de Tritanopia");
        jPanel1.add(lblTexto1);
        lblTexto1.setBounds(160, 220, 1020, 56);

        lblTexto2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTexto2.setText("Recomendamos que o paciente procure um oftalmologista");
        jPanel1.add(lblTexto2);
        lblTexto2.setBounds(200, 290, 950, 60);

        lblTexto3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblTexto3.setText("Não esqueça de realizar todos os testes utilizando o botão abaixo!");
        jPanel1.add(lblTexto3);
        lblTexto3.setBounds(150, 470, 1070, 40);

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

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        jDesktopPane.removeAll();
        Holmgreen TelaHolmgreen = new Holmgreen(jDesktopPane);
        jDesktopPane.add(TelaHolmgreen);
        TelaHolmgreen.setVisible(true);
    }//GEN-LAST:event_btnVoltarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTexto3;
    // End of variables declaration//GEN-END:variables
}
