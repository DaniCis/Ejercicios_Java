import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

public class DanielaCisnerosExamen extends Applet implements ActionListener{
	
	Graphics z;
	LinkedList <Productos> ListaProductos= new LinkedList<Productos>();
	Label lblTitutlo= new Label("  EMPRESA DE SEGUROS");
	Label lbLAfiliado = new Label("AFILIADO");
	Label lblNombre = new Label("Nombre");
	Label lblEdad = new Label("Edad");
	TextField txtnombre= new TextField(10);
	TextField txtedad= new TextField(10);
	Label lblSeguro = new Label("SEGURO");
	Label lblTipo = new Label("Tipo de Seguro");
	Label lbltipn= new Label("Tipo #");	
	TextField txttinum= new TextField(10);
	Label lblDuracion = new Label("Duración");
	TextField txttipo= new TextField(10);
	TextField txtduracion= new TextField(10);
	Label lbLVentas = new Label("   VENTAS");
	Label lblnum = new Label("Número de ventas");
	TextField txtnum= new TextField(10);
	Button btnIngresarSeguro= new Button("Ingresar Seguro");
	Button btnIngresarAfiliado= new Button("Ingresar Afiliado y Mostrar lista");
	Button btnVentas= new Button("Calcular Ventas");
	Button btnGraficar= new Button("Graficar");
		
	public void init() {
		setLayout(null);
		add(lblTitutlo);
		add(lbLAfiliado);
		add(lblNombre);
		add(lblEdad);
		add(txtnombre);
		add(txtedad);
		add(lblSeguro);
		add(lblTipo);
		add(lblDuracion);
		add(txttipo);
		add(txtduracion);
		add(lbLVentas);
		add(lblnum);
		add(lbltipn);
		add(txttinum);
		add(txtnum);
		add(btnIngresarSeguro);
		add(btnIngresarAfiliado);
		add(btnVentas);
		add(btnGraficar);
		btnIngresarSeguro.addActionListener(this);
		btnIngresarAfiliado.addActionListener(this);
		btnVentas.addActionListener(this);
		btnGraficar.addActionListener(this);
	}

