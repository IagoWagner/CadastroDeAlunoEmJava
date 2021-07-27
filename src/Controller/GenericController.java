
package Controller;

import br.com.model.Curso;


public class CursoController extends GenericController<Curso> {
  
    abstract public T buscarPorID(int id);
}
