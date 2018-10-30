
package projeto;



public class Turma {
    private int identificador;
    private double ano_oferta;
    
    
    
    public Turma(){
        this.identificador = 00;
        this.ano_oferta = 0000;
        
    }
    public Turma(int id, double anoOferta){
        this.identificador = id;
        this.ano_oferta = anoOferta;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getAno_oferta() {
        return this.ano_oferta;
    }

    public void setAno_oferta(double ano_oferta) {
        this.ano_oferta = ano_oferta;
    }

    

    
    @Override
    public String toString() {
        return "Turma{" + "identificador= " + this.identificador + ", ano_oferta= " + this.ano_oferta + '}';
    }
    
}
