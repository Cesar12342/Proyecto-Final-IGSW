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
public class ReservaMesa {
    protected String idDeReserva;
    protected String nombreDelCliente;
    protected int numeroDePersonas;
    protected int fechaDeLaReserva;
    protected int horaDeLaReserva;
    protected boolean estado;
    public ReservaMesa(String idDeReserva,String nombreDelCliente,int numeroDePersonas,
    int fechaDeLaReserva,int horaDeLaReserva,boolean estado){
    this.numeroDePersonas=numeroDePersonas;
    this.idDeReserva=idDeReserva;
    this.nombreDelCliente=nombreDelCliente;
    this.estado=estado;
    this.fechaDeLaReserva=fechaDeLaReserva;
    this.horaDeLaReserva=horaDeLaReserva;
    
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

    public int getFechaDeLaReserva() {
        return fechaDeLaReserva;
    }

    public void setFechaDeLaReserva(int fechaDeLaReserva) {
        this.fechaDeLaReserva = fechaDeLaReserva;
    }

    public int getHoraDeLaReserva() {
        return horaDeLaReserva;
    }

    public void setHoraDeLaReserva(int horaDeLaReserva) {
        this.horaDeLaReserva = horaDeLaReserva;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
