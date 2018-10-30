
package projeto;
import java.util.Vector;

public class Projeto {

    
    public static void main(String[] args) {
        Usuario joao = new Usuario ();
        
        joao.setApelido ("jo");
        joao.setSenha("kk123");
        
        System.out.println(joao.toString());
        
        Laboratorio info = new Laboratorio();
        
        info.setDescricao("Laboratório informática 2");
        info.setCapacidade(20);
        
        System.out.println(info.toString());
        
        Docente mar = new Docente();
        
        mar.setNome ("Marcilio");
        mar.setApelido("druida");
        mar.setMatricula(11111);
        
        System.out.println(mar.toString());
        
        Turma terceiro = new Turma();
        
        terceiro.setIdentificador(003);
        terceiro.setAno_oferta(2018.2);
        
        
        System.out.println(terceiro.toString());
        
        Disciplina filosofia = new Disciplina();
        
        filosofia.setDescricao("Filosofia básica");
        filosofia.setPeriodo(20);
        filosofia.setSigla("FILO");
        
        System.out.println(filosofia.toString());
        
        Curso integrado = new Curso("3 anos integrado ao médio", 0004, 3);
        System.out.println(integrado.toString());
        
        GradeDeHorarios gg = new GradeDeHorarios();
        
        System.out.println(gg);
        
        
        
    }
    
}
        
