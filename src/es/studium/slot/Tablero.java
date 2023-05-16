package es.studium.slot;

import java.awt.Frame;

public class Tablero extends Frame
{
	private static final long serialVersionUID = 1L;

	Tablero()
	{
		setTitle("Jugando...");
		setSize(400, 200);
		setLocationRelativeTo(this);
		setVisible(true);
	}
}
