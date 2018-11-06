

public class Docente {
    private String nome;
    private String apelido;
    private String email;
    private String matricula;
    private String AreaLotacao;
    private String vinculo;
    
    @Override
    public String toString() {
        return "Docente{" + "nome= " + this.nome + ", apelido= " + this.apelido + ", email= " + this.email + ", matricula= " + this.matricula + '}';
    }
    
    
    public Docente(){
        this.nome = null;
        this.apelido = null;
        this.matricula = null;
        this.email = null;
        this.AreaLotacao=null;
        this.vinculo=null;
    }
    public Docente(String nom, String apeli, String mail, String matric, String AreaLotacao,String vinculo){

        this.nome = nom;
        this.apelido = apeli;
        this.email = mail;
        this.matricula = matric;
        this.AreaLotacao=AreaLotacao;
        this.vinculo=vinculo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
