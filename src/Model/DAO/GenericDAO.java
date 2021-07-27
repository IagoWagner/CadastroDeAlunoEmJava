
package Model.DAO;

import java.sql.Connection;

abstract public class GenericDAO<T> {
    private Connection connection;
    GenericDAO(){
        this.connection = ConnectionDatabase.getConnetion();
    }
    public Connection getConnection();
    reurn this.Connection;
}
    abstract public void inserir(T obj);
    abstract public void editar(T obj);
    abstract public void remover(T obj);
    abstract public T buscarPorID(int id);
}
