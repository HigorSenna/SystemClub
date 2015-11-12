
package DaoClasses;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Higor Senna
 */
public interface DaoGenerics <Class,Type> {
    public void inserir(Class obj) throws SQLException, ClassNotFoundException;
    public void alterar (Class obj) throws SQLException, ClassNotFoundException;
    public void deletar (Class obj) throws SQLException, ClassNotFoundException;
    public ArrayList <Class> buscarTodos(Class obj) throws SQLException,ClassNotFoundException;
    public Class buscarPelaChave (Type chave) throws SQLException,ClassNotFoundException;
}
