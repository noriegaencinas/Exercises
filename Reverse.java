
package reverse;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Reverse extends JFrame implements ActionListener{
    
    private JMenuBar mb1;
    private JMenu menu1, menu2;
    private JLabel label1, label2;
    private JButton boton1, boton2;
    private JTextField tf1, tf2;
    private JMenuItem mi1, verde, rojo, azul;
    
    public Reverse(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                        
        mb1 = new JMenuBar();
        setJMenuBar(mb1);                        
        
        menu1 = new JMenu("Opciones");
        mb1.add(menu1);
        
        mi1 = new JMenuItem("Salir");
        mi1.addActionListener(this);
        menu1.add(mi1);
        
        menu2 = new JMenu("Color de fondo");
        mb1.add(menu2);        
        
        verde = new JMenuItem("Verde");
        verde.addActionListener(this);
        menu2.add(verde);
        rojo = new JMenuItem("Rojo");
        rojo.addActionListener(this);
        menu2.add(rojo);
        azul = new JMenuItem("Azul");
        azul.addActionListener(this);
        menu2.add(azul);
                       
        label1 = new JLabel("Convertir");
        label1.setFont(new Font("Gabriola", 2, 32));
        label1.setBounds(10,10,150,30);
        add(label1);
        
        tf1 = new JTextField();
        tf1.setBounds(10, 40, 150, 30);
        add(tf1);
        
        boton1 = new JButton("Turn");
        boton1.setBounds(170,80,110,30);
        boton1.addActionListener(this);
        add(boton1);
        
        label2 = new JLabel("Resultado");
        label2.setFont(new Font("Gabriola", 2, 32));
        label2.setBounds(10,90,150,30);
        add(label2);
        
        tf2 = new JTextField();
        tf2.setBounds(10, 120, 150, 30);
        tf2.setEditable(false);
        add(tf2);
        
        boton2 = new JButton("Cerrar");
        boton2.setBounds(170,210,110,30);
        boton2.addActionListener(this);
        add(boton2);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            
            String alfabeto = "abcdefghijklmnopqrstuvwxyz";
            char alf[] = alfabeto.toCharArray();            
            char cad_ori[] = tf1.getText().toCharArray();            
            String cad_fin = "";
            for (int i = 0; i < cad_ori.length; i++) {            
            for (int j = 0; j < alf.length; j++) {
                if (cad_ori[i] == alf[j]) {                    
                    for (int k = 0; k < alf.length; k++) {
                        if (j + k == alf.length-1) {
                            cad_fin += alf[k];
                        }
                    }
                }
            }
        }
            tf2.setText(cad_fin);
            
        }        
        if (e.getSource() == boton2) {
            System.exit(0);
        }
        if (e.getSource() == mi1) {
            System.exit(0);
        }
        if (e.getSource() == verde) {
            Container fondo = getContentPane();
            fondo.setBackground(Color.green);
        }
        if (e.getSource() == rojo) {
            Container fondo = getContentPane();
            fondo.setBackground(Color.red);
        }
        if (e.getSource() == azul) {
            Container fondo = getContentPane();
            fondo.setBackground(Color.blue);
        }
    }
    
    public static void main(String[] args) {
        Reverse contenedor = new Reverse();
        contenedor.setBounds(0,0,300,300);
        contenedor.setResizable(false);
        contenedor.setVisible(true);
        contenedor.setLocationRelativeTo(null);
    }
    
}
