
package projeto;

public class Disciplina {
    private String descricao;
    private String sigla;
    private int periodo;
    private int qtd_creditos;

    void Visualizar(){
        System.out.println("Descrição:"+this.descricao);
        System.out.println("Sigla: "+this.sigla);
        System.out.println("Período: "+this.periodo);
        System.out.println("Créditos: "+this.qtd_creditos);
    }
    public Disciplina(){
        this.descricao = null;
        this.periodo = 00;
        this.sigla = null;
        this.qtd_creditos = 00;
    }
    public Disciplina(String descricao, String sigla, int periodo,int qtdC){
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