	public void paint(Graphics g) {
		
		z=this.getGraphics();
		setBackground(Color.black);
		lblTitutlo.setBounds(190,15,150,20);
		lblTitutlo.setBackground(Color.red);
		lblSeguro.setBounds(50,40,65,20);
		lblSeguro.setBackground(Color.magenta);
		lblTipo.setBounds(20,70,90,20);
		lblTipo.setBackground(Color.orange);
		txttipo.setBounds(120,70,90,20);
		lblDuracion.setBounds(20,110,70,20);
		lblDuracion.setBackground(Color.orange);
		txtduracion.setBounds(120,100,90,20);
		lbltipn.setBounds(20,140,70,20);
		lbltipn.setBackground(Color.orange);
		txttinum.setBounds(120,140,90,20);
		btnIngresarSeguro.setBounds(40,170,130,30);
		lbLAfiliado.setBounds(350,40,60,20);
		lbLAfiliado.setBackground(Color.magenta);
		lblNombre.setBounds(300,70,50,20);
		lblNombre.setBackground(Color.orange);
		txtnombre.setBounds(370,70,90,20);
		lblEdad.setBounds(300,100,50,20);
		lblEdad.setBackground(Color.orange);
		txtedad.setBounds(370,100,90,20);
		btnIngresarAfiliado.setBounds(300,150,190,30);
		btnGraficar.setBounds(210,200,70,30);
		btnVentas.setBounds(600,100,100,30);
		lbLVentas.setBounds(550,40,65,20);
		lbLVentas.setBackground(Color.magenta);
		lblnum.setBounds(500,70,110,20);
		lblnum.setBackground(Color.orange);
		txtnum.setBounds(620,70,90,20);
	}
	public void actionPerformed(ActionEvent x)
	{
		if(x.getSource()==btnIngresarSeguro)
		{
			String TipoSeguro=txttipo.getText();
			int Duracion= Integer.parseInt(txtduracion.getText());
			int tipo= Integer.parseInt(txttinum.getText());
			Productos pro1= new Productos(TipoSeguro,tipo,Duracion);
			ListaProductos.add(pro1);
		}
		if(x.getSource()==btnGraficar)
		{
			Graficar(z); 
		}
		if(x.getSource()==btnVentas)
		{
			int Numventas=Integer.parseInt(txtnum.getText());
			Ventas ven= new Ventas(Numventas);
			ven.VerDatos(z,800,50);
		}
		if(x.getSource()==btnIngresarAfiliado)
		{
			String Nombre=txtnombre.getText();
			int Edad = Integer.parseInt(txtedad.getText());
			Afiliados afi = new Afiliados(Nombre,Edad,ListaProductos);
			afi.VerDatos(z);
		}
		
	}
	public void Graficar(Graphics g){
		int cont1 = 0,cont2=0,cont3 = 0,cont4=0,cont5 = 0,contn=0;
		int j=1,w = 5;
		int q= 90;
		int qp = 650;
		String P1="tipo 1";
		String P2="tipo 2";
		String P3="tipo 3";
		String P4="tipo 4";
		String P5="tipo 5";
		g.setColor(Color.WHITE);
		g.drawLine(60,320,60,650); 
		g.drawLine(25,630,680,630);
		
		for (int i = 0; i<600; i++){
		g.drawLine(60+i, 620,60+i, 640);
		if(j==1){
		g.setColor(Color.magenta);
		g.drawString(""+P1, q+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==2){
		g.setColor(Color.magenta);
		g.drawString(""+P2, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==3){
		g.setColor(Color.magenta);
		g.drawString(""+P3, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==4){
		g.setColor(Color.magenta);
		g.drawString(""+P4, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==5){
		g.setColor(Color.magenta);
		g.drawString(""+P5, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else{
		g.setColor(Color.magenta);
		g.drawString("Otro tipo", q+6+i, qp);
		g.setColor(Color.WHITE);
		}j++;
		i = i+99;}
		g.drawLine(660, 620,660, 640);
		int q1 = 10;
		int qr = 340;
		for (int i = 0; i<401; i++){
		g.drawLine(50,630-i,70,630-i);
		if(w!=0){
			if(w==1){
		g.setColor(Color.magenta);
		g.drawString(w+"Vent.", q1, qr+i);
		g.setColor(Color.WHITE);
			}
		else{
		g.setColor(Color.magenta);
		g.drawString(w+" Vent(s)", q1, qr+i);
		g.setColor(Color.WHITE);}
		w--;
		}
		i = i+67;
		}
		Productos[] pac= ListaProductos.toArray(new  Productos[ListaProductos.size()]);
		for (int i = 0; i<pac.length; i++){
			if(pac[i].getTipo()==1)
                    cont1++;
			else if(pac[i].getTipo()==2)
                    cont2++;
			else if(pac[i].getTipo()==3)
                    cont3++;
			else if(pac[i].getTipo()==4)
             		cont4++;
            else if(pac[i].getTipo()==5)
            	cont5++;
            else
            	contn++;
		}
		int posx = 60;
		int posy= 630;
		g.setColor(new Color(29,218,175));
		g.fillRect(posx,posy-cont1*68, 100, cont1*68);
		g.setColor(new Color(239,193,250));
		g.fillRect(posx+100,posy-cont2*68, 100, cont2*68);
		g.setColor(new Color(193,250,195));
		g.fillRect(posx+200,posy-cont3*68, 100, cont3*68);
		g.setColor(new Color(253,91,150));
		g.fillRect(posx+300,posy-cont4*68, 100, cont4*68);
		g.setColor(new Color(209,244,250));
		g.fillRect(posx+400,posy-cont5*68, 100, cont5*68);
		g.setColor(new Color(250,249,136));
		g.fillRect(posx+500,posy-contn*68, 100, contn*68);
	}
}