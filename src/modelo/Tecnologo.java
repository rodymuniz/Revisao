package modelo;

public class Tecnologo extends Formacao
{
	private boolean planoEstendido;
	
	public Tecnologo() {
		super();
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		//No ponto em que você gera o construtor com o Eclipse, ele coloca esse super com
		//os atributos que já tem os métodos set para setar os parametros
		//por isso é necessário mudar só os atributos da classe filha
		//nesse caso de
		//this.planoEstendido = planoEstendido;
		//para
		//setPlanoestendido(planoEstendido);
		super(descricao, periodo, mensalidade, duracao);
		setPlanoEstendido(planoEstendido);
	}

	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido)
	{
		super.setAll(descricao, periodo, mensalidade, duracao);
		setPlanoEstendido(planoEstendido);
	}
	
	public String getAll()
	{
		return super.getAll()+
				"\nPlano Estendido: "+isPlanoEstendido();
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
}
