package projeto;

public class Fachada {
    private static Fachada instance = null;
    int i;
  
    Curso[] cursos = new Curso[30];{

    }
    
    public void addCurso( String descricao, String codigo, int duracao) {
        for (i = 0; i< 30; i++){
            cursos= new Curso[0];
    }
    }
    
    public String listarCursos(){
        String [] curso = {"Descrição", "Código", " Duração"};
        String print = "";
        
         for (int c = 0; c < 3; c++){
            print += cursos[c] + "\n";
            for (int l = 0; l < 30; l++){
                print +=  cursos[l][c] + " ";
            }
            print += "\n";
        }
         return print;
    }
    
    
        
    
    
    public void addDisciplina(String nomeDisciplina, String descricao, String sigla, int periodo, int quantCredito){
        
    }
    
    public void listarDisciplinas(String d){
       
    }
    
    Docente [] docentes = new Docente[30]; {

    }
    
    public void addDocente(String nome, String apelido, String email, String matricula, String areaLotacao, String vinculo){
    
    }
    
    public String listarDocentes(String doc){
        String [] dcnt = {"Nome", "Apelido", "E-mail", "Matrícula", "Área de Lotação", "Vínculo" };
        
            for (int c = 0; c < 30; c++){
            doc += dcnt[c] + "\n";
            doc += "\n";
        }
         return doc;
    }
    
    Laboratorio [] laboratorios = new  Laboratorio[10];{

}
     public void addLaboratorio(String descricao, int capacidade){
     
    }
     
    public String listarLaboratorios(String lab){
        String [] labo = {"Descrição", "Capacidade"};
        
         for (int c = 0; c < 10; c++){
            lab += labo[c] + "\n";
            }
            lab += "\n";
        
         return lab;
    }
     
    
    public void listarTudo(){
        
      }
    
     GradeDeHorarios[][] g = new GradeDeHorarios[6][5];
       
     public String criarGrade(String grade){
        grade += g;
        return grade;
        }
   
    public void addHorario(){
        
    }
    
    
    public String verGrade(String v){
        String [] diaSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};
        
        for (int c = 0; c < 5 ; c++) {
            v += diaSemana[c] + "\n";
            for (int l = 0; l < 6 ; l++) {
                v += g[l][c] + " ";
            }
            v += "\n";
        }
        return v;
    }
    
    
    
    
   public static Fachada getInstance(){
        if (instance == null){
            Fachada.instance = new Fachada();
        }
        return instance;
    }

    
}   
