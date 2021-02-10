import java.awt.*;
import java.applet.*;
import java.text.*;

class Trapecio {
	private double Altura;
	private double Basemenor;
	private double Basemayor;
	
	Trapecio(double alt,double bmen,double bmay)
	{
		this.Altura=alt;
		this.Basemenor=bmen;
		this.Basemayor=bmay;
	}
	Trapecio(){
	}
	public void Setear(double alt, double bmay, double bmen)
	{
		this.Altura=alt;
		this.Basemayor=bmay;
		this.Basemenor=bmen;
	}
	public double CalcularArea()
	{
		return Altura*((Basemayor+Basemenor)/2);	
	}
	public void VerDatos(Graphics g)
	{
		g.setColor(Color.MAGENTA);
		g.drawString("TRAPECIO",50,40);
		g.setColor(Color.white);	
		g.drawString("Base mayor: "+Basemayor+"cm",14,60);
		g.drawString("Base menor: "+Basemenor+"cm",14,75);
		g.drawString("Altura: "+Altura+"cm",14,90);
	}
	public void Graficar(Graphics g)
	{
		g.setColor(Color.PINK);
		int[] x={30,50,130,150};
		int[] y={190,140,140,190};
		g.drawPolygon(x,y,4);
		g.setColor(Color.BLACK);
	}
		public void VerDatos2(Graphics g)
	{
		g.setColor(Color.white);
		g.drawString("Base mayor: "+Basemayor+"cm",14,250);
		g.drawString("Base menor: "+Basemenor+"cm",14,265);
		g.drawString("Altura: "+Altura+"cm",14,280);
	}
	public void Graficar2(Graphics g)
	{
		g.setColor(Color.green);
		int[] x={15,70,140,195};
		int[] y={375,325,325,375};
		g.drawPolygon(x,y,4);
		g.setColor(Color.BLACK);
	}
}
class Cilindro {
	private double Altura;
	private double Radio;
	Cilindro(double alt,double rad)
	{
		this.Altura=alt;
		this.Radio=rad;
	}
	Cilindro(){
	}
	public void Setear(double alt, double rad)
	{
		this.Altura=alt;
		this.Radio= rad;
	}
	public void VerDatos(Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.drawString("CILINDRO",270,40);
		g.setColor(Color.white);	
		g.drawString("Radio: "+Radio+"cm",220,60);
		g.drawString("Altura: "+Altura+"cm",220,75);
	}
	public double CalcularArea()
	{
		return (2*Math.PI*Radio*Altura)+2*(Math.PI*Math.pow(
			Radio,2));
	}
	public double CalcularVolumen()
	{
		return Math.PI*Altura*Math.pow(Radio,2);
	}
	public void Graficar(Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.drawOval(280,120,40,20);
		g.drawLine(280,130,280,200);
		g.drawLine(320,130,320,200);	
		g.drawOval(280,190,40,20);
		g.setColor(Color.BLACK);
	}
	public void VerDatos2(Graphics g)
	{
		g.setColor(Color.white);	
		g.drawString("Radio: "+Radio+"cm",220,250);
		g.drawString("Altura: "+Altura+"cm",220,265);
	}
	public void Graficar2(Graphics g)
	{
		g.setColor(Color.red);
		g.drawOval(280,310,60,15);
		g.drawLine(280,320,280,389);
		g.drawLine(340,320,340,389);	
		g.drawOval(280,380,60,15);
		g.setColor(Color.BLACK);
	}
}
class Cono{
	private double Altura;
	private double Generatriz;
	private double Radio;
	Cono(double alt, double gen, double rad)
	{
		this.Altura= alt;
		 this.Generatriz=gen;
		 this.Radio=rad;
	}
	Cono(){
	}
	public void Setear(double alt, double gen, double rad)
	{
		 this.Altura= alt;
		 this.Generatriz=gen;
		 this.Radio=rad;
	}
	public void VerDatos(Graphics g)
	{
		g.setColor(Color.cyan);
		g.drawString("CONO",499,40);
		g.setColor(Color.white
			);	
		g.drawString("Radio: "+Radio+"cm",450,60);
		g.drawString("Generatriz: "+Generatriz+"cm",450,75);
		g.drawString("Altura: "+Altura+"cm",450,90);
	}
	public double CalcularArea()
	{
		return  Math.PI*Radio*(Radio+Generatriz);
	}
	public double CalcularVolumen()
	{
		return (Math.PI*Math.pow(Radio,2)*Altura)/3;
	}
	public void Graficar(Graphics g)
	{
		g.setColor(Color.blue);
		g.drawOval(487,130,60,15);
		g.drawLine(488,135,520,200);
		g.drawLine(547,135,520,200);
		g.setColor(Color.BLACK);
	}
	public void VerDatos2(Graphics g)
	{
		g.setColor(Color.white);	
		g.drawString("Radio: "+Radio+"cm",450,250);
		g.drawString("Generatriz: "+Generatriz+"cm",450,265);
		g.drawString("Altura: "+Altura+"cm",450,280);
	}
	public void Graficar2(Graphics g)
	{
		g.setColor(Color.GRAY);
		g.drawOval(500,320,45,25);
		g.drawLine(500,330,522,385);
		g.drawLine(545,335,522,385);
		g.setColor(Color.BLACK);
	}
}
public class Figurasgeometricas extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		setBackground(Color.BLACK);
		Font tip= new Font("Verdana",Font.BOLD,16);
		g.setFont(tip);
		g.setColor(Color.RED);
		g.drawString("FIGURAS GEOMÉTRICAS",220,15);
		DecimalFormat df= new DecimalFormat("#.00");
		Font tip2= new Font("Verdana",Font.PLAIN,12);
		g.setFont(tip2);
	
		Trapecio trap1 = new Trapecio();
		Trapecio trap2 = new Trapecio(8,12,20);//Con constructor
		trap1.Setear(6,15,12);
		trap1.VerDatos(g);
		g.drawString("Área: "+df.format(trap1.CalcularArea())+" cm cuadrados",14,105);
		trap1.Graficar(g);
		trap2.VerDatos2(g);
		g.drawString("Área: "+df.format(trap2.CalcularArea())+" cm cuadrados",14,295);
		trap2.Graficar2(g);
		
		Cilindro cilin1= new Cilindro();
		cilin1.Setear(16,10);
		cilin1.VerDatos(g);
		g.drawString("Área: "+df.format(cilin1.CalcularArea())+" cm cuadrados",220,90);
		g.drawString("Volúmen: "+df.format(cilin1.CalcularVolumen())+" cm cúbicos",220,105);
		cilin1.Graficar(g);
		Cilindro cilin2= new Cilindro(8,5);//Con constructor
		cilin2.VerDatos2(g);
		g.drawString("Área: "+df.format(cilin2.CalcularArea())+" cm cuadrados",220,280);
		g.drawString("Volúmen: "+df.format(cilin2.CalcularVolumen())+" cm cúbicos",220,295);
		cilin2.Graficar2(g);
		
		
		Cono con1= new Cono();
		con1.Setear(4,5,3);
		con1.VerDatos(g);
		g.drawString("Área: "+df.format(con1.CalcularArea())+" cm cuadrados",450,105);
		g.drawString("Volúmen: "+df.format(con1.CalcularVolumen())+" cm cúbicos",450,120);
		con1.Graficar(g);
		Cono con2= new Cono(5,5.38,2);//Con constructor
		con2.VerDatos2(g);
		g.drawString("Área: "+df.format(con2.CalcularArea())+" cm cuadrados",450,295);
		g.drawString("Volúmen: "+df.format(con2.CalcularVolumen())+" cm cúbicos",450,310);
		con2.Graficar2(g);
		
		
	}
}