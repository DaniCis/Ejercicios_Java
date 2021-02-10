import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

public class SistemaAcademico extends Applet implements ActionListener {
	
	Graphics z;
	LinkedList <Estudiante> ListaEstudiantes= new LinkedList<Estudiante>();
	Label lblTitutlo= new Label("  SISTEMA ACADÉMICO");
	Label lblEstudiante= new Label("Estudiante");
	Label lblNombre = new Label("Nombre");
	Label lblEdad = new Label("Edad");
	Label lblSexo = new Label("Sexo");
	Label lblCarrera = new Label("Carrera");
	Label lblNivel = new Label("nivel");
	Label lblProfesor = new Label("Profesor");
	Label lblNombre2 = new Label("Nombre");
	Label lblEdad2 = new Label("Edad");
	Label lblSexo2 = new Label("Sexo");
	Label lblEspecialidad= new Label("Especialidad");
	TextField txtnombre= new TextField(10);
	TextField txtedad= new TextField(10);
	TextField txtsexo= new TextField(10);
	TextField txtcarrera= new TextField(10);
	TextField txtnivel= new TextField(10);
	TextField txtnombre2= new TextField(10);
	TextField txtedad2= new TextField(10);
	TextField txtsexo2= new TextField(10);
	TextField txtespecialidad = new TextField(10);
	Button btnIngresarEstu= new Button("Ingresar Estudiante");
	Button btnIngresarProf = new Button("Ingresar Profesor ");
	Button btnGraficar= new Button("Graficar");
	
	
	public void init() {
		setLayout(null);
		add(lblTitutlo);
		add(lblEstudiante);
		add(lblNombre);
		add(lblEdad);
		add(lblSexo);
		add(lblCarrera);
		add(lblNivel);
		add(lblEspecialidad);
		add(txtnombre);
		add(txtedad);
		add(txtsexo);
		add(txtcarrera);
		add(txtnivel);
		add(txtespecialidad);
		add(lblNombre2);
		add(lblEdad2);
		add(lblSexo2);
		add(txtnombre2);
		add(txtedad2);
		add(txtsexo2);
		add(lblProfesor);
		add(btnIngresarEstu);
		add(btnIngresarProf);
		add(btnGraficar);
		btnIngresarEstu.addActionListener(this);
		btnIngresarProf.addActionListener(this);
		btnGraficar.addActionListener(this);
	}

	public void paint(Graphics g) {
		z=this.getGraphics();
		setLayout(null);
		setBackground(Color.black);
		lblTitutlo.setBounds(190,15,150,20);
		lblTitutlo.setBackground(Color.red);
		lblEstudiante.setBounds(50,40,65,20);
		lblEstudiante.setBackground(Color.magenta);
		lblNombre.setBounds(20,70,50,20);
		lblNombre.setBackground(Color.orange);
		txtnombre.setBounds(120,70,90,20);
		lblEdad.setBounds(20,100,50,20);
		lblEdad.setBackground(Color.orange);
		txtedad.setBounds(120,100,90,20);
		lblSexo.setBounds(20,130,50,20);
		lblSexo.setBackground(Color.orange);
		txtsexo.setBounds(120,130,90,20);
		lblCarrera.setBounds(20,160,75,20);
		lblCarrera.setBackground(Color.orange);
		txtcarrera.setBounds(120,160,90,20);
		lblNivel.setBounds(20,190,90,20);
		lblNivel.setBackground(Color.orange);
		txtnivel.setBounds(120,190,90,20);
		btnIngresarEstu.setBounds(40,250,130,30);
		lblProfesor.setBounds(350,40,60,20);
		lblProfesor.setBackground(Color.magenta);
		lblNombre2.setBounds(300,70,50,20);
		lblNombre2.setBackground(Color.orange);
		txtnombre2.setBounds(370,70,90,20);
		lblEdad2.setBounds(300,100,50,20);
		lblEdad2.setBackground(Color.orange);
		txtedad2.setBounds(370,100,90,20);
		lblSexo2.setBounds(300,130,50,20);
		lblSexo2.setBackground(Color.orange);
		txtsexo2.setBounds(370,130,90,20);
		lblEspecialidad.setBounds(290,160,75,20);
		lblEspecialidad.setBackground(Color.orange);
		txtespecialidad.setBounds(370,160,90,20);
		btnIngresarProf.setBounds(320,250,100,30);
		btnGraficar.setBounds(210,300,70,30);
		
	}
	public void actionPerformed(ActionEvent x)
	{
		if(x.getSource()==btnIngresarEstu)
		{
			String Nombre =txtnombre.getText();
			int Edad = Integer.parseInt(txtedad.getText());
			String Sexo = txtsexo.getText();
			String Carrera= txtcarrera.getText();
			int Nivel = Integer.parseInt(txtnivel.getText());
			Estudiante estu1= new Estudiante(Nombre,Edad,Sexo,Carrera,Nivel);
			ListaEstudiantes.add(estu1);
		}
		if(x.getSource()==btnGraficar)
		{
			Graficar(z); 
		}
		if(x.getSource()==btnIngresarProf)
		{
			String Nombre2=txtnombre2.getText();
			int Edad2 = Integer.parseInt(txtedad2.getText());
			String Sexo2 = txtsexo2.getText();
			String Especialidad= txtespecialidad.getText();
			Profesor prof= new Profesor(Nombre2,Edad2,Sexo2,Especialidad,ListaEstudiantes);
			prof.VerDatos(z);
		}
	}
	public void Graficar(Graphics g){
		int cont1 = 0,cont2=0,cont3 = 0,cont4=0,cont5 = 0,contn=0;
		int j=1,w = 5;
		int q= 90;
		int qp = 650;
		String N1="Nivel 1";
		String N2="Nivel 2";
		String N3="Nivel 3";
		String N4="Nivel 4";
		String N5="Nivel 5";
		g.setColor(Color.WHITE);
		g.drawLine(60,320,60,650); 
		g.drawLine(25,630,680,630);
		
		for (int i = 0; i<600; i++){
		g.drawLine(60+i, 620,60+i, 640);
		if(j==1){
		g.setColor(Color.magenta);
		g.drawString(""+N1, q+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==2){
		g.setColor(Color.magenta);
		g.drawString(""+N2, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==3){
		g.setColor(Color.magenta);
		g.drawString(""+N3, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==4){
		g.setColor(Color.magenta);
		g.drawString(""+N4, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else if(j==5){
		g.setColor(Color.magenta);
		g.drawString(""+N5, q+6+i, qp);
		g.setColor(Color.WHITE);
		}
		else{
		g.setColor(Color.magenta);
		g.drawString("Otro Nivel", q+6+i, qp);
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
		g.drawString(w+"Estu.", q1, qr+i);
		g.setColor(Color.WHITE);
			}
		else{
		g.setColor(Color.magenta);
		g.drawString(w+" Estu(s)", q1, qr+i);
		g.setColor(Color.WHITE);}
		w--;
		}
		i = i+67;
		}
		Estudiante[] estu= ListaEstudiantes.toArray(new Estudiante[ListaEstudiantes.size()]);
		for (int i = 0; i<estu.length; i++){
			if(estu[i].getNivel()==1)
                    cont1++;
			else if(estu[i].getNivel()==2)
                    cont2++;
			else if(estu[i].getNivel()==3)
                    cont3++;
			else if(estu[i].getNivel()==4)
             		cont4++;
            else if(estu[i].getNivel()==5)
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