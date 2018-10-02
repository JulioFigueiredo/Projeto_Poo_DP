package projeto;

public class Docente {
    private String nome;
    private String apelido;
    private String email;
    private int matricula;
    
    void Visualizar(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Apelido: "+this.apelido);
        System.out.println("Email: "+this.email);
        System.out.println("Matrícula: "+this.matricula);
    }
    public Docente(){
        this.nome = null;
        this.apelido = null;
        this.matricula = 00;
        this.email = null;
    }
    public Docente(String nom, String apeli, String mail, int matric){
        this.nome = nom;
        this.apelido = apeli;
        this.email = mail;
        this.matricula = matric;
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

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
