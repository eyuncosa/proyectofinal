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

class Filtro extends JFrame implements ActionListener {
	
	JLabel l1;
	JComboBox<String> Sector;
	public Filtro() {
	
		Image imagen= Toolkit.getDefaultToolkit().getImage("jicon.png");	
		this.setTitle("Filtrar por Cargo");
		this.setIconImage(imagen);
		this.setSize(300,150);
		this.setLocationRelativeTo(null);
		JLabel l1=new JLabel("Seleccione el cargo a filtrar: ");
		l1.setBounds(60,5,180,30);
		Sector= new JComboBox<String>();
		Sector.addItem("Seleccione");
		Sector.addItem("Programación");
		Sector.addItem("Técnico");
		Sector.addItem("Tester");
		Sector.addItem("Administración");
		Sector.setBounds(80,40,120,20);
		
		JButton Aceptar= new JButton("Aceptar");
		Aceptar.setBounds(100, 70, 80, 25);
this.add(l1);		
this.add(Sector);
this.add(Aceptar);
Aceptar.addActionListener(Al);
				
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
ActionListener Al=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().compareTo("Aceptar")==0) {
			
			System.out.println("siga");
			new Filtro();
			
		File datos =new File("C:\\Users\\edgar\\OneDrive\\Escritorio\\proyectofinal\\Datos.txt");	
		
		File cargo=new File("C:\\Users\\edgar\\OneDrive\\Escritorio\\proyectofinal\\cargo.txt");
		PrintWriter Escribe;
		
		
		try {
			Escribe = new PrintWriter(cargo);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		Scanner lectura;
		Escribe = new PrintWriter("cargo");
		try {
			lectura=new Scanner(new File("C:\\Users\\edgar\\OneDrive\\Escritorio\\proyectofinal\\Datos.txt"));
			while(lectura.hasNext()) {
				
				int a = lectura.nextInt();
				System.out.print(a+" ");
				String nombre= lectura.next();
				System.out.print(nombre+" ");
				String apellido= lectura.next();
				System.out.print(apellido+" ");
				int edad= lectura.nextInt();
				System.out.print(edad+" ");
				String cargos= lectura.next();
				System.out.println(cargos+" ");
				
				
				if(Sector.getSelectedItem()=="Programación") {
					Escribe.println(a+ " "+nombre+" "+apellido+" "+edad+" "+cargos+" "+"\n");
					System.out.println("se entiende");
				}
			}
			lectura.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Escribe.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
	}
};

@Override
public void actionPerformed(ActionEvent e) {		
	}
}


