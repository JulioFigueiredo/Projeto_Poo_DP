
package projeto;

public class Usuario {
  private String apelido;
  private String senha;

 public Usuario(){
   this.apelido = "null";
   this.senha = null;
 } 
 public Usuario(String nome, String senha){
   
 }
 public String getApelido(){
   return this.apelido;
 }
 public void setApelido(String apelido){
   this.apelido = apelido;
 }

 public String getSenha(){
   return this.senha;
 }
 public void setSenha(String senha){
   this.senha = senha;
  
 }

    @Override
    public String toString() {
        return "Usuario{" + "apelido=" + apelido + ", senha=" + senha + '}';
    }
 
}
