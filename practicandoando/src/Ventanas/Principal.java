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

public class Principal extends JFrame implements ActionListener{

	
	File datos=new File("C:\\Users\\edgar\\eclipse-workspace\\java2024\\practicandoando\\Datos.txt");//cambiar ruta
	JTextArea area;
	JScrollPane sp;
	JMenuBar menu;
	JMenu cuentas;
	JMenu vistas;
	JButton filtro;
	JButton agregar;
	JButton aplicar;
	Nuevo Nv;

	public Principal() {
		Image imagen= Toolkit.getDefaultToolkit().getImage("jicon.png");
		this.setTitle("Base de Datos");
		this.setIconImage(imagen);	
		this.setSize(500, 800);
		this.setLocationRelativeTo(null);
		
		JTextArea area=new JTextArea();
		
		Scanner fp = null;
		try {
			fp = new Scanner(datos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String S=" ";
		while(fp.hasNext()){
			S += fp.nextLine()+" \n";
		}
		area.setText(S);
		
		JScrollPane sp= new JScrollPane(area);
		sp =new JScrollPane(area);
		sp.setSize(300,700);
		
		JMenuBar menu=new JMenuBar();
			JMenu cuentas=new JMenu("Cuentas");
			JMenu vistas=new JMenu("Vistas");
					
		JButton filtro=new JButton("Filtro");
		filtro.setBounds(345,50,100,30);
		
		JButton agregar=new JButton("Agregar");
		agregar.setBounds(345,100,100,30);
		
		JButton aplicar=new JButton("Aplicar");
		aplicar.setBounds(345,150,100,30);
		

this.setJMenuBar(menu);
this.add(filtro);
this.add(aplicar);
this.add(agregar);
filtro.addActionListener(A);
agregar.addActionListener(A);
aplicar.addActionListener(A);
menu.add(cuentas);
menu.add(vistas);
this.add(sp);
			this.setLayout(null);
			this.setVisible(true);
			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
ActionListener A= new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().compareTo("Agregar")==0) {
			
			System.out.println("voy bien gfgfgfgfg");
			System.out.println("Se presiono el boton "+ e.getActionCommand());
			new Nuevo();
			Principal.this.dispose();

			
		}
		
		if(e.getActionCommand().compareTo("Aplicar")==0) {
			Scanner fp;
			try {
				
				fp = new Scanner(datos);
				String S=" ";
				while(fp.hasNext()){
					S += fp.nextLine()+" \n";
				}
				//area.setText(Nombre.getText());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			System.out.println("hfhfh");
		}
		if(e.getActionCommand().compareTo("Filtro")==0) {
			System.out.println("siga");
			//new Filtro();
			
	}}
};

@Override
public void actionPerformed(ActionEvent e) {		
}
}