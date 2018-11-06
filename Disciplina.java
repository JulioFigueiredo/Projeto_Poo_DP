

public class Disciplina {
    private String nome;
	private String descricao;
    private String sigla;
    private int periodo;
    private int qtd_creditos;

    @Override
    public String toString() {
        return "Disciplina{"+ "nome: "+ this.nome + ",descricao= " + this.descricao + ", sigla= " + this.sigla + ", periodo= " + this.periodo + ", qtd_creditos= " + this.qtd_creditos + '}';
    }

    
    public Disciplina(){
        this.nome= null;
    	this.descricao = null;
        this.periodo = 00;
        this.sigla = null;
        this.qtd_creditos = 00;
    }
    public Disciplina(String nome, String descricao, String sigla, int periodo,int qtdC){
        this.nome= nome;
    	this.descricao = descricao;
        this.sigla = sigla;
        this.periodo = periodo;
        this.qtd_creditos = qtdC;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getQtd_creditos() {
        return this.qtd_creditos;
    }

    public void setQtd_creditos(int qtd_creditos) {
        this.qtd_creditos = qtd_creditos;
    }
    
}
