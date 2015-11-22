/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasses.ClassesProjeto;

import DaoClasses.DaoGenerics;
import Financeiro.ContaBancaria;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Higor Senna
 */
public class ContaBancariaDao implements DaoGenerics<ContaBancaria,Integer> {

    @Override
    public void inserir(ContaBancaria co) throws SQLException, ClassNotFoundException {         
        Connection c = ConnectionFactory.getConnection();        
        
        String sql = "INSERT INTO conta_bancaria (numero,banco,agencia,saldo) " 
                +"values (?,?,?,?);";      
        
         PreparedStatement stm = c.prepareStatement(sql);
         
         stm.setInt(1,co.getNumero());
         stm.setString(2,co.getBanco());
         stm.setString(3,co.getAgencia());
         stm.setDouble(4,co.getSaldo());            
         stm.executeUpdate();          
    }

    @Override
    public void alterar(ContaBancaria obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(ContaBancaria obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ContaBancaria> buscarTodos() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaBancaria buscarPelaChave(Integer chave) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
