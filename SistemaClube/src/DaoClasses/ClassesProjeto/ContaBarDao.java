/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasses.ClassesProjeto;

import DaoClasses.DaoGenerics;
import Financeiro.ContaBancaria;
import Financeiro.ContaBar;
import MembrosClube.AssociadoTitular;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContaBarDao implements DaoGenerics<ContaBar,Integer> {

    @Override
    public void inserir(ContaBar cb) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "INSERT INTO contabar (numContaBar,tipo,saldo) "
                + "values (?,?,?);";

        PreparedStatement stm = c.prepareStatement(sql);

        stm.setInt(1,cb.getNumContaBar());
        stm.setString(2,cb.getTipoContaBar());
        stm.setDouble(3, cb.getSaldo());
        
        stm.executeUpdate();
    }

    @Override
    public void alterar(ContaBar cb) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE contabar SET " /*RESPEITAR OS ESPAÇOS*/
                + "numContaBar = ?, "
                + "tipo = ?, "
                + "saldo = ? "
                + "where numContaBar = ?;";

        PreparedStatement stm = c.prepareStatement(sql);

        stm.setInt(1,cb.getNumContaBar());
        stm.setString(2,cb.getTipoContaBar());
        stm.setDouble(3, cb.getSaldo());

        stm.executeUpdate();
    }

    @Override
    public void deletar(ContaBar cb) throws SQLException, ClassNotFoundException {
         Connection c = ConnectionFactory.getConnection();
        String sql = "DELETE FROM contabar WHERE "
                + "numContaBar = ?;";

        PreparedStatement stm = c.prepareStatement(sql);

        stm.setInt(1, cb.getNumContaBar());

        stm.executeUpdate();
    }

    @Override
    public ArrayList<ContaBar> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "select * from contabar ;";
        PreparedStatement stm = c.prepareStatement(sql);

        ResultSet rs = stm.executeQuery();

        ArrayList<ContaBar> listaCB = new ArrayList<>();

        while (rs.next()) {
            ContaBar cb = new ContaBar(rs.getString("tipo"),rs.getInt("numContaBar"),rs.getDouble("saldo"),rs.getDouble("limite"));
            listaCB.add(cb);
        }
        return listaCB;
    }

    @Override
    public ContaBar buscarPelaChave(Integer numero) throws SQLException, ClassNotFoundException {
         Connection c = ConnectionFactory.getConnection();

        String sql = "select * from contabar ?;";

        PreparedStatement stm = c.prepareStatement(sql);
        stm.setInt(1,numero);

        ResultSet rs = stm.executeQuery();

        if (rs.next()) {
           ContaBar cb = new ContaBar(rs.getString("tipo"),rs.getInt("numContaBar"),rs.getDouble("saldo"),rs.getDouble("limite"));
            return cb;
        } else {
            return null;
        }
    }
    
}
