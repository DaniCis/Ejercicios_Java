import java.awt.*;
import java.applet.*;
import java.text.*;
class Ecuacion
{
	private double a;
	private double b;
	private double c;
	Ecuacion(double a,double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	Ecuacion(){}
	public void Setear(double a,double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void VerDatos(Graphics g)
	{
		g.setColor(Color.pink);
		g.drawString("Ecuación de 1er grado",15,35);
		g.setColor(Color.white);
		g.drawString("Coeficiente a: "+a,15,55);
		g.drawString("Coeficiente b: "+b,15,70);
		g.drawString(a+"x + "+b+" = 0",15,85);
	}
	public double CalcularSolPrimer()
	{
		return (-b/a);
	}
	public void VerDatos2(Graphics g)
	{
		g.setColor(Color.orange);
		g.drawString("Ecuación de 2do grado",310,35);
		g.setColor(Color.white);
		g.drawString("Coeficiente a: "+a,300,55);
		g.drawString("Coeficiente b: "+b,300,70);
		g.drawString("Coeficiente c: "+c,300,85);
		g.drawString(a+"x^2 + "+b+"x + "+c+" =0",300,100);
	}
	public void GraficarRecta(Graphics g)
	{
		g.drawLine(30,270,200,270);
		g.drawLine(115,170,115,360);
		g.setColor(Color.cyan);
		g.drawLine(50,340,160,170);
		g.drawString("Y",113,162);
		g.drawString("X",210,270);
		g.setColor(Color.white);
	}
	public void GraficarParabola(Graphics g)
	{
		g.drawLine(370,270,540,270);
		g.drawLine(450,170,450,360);
		g.setColor(Color.cyan);
		g.drawString("Y",453,162);
		g.drawString("X",547,270);
		g.drawArc(400,105,58,200,180,180);
	}
	public double CalcularRaizPos()
	{
		double x1;
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return x1;
	}
	public double CalcularRaizNeg()
	{
		double x2;
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return x2;
	}
	
}
public class Ecuaciones extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		setBackground(Color.gray);
		DecimalFormat ft= new DecimalFormat("#.00");
		g.setColor(Color.red);
		g.drawString("ECUACIONES", 180, 15 );
		
		Ecuacion ec1= new Ecuacion();
		ec1.Setear(2,1,0);
		ec1.VerDatos(g);
		g.setColor(Color.magenta);
		g.drawString("Solución",25,120);
		g.setColor(Color.white);
		g.drawString("X= "+ft.format(ec1.CalcularSolPrimer()),25,140);
		ec1.GraficarRecta(g);
		ec1.GraficarParabola(g);
		
		Ecuacion ec2= new Ecuacion(2,5,2);
		ec2.VerDatos2(g);
		g.setColor(Color.green);
		g.drawString("Soluciones",305,120);
		g.setColor(Color.white);
		g.drawString("Raiz 1= "+ft.format(ec2.CalcularRaizPos()),300,140);
		g.drawString("Raiz 2= "+ft.format(ec2.CalcularRaizNeg()),300,155);
		
		
	}
}