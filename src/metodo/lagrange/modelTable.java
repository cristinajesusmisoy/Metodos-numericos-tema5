/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo.lagrange;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Nanci Uicab
 */
public class modelTable extends AbstractTableModel {
    
  public  String[] columnas = {"i", "x","y"};
     public ArrayList<Punto2> datos = new ArrayList<Punto2>(); 
    ArrayList<Punto2> dat;
     //Constructor
     modelTable(){
     
     }
 
   @Override
    public int getRowCount() {
       
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
       
    
    return this.columnas.length;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return super.isCellEditable(rowIndex, columnIndex); 
    }
    @Override
    public String getColumnName(int column) {
     return this.columnas[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Punto2 p = this.datos.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getI2();
            case 1: return p.getX2();
            case 2: return p.getY2();
        }
       return null;
       }
   
    public void addPunto(Punto2 p){
     p.setI2(this.datos.size());
     this.datos.add(p);
     this.fireTableRowsInserted(this.datos.size()-1, this.datos.size()-1);
    }
   
}
