package projeto;

public class GradeDeHorarios {
    int i;
    int c;
    Horario[][] horarios = new Horario [7][7];
    @Override
    public String toString(){    
        String [] dias = {"segunda ","terça ","quarta ","quinta ","sexta"} ; 
        String dados="";
        for (i = 0; i <5 ; i++) {
            dados+=dias[i] + "\n";
            for(c = 0; c < 6 ; c++){
                dados += horarios[i][c] +" ";
            }
            dados+="\n";
        }
        return dados;
    }

    public void addHorarios(int dia, Horario h){
        this.horarios[h.getAula()][dia] = h;
    };
    
    
}
