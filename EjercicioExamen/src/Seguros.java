import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

class Productos {
	private String TipoSeguro;
	private int Tipo;
	private int Duracion;
	
	public Productos(String TipoSeguro, int tipo,int Duracion){
		this.TipoSeguro=TipoSeguro;
		this.Tipo=tipo;
		this.Duracion=Duracion;
	}
	public int VerDatos(Graphics g, int x, int y){
		g.drawString("Tipo de Seguro: "+ this.TipoSeguro,x,y);
		g.drawString("Tipo#: "+ this.Tipo,x,y+=15);
		g.drawString("Duración: "+this.Duracion,x,y+=15);
		return y;
	}
	public int getTipo()
		{
			return this.Tipo;
		}
}
