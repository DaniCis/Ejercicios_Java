import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class TextExample extends Applet implements TextListener
{
String str;
Label label1= new Label("Ingrese texto para mostrar sus cambios");
Label label2= new Label();
TextField field1 = new TextField(25); 
public void init()
{setLayout(null);
add(label1);
add(field1);
add(label2);
field1.addTextListener(this); 
}
public void textValueChanged(TextEvent te)
{
label2.setText(te.paramString());
}
public void paint (Graphics g)
{
 label1.setBounds(50,50,300,50);
 label2.setBounds(50,250,300,100);
 field1.setBounds(50,100,150,150);
}
}