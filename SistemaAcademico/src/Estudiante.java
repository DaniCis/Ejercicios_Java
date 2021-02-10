import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.*;

class Persona{
	private String Nombre;
	private int Edad;
	private String Sexo;
	public Persona(String Nombre,int Edad,String Sexo)
	{
		this.Nombre=Nombre;
		this.Edad=Edad;
		this.Sexo=Sexo;
	}
	public String getNombre(){
		return this.Nombre;
	}
	public int getEdad(){
		return this.Edad;
	}
	public String getSexo(){
		return this.Sexo;}
}
class Estudiante extends Persona {
	private String Carrera;
	private int Nivel;
	public Estudiante(String Nombre, int Edad,String Sexo,String Carrera,int Nivel){
		super(Nombre,Edad,Sexo);
		this.Carrera=Carrera;
		this.Nivel=Nivel;
	}
	public int VerDatos(Graphics g, int x, int y){
		g.drawString("Nombre: "+super.getNombre() ,x,y);
		g.drawString("Edad: "+ super.getEdad() ,x,y+=15);
		g.drawString("Sexo: "+ super.getSexo(),x,y+=15);
		g.drawString("Carrera: "+Carrera,x,y+=15);
		g.drawString("Nivel: "+Nivel,x,y+=15);
		return y;
	}
	public String getCarrera(){
		return this.Carrera;
	}
	public int getNivel(){
		return this.Nivel;
	}
}
