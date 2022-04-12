package ar.edu.um.progranacion2.demo2.estandar.pojo;

import ar.edu.um.progranacion2.demo2.estandar.exception.NoMasComidaException;
import ar.edu.um.progranacion2.demo2.estandar.exception.StockInicialException;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Comida {
    protected String comida;
    protected String descripcion;
    protected Double precio;
    protected Integer stock;

    public Comida(String comida, String descripcion, Double precio, Integer stock) throws StockInicialException{
        this.comida = comida;
        this.descripcion = descripcion;
        this.precio = precio;
        if(stock<0) {
            throw new StockInicialException("No se puede crear este objeto con stock negativo");
        }
        this.stock = stock;
    }

    public void descontarStock() throws NoMasComidaException {
        if(this.stock == 0) {
            throw new NoMasComidaException("No se puede vender esa comida porque no hay mas stock");
        }
        this.stock--;
    }
}
