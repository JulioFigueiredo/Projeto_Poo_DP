
package projeto;


public class Projeto {

    
    public static void main(String[] args) {
        Usuario joao = new Usuario ();
        
        joao.setApelido ("jo");
        joao.setSenha("kk123");
        joao.Visualizar();
        
        Laboratorio info = new Laboratorio();
        
        info.setDescricao("Laboratório informática 2");
        info.setCapacidade(20);
        info.Visualizar();
        
        Docente mar = new Docente();
        
        mar.setNome ("Marcilio");
        mar.setApelido("druida");
        mar.setMatricula(11111);
        mar.Visualizar();
        
        Turma terceiro = new Turma();
        
        terceiro.setIdentificador(003);
        terceiro.setAno_oferta(2018.2);
        terceiro.Visualizar();
        
        Disciplina filosofia = new Disciplina();
        
        filosofia.setDescricao("Filosofia básica");
        filosofia.setPeriodo(20);
        filosofia.setSigla("FILO");
        filosofia.Visualizar();
        
        Curso integrado = new Curso("3 anos integrado ao médio", 0004, 3);
        integrado.Visualizar();
        
      }
    
}
