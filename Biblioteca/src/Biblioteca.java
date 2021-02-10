import java.awt.*;
import java.applet.*;
class Libros
{
	private String Nombre;
	private String Autor;
	private String Editorial;
	private Boolean Disponible;
	private int Cantidad;
	Libros(String nom, String aut, String edi, Boolean dis, int cant){
		this.Nombre=nom;
		this.Autor=aut;
		this.Editorial=edi;
		this.Disponible=dis;
		this.Cantidad=cant;
	}
	Libros(){
	}
	public void Setear(String nom, String aut, String edi, Boolean dis, int cant)
	{
		this.Nombre=nom;
		this.Autor=aut;
		this.Editorial=edi;
		this.Disponible=dis;
		this.Cantidad=cant;
	}
	public void VerDatos(Graphics g)
	{
		g.setColor(Color.orange);
		g.drawString("LIBRO",45,40);
		g.setColor(Color.BLACK);
		g.drawString("Nombre: "+Nombre,15,60);
		g.drawString("Autor: "+Autor,15,75);
		g.drawString("Editorial: "+Editorial,15,90);
		g.drawString("Disponible: "+Disponible,15,105);
		g.drawString("Cantidad: "+Cantidad,15,120);
	}
	public void VerDatos2(Graphics g)
	{
		g.drawString("Nombre: "+Nombre,15,160);
		g.drawString("Autor: "+Autor,15,175);
		g.drawString("Editorial: "+Editorial,15,190);
		g.drawString("Disponible: "+Disponible,15,205);
		g.drawString("Cantidad: "+Cantidad,15,220);
	}
}
class Estudiantes
{
	private String Nombre;
	private int Cedula;
	private String Carrera;
	private String Facultad;
	private int Nivel;
	Estudiantes(String nom,int cedu, String carr, String facu, int niv){
		this.Nombre=nom;
		this.Cedula=cedu;
		this.Carrera=carr;
		this.Facultad=facu;
		this.Nivel=niv;
	}
	Estudiantes(){}
	public void Setear(String nom,int cedu, String carr, String facu, int niv)
	{
		this.Nombre=nom;
		this.Cedula=cedu;
		this.Carrera=carr;
		this.Facultad=facu;
		this.Nivel=niv;
	}
	public void VerDatos(Graphics g)
	{
		g.setColor(Color.magenta);
		g.drawString("ESTUDIANTE",280,40);
		g.setColor(Color.BLACK);
		g.drawString("Nombre: "+Nombre,250,60);
		g.drawString("Cédula: "+Cedula,250,75);
		g.drawString("Carrera: "+Carrera,250,90);
		g.drawString("Facultad: "+Facultad,250,105);
		g.drawString("Nivel: "+Nivel,250,120);
	}
	public void VerDatos2(Graphics g)
	{
		g.drawString("Nombre: "+Nombre,250,160);
		g.drawString("Cédula: "+Cedula,250,175);
		g.drawString("Carrera: "+Carrera,250,190);
		g.drawString("Facultad: "+Facultad,250,205);
		g.drawString("Nivel: "+Nivel,250,220);
	}
}
public class Biblioteca extends Applet {

	public void init() {
	}

	public void paint(Graphics g) {
		
		setBackground(Color.lightGray);
		Font x= new Font("Verdana",Font.BOLD,16);
		g.setFont(x);
		g.setColor(Color.CYAN);
		g.drawString("BIBLIOTECA PUCE", 150, 15 );
		Font x2= new Font("Verdana",Font.PLAIN,12);
		g.setFont(x2);
		
		Libros Lib= new Libros();
		Lib.Setear("La Metamorfosis","Franz Kafka","Kurt Wolf",true,12);
		Lib.VerDatos(g);
		Libros Lib2= new Libros("Ensayo sobre la ceguera","José Saramago","Santillana",false,7);
		Lib2.VerDatos2(g);
		
		Estudiantes estu= new Estudiantes();
		estu.Setear("Daniela Cisneros",1717431942,"Ing. de Sistemas","Ingeniería",3);
		estu.VerDatos(g);
		Estudiantes estu2= new Estudiantes("Juan Torres",1707872761,"Biología","Ciencias Exactas",5);
		estu2.VerDatos2(g);
	}
}