package modelo;

public class Bacharelado extends Formacao
{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public Bacharelado() {
		super();
	}
	
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		setProjetoConclusao(projetoConclusao);
		setCargaHorariaEstagio(cargaHorariaEstagio);
	}
	
	public String getAll()
	{
		return super.getAll() +
				"\nProjeto de Conclusão: "+ getProjetoConclusao()+
				"\nCarga Horária de Estágio: "+getCargaHorariaEstagio();
	}
	
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		setProjetoConclusao(projetoConclusao);
		setCargaHorariaEstagio(cargaHorariaEstagio);
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
}
