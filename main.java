/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

/**
 *
 * @author HP
 */
import logica.calculadora;
import vista.CalculadoraVista;
import controlador.CalculadoraControlador;

public class main {
    public static void main(String[] args) {
        calculadora modelo = new calculadora();
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);

        vista.setVisible(true);
    }
}
