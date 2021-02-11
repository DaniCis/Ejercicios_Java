import java.awt.event.*; 
import java.awt.*;
import java.applet.*;

public class ActListen extends Applet implements ActionListener{
	
		Label text = new Label();
        Button b= new Button("Click me");
		private int numClicks = 0;
			
	public void init() {
		setLayout(null);
		add(text);
		add(b);
		b.addActionListener(this); 
	}

	public void paint(Graphics g) {
		
		text.setBounds(20,80,150,30);
		text.setBackground(Color.red);
		b.setBounds(20,20,60,40);
	}
	public void actionPerformed(ActionEvent x)
	{
		if(x.getSource()==b)
		{
			numClicks++;
         	text.setText("Button Clicked " + numClicks + " times");
		}
	}
}