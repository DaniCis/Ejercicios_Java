import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.text.*;

public class EcuacionGraf extends Applet implements ActionListener {

	Graphics g;
	Label lbltitulo=new Label("ECUACIONES");
	Label lblcoeficientea=new Label("Coeficiente a");
	Label lblcoeficienteb=new Label("Coeficiente b");
	Label lblcoeficientec=new Label("Coeficiente c");
	Label lblraiz1=new Label("Raiz 1");
	Label lblraiz2=new Label("Raiz 2");
	Label lblobservacion= new Label("Observ");
	Button btncalcular=new Button ("Calcular");
	Button btngraficar=new Button ("Graficar");	
	TextField txtcoeficientea= new TextField(10);
	TextField txtcoeficienteb= new TextField(10);
	TextField txtcoeficientec= new TextField(10);
	Label lblvaciaraiz1=new Label();
	Label lblvaciaraiz2=new Label();
	Label lblvaciaobs=new Label();	
		
	public void init() 
		{
			setLayout(null);
			add(lblcoeficientea);
			add(lblcoeficienteb);
			add(lblcoeficientec);
			add(lblraiz1);
			add(lblraiz2);
			add(lblobservacion);
			add(lbltitulo);
			add(btncalcular);
			add(btngraficar);
			add(txtcoeficientea);
			add(txtcoeficienteb);
			add(txtcoeficientec);
			add(lblvaciaraiz1);
			add(lblvaciaraiz2);
			add(lblvaciaobs);
			btncalcular.addActionListener(this);
			btngraficar.addActionListener(this);
		}

	public void paint(Graphics z) 
	{
		g=this.getGraphics();
		setBackground(Color.gray);
		lbltitulo.setBackground(new Color(0,220,30));
		lbltitulo.setBounds(100,10,85,30);
		lblcoeficientea.setBounds(20,65,80,30);
		lblcoeficientea.setBackground(Color.red);
		lblcoeficienteb.setBounds(20,100,80,30);
		lblcoeficienteb.setBackground(Color.red);
		lblcoeficientec.setBounds(20,135,80,30);
		lblcoeficientec.setBackground(Color.red);
		lblraiz1.setBounds(20,180,45,20);
		lblraiz1.setBackground(Color.magenta);
		lblraiz2.setBounds(175,180,45,20);
		lblraiz2.setBackground(Color.magenta);
		lblobservacion.setBounds(20,215,50,20);
		lblobservacion.setBackground(Color.orange);
		lblvaciaraiz1.setBounds(90,180,75,20);
		lblvaciaraiz2.setBounds(230,180,75,20);
		lblvaciaobs.setBounds(90,215,215,20);
		
		txtcoeficientea.setBounds(130,65,80,30);
		txtcoeficienteb.setBounds(130,100,80,30);
		txtcoeficientec.setBounds(130,135,80,30);
		
		btncalcular.setBounds(20,255,60,30);
		btncalcular.setBackground(Color.cyan);
		btngraficar.setBounds(170,255,60,30);
		btngraficar.setBackground(Color.cyan);
		
	}
		public void actionPerformed(ActionEvent x)
	{
		if(x.getSource()==btncalcular)
		{
			DecimalFormat d = new DecimalFormat("0.00");
			double coeficienteA=Double.parseDouble(txtcoeficientea.getText());
			double coeficienteB=Double.parseDouble(txtcoeficienteb.getText());
			double coeficienteC=Double.parseDouble(txtcoeficientec.getText());
			Ecuacion ecuacion=new Ecuacion(coeficienteA, coeficienteB, coeficienteC);
			double [] raices= ecuacion.CalcularRaices(ecuacion.CalcularDiscriminante());
				if(ecuacion.CalcularDiscriminante()>0)
				{
					lblvaciaraiz1.setText(String.valueOf(d.format(raices[0])));
					lblvaciaraiz2.setText(String.valueOf(d.format(raices[1])));
					lblvaciaobs.setText("Existen dos raices reales.");
				}
				else if(ecuacion.CalcularDiscriminante()==0)
				{
					lblvaciaraiz1.setText(String.valueOf(d.format(raices[0])));
					lblvaciaobs.setText("Existe solamente una raiz real.");
				}
				else
				{
					lblvaciaraiz1.setText("----");
					lblvaciaraiz2.setText("----");
					lblvaciaobs.setText("Existen raices imaginarias");
				}
		}
		if(x.getSource()==btngraficar)
		{
			double coeficienteA=Double.parseDouble(txtcoeficientea.getText());
			double coeficienteB=Double.parseDouble(txtcoeficienteb.getText());
			double coeficienteC=Double.parseDouble(txtcoeficientec.getText());
			Ecuacion ecuacion=new Ecuacion(coeficienteA, coeficienteB, coeficienteC);
			ecuacion.Graficar(g,coeficienteA,coeficienteB,coeficienteC);
		}
	}
}