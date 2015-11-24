/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Telas.funcionarios.TelaAtendente;
import MembrosClube.Associado;
import MembrosClube.AssociadoTitular;
import MembrosClube.Funcionario;
import Telas.associado.TelaAssociado;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Higor Senna
 */
public class TelaInicial extends javax.swing.JFrame {
    
    /**
     * Creates new form LoginAtendente
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inicioCB1 = new javax.swing.JCheckBox();
        jlogin = new javax.swing.JTextField();
        jBotaoEntrar = new javax.swing.JButton();
        inicioCB2 = new javax.swing.JCheckBox();
        jBotaoLimpar = new javax.swing.JButton();
        jsenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Dialog", 0, 40)); // NOI18N
        label1.setText("\t\t\t          SISTEMA DO CLUBE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Senha");

        inicioCB1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inicioCB1.setText("Atendente");
        inicioCB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioCB1MouseClicked(evt);
            }
        });

        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });

        jBotaoEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBotaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/imagens/homehost_ok.png"))); // NOI18N
        jBotaoEntrar.setText("Entrar");
        jBotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoEntrarActionPerformed(evt);
            }
        });

        inicioCB2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inicioCB2.setText("Associado");
        inicioCB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inicioCB2MouseClicked(evt);
            }
        });

        jBotaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBotaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/imagens/x.png"))); // NOI18N
        jBotaoLimpar.setText("Limpar");
        jBotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoLimparActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/imagens/club.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inicioCB1)
                        .addGap(59, 59, 59)
                        .addComponent(inicioCB2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jsenha))))
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jBotaoLimpar)
                        .addGap(40, 40, 40)
                        .addComponent(jBotaoEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioCB1)
                    .addComponent(inicioCB2))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoEntrar)
                    .addComponent(jBotaoLimpar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      private void limparCampos(){
       jlogin.setText(null);
       jsenha.setText(null);
       inicioCB1.setSelected(false); //atendente
       inicioCB2.setSelected(false); //associado
       jlogin.requestFocus();  
      }
      
         
        public boolean consultaAssoci(String pass) throws ClassNotFoundException, SQLException{
            boolean exist = false;
            Connection c = ConnectionFactory.getConnection();
            String sql = "SELECT senhaClube from associado_titular WHERE senhaClube = ? ";

            PreparedStatement stm = c.prepareStatement(sql);        
            stm.setString(1,pass);               
            ResultSet rs;
            rs = stm.executeQuery();

            if(rs.next()){
               exist = true;
            }
            return exist;        
        }
        
        public String buscarNome(String senha) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from associado_titular WHERE senhaClube = ?;";
        
         PreparedStatement stm = c.prepareStatement(sql);
         stm.setString(1,senha);
         
         ResultSet rs = stm.executeQuery();
         
         if(rs.next()){
             AssociadoTitular ass = new AssociadoTitular(rs.getInt("id_associado"),rs.getString("nome"),
                     rs.getString("RG"),rs.getString("CPF"),rs.getString("telefone")
                     ,rs.getString("endereco"),rs.getString("senhaClube"),rs.getInt("numConta"));
                     
             return ass.getNome();
         }else{
             return null;
         }
    }
       
    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jloginActionPerformed

    private void jBotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoLimparActionPerformed
       jlogin.setText(null);
       jsenha.setText(null);
       inicioCB1.setSelected(false); //atendente
       inicioCB2.setSelected(false); //associado
    }//GEN-LAST:event_jBotaoLimparActionPerformed

    private void jBotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoEntrarActionPerformed
      if((jlogin.getText().equals("") || jsenha.getText().equals("")) && inicioCB1.isSelected()){
           JOptionPane.showMessageDialog(this, "Preencha os campos!");
       }
      else if(jsenha.getText().equals("") && inicioCB2.isSelected()){
          JOptionPane.showMessageDialog(this, "Preencha os campos!");
      }
       else if(inicioCB1.isSelected() || inicioCB2.isSelected()){           
           if(inicioCB1.isSelected()){
                  Funcionario f = new Funcionario();
                try {
                    f.consultaFuncs(jlogin.getText(),jsenha.getText());
                    if(f.consultaFuncs(jlogin.getText(),jsenha.getText()) == true ){
                        JOptionPane.showMessageDialog(this, "Bem Vindo " + jlogin.getText());                        
                        TelaAtendente tela = new TelaAtendente(this, true);
                        
                        tela.setVisible(true);                       
                    }
                    else{
                       JOptionPane.showMessageDialog(this, "Login ou senha Incorretos");
                       limparCampos();  
                    }
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "class,Consulte o desenvolvedor " + ex.getMessage());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "sql,Consulte o desenvolvedor " +ex.getMessage());
                }  
           }
           else if(inicioCB2.isSelected()){
              AssociadoTitular at = new AssociadoTitular();
              
              try {
                    consultaAssoci(jsenha.getText());
                   
                    if(consultaAssoci(jsenha.getText()) == true){   
                        
                       JOptionPane.showMessageDialog(this, "Verificar Mensalidade! "); 
                       String nome = buscarNome(jsenha.getText()); 
                       nome = nome.toUpperCase();
                       JOptionPane.showMessageDialog(this, "Bem Vindo " + nome);                       
                       TelaAssociado tela = new TelaAssociado(this, true); 
                       tela.setLabel("Você está logado como: -> " + nome);
                       tela.setVisible(true);                      
                    }
                    else if(consultaAssoci(jsenha.getText()) == true){
                        JOptionPane.showMessageDialog(this, "Verificar Mensalidade! "); 
                    }
                    else{
                       JOptionPane.showMessageDialog(this, "Login ou senha Incorretos");
                       limparCampos();  
                    }
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "class,Consulte o desenvolvedor " + ex.getMessage());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "sql,Consulte o desenvolvedor " +ex.getMessage());
                }  
           }          
       }  
       else{
           JOptionPane.showMessageDialog(this,"Selecione um campo!");
       } 
    }//GEN-LAST:event_jBotaoEntrarActionPerformed
    
    private void inicioCB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioCB1MouseClicked
        if(inicioCB2.isSelected()){
            JOptionPane.showMessageDialog(this, "Campo Associado ja esta selecionado ");
            inicioCB1.setSelected(false);
        }
    }//GEN-LAST:event_inicioCB1MouseClicked

    private void inicioCB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inicioCB2MouseClicked
        if(inicioCB1.isSelected()){
            JOptionPane.showMessageDialog(this, "Campo Atendente ja esta selecionado ");
            inicioCB2.setSelected(false);
        }
    }//GEN-LAST:event_inicioCB2MouseClicked

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox inicioCB1;
    private javax.swing.JCheckBox inicioCB2;
    private javax.swing.JButton jBotaoEntrar;
    private javax.swing.JButton jBotaoLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jlogin;
    private javax.swing.JPasswordField jsenha;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
