import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MouseMotionExample extends Applet implements MouseMotionListener {
		Label lblAreaPrueba=new Label("Area de prueba");
		Label lblMensaje=new Label();
	public void init() {
		setLocale(null);
		add(lblAreaPrueba);
		add(lblMensaje);
		lblAreaPrueba.addMouseMotionListener(this);
        //addMouseMotionListener(this);
	}
	public void Dar_Mensaje(String Descripcion,MouseEvent evento)
	{
		lblMensaje.setText(Descripcion+ " (" + evento.getX() + "," + evento.getY() + ")"
                        + " detectado "
                        + evento.getComponent().getClass().getName());}
	public void mouseMoved(MouseEvent evento)
	{
		Dar_Mensaje("Mouse movido",evento);
	}
	public void mouseDragged(MouseEvent evento)
	{
		Dar_Mensaje("Mouse arrastrado",evento);
	}
	public void paint(Graphics g) {

		lblAreaPrueba.setBackground(Color.CYAN);
		lblAreaPrueba.setBounds(80,40,130,60);
		lblMensaje.setBounds(20,200,300,60);
	}
}