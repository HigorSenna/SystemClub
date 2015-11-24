/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasses.ClassesProjeto;

import DaoClasses.DaoGenerics;
import MembrosClube.Dependente;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Higor Senna
 */
public class DependenteDao implements DaoGenerics<Dependente,Integer> {

    @Override
    public void inserir(Dependente dep) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "INSERT INTO dependente (CPF_Dep,nome,endereco,telefone,RG,senhaClubeDep) " 
                +"values (?,?,?,?,?,?);";
        
         PreparedStatement stm = c.prepareStatement(sql);
         
         stm.setString(1,dep.getCPF());
         stm.setString(2,dep.getNome());
         stm.setString(3,dep.getEndereco());
         stm.setString(4,dep.getTelefone());
         stm.setString(5,dep.getRG());
         stm.setString(6,dep.getSenhaClube());    
         
         stm.executeUpdate();
    }
    @Override
    public void alterar(Dependente dep) throws SQLException, ClassNotFoundException {
        
    }

    @Override
    public void deletar(Dependente dep) throws SQLException, ClassNotFoundException {
       
    }

    @Override
    public ArrayList buscarTodos() throws SQLException, ClassNotFoundException {
        
    }

    @Override
    public Dependente buscarPelaChave(Integer chave) throws SQLException, ClassNotFoundException {
     
    }
    
}
