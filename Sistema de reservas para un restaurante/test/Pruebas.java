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
    private ListaDeReservas listaDeReservas;
    
    @Before
    public void setUp(){
        listaDeReservas = new ListaDeReservas();
    }
    @Test
    public void testAgregarReserva() {
        ReservaMesa reserva1 = new ReservaMesa("91563" , "Cesar" , 6 , "10 04 2024" , 
                "12:30" );
        listaDeReservas.addReserva(reserva1);
        assertTrue(listaDeReservas.getReservas().contains(reserva1));
        
    }
    @Test
    public void testConfirmarReserva(){
        ReservaMesa reserva2 = new ReservaMesa("914ye" , "Cesar" , 6 , 
                "10 04 2024" , "12:30" );
         listaDeReservas.addReserva(reserva2);
         listaDeReservas.confirmarReservacion("914ye");
         ReservaMesa confirmada = listaDeReservas.getReservas().get(0);
         assertEquals(true,confirmada.isEstado());
         
    }
    @Test
    public void testActualizarReserva(){
       ReservaMesa reserva2 = new ReservaMesa("914ye" , "Cesar" , 6 , 
                "10 04 2024" , "12:30" );
       listaDeReservas.addReserva(reserva2);
        ReservaMesa encontrada = listaDeReservas.buscarReserva("914ye");
       encontrada.setNumeroDePersonas(8);
       encontrada.setNombreDelCliente("Jose");
       encontrada.setHoraDeLaReserva("5:30");
       encontrada.setFechaDeLaReserva("11 05 2030");
       assertEquals(8 , encontrada.getNumeroDePersonas());
       assertEquals("Jose" , encontrada.getNombreDelCliente());
       assertEquals("5:30" , encontrada.getHoraDeLaReserva());
       assertEquals("11 05 2030" , encontrada.getFechaDeLaReserva());
    }
}
