
package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{

    JMenuBar menubar1;
    JMenu menu1;    
    JMenuItem menuitem1;
    JTextField textfield1;
    JTextArea textarea1;
    JScrollPane scroll1;
    JButton boton_uno, boton_dos, boton_tres, boton_cuatro, boton_cinco, boton_seis, boton_siete, boton_ocho, boton_nueve;
    JButton boton_cero, boton_punto, boton_ans, boton_igual, boton_resta, boton_suma, boton_multi, boton_div, boton_del, boton_ac;
        
    public Calculadora(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
        setTitle("Mi calculadora");
        getContentPane().setBackground(Color.WHITE);
        
        Font sc = new Font("Arial", 0, 24);
        Font nc = new Font("Arial", 0, 12);
        
        menubar1 = new JMenuBar();
        setJMenuBar(menubar1);
        
        menu1 = new JMenu("Opciones");       
        menubar1.add(menu1);
        
        menuitem1 = new JMenuItem("Salir");                       
        menuitem1.addActionListener(this);
        menu1.add(menuitem1);
    
        textfield1 = new JTextField();
        textfield1.setBounds(10,10,200,40);
        textfield1.setFont(new Font("Arial", 0, 18));
        textfield1.setEditable(false);
        add(textfield1);
        
        textarea1 = new JTextArea();     
        textarea1.setEditable(false);
        scroll1 = new JScrollPane(textarea1);
        scroll1.setBounds(220,10,130,40);       
        add(scroll1);
        //
        
        boton_siete = new JButton("7");
        boton_siete.setBounds(10,60,60,60);
        boton_siete.setFont(sc);
        add(boton_siete);
        boton_siete.addActionListener(this);
        
        boton_ocho = new JButton("8");
        boton_ocho.setBounds(80,60,60,60);
        boton_ocho.setFont(sc);
        add(boton_ocho);
        boton_ocho.addActionListener(this);
        
        boton_nueve = new JButton("9");
        boton_nueve.setBounds(150,60,60,60);
        boton_nueve.setFont(sc);
        add(boton_nueve);
        boton_nueve.addActionListener(this);
        
        boton_del = new JButton("DEL");
        boton_del.setBounds(220,60,60,60);
        boton_del.setFont(nc);
        boton_del.setBackground(Color.orange);
        add(boton_del);
        boton_del.addActionListener(this);
        
        boton_ac = new JButton("AC");
        boton_ac.setBounds(290,60,60,60);
        boton_ac.setFont(nc);
        boton_ac.setBackground(Color.orange);
        add(boton_ac);
        boton_ac.addActionListener(this);
        
        //
        
        boton_cuatro = new JButton("4");
        boton_cuatro.setBounds(10,130,60,60);
        boton_cuatro.setFont(sc);
        add(boton_cuatro);
        boton_cuatro.addActionListener(this);
        
        boton_cinco = new JButton("5");
        boton_cinco.setBounds(80,130,60,60);
        boton_cinco.setFont(sc);
        add(boton_cinco);
        boton_cinco.addActionListener(this);
        
        boton_seis = new JButton("6");
        boton_seis.setBounds(150,130,60,60);
        boton_seis.setFont(sc);
        add(boton_seis);
        boton_seis.addActionListener(this);
        
        boton_multi = new JButton("X");
        boton_multi.setBounds(220,130,60,60);
        boton_multi.setFont(sc);
        add(boton_multi);
        boton_multi.addActionListener(this);
        
        boton_div = new JButton("/");
        boton_div.setBounds(290,130,60,60);
        boton_div.setFont(sc);
        add(boton_div);
        boton_div.addActionListener(this);
        
        //
        
        boton_uno = new JButton("1");
        boton_uno.setBounds(10,200,60,60);
        boton_uno.setFont(sc);
        add(boton_uno);
        boton_uno.addActionListener(this);
        
        boton_dos = new JButton("2");
        boton_dos.setBounds(80,200,60,60);
        boton_dos.setFont(sc);
        add(boton_dos);
        boton_dos.addActionListener(this);
        
        boton_tres = new JButton("3");
        boton_tres.setBounds(150,200,60,60);
        boton_tres.setFont(sc);
        add(boton_tres);
        boton_tres.addActionListener(this);
        
        boton_suma = new JButton("+");
        boton_suma.setBounds(220,200,60,60);
        boton_suma.setFont(sc);
        add(boton_suma);
        boton_suma.addActionListener(this);
        
        boton_resta = new JButton("-");
        boton_resta.setBounds(290,200,60,60);
        boton_resta.setFont(sc);
        add(boton_resta);
        boton_resta.addActionListener(this);
        
        //
        
        boton_cero = new JButton("0");
        boton_cero.setBounds(10,270,60,60);
        boton_cero.setFont(sc);
        add(boton_cero);
        boton_cero.addActionListener(this);
        
        boton_punto = new JButton(".");
        boton_punto.setBounds(80,270,60,60);
        boton_punto.setFont(sc);
        add(boton_punto);
        boton_punto.addActionListener(this);
        
        boton_ans = new JButton("ANS");
        boton_ans.setBounds(150,270,60,60);
        boton_ans.setFont(nc);
        add(boton_ans);
        boton_ans.addActionListener(this);
        
        boton_igual = new JButton("=");
        boton_igual.setBounds(220,270,130,60);
        boton_igual.setFont(sc);
        add(boton_igual);
        boton_igual.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e){
        String texto = "";
        String historial = "";
        String primero = "", segundo = "";
        double resultado = 0;
        double v1 = 0, v2 = 0;
        double ans = 0;
        if (e.getSource() == menuitem1) {
            System.exit(0);
        }
        if (e.getSource() == boton_uno) {
            texto = textfield1.getText();
            texto += "1";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_dos) {
            texto = textfield1.getText();
            texto += "2";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_tres) {
            texto = textfield1.getText();
            texto += "3";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_cuatro) {
            texto = textfield1.getText();
            texto += "4";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_cinco) {
            texto = textfield1.getText();
            texto += "5";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_seis) {
            texto = textfield1.getText();
            texto += "6";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_siete) {
            texto = textfield1.getText();
            texto += "7";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_ocho) {
            texto = textfield1.getText();
            texto += "8";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_nueve) {
            texto = textfield1.getText();
            texto += "9";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_cero) {
            texto = textfield1.getText();
            texto += "0";
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_punto) {
            texto = textfield1.getText();
            texto += ".";
            textfield1.setText(texto);
        }        
        
        //----------------------------------------------------------------------
        
        if (e.getSource() == boton_del) {
            int longitud;
            texto = textfield1.getText();
            longitud = texto.length();
            if (longitud == 0) {                
            }
            else{
                texto = texto.substring(0,longitud-1);   
            }            
            textfield1.setText(texto);
        }
        if (e.getSource() == boton_ac) {            
            texto = "";            
            primero = "";
            segundo = "";
            resultado = 0;
            v1 = 0;
            v2 = 0;
            textfield1.setText(texto);
            textarea1.setText(texto);
        }       
        if (e.getSource() == boton_ans) {
            texto = textfield1.getText();
            historial = textarea1.getText();
            int longitud = historial.length();    
            texto = texto + String.valueOf(historial.substring(0,longitud-1));
            textfield1.setText(texto);
        }
        
        //----------------------------------------------------------------------
        
        if (e.getSource() == boton_multi) {
            primero = textfield1.getText();
            historial = primero;        
            historial += "*";
            textarea1.setText(historial);
            textfield1.setText("");
        }
        if (e.getSource() == boton_div) {
            primero = textfield1.getText();
            historial = primero;    
            historial += "/";
            textarea1.setText(historial);
            textfield1.setText("");
        }        
        if (e.getSource() == boton_suma) {            
            primero = textfield1.getText();
            historial = primero;    
            historial += "+";
            textarea1.setText(historial);
            textfield1.setText("");
        }
        if (e.getSource() == boton_resta) {
            primero = textfield1.getText();
            historial = primero;    
            historial += "-";
            textarea1.setText(historial);
            textfield1.setText("");
        }
        
        //----------------------------------------------------------------------
        
        if (e.getSource() == boton_igual) {            
            segundo = textfield1.getText();   
            
            historial = textarea1.getText();
            int longitud = historial.length();            
            primero = historial.substring(0,longitud-1); 
            String op = historial.substring(longitud-1,longitud);               
            v1 = Double.valueOf(primero);
            v2 = Double.valueOf(segundo);
            if (op.equals("+")) {
                resultado = v1 + v2;
            }
            else if (op.equals("-")) {
                resultado = v1-v2;
            }
            else if (op.equals("*")) {
                resultado = v1*v2;
            }
            else if (op.equals("/")) {                                                
                resultado = (v2==0)?0:v1/v2;                   
            }
            historial += segundo;
            textarea1.setText(historial + "=");
            textfield1.setText(String.valueOf(resultado));
            ans = resultado;
            
        }
    }
    public static void main(String[] args) {
        Calculadora contenedor = new Calculadora();
        contenedor.setBounds(0,0,370,390);   
        contenedor.setVisible(true);
        contenedor.setResizable(false);
        contenedor.setLocationRelativeTo(null);                        
    }    
}
