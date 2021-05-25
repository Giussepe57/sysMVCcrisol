/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Entidad.Lector;
import java.util.List;

/**
 *
 * @author Documentos
 */
public interface Interface_Lector {
    public List ListadoLector();
    public boolean IngresarLector(Lector lec);
    public boolean ModificarLector(Lector lec);
    public boolean EliminarLector(int idlec);
    public Lector BuscarLector(int idlec);
}
