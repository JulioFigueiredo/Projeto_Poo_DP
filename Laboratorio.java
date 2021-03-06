
public class Laboratorio {
    private String descricao;
    private int capacidade;
    
    public Laboratorio() {
        this.descricao = null;
        this.capacidade = 0;        
    }
    public Laboratorio(String desc, int capac){
        this.capacidade = capac;
        this.descricao = desc;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "descricao= " + this.descricao + ", capacidade= " + this.capacidade + '}';
    }
   
}
