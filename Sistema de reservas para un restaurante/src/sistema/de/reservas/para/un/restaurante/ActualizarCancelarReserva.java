/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema.de.reservas.para.un.restaurante;

/**
 *
 * @author César
 */
public class ActualizarCancelarReserva extends ReservaMesa{
    private String id;
    public ActualizarCancelarReserva(String nombreDelCliente,int numeroDePersonas,
    int fechaDeLaReserva,int horaDeLaReserva,boolean estado){
        super(nombreDelCliente,numeroDePersonas,fechaDeLaReserva,horaDeLaReserva,estado);
        
    }
}
