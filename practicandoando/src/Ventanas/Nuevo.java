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

public class Nuevo extends JFrame {

	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JTextField Nombre;
	JTextField Apellido;
	JTextField Edad;
	JTextField Sector;
	JButton Aceptar;
	//String texto= " ";
	
	String nombre;
	String apellido;
	int edad;
	String sector;
	
	public Nuevo() {
	Image imagen= Toolkit.getDefaultToolkit().getImage("jicon.png");	
	this.setTitle("Nuevo Empleado");
	this.setIconImage(imagen);
	this.setSize(300,195);
	this.setLocationRelativeTo(null);
	
	JLabel l1= new JLabel("Nombre");
	l1.setBounds(60,-5,100,30); 
	JLabel l2=new JLabel("Apellido");
	l2.setBounds(60,25,100,30);
	JLabel l3= new JLabel("Edad");
	l3.setBounds(60,55,100,30);
	JLabel l4= new JLabel("Sector");
	l4.setBounds(60,85,100,30);
	
	Nombre= new JTextField();
	Nombre.setBounds(110,0,100,20);
	Apellido= new JTextField();
	Apellido.setBounds(110,30,100,20);
	Edad= new JTextField();
	Edad.setBounds(110,60,100,20);
	Sector= new JTextField();
	Sector.setBounds(110,90,100,20);
	
	JButton Aceptar= new JButton("Aceptar");
	Aceptar.setBounds(85, 120, 100, 30);
	
	
	this.add(l1);
	this.add(l2);
	this.add(l3);
	this.add(l4);
	this.add(Nombre);
	this.add(Apellido);
	this.add(Edad);
	this.add(Sector);
	this.add(Aceptar);
	//Aceptar.addActionListener(Al);
	Aceptar.addActionListener(Al);				
	
					this.setLayout(null);
					this.setVisible(true);
					this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
ActionListener Al= new ActionListener() {
	@Override
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se presiono el boton "+ e.getActionCommand());
		
		if(e.getActionCommand().compareTo("Aceptar")==0) {
			System.out.println("funciona el boton");
			
			System.out.println("voy bien parte2");
			System.out.println("Se presiono el boton "+ e.getActionCommand());
			
			nombre = Nombre.getText();
			apellido = Apellido.getText();
			edad=Integer.parseInt(Edad.getText());
			sector = Sector.getText();
			
			/*Nombre.getText();
			Apellido.getText();
			Edad.getText();
			Sector.getText();
			*/
			System.out.println(Nombre +" "+Apellido+" "+Edad+" "+Sector+"\n");
			/*try {
				Scanner fp=new Scanner(datos);
				String S=" ";
				while(fp.hasNext()){
					S += fp.nextLine()+" \n";
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			/*try {
				new Principal();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			Nuevo.this.dispose();
			new Principal();
		}
		
	
}
};


}
	

