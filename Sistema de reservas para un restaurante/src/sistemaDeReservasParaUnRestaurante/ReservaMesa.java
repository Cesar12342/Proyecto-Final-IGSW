/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemaDeReservasParaUnRestaurante;

/**
 *
 * @author César
 */
public class ReservaMesa {

    
    private String idDeReserva;
    private String nombreDelCliente;
    private int numeroDePersonas;
    private String fechaDeLaReserva;
    private String horaDeLaReserva;
    private boolean estado;
    public ReservaMesa(String idDeReserva,String nombreDelCliente,int 
      numeroDePersonas,String fechaDeLaReserva,String horaDeLaReserva){
    this.idDeReserva=idDeReserva;
    this.nombreDelCliente=nombreDelCliente;
    this.numeroDePersonas=numeroDePersonas;
    this.fechaDeLaReserva=fechaDeLaReserva;
    this.horaDeLaReserva=horaDeLaReserva;
    this.estado=false;
    }    
    public String getIdDeReserva() {
        return idDeReserva;
    }

    public void setIdDeReserva(String idDeReserva) {
        this.idDeReserva = idDeReserva;
    }

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }

    public int getNumeroDePersonas() {
        return numeroDePersonas;
    }

    public void setNumeroDePersonas(int numeroDePersonas) {
        this.numeroDePersonas = numeroDePersonas;
    }

    public String getFechaDeLaReserva() {
        return fechaDeLaReserva;
    }

    public void setFechaDeLaReserva(String fechaDeLaReserva) {
        this.fechaDeLaReserva = fechaDeLaReserva;
    }

    public String getHoraDeLaReserva() {
        return horaDeLaReserva;
    }

    public void setHoraDeLaReserva(String horaDeLaReserva) {
        this.horaDeLaReserva = horaDeLaReserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}