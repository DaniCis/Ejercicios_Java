/**
 * @(#)AppletHolaMundo1.java
 *
 * Sample Applet application
 *
 * @author 
 * @version 1.00 19/02/28
 */
 
import java.awt.*;
import java.applet.*;

public class AppletHolaMundo1 extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		g.setColor(Color.magenta);
		setBackground(Color.lightGray);
		g.drawString("Hola Mundo", 50, 60 );
	}
}