/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestres;

/**
 *
 * @author Denilson
 */
import java.util.Scanner;
public class Trimestres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        Trimestre NumeroMes = new Trimestre();

        System.out.println("Introduce el número del mes");
        NumeroMes.setTrimestre(entrada.nextInt());
        System.out.println(NumeroMes.getTrimestre());
    }
   
}

class Trimestre{
    
    private int NumeroMes;
    private String trimestre;
    
    public void setTrimestre(int NumeroMes){
        
        this.NumeroMes = NumeroMes;
        
        switch(this.NumeroMes){
            
            case 1: case 2: case 3:
                this.trimestre = "Primer trimestre";
                break;
            case 4: case 5: case 6:
                this.trimestre = "Segundo trimestre";
                break;
            case 7: case 8: case 9:
                this.trimestre = "Tercer trimestre";
                break;
            case 10: case 11: case 12:
                this.trimestre = "Cuarto trimestre";
                break;
            default:
                this.trimestre = "Introduce un númerom correcto del mes";
                
        }
    }
    
    public String getTrimestre(){
        return this.trimestre;
    }
    
}
