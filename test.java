package DiferenciaFechas;



import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class test extends JFrame implements ActionListener{
    
    private JMenuBar mb1;
    private JMenu menu1;
    private JMenuItem item1, item2;
    private JTextField campo1, campo2;
    private JButton boton1, boton2, boton3;
    private JLabel label1, label2, resultado;
    
    test(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mb1 = new JMenuBar();
        setJMenuBar(mb1);
        menu1 = new JMenu("Opciones");
        mb1.add(menu1);
        item1 = new JMenuItem("Salir");
        item1.addActionListener(this);
        menu1.add(item1);
        item2 = new JMenuItem("Limpiar");
        item2.addActionListener(this);
        menu1.add(item2);
        
        label1 = new JLabel("Introduce la fecha inicial");
        label1.setFont(new Font("Gabriola", 1, 24));
        label1.setBounds(10,10,250,30);
        add(label1);
        
        campo1 = new JTextField("19/5/2022");
        campo1.setBounds(260,10,100,30);
        add(campo1);
    
        boton2 = new JButton("Hoy");
        boton2.setBounds(370,10,100,30);
        boton2.setFont(new Font("Gabriola", 1, 24));
        boton2.addActionListener(this);
        add(boton2);
        
        label2 = new JLabel("Introduce la fecha final");
        label2.setFont(new Font("Gabriola", 1, 24));
        label2.setBounds(10,50,250,30);
        add(label2);

        campo2 = new JTextField("8/8/2022");
        campo2.setBounds(260,50,100,30);
        add(campo2);        
        
        boton3 = new JButton("Hoy");
        boton3.setBounds(370,50,100,30);
        boton3.setFont(new Font("Gabriola", 1, 24));
        boton3.addActionListener(this);
        add(boton3);
        
        boton1 = new JButton("Calcular");
        boton1.setBounds(330,180,150,50);
        boton1.setFont(new Font("Gabriola", 1, 24));
        boton1.addActionListener(this);
        add(boton1);
        
        resultado = new JLabel("Aquí va a aparecer el resultado");
        resultado.setFont(new Font("Gabriola", 1, 24));
        resultado.setBounds(50,100,300,30);
        add(resultado);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == item1) {
            System.exit(0);
        }
        if (e.getSource() == boton1) {            
            String f1 = campo1.getText();
            String f2 = campo2.getText();
            String[] comp1 = f1.split("/");          
            String[] comp2 = f2.split("/");
            Date fecha1 = new Date(Integer.parseInt(comp1[2]),Integer.parseInt(comp1[1])-1,Integer.parseInt(comp1[0]));
            Date fecha2 = new Date(Integer.parseInt(comp2[2]),Integer.parseInt(comp2[1])-1,Integer.parseInt(comp2[0]));
            double dif = (fecha2.getTime() - fecha1.getTime());
            Double dias = ((((dif/1000)/60)/60)/24);
            resultado.setText(dias.toString() + " dias de diferencia");
        }
        if (e.getSource() == item2) {
            campo1.setText("");
            campo2.setText("");
            resultado.setText("Aquí va a aparecer el resultado");
        }
        if (e.getSource() == boton2) {
            Date currentDate = new Date();
            SimpleDateFormat hoy = new SimpleDateFormat("dd/MM/yy");            
            campo1.setText(hoy.format(currentDate));
        }
        if (e.getSource() == boton3) {
            Date currentDate = new Date();
            SimpleDateFormat hoy = new SimpleDateFormat("dd/MM/yy");            
            campo2.setText(hoy.format(currentDate));
        }
    }
    public static void main(String[] args) {
    test contenedor = new test();
    contenedor.setBounds(0,0,500,300);
    contenedor.setVisible(true);
    contenedor.setLocationRelativeTo(null);
    contenedor.setResizable(false);
    }
}
