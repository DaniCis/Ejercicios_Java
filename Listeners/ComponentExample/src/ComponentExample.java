import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ComponentExample extends Applet implements ComponentListener{	
	Label label=new Label("Esta es una etiqueta");
	Checkbox checkbox=new Checkbox("Etiqueta visible",true);
	TextField textfield=new TextField();
	TextArea textArea=new TextArea();	
	public void init() {
		setLayout(null);
		add(label);
		add(checkbox);
		add(textfield);
		label.addComponentListener(this);
		checkbox.addComponentListener(this);
		textfield.addComponentListener(this);
		textArea.addComponentListener(this);
		add(textArea);
	}	
	public void Mostrar_Mensaje(String s)
	{	textArea.append(s+"\n");	}	
	public void componentHidden(ComponentEvent e) {
        Mostrar_Mensaje(e.getComponent().getClass().getName() + " --- Hidden");
    }
    public void componentMoved(ComponentEvent e) {
       Mostrar_Mensaje(e.getComponent().getClass().getName() + " --- Moved");
}
    public void componentResized(ComponentEvent e) {
        Mostrar_Mensaje(e.getComponent().getClass().getName() + " --- Resized ");}
    public void componentShown(ComponentEvent e) {
       Mostrar_Mensaje(e.getComponent().getClass().getName() + " --- Shown");}
	public void paint(Graphics g) {		
		label.setBounds(20,10,150,30);
		label.setVisible(false);
		textArea.setBounds(20,100,500,500);
		textfield.setBounds(20,30,100,30);
		checkbox.setBounds(20,70,100,30);
		textfield.setVisible(true);	}
}