package com.interfaz.swing;

import javax.swing.*;

public class Ejercicio01 {
    public static void main (String[]args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        //cambiar las apariencias de las app
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. In ante metus dictum at tempor commodo ullamcorper a lacus. Lorem donec massa sapien faucibus. Fermentum iaculis eu non diam. Turpis in eu mi bibendum neque egestas congue quisque egestas. Velit euismod in pellentesque massa placerat duis ultricies lacus sed. Nec dui nunc mattis enim ut tellus. Tempus urna et pharetra pharetra massa massa ultricies. Sit amet venenatis urna cursus eget nunc scelerisque viverra mauris. Cras sed felis eget velit aliquet sagittis id consectetur purus. Pellentesque adipiscing commodo elit at.";
        String mitexto = texto.strip();


        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("Mi primera ventana");
        jFrame.setSize(600, 430);
        jFrame.setVisible(true);

        JLabel jLabelSaludo= new JLabel();
        jLabelSaludo.setText(texto);
        jLabelSaludo.setBounds(10,10,580, 10);
        jFrame.add(jLabelSaludo);

        JButton jButtonAceptar = new JButton();
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(
                actionEvent ->{
                    //System.out.println("Diste clic");
                    imprimirMensaje();
                }
        );
        jButtonAceptar.setBounds(450, 340, 140, 50);
        jFrame.add(jButtonAceptar);


        jFrame.setVisible(true);
    }

    public static void imprimirMensaje(){
        System.out.println("Este es un mensaje");
    }
}


