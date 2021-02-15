import java.awt.*;
import java.text.*;
import java.applet.*;
import java.awt.event.*;

class Circulo {
	private int radio;
	public Circulo(int radio)
	{
		this.radio=radio;
	}
	public void VerDatos(Graphics g)
	{
		g.drawString("El radio es: "+this.radio,15,20);
	}
	public double CalcularArea()
	{
		return Math.PI*Math.pow(this.radio,2);
	}
}
class Cilindro extends Circulo {
	private int Altura;
	public Cilindro(int Altura,int radio)
	{
		super(radio);
		this.Altura=Altura;
	}
	public void VerDatos(Graphics g)
	{
		super.VerDatos(g);
		g.drawString("La altura es: "+this.Altura,30,20);
	}
	public double CalcularVolumen()
	{
		return super.CalcularArea()*this.Altura;
	}
	public void Graficar(Graphics g)
	{
		g.setColor(Color.green);
		g.drawOval(280,80,40,20);
		g.drawLine(280,90,280,160);
		g.drawLine(320,90,320,160);	
		g.drawOval(280,150,40,20);
	}
}
public class VolumenCilindro extends Applet implements  ActionListener{
	
	Graphics z;
	Label lblTitulo= new Label("VOLUMEN DE UN CILINDRO");
	Label lblRadio= new Label("Radio");
	Label lblAltura= new Label("Altura");
	Label lblVolumen= new Label("Volumen");
	Label lblVolvacio= new Label();
	TextField txtRadio= new TextField(5);
	TextField txtAltura= new TextField(5);
	Button btncalcular= new Button("Calcular");
	Button btngraficar= new Button("Graficar");
	
	
	public void init() {
		setLayout(null);
		add(lblTitulo);
		add(lblRadio);
		add(lblAltura);
		add(txtRadio);
		add(txtAltura);
		add(lblVolumen);
		add(lblVolvacio);
		add(btncalcular);
		add(btngraficar);
		btncalcular.addActionListener(this);
		btngraficar.addActionListener(this);	
	}

	public void paint(Graphics g)
	{
		z=this.getGraphics();
		setBackground(Color.LIGHT_GRAY);
		lblTitulo.setBackground(Color.CYAN);
		lblTitulo.setBounds(30,10,170,30);
		lblRadio.setBounds(55,50,50,20);
		lblRadio.setBackground(Color.magenta);
		lblAltura.setBounds(55,80,50,20);
		lblAltura.setBackground(Color.magenta);
		lblVolumen.setBounds(45,120,60,20);
		lblVolumen.setBackground(Color.magenta);
		lblVolvacio.setBounds(120,120,80,20);
		txtAltura.setBounds(120,80,50,20);
		txtRadio.setBounds(120,50,50,20);
		btncalcular.setBounds(55,180,60,30);
		btngraficar.setBounds(130,180,60,30);
		
	}
	public void actionPerformed(ActionEvent x)
	{
		Cilindro cil1= new Cilindro(Integer.parseInt(txtRadio.getText()),Integer.parseInt(txtAltura.getText()) );
		if(x.getSource()==btncalcular)
		{
			Double res= cil1.CalcularVolumen();
			DecimalFormat df= new DecimalFormat("0.00");
			lblVolvacio.setText(String.valueOf(df.format(res)));
			
		}
		if(x.getSource()==btngraficar)
		{
			cil1.Graficar(z);
		}
	}
}