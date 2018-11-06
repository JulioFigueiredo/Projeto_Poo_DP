
public class Horario {
    private String desc; 
    private int aula;
    private String disc;
    private String prof;
    private String laboratorio;
    
    
    public Horario(){
        this.desc= null;
    	this.disc= null;
        this.prof= null;
        this.laboratorio= null;  
        this.aula= 0;
    }
    public Horario(String desc,  int aula, String dis, String prof, String lab){
        this.desc= desc;
    	this.disc= dis;
        this.prof= prof;
        this.laboratorio=lab;
        this.aula=aula;
    }
    public String getDesc(){
    	return this.desc;
    }
    public void setDesc(String desc){
    	this.desc= desc;
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
