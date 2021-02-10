import java.awt.*;
import java.applet.*;
class Paciente
{
	private String Nombre;
	private String Sexo;
	private String Enfermedad;
	private String TipoSangre;
	private String CodigoHistorial;
	
	public void Setear(String nom,String sex,String enf,String ts,String cod)
	{
		Nombre=nom;
		Sexo=sex;
		Enfermedad=enf;
		TipoSangre=ts;
		CodigoHistorial=cod;
	}
	public void VerDatos(Graphics g,int x,int y)
	{
		g.setColor(Color.cyan);
		g.drawString("Nombre: "+Nombre,x,y+35);
		g.drawString("Sexo: "+Sexo,x,y+50);
		g.drawString("Enfermedad: "+Enfermedad,x,y+65);
		g.drawString("Tipo de Sangre: "+TipoSangre,x,y+80);
		g.drawString("Código del Historial: "+CodigoHistorial,x,y+95);
	}
	public String getCodigoHistorial()
	{
		return CodigoHistorial;
	}
}
public class Hospital extends Applet {
	
	public void init() {
	}
	int i=0;
	Paciente[] pac = new Paciente[5];
	public Paciente Buscar(Paciente [] pac, String cod)
	{
		for ( i = 0; i<pac.length; i++)
		{
			if(pac[i].getCodigoHistorial().compareTo(cod)==0)
				return pac[i];
		}
		return pac[i];
	}
	public void Graficar(Graphics g)
	{
		g.setColor(Color.white);
		g.drawLine(270,380,470,380);
		g.drawLine(270,380,270,190);
		i=0;
		while(i!=6)
		{
			g.drawString("|",300+30*i,389);
			g.drawString("__",255,355-30*i);
			i++;
		}
		g.drawString("X (Tipo Sangre)",475,380);
		g.drawString("Y (Cant)",245,183);
		g.drawString("A+",280,410);
		g.drawString("A-",310,410);
		g.drawString("B+",340,410);
		g.drawString("B-",370,410);
		g.drawString("AB+",400,410);
		g.drawString("O+",430,410);
		g.drawString("1",240,360);
		g.drawString("2",240,330);
		g.drawString("3",240,300);
		g.drawString("4",240,270);
		g.drawString("5",240,240);
		g.drawString("6",240,210);
		g.setColor(Color.red);
		g.drawRect(270,325,31,55);
		g.setColor(Color.blue);
		g.drawRect(330,325,31,55);
		g.setColor(Color.magenta);
		g.drawRect(420,360,31,20);
	}
	public void paint(Graphics g) {
	setBackground(Color.DARK_GRAY);
	g.setColor(Color.pink);
	g.drawString("HISTORIAL MÉDICO",180,15);
	g.setColor(Color.green);
	g.drawString("PACIENTES",45,30);
	g.setColor(Color.yellow);	
	g.drawString("DATOS DEL PACIENTE CON HISTORIAL MC30",280,35);
		
	pac[0]= new Paciente();
	pac[0].Setear("Diana Castro","Femenino","Pulmonía","A+","DC120");
	pac[1]= new Paciente();
	pac[1].Setear("Andrés Torres","Masculino","Hepatitis","B+","AT53");
	pac[2]= new Paciente();
	pac[2].Setear("Lia Páez","Femenino","Asma","O+","LP097");
	pac[3]= new Paciente();
	pac[3].Setear("Monica Ruiz","Femenino","Diabetes","B+","MR248");
	pac[4]= new Paciente();
	pac[4].Setear("Mateo Carrera","Masculino","Asma","A+","MC30");
	for (int i = 0; i<pac.length; i++)
		pac[i].VerDatos(g,25,15+90*i);
	Buscar(pac,"MC30").VerDatos(g,310,22);
	Graficar(g);
	}
}