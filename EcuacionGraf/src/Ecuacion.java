import java.awt.*;
import java.applet.*;
import java.text.*;
import java.awt.event.*;

class Ecuacion {
	private double coeficienteA;
	private double coeficienteB;
	private double coeficienteC;

	public Ecuacion( double coeficienteA,double  coeficienteB, double coeficienteC)
	{
		this.coeficienteA=coeficienteA;
		this.coeficienteB=coeficienteB;
		this.coeficienteC=coeficienteC;
	}
	public Ecuacion(){}
	
	public double CalcularDiscriminante()
	{
	 	return  Math.pow(coeficienteB, 2) - 4 * coeficienteA * coeficienteC;
	}
	public double[] CalcularRaices(double discriminate)
	{
				double[] raices=new double[2];
				if(discriminate>0)
				{
					raices[0]=((-coeficienteB+Math.sqrt(Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC)))/(2*coeficienteA);
					raices[1]=((-coeficienteB-Math.sqrt(Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC)))/(2*coeficienteA);
				}
				else if (discriminate==0)
				{
					raices[0]=((-coeficienteB+Math.sqrt(Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC)))/(2*coeficienteA);
				}	
				return raices;
		}
		public void Graficar(Graphics g, double coeficienteA, double coeficienteB, double coeficienteC)
		{
			if(coeficienteA==0)
			{
				g.setColor(Color.white);
				g.drawLine(350,190,420,55);
				g.drawString(coeficienteB+"x"+"+"+coeficienteC+"=0",350,235);
			}
			else
			{
				g.setColor(Color.white);
				g.drawArc(300,10,150,180,-100, 95);
				g.drawString(coeficienteA+"x^2"+"+"+coeficienteB+"x"+"+"+coeficienteC+"=0", 350,90);
			}
			
		}
}
