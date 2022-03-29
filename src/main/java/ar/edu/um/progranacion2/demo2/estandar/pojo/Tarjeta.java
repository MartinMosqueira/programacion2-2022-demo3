package ar.edu.um.progranacion2.demo2.estandar.pojo;

import java.time.LocalDate;
import java.util.Random;

public class Tarjeta extends MedioPago{
    private Integer numeroTarjeta;
    private LocalDate fechaCaducidad;
    private Integer CVV;

    public Tarjeta(Integer numeroPago) {
        super(numeroPago);
        Random r = new Random();
        this.numeroTarjeta = r.nextInt(550000);
        this.fechaCaducidad = LocalDate.now();
        this.CVV = r.nextInt(3);
    }
}
