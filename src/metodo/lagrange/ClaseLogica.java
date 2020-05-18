/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.lagrange;
import java.util.ArrayList;
/**
 *
 * @author Nanci Uicab
 */
public class ClaseLogica {
    
    
 private ArrayList<Punto> datos;
    
    ClaseLogica(ArrayList<Punto> lista){
    this.datos = lista;
    
    }
    
    public String getLagrange2(){
        int i,j;
        String lag="";
        String polinomio="";
        for (i = 0; i<this.datos.size();i++){
            lag ="";
            for( j = 0;j<this.datos.size();j++){
                if(j!=i ){
                   
                    lag ="(x- " + String.valueOf( this.datos.get(j).getX()) + " ) / " ;
                    lag +="(" +String.valueOf( this.datos.get(i).getX()) +" - " + String.valueOf( this.datos.get(j).getX()) +")";
               
                
                }
          
            }
            
            polinomio += lag + "*"+ String.valueOf( this.datos.get(i).getY() )+"\n";
            
        }
        return polinomio;
       
    }

    
    
    
    
    
    
}
