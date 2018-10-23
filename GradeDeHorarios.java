package projeto;


import java.util.ArrayList;

public class GradeDeHorarios {
    int i;
    int c;
    Horario[][] horarios = new Horario [6][5];
    {    
        horarios[0][1]=null;
        horarios[0][2]=null;
        horarios[0][3]=null;
        horarios[0][4]=null;
        horarios[0][5]=null;
        
        horarios[1][0]=null;
        horarios[2][0]=null;
        horarios[3][0]=null;
        horarios[4][0]=null;
        horarios[5][0]=null;
        horarios[6][0]=null;
    
        for (i = 0; i < horarios.length; i++) {
            for(c = 0; c < horarios.length; c++){
                System.out.println(horarios[i][c] +" ");
        }
     }
};

    public void addHorarios(int dia, Horario h){
        this.horarios[h.getAula()][dia] = h;
    };
    
    
}
