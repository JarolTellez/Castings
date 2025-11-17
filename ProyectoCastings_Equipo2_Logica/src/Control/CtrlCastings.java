/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ObjetoNegocio.*;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import DAOS.*;

/**
 *
 * @author Jarol
 */
public class CtrlCastings {

    IDatos fabricaDatos;

    public CtrlCastings() {
        fabricaDatos = new FachadaDatos();
    }

    public Casting buscarCastingNombre(String nombre) {
        return fabricaDatos.buscarCastingNombre(nombre);
    }

    public List<Casting> consultarTodosCasting(String nombre, ObjectId codigo, Date fecha) {

        return fabricaDatos.consultarTodosCasting(nombre, codigo, fecha);
    }

}
