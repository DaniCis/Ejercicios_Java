import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

class Medico extends Persona  {
	private String Especialidad;
	private LinkedList<Paciente> ListaPacientes;
	
	public Medico(String Nombre, int Edad,String Sexo,String Especialidad, LinkedList<Paciente> ListaPacientes)
	{
		super(Nombre,Edad,Sexo);
		this.Especialidad=Especialidad;
		this.ListaPacientes=ListaPacientes;
	}
	public void VerDatos(Graphics g){
		int x= 700,y=50;
		g.setColor(Color.black);
		g.drawString("DOCTOR ",x,y);
		g.drawString("Nombre: "+ super.getNombre(),x,y+=15);
		g.drawString("Edad: "+ super.getEdad() ,x,y+=15);
		g.drawString("Sexo: "+ super.getSexo(),x,y+=15);
		g.drawString("Especialidad: "+Especialidad,x,y+=15);
		g.drawString("Pacientes: ",x,y+=15);
		for (int i = 0; i<ListaPacientes.size(); i++);
		{
			y+=30;
			Paciente pa1,pa2,pa3;
			pa1= ListaPacientes.get(0);
			pa1.VerDatos(g,x,y);
			y+=80;
			pa2= ListaPacientes.get(1);
			pa2.VerDatos(g,x,y);
			y+=80;
			pa3= ListaPacientes.get(2);
			pa3.VerDatos(g,x,y);
		}
	}
		
}
