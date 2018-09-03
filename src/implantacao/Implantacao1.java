package implantacao;

//import javax.swing.JOptionPane;
import modelo.Formacao;

public class Implantacao1
{
	public static void main (String [] args)
	{
		Formacao objeto = new Formacao("jbdsfkjdsbjsdlfsd",1,1,1);
		//input
		//objeto.setDescricao
		//	(JOptionPane.showInputDialog("Digite a descrição"));
		//objeto.setAll("desc", 1, 500, 60);
		//output
		System.out.println(objeto.getDescricao());
		System.out.println(objeto.getDescricaoReduzida());
		System.out.println(objeto.getDescricaoComLimite(10));
	}
}
