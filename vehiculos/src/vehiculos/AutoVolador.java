/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.Date;

/**
 * 
 * @author sistemas
 * @class AutoVolador
 * @version 1.0
 * Clase de un auto volador que hereda de la clase carro para su implementación7n
 */
public class AutoVolador extends carro{
        public boolean esta_Volando=false;

    public AutoVolador(String color, char placa, String chasis, String marca, int modelo, int kilometraje, Date anioCompra) {
        super(color, placa, chasis, marca, modelo, kilometraje, anioCompra);
    }

    public AutoVolador() {
    }

    public boolean isEsta_Volando() {
        return esta_Volando;
    }

    public void setEsta_Volando(boolean esta_Volando) {
        this.esta_Volando = esta_Volando;
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
    /**
     * Metodo volar para que nuestro auto vuele o aterrice
     * @param estado 
     * el estado es un booleano que controla si esta volando o no
     */
        
    public void Volar(boolean estado ){
        this.esta_Volando = estado;  
    }
    
}
