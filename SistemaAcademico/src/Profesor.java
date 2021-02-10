import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

class Profesor extends Persona  {
	private String Especialidad;
	private LinkedList<Estudiante> ListaEstudiantes;
	
	public Profesor (String Nombre, int Edad,String Sexo,String Especialidad, LinkedList<Estudiante> ListaEstudiantes)
	{
		super(Nombre,Edad,Sexo);
		this.Especialidad=Especialidad;
		this.ListaEstudiantes=ListaEstudiantes;
	}
	public void VerDatos(Graphics g){
		int x= 700,y=50;
		g.setColor(Color.white);
		g.drawString("PROFESOR ",x,y);
		g.drawString("Nombre: "+ super.getNombre(),x,y+=15);
		g.drawString("Edad: "+ super.getEdad() ,x,y+=15);
		g.drawString("Sexo: "+ super.getSexo(),x,y+=15);
		g.drawString("Especialidad: "+Especialidad,x,y+=15);
		g.drawString("Estudiantes: ",x,y+=15);
		for (int i = 0; i<ListaEstudiantes.size(); i++);
		{
			y+=30;
			Estudiante estu1,estu2,estu3;
			estu1= ListaEstudiantes.get(0);
			estu1.VerDatos(g,x,y);
			y+=80;
			estu2= ListaEstudiantes.get(1);
			estu2.VerDatos(g,x,y);
			y+=80;
			estu3= ListaEstudiantes.get(2);
			estu3.VerDatos(g,x,y);
		}
	}
		
}