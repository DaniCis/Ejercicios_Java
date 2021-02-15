import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

class Ventas {
	private int NumeroVentas;
	
	Ventas(int NumeroVentas){
		this.NumeroVentas=NumeroVentas;
	}
	public void VerDatos(Graphics g,int x,int y){
		g.drawString("Número de Ventas: "+this.NumeroVentas,x,y);
	}
	public int getNumeroVentas(){
		return NumeroVentas;
	}
}
