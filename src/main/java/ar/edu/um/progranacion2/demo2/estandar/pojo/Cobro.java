package ar.edu.um.progranacion2.demo2.estandar.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cobro {
    protected List<MedioPago> medioPago;

    public Cobro() {
        System.out.println("Iniciando Cobro");
        this.medioPago = new ArrayList<>();
    }

    public void agregar_medioPago(MedioPago pago){
        this.medioPago.add(pago);
    }

    public MedioPago obtener_medio_pago_random(){
        int numPago = this.medioPago.size();
        Random r = new Random();
        int pos = r.nextInt(numPago);
        MedioPago pago = this.medioPago.get(pos);
        return pago;
    }

    public void efectuar_cobro(Cliente cliente){
        System.out.println("Vamos a cobrar al cliente: "+cliente.toString());
        MedioPago medioPago = this.obtener_medio_pago_random();
        System.out.println("Cliente paga con "+medioPago.toString());
        System.out.println("Cobro efectuado");
    }
}
