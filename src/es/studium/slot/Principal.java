package es.studium.slot;

public class Principal
{
	public static void main(String[] args)
	{
		Modelo modelo = new Modelo();
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		new Controlador(modelo, menuPrincipal);
	}
}
