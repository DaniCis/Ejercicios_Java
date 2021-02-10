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
class Paciente extends Persona {
	private String Enfermedad;
	private int Piso;
	public Paciente(String Nombre, int Edad,String Sexo,String Enfermedad,int Piso){
		super(Nombre,Edad,Sexo);
		this.Enfermedad=Enfermedad;
		this.Piso=Piso;
	}
	public int VerDatos(Graphics g, int x, int y){
		g.drawString("Nombre: "+super.getNombre() ,x,y);
		g.drawString("Edad: "+ super.getEdad() ,x,y+=15);
		g.drawString("Sexo: "+ super.getSexo(),x,y+=15);
		g.drawString("Enfermedad: "+Enfermedad,x,y+=15);
		g.drawString("Piso: "+Piso,x,y+=15);
		return y;
	}
	public String getEnfermedad(){
		return this.Enfermedad;
	}
	public int getPiso(){
		return this.Piso;
	}
}
