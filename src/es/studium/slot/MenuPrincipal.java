package es.studium.slot;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class MenuPrincipal extends Frame
{
private static final long serialVersionUID = 1L;
	
	MenuPrincipal()
	{
		setSize(400,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint (Graphics g)
	{
		Color color = new Color(181, 230, 29);
		g.setColor(color);
		g.drawRect(10, 50, 40, 40);
	}
}
