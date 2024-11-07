/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import logica.calculadora;
import vista.CalculadoraVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador {
    private calculadora modelo;
    private CalculadoraVista vista;
    private String operador;
    private int primerNumero;

    public CalculadoraControlador(calculadora modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;

       
        for (int i = 0; i <= 9; i++) {
            int num = i;
            vista.getBotonesNumeros()[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    vista.getDisplay().setText(vista.getDisplay().getText() + num);
                }
            });
        }

        
        vista.getBotonSuma().addActionListener(e -> setOperador("+"));
        vista.getBotonResta().addActionListener(e -> setOperador("-"));
        vista.getBotonMultiplicacion().addActionListener(e -> setOperador("*"));
        vista.getBotonDivision().addActionListener(e -> setOperador("/"));
        
        vista.getBotonIgual().addActionListener(e -> calcular());
        vista.getBotonClear().addActionListener(e -> vista.getDisplay().setText(""));
    }

    private void setOperador(String operador) {
        primerNumero = Integer.parseInt(vista.getDisplay().getText());
        this.operador = operador;
        vista.getDisplay().setText(""); // Limpia el display para el segundo número
    }

    private void calcular() {
        int segundoNumero = Integer.parseInt(vista.getDisplay().getText());
        int resultado = 0;

        switch (operador) {
            case "+":
                resultado = modelo.sumar(primerNumero, segundoNumero);
                break;
            case "-":
                resultado = modelo.restar(primerNumero, segundoNumero);
                break;
            case "*":
                resultado = modelo.multiplicar(primerNumero, segundoNumero);
                break;
            case "/":
                try {
                    resultado = modelo.dividir(primerNumero, segundoNumero);
                } catch (ArithmeticException e) {
                    vista.getDisplay().setText("Error: " + e.getMessage());
                    return;
                }
                break;
        }

        vista.getDisplay().setText(String.valueOf(resultado));
    }
}