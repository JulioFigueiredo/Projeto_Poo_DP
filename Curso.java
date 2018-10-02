
package projeto;

public class Curso{
  private String descricao;
  private int codigo;
  private int duracao;

  public Curso(){
    this.descricao = null;
    this.codigo = 0;
    this.duracao = 0;
  }
 public Curso(String desc, int codigo, int duracao){
   this.descricao = desc;
   this.codigo = codigo;
   this.duracao = duracao;
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
 void Visualizar(){
     System.out.println("Descrição: "+this.descricao);
     System.out.println("codigo: "+this.codigo);
     System.out.println("Duração: "+this.duracao+ " anos");
     
 }
}

