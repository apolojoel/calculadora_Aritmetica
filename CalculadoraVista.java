/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraVista extends JFrame {
    private final JTextField display = new JTextField();
    private final JButton[] botonesNumeros = new JButton[10];
    private final JButton botonSuma = new JButton("+");
    private final JButton botonResta = new JButton("-");
    private final JButton botonMultiplicacion = new JButton("*");
    private final JButton botonDivision = new JButton("/");
    private final JButton botonIgual = new JButton("=");
    private final JButton botonClear = new JButton("C");

    public CalculadoraVista() {
        setTitle("Calculadora");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para el display
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4));

        for (int i = 0; i <= 9; i++) {
            botonesNumeros[i] = new JButton(String.valueOf(i));
            panelBotones.add(botonesNumeros[i]);
        }

        // Agregar botones de operaciones
        panelBotones.add(botonSuma);
        panelBotones.add(botonResta);
        panelBotones.add(botonMultiplicacion);
        panelBotones.add(botonDivision);
        panelBotones.add(botonIgual);
        panelBotones.add(botonClear);

        add(panelBotones, BorderLayout.CENTER);
    }

 
    public JButton getBotonSuma() { return botonSuma; }
    public JButton getBotonResta() { return botonResta; }
    public JButton getBotonMultiplicacion() { return botonMultiplicacion; }
    public JButton getBotonDivision() { return botonDivision; }
    public JButton getBotonIgual() { return botonIgual; }
    public JButton getBotonClear() { return botonClear; }
    public JTextField getDisplay() { return display; }

    public JButton[] getBotonesNumeros() { return botonesNumeros; }
}