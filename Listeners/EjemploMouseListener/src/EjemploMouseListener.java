import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class EjemploMouseListener extends Applet implements MouseListener {
	Label lblmensaje = new Label();
	Label lblmouse = new Label("   �rea de Prueba");
	public void init() {
		setLayout(null);
		add(lblmensaje);
		add(lblmouse);
		lblmouse.addMouseListener(this);
		//addMouseListener(this);
}
	public void paint(Graphics g) {
		lblmensaje.setBackground(Color.cyan);
		lblmensaje.setBounds(40,120,250,20);
		lblmouse.setBackground(Color.magenta);
		lblmouse.setBounds(80,40,130,60);}
	public void mousePressed(MouseEvent x){
		lblmensaje.setText("Se presion� el mouse en posici�n "+String.valueOf(x.getX())+" , "+String.valueOf(x.getY()));
    	repaint();}
  public void mouseReleased(MouseEvent x){
    lblmensaje.setText("Se dej� de presionar el mouse");
    repaint();}  
  public void mouseClicked(MouseEvent x){
    lblmensaje.setText("Se ha dado "+ String.valueOf(x.getClickCount())+" click");
    repaint();}  
  public void mouseEntered(MouseEvent x){
    lblmensaje.setText("El cursor est� dentro del objeto");
    repaint();}  
  public void mouseExited(MouseEvent x){
    lblmensaje.setText("El cursor est� afuera del objeto");
    repaint();}
}	