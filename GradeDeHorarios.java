
package projeto;


import java.util.ArrayList;

public class GradeDeHorarios {
    int i;
    int c;
    private ArrayList<Horario> horario;
    String [][] horarios = new String [7][7];
    {    
        horarios[0][1]="segunda";
        horarios[0][2]="terça";
        horarios[0][3]="quarta";
        horarios[0][4]="quinta";
        horarios[0][5]="sexta";
        
        horarios[1][0]="primeira aula";
        horarios[2][0]="segunda aula";
        horarios[3][0]="terceira aula";
        horarios[4][0]="quarta aula";
        horarios[5][0]="quinta aula";
        horarios[6][0]="sexta aula";
    
        for (i = 0; i < horarios.length; i++) {
            for(c = 0; c < horarios.length; c++){
                System.out.println(horarios[i][c] +" ");
        }
     }
};

    public GradeDeHorarios() {
    }
}
   
    

    
    

