package modelo;

public class Formacao
{
	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	//CONSTRUTORES
	//CHEIO
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		setDescricao(descricao);
		setPeriodo(periodo);
		setMensalidade(mensalidade);
		setDuracao(duracao);
	}
	//VAZIO
	public Formacao() {
		super();
	}
	//TODO METODO SET É VOID E RECEBE PARAMETRO
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao)
	{
		//USAR METODOS SET INDIVIDUAIS NO SETALL
		setDescricao(descricao);
		setPeriodo(periodo);
		setMensalidade(mensalidade);
		setDuracao(duracao);
	}
	
	//TODO GETALL É STRING
	
	public String getAll()
	{
		return "Descrição: " + getDescricao()+
				"\nPeriodo: "+ getPeriodo()+
				"\nMensalidade: R$"+ getMensalidade()+
				"\nDuração: "+ getDuracao();
	}
	
	//TODO GET NÃO TEM PARAMETRO E RETORNA ALGUMA COISA
	//TODO SET NÃO RETORNA NADA E TEM PARAMETRO
	//getters e setters individuais
	public String getDescricao()
	{
		return descricao;
	}
	public void setDescricao(String descricao)
	{
		if(descricao.length() >= 8 && descricao.length() <= 50)
		{
			//Tem que ser maior que 8 e menor que 50
			this.descricao = descricao.toUpperCase();
		}
		else //Não é função do backend dar segundas chances
		{
			this.descricao = "DESCRIÇÃO INVALIDA";
		}
			
		//toUpperCase: Tudo em caixa alta
		//toLowerCase: Tudo em letra minuscula
		//length: Tamanho da string
	}
	
	public int getPeriodo()
	{
		return periodo;
	}
	public void setPeriodo(int periodo)
	{
		this.periodo = periodo;
	}
	
	public double getMensalidade()
	{
		return mensalidade;
	}
	public void setMensalidade(double mensalidade)
	{
		this.mensalidade = mensalidade;
	}
	
	public int getDuracao()
	{
		return duracao;
	}
	public void setDuracao(int duracao)
	{
		this.duracao = duracao;
	}
	
	public String getDescricaoReduzida()
	{
		if (descricao.indexOf(" ") > 0)
		{
			//gera uma substring que vai desde o começo até o caractere especificado
			//não o inclundo
			return descricao.substring(0, descricao.indexOf(" "));
		}
		else
		{
			return	descricao;
		}
	}
	
	public String getDescricaoComLimite(int limite)
	{
		if (descricao.length() >= limite) //if para verificar se a string é do tamanho do limite
										  //especificado do usuário
		{
			return descricao.substring(0, limite);
			//se for corta
		}
		else
		{
			return descricao;
			//se não for retorna a string inteira
		}
	}
	
	public void definirDuracao()
	{
		if(this instanceof Medio)
		{
			duracao = 36;
		}
		else if(this instanceof Tecnologo)
		{
			duracao = 24;
		}
		else if(this instanceof Bacharelado)
		{
			duracao = 60;
		}
	}
	
	public double exibirMedia(double ps1, double ps2)//DP semi-pres
	{
		return (ps1+ps2)/2;
	}
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2)//DP pres
	{
		return ((ps1+ps2)*0.8 + (nac1+nac2)*0.2)/2;
	}
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2)//Regular
	{
		return ( (ps1+ps2)*0.5 + (am1+am2)*0.3 + (nac1+nac2)*0.2 )/2;
	}
	
}
