import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ingresardatos extends JPanel implements ActionListener {
    private JButton siguiente;
    private JLabel titulo9;
    private JLabel tem;
    private JLabel hum;
    private JLabel p;
    private JLabel llu;
    private JTextField temperatura;
    private JTextField humedad;
    private JTextField ph;
    private JTextField lluvia;
    private JLabel titulo8;
    private JTextArea mostrardatos;
    private JLabel titulo10;
    private JButton ver;

    public Ingresardatos() {
        //construct components
        siguiente = new JButton ("Siguiente");
        titulo9 = new JLabel ("Ingresa los datos de tu terreno:");
        tem = new JLabel ("Temperatura");
        hum = new JLabel ("Humedad");
        p = new JLabel ("ph");
        llu = new JLabel ("Lluvia");
        temperatura = new JTextField (5);
        humedad = new JTextField (5);
        ph = new JTextField (5);
        lluvia = new JTextField (5);
        titulo8 = new JLabel ("Agro tester");
        mostrardatos = new JTextArea (5, 5);
        titulo10 = new JLabel ("Tus datos fueron:");
        ver = new JButton ("Ver");
        ver.addActionListener(this);
        siguiente.addActionListener(this);


        //adjust size and set layout
        setPreferredSize (new Dimension (539, 278));
        setLayout (null);

        //add components
        add (siguiente);
        add (titulo9);
        add (tem);
        add (hum);
        add (p);
        add (llu);
        add (temperatura);
        add (humedad);
        add (ph);
        add (lluvia);
        add (titulo8);
        add (mostrardatos);
        add (titulo10);
        add (ver);

        //set component bounds (only needed by Absolute Positioning)
        siguiente.setBounds (425, 240, 100, 25);
        titulo9.setBounds (185, 40, 190, 35);
        tem.setBounds (40, 90, 100, 25);
        hum.setBounds (175, 90, 100, 25);
        p.setBounds (320, 90, 100, 25);
        llu.setBounds (440, 90, 100, 25);
        temperatura.setBounds (30, 115, 100, 25);
        humedad.setBounds (155, 115, 100, 25);
        ph.setBounds (280, 115, 100, 25);
        lluvia.setBounds (405, 115, 100, 25);
        titulo8.setBounds (245, 10, 100, 25);
        mostrardatos.setBounds (30, 180, 230, 80);
        titulo10.setBounds (95, 155, 100, 25);
        ver.setBounds (285, 180, 100, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Ingresardatos());
        frame.pack();
        frame.setVisible (true);
    }


    
    public void actionPerformed(ActionEvent e) {
     String temperatura1= temperatura.getText();
     String humedad1 = humedad.getText();
     String lluvia1 = lluvia.getText();
     String ph1= ph.getText();

      if(e.getSource()== ver){
        String texdef = " tus datos son:\n  "+"ph =" + ph1 +"\n Humedad ="+ humedad1 + "\n Lluvia ="+ lluvia1+ "\n Temperatura ="+ temperatura1;
        mostrardatos.setText(texdef);
      }
      if(e.getSource()== siguiente){
        JFrame frame = new JFrame ("MyPanel");
            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add (new Resultados(temperatura1,humedad1,lluvia1,ph1));
            frame.pack();
             frame.setVisible (true);
      }
    }
}
