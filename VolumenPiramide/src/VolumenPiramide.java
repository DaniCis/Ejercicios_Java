import java.text.*;
import java.lang.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class Cuadrado{
	private int lado;
	Cuadrado(int lado)
	{
		this.lado=lado;
	}
	public double  CalcularArea()
	{
		return Math.pow(this.lado,4);
	}
}
class Piramide extends Cuadrado{
	
	private int altura;
	Piramide(int lado,int altura){
		super(lado);
		this.altura=altura;
	}
	public double CalcularVolumen()
	{
		return (super.CalcularArea()*altura)/3;
	}
	public void Graficar(Graphics g)
	{
		g.drawLine(300,200,400,200);
		g.drawLine(315,150,385,150);
		g.drawLine(315,150,300,200);
		g.drawLine(385,150,400,200);
		g.drawLine(300,200,350,100);
		g.drawLine(315,150,350,100);
		g.drawLine(400,200,350,100);
		g.drawLine(385,150,350,100);
	}
}

public class VolumenPiramide extends Applet implements ActionListener {
	
	Graphics z;
	Label lblTitulo= new Label("  VOLUMEN DE UNA PÍRAMIDE");
	Label lblladobase=new Label("Lado de la base");
	Label lblaltura= new Label("Altura");
	Label lblvolumen= new Label("Volumen");
	Label lblvolvacia= new Label();
	TextField txtlado= new TextField(5);
	TextField txtaltura= new TextField(5); 
	Button btncalcular= new Button("Calcular");
	Button btngraficar= new Button("Graficar");
		
	public void init() {
		setLayout(null);
		add(lblTitulo);
		add(lblladobase);
		add(lblaltura);
		add(lblvolumen);
		add(lblvolvacia);
		add(txtaltura);
		add(txtlado);
		add(btncalcular);
		add(btngraficar);
		btncalcular.addActionListener(this);
		btngraficar.addActionListener(this);
	}

	public void paint(Graphics g) {
		z=this.getGraphics();
		setBackground(Color.LIGHT_GRAY);
		lblTitulo.setBounds(50,10,180,20);
		lblTitulo.setBackground(Color.green);
		lblladobase.setBounds(20,40,95,20);
		txtlado.setBounds(120,40,50,20);
		lblladobase.setBackground(Color.cyan);
		lblaltura.setBounds(20,70,40,20);
		txtaltura.setBounds(120,70,50,20);
		lblaltura.setBackground(Color.cyan);
		lblvolumen.setBounds(20,100,60,20);
		lblvolumen.setBackground(Color.cyan);
		lblvolvacia.setBounds(120,100,70,20);
		btncalcular.setBounds(50,150,55,30);
		btngraficar.setBounds(150,150,60,30);
			}
	public void actionPerformed(ActionEvent x)
	{
		DecimalFormat df= new DecimalFormat("0.00");
		Piramide pira1= new Piramide(Integer.parseInt(txtlado.getText()),Integer.parseInt(txtaltura.getText()));
		if(x.getSource()==btncalcular)
		{
			double res=pira1.CalcularVolumen();
			lblvolvacia.setText(String.valueOf(df.format(res)));
		}
		if(x.getSource()==btngraficar)
		{
			pira1.Graficar(z);
		}
	}
}