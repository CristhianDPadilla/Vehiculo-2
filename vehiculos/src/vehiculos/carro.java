/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 *
 * @author sistemas
 * @class carro
 * @version 1.0
 * Clase de un carro qeu hereda de la clase vehiculo para su implementacion
 */
public class carro {
    
    //atributo 
    
    public String color;
    public char placa;
    public String chasis;
    public String marca;
    public int modelo;
    public int kilometraje;
    public Date anioCompra;

    public carro(String color, char placa, String chasis, String marca, int modelo, int kilometraje, Date anioCompra) {
        this.color = color;
        this.placa = placa;
        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.anioCompra = anioCompra;
    }

    carro() {
       
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getPlaca() {
        return placa;
    }

    public void setPlaca(char placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Date getAnioCompra() {
        return anioCompra;
    }

    public void setAnioCompra(Date anioCompra) {
        this.anioCompra = anioCompra;
    }
    
    
    
}

