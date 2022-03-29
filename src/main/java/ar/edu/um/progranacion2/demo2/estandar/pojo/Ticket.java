package ar.edu.um.progranacion2.demo2.estandar.pojo;

import java.util.Random;

public class Ticket {
    private Integer numeroTicket;
    private Cliente cliente;
    private Comida comida;
    private Float importe;

    public Ticket(Cliente cliente, Comida comida) {
        Random r = new Random();
        this.numeroTicket = r.nextInt(1000000);
        this.cliente = cliente;
        this.comida = comida;
        this.importe = r.nextFloat(10000);
    }

    @Override
    public String toString() {
        return "Ticket{" +
            "numeroTicket=" + numeroTicket +
            ", cliente=" + cliente +
            ", comida=" + comida +
            ", importe=" + importe +
            '}';
    }
}
