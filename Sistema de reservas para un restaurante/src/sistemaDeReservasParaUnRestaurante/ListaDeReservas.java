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
public class ListaDeReservas {

    private ArrayList<ReservaMesa> reservas = new ArrayList<>();

    public ArrayList<ReservaMesa> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<ReservaMesa> reservas) {
        this.reservas = reservas;
    }

    public void addReserva(ReservaMesa a) {
        reservas.add(a);
    }

    public ReservaMesa buscarReserva(String id) {
        for (ReservaMesa y : reservas) {
            if (y.getIdDeReserva().equals(id)) {
                return y;
            }
        }
        return null;
    }
    
    
   public void cancelarReserva(String id) {
    ReservaMesa reserva = buscarReserva(id);
    if (reserva != null) {
        reservas.remove(reserva);
    }
}

    
    }



