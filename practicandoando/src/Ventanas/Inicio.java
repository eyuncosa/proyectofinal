package Ventanas;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Inicio extends JFrame implements ActionListener {
	JLabel l1;
	JTextField text1;
	JPasswordField text2;
	JLabel l2;
	JButton A;
	
	


public Inicio() {
	Image imagen= Toolkit.getDefaultToolkit().getImage("jicon.png");
	this.setTitle("Inicio de Sesión");
	this.setIconImage(imagen);
	this.setSize(400, 500);
	this.setLocationRelativeTo(null);
	
	l1= new JLabel("Usuario");
	l1.setBounds(80, 100, 100, 100);
	
	text1= new JTextField();
	text1.setBounds(140, 135, 150, 30);
	
	 l2= new JLabel("Contraseña");
	l2.setBounds(58, 135, 100, 100);
	
	 text2= new JPasswordField();
	text2.setBounds(140, 170, 150, 30);
	
	A= new JButton("Iniciar Sesión");
	A.setBounds(150, 230, 120, 40);
this.add(l1);
this.add(text1);
this.add(l2);
this.add(text2);
A.addActionListener(Al);
this.add(A);


	this.setLayout(null);
	this.setVisible(true);
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
}
ActionListener Al= new ActionListener() {
@Override

public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
System.out.println("Se presiono el boton "+ e.getActionCommand());

if(e.getActionCommand().compareTo("Iniciar Sesión")==0) {
	System.out.println("rdrdrrdrdr");
	Scanner lectura;
	try {
		lectura = new Scanner(new File("C:\\Users\\edgar\\eclipse-workspace\\java2024\\practicandoando\\usuarios.txt"));
		while(lectura.hasNext()) { //para leer varias lineas
			
			
			String nombre= lectura.next();
			System.out.println(nombre+" ");
			String contra= lectura.next();
			System.out.print(contra+" ");
			
			text1.getText();			
			text2.getPassword();
			if(text1.getText().compareTo(nombre)==0 && ( String.valueOf( text2.getPassword() ).compareTo(contra)==0)) {
				System.out.println("voy bien");
				new Principal();
				Inicio.this.dispose();
			}else {
				System.out.println("siga intentando");
				JOptionPane.showMessageDialog(null, "Valores Ingresados No Válidos"+ " \nIntente Nuevamente");
			}
		}
		text1.getText();			
		text2.getPassword();
				
	
		
	
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	System.out.println(e.getActionCommand());
	}
}
};

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
}
	
}
