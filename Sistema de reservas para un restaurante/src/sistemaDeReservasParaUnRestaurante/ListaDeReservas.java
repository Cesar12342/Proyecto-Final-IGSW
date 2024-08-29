/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaDeReservasParaUnRestaurante;
import java.util.ArrayList;
/**
 *
 * @author César
 */
public class ListaDeReservas{
    public ArrayList<ReservaMesa>reservas=new ArrayList<>(); 

    public ArrayList<ReservaMesa> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<ReservaMesa> reservas) {
        this.reservas = reservas;
    }
    public void addReserva(ReservaMesa a){
      reservas.add(a);
    }
    private int buscarReserva(String id){
     int indexOf = 0;
        for (ReservaMesa y : reservas) {
      if(y.getIdDeReserva().equals(id)){
         indexOf = reservas.indexOf(y);
      }   
     }
        return indexOf;
    }
public void actualizarReserva(String id,String nombreDelCliente,int 
        numeroDePersonas,String fechaDeLaReserva,String horaDeLaReserva){
    int reserva = buscarReserva(id);
    reservas.get(reserva).setFechaDeLaReserva(fechaDeLaReserva);
    reservas.get(reserva).setHoraDeLaReserva(horaDeLaReserva);
    reservas.get(reserva).setNombreDelCliente(nombreDelCliente);
    reservas.get(reserva).setNumeroDePersonas(numeroDePersonas);
}
public void cancelarReserva (String id){
    reservas.remove(reservas.get(buscarReserva(id)));
}
public void confirmarReservacion (String id){
    reservas.get(buscarReserva(id)).setEstado(true);
 }
}