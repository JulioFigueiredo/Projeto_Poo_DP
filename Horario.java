package projeto;

public class Horario {
    private String disc;
    private String prof;
    private String laboratorio;
    private int aula;
    
    public Horario(){
        this.disc= null;
        this.prof= null;
        this.laboratorio= null;  
        this.aula= 0;
    }
    public Horario(String dis, String prof, String lab, int aula){
        this.disc= dis;
        this.prof= prof;
        this.laboratorio=lab;
        this.aula=aula;
    }

    public int getAula() {
        return this.aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getDisc() {
        return this.disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getProf() {
        return this.prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getLaboratorio() {
        return this.laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
}
    
}
