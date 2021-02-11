import java.awt.*;
import java.applet.*;
class Estudiantes {
	private String Nombre;
	private String Carrera;
	private String Facultad;
	private int Nivel;
	private String Codigo;
	private int Creditos;
	public void Setear(String nom,String car,String fac,int niv,String codi,int cre)
	{
		this.Nombre=nom;
		this.Carrera=car;
		this.Facultad=fac;
		this.Nivel=niv;
		this.Codigo=codi;
		this.Creditos=cre;
	}
	public void VerDatos(Graphics g,int x,int y)
	{
		g.setColor(Color.pink);
		g.drawString("Nombre: "+Nombre,x,y+15);
		g.drawString("Carrera: "+Carrera,x,y+30);
		g.drawString("Facultad: "+Facultad,x,y+45);
		g.drawString("Nivel: "+Nivel,x,y+60);
		g.drawString("Código: "+Codigo,x,y+75);
		g.drawString("Créditos: "+Creditos,x,y+90);
	}
	public String getCodigo()
	{
		return Codigo;
	}
}
public class Educacion extends Applet {
	
	public void init() {
	}

	Estudiantes[] estu = new Estudiantes[5];
	int i=0;
	public Estudiantes Buscar(Estudiantes [] estu, String cod)
	{
		for ( i = 0; i<estu.length; i++)
		{
			if(estu[i].getCodigo().compareTo(cod)==0)
				return estu[i];
		}
		return estu[i];
	}
	public void Graficar(Graphics g)
	{
		g.setColor(Color.white);
		g.drawLine(270,380,500,380);
		g.drawLine(270,380,270,170);
		i=0;
		while(i!=7)
		{
			g.drawString("|",300+30*i,389);
			g.drawString("__",257,360-30*i);
			i++;
		}
		g.drawString("X (Nivel)",505,380);
		g.drawString("Y (Cant)",255,163);
		g.drawString("1°",280,410);
		g.drawString("2°",310,410);
		g.drawString("3°",340,410);
		g.drawString("4°",370,410);
		g.drawString("5°",400,410);
		g.drawString("6°",430,410);
		g.drawString("7°",460,410);
		g.drawString("1",240,360);
		g.drawString("2",240,330);
		g.drawString("3",240,300);
		g.drawString("4",240,270);
		g.drawString("5",240,240);
		g.drawString("6",240,210);
		g.drawString("7",240,180);
		g.setColor(Color.red);
		g.fillRect(300,360,31,20);
		g.setColor(Color.yellow);
		g.fillRect(360,360,31,20);
		g.setColor(Color.magenta);
		g.fillRect(390,335,31,45);
		g.setColor(Color.orange);
		g.fillRect(450,360,31,20);
	}
		
	public void paint(Graphics g) {
		setBackground(Color.black);
		g.setColor(Color.green);
		g.drawString("LISTADO DE ESTUDIANTES",30,15);
		
		estu[0]= new Estudiantes();
		estu[0].Setear("Paul Ruiz","Ingeniería Civil","Ingeniería",5,"AI12",32);
		estu[1]= new Estudiantes();
		estu[1].Setear("Camila Erazo","Biología","Ciencias Exactas",2,"AC08",25);
		estu[2]= new Estudiantes();
		estu[2].Setear("Juan León","Diseño Gráfico","Arquitectura",7,"AA34",30);
		estu[3]= new Estudiantes();
		estu[3].Setear("David Alvear","Medicina","Mecina",5,"AM28",27);
		estu[4]= new Estudiantes();
		estu[4].Setear("Nicole Flores","Contabilidad","Administración",4,"AF71",18);
		for (int i = 0; i<estu.length; i++)
			estu[i].VerDatos(g,10,20+100*i);
		g.setColor(Color.cyan);
		g.drawString("DATOS DEL ESTUDIANTE CON CÓDIGO AC08",290,20);;
		Buscar(estu,"AC08").VerDatos(g,310,32);
		Graficar(g);
	}
}