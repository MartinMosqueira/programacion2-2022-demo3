package ar.edu.um.progranacion2.demo2.estandar.servicio;

import ar.edu.um.progranacion2.demo2.estandar.pojo.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class Negocio {
    protected List<Empleado> empleados;
    protected List<Comida> menu;

    public Negocio() {
        System.out.println("Arrancando negocio");
        this.empleados=new ArrayList<>();
        this.menu=new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void agregarComida(Comida c) {
        this.menu.add(c);
    }

    public Empleado obtenerEmpleadoRandom() {
        int numEmpleados = this.empleados.size();
        Random r = new Random();
        int pos = r.nextInt(numEmpleados);
        Empleado e = this.empleados.get(pos);
        return e;
    }

    public Comida obtenerComidaRandom() {
        int numComidas = this.menu.size();
        Random r = new Random();
        int pos = r.nextInt(numComidas);
        Comida c = this.menu.get(pos);
        return c;
    }

    public void vender(Cliente c) {
        System.out.println("Vamos a atender al cliente: "+c.toString());
        Empleado em = this.obtenerEmpleadoRandom();
        Comida com = this.obtenerComidaRandom();
        System.out.println("El empleado que atiende es: "+em.toString());
        System.out.println("La opcion seleccionada de comida del menu es: "+com.toString());
        System.out.println("La comida ha sido entregada");
        Cobro cobro = new Cobro();
        Tarjeta tar1 = new Tarjeta(1);
        Efectivo efc1 = new Efectivo(2);
        cobro.agregar_medioPago(tar1);
        cobro.agregar_medioPago(efc1);
        cobro.efectuar_cobro(c);
        System.out.println("Cobro finalizado");
        Ticket ticket1 = new Ticket(c, com);
        System.out.println("Ticket: "+ticket1.toString());
        System.out.println("Ticket entregado");
        System.out.println(String.format("El cliente %s se ha retirado del local", c));
        System.out.println("--------------------------------------------------------------------------------");
    }
}
