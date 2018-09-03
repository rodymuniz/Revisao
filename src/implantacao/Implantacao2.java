package implantacao;

import modelo.Bacharelado;
import modelo.Formacao;
import modelo.Medio;

public class Implantacao2
{
	public static void main(String[] args)
	{
		Formacao objeto;
		
		objeto = new Medio();
		objeto.definirDuracao();
		System.out.println(objeto.getDuracao());
		
		objeto = new Bacharelado();
		objeto.definirDuracao();
		System.out.println(objeto.getDuracao());
	}
}
