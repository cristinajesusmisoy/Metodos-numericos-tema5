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
public class ClaseLogica2 {
    
     private ArrayList<Punto2> datos;
    
    ClaseLogica2(ArrayList<Punto2> list){
    this.datos = list;
    }

    
    
    public String getLagrange3(){
        int a,b,c;
        String cad="";
        String polinomio3="";
        for (a = 0; a<this.datos.size();a++){
               for( b = 0;b<this.datos.size();b++){
                
                  for (c = 0;c <this.datos.size();c++){
                    if ( c!=b & c!=a){
                        
                        cad = "(x- " + String.valueOf( this.datos.get(c).getX2()) + ")" +"(x- " + String.valueOf( this.datos.get(b).getX2()) + " ) / "  ;
                        cad +="("+ String.valueOf( this.datos.get(a).getX2()) +" - " + String.valueOf( this.datos.get(c).getX2()) + ")"+ "("+String.valueOf( this.datos.get(a).getX2()) +" - " + String.valueOf( this.datos.get(b).getX2()) +") ";
                    }
                        
                }
        
              }
            polinomio3 += cad + "*"+ String.valueOf( this.datos.get(a).getY2() ) +" \n"; 
                 
            }
        return polinomio3;
    }
}
    
    