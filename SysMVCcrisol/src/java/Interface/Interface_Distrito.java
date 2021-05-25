/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Entidad.Distrito;
import java.util.List;

/**
 *
 * @author Documentos
 */
public interface Interface_Distrito {
    public List ListadoDistrito();
    public boolean IngresarDistrito(Distrito dis);
    public boolean ModificarDistrito(Distrito dis);
    public boolean EliminarDistrito(int idDis);
    public Distrito BuscarDistrito(int idDis);
}
