import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

class Afiliados {
	private String Nombre;
	private int Edad;
	private LinkedList<Productos> ListaProuctos;
	
	public Afiliados(String Nombre,int Edad,LinkedList<Productos> ListaProductos){
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.ListaProuctos=ListaProductos;
	}
	public void VerDatos(Graphics g)
	{
		int x= 760,y=50;
		g.setColor(Color.white);
		g.drawString("Afiliado ",x,y);
		g.drawString("Nombre: "+ this.Nombre,x,y+=15);
		g.drawString("Edad: "+ this.Edad ,x,y+=15);
		g.drawString("Seguros: ",x,y+=15);
		for (int i = 0; i<ListaProuctos.size(); i++);
		{
			y+=30;
			Productos pro1,pro2,pro3;
			pro1= ListaProuctos.get(1);
			pro1.VerDatos(g,x,y);
			y+=80;
			pro2= ListaProuctos.get(2);
			pro2.VerDatos(g,x,y);
			y+=80;
			pro3= ListaProuctos.get(3);
			pro3.VerDatos(g,x,y);
			y+=80;
			
		}
		
	}
	
}
