/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import sistemaDeReservasParaUnRestaurante.ListaDeReservas;
import sistemaDeReservasParaUnRestaurante.ReservaMesa;
/**
 *
 * @author César
 */
public class Pruebas {
   public ListaDeReservas listaDeReservas;
   ReservaMesa reserva;
    @Before
    public void setUp(){
        listaDeReservas = new ListaDeReservas();
        reserva = new ReservaMesa("914ye" , "Cesar" , 6 , 
                "10 04 2024" , "12:30" ,"pendiente");
        listaDeReservas.addReserva(reserva);
    }
    @Test
    public void testAgregarReserva() {
        ReservaMesa reservaAgregada = new ReservaMesa("91563" , "Cesar" , 6 , "10 04 2024" , 
                "12:30" ,"pendiente");
        listaDeReservas.addReserva(reservaAgregada);
        assertTrue(listaDeReservas.getReservas().contains(reservaAgregada));
    }
    @Test
    public void testCancelarReserva(){
        assertTrue(listaDeReservas.getReservas().contains(reserva));
        listaDeReservas.cancelarReserva("914ye");
        assertFalse(listaDeReservas.getReservas().contains(reserva));
    }
    @Test
    public void testActualizarReserva(){
       ReservaMesa encontrada = listaDeReservas.buscarReserva("914ye");
       if(encontrada != null){
          encontrada.setNumeroDePersonas(8);
          encontrada.setNombreDelCliente("Jose");
          encontrada.setHoraDeLaReserva("5:30");
          encontrada.setFechaDeLaReserva("11 05 2030");
          encontrada.setEstado("confirmada");
          assertEquals(8 , encontrada.getNumeroDePersonas());
          assertEquals("Jose" , encontrada.getNombreDelCliente());
          assertEquals("5:30" , encontrada.getHoraDeLaReserva());
          assertEquals("11 05 2030" , encontrada.getFechaDeLaReserva());
          assertEquals("confirmada" , encontrada.getEstado());
       }else{
           System.err.println("La reserva no existe");
       }
    }
}
