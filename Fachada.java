import java.util.ArrayList;

public class Fachada {
    private static Fachada instance = null;
    int i;
    private ArrayList<Curso> cursos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Docente> profs;
    private ArrayList<Laboratorio> laboratorios;
    private ArrayList<GradeDeHorarios> grade;
    private ArrayList<Horario> horario;
    
    private Fachada (){
    	this.cursos= new ArrayList<Curso>();
    	this.disciplinas=new ArrayList<Disciplina>();
    	this.profs = new ArrayList<Docente>();
    	this.laboratorios= new ArrayList<Laboratorio>();
    	this.horario= new ArrayList<Horario>();
    	this.grade= new ArrayList<GradeDeHorarios>();
    }
    public void addCurso( String descricao, String codigo, int duracao) {
      Curso c = new Curso(descricao, codigo, duracao);
      cursos.add(c);
    }
    
    public void listarCursos(){
       for (Curso c : cursos){
    	   System.out.println(c.toString());
       }
    }
    
    public void addDisciplina(String nomeDisciplina, String descricao, String sigla, int periodo, int quantCredito){
        Disciplina d = new Disciplina(nomeDisciplina, descricao, sigla, periodo,quantCredito);
        for ( Curso c: cursos){
        	if (c.getDescricao()== descricao){
        		c.addDisciplina(d);
        	}
        }
    }
    
    public void listarDisciplinas(String j){
    	for (Disciplina c: disciplinas){
     	   System.out.println(c.toString());
        }
    }
   
    public void addDocente(String nome, String apelido, String email, String matricula, String areaLotacao, String vinculo){
    	Docente p = new Docente(nome, apelido, email, matricula, areaLotacao,vinculo);
    	for (Curso c: cursos){
    		if(c.getDescricao()== nome){
    			c.addDocente(p);
    		}
    	}
    }
    
    public void listarDocentes(String c){
    	for (Docente p : profs){
     	   System.out.println(p.toString());
        }
    }
    
  
    public void addLaboratorio(String descricao, int capacidade){
    	Laboratorio l= new Laboratorio(descricao,capacidade);
    	for (Curso c: cursos){
    		if(c.getDescricao()== descricao){
    			c.addLaboratorio(l);
    		}
    	}
    	
    	
    }
     
    public void listarLaboratorios(String c){
    	for (Laboratorio l : laboratorios){
    		System.out.println(l.toString());
    		}
    }
     
    
    public void listarTudo(String a){
    	for (Curso c: cursos){
    		if(c.getDescricao()==a){
    			c.toString();
    		}
    	}
        
      }
    
   
    public void addHorario(String descricao, int aula, String prof, String disc, String lab ){
        Horario h= new Horario(descricao, aula, prof, disc, lab);
        
    }
    
    
    public void verGrade(String g){
        
    	this.grade.toString();
        }
  
    
    
    
   public static Fachada getInstance(){
        if (instance == null){
            Fachada.instance = new Fachada();
        }
        return instance;
    }

   public void criarGrade(String g) {
	GradeDeHorarios [][] grade = new GradeDeHorarios[7][7];
	g= g +" " + grade;
   }

    
}
