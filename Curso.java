
package projeto;

import java.util.ArrayList;

public class Curso{
  private String descricao;
  private int codigo;
  private int duracao;
  private ArrayList<Docente> professor;
  private ArrayList<Turma> turma;
  private ArrayList<Disciplina> disciplina;
  

  public Curso(){
    this.descricao = null;
    this.codigo = 0;
    this.duracao = 0;
  }
 public Curso(String desc, int codigo, int duracao){
   this.descricao = desc;
   this.codigo = codigo;
   this.duracao = duracao;
   this.professor= new ArrayList<Docente>();
   this.turma= new ArrayList<Turma>();
   this.disciplina= new ArrayList<Disciplina>();
 }
 public String getDescricao(){
   return this.descricao;
 }
 public void setDescricao(String descricao){
   this.descricao = descricao;
 }
 public int getCodigo(){
   return this.codigo;
 }
 public void setCodigo(int codigo){
   this.codigo = codigo;
 }
 public int getDuracao(int duracao){
   return this.duracao;
 }
 public void setDuracao(int duracao){
   this.duracao = duracao;
 }

    public ArrayList<Docente> getProfessor() {
        return this.professor;
    }

    public void setProfessor(ArrayList<Docente> professor) {
        this.professor = professor;
    }

    public ArrayList<Turma> getTurma() {
        return this.turma;
    }

    public void setTurma(ArrayList<Turma> turma) {
        this.turma = turma;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    public void addDocente(Docente d) {
        this.professor.add(d);
    }

    public void removeDocente(int d) {
        this.professor.remove(d);
    }
    
    
    public void addDisciplina(Disciplina disc) {
        this.disciplina.add(disc);
    }

    public void removeDisciplina(int disc) {
        this.disciplina.remove(disc);
    }

    public void addTurma(Turma t) {
        this.turma.add(t);
    }

    public void removeTurma(int t) {
        this.turma.remove(t);
    }

    @Override
    public String toString() {
        return "Curso{" + "descricao=" + descricao + ", codigo=" + codigo + ", duracao=" + duracao + ", professor=" + professor + ", turma=" + turma + ", disciplina=" + disciplina + '}';
    }
    
    
 

   

}

