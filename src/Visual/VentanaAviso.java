package Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAviso extends JFrame {

    // Constructor de la clase Aviso
    public VentanaAviso(String mensaje) {
        // Configura el título de la ventana
        setTitle("Aviso");

        // Configura el tamaño de la ventana
        setSize(300, 150);

        // Establece la ubicación de la ventana en el centro de la pantalla
        setLocationRelativeTo(null);

        // Configura la operación por defecto al cerrar la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crea un panel para contener los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crea una etiqueta para mostrar el mensaje
        JLabel etiquetaMensaje = new JLabel(mensaje, SwingConstants.CENTER);

        // Añade la etiqueta al panel
        panel.add(etiquetaMensaje, BorderLayout.CENTER);

        // Crea un botón para cerrar la ventana
        JButton botonCerrar = new JButton("Cerrar");

        // Añade un listener al botón para cerrar la ventana al ser presionado
        botonCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Crea un panel para el botón y lo añade al panel principal
        JPanel panelBoton = new JPanel();
        panelBoton.add(botonCerrar);
        panel.add(panelBoton, BorderLayout.SOUTH);

        // Añade el panel principal a la ventana
        add(panel);
    }
    public static void main(String[] args) {
        // Ejecuta la creación de la ventana en el hilo de despacho de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crea una instancia de la ventana de aviso con un mensaje
                VentanaAviso aviso = new VentanaAviso("Este es un mensaje de aviso.");

                // Hace visible la ventana
                aviso.setVisible(true);
            }
        });
    }
}