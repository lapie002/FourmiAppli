/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourmiappli;

import java.util.ArrayList;

/**
 *
 * @author lapie
 */
public class Fourmiliere {
    
    private ArrayList<Fourmi> ma_fourmiliere; 
    
    public Fourmiliere(int n)
    {
        this.ma_fourmiliere  = new ArrayList<Fourmi>();
        
        FourmiReine queenAnt = new FourmiReine(10);
        //FourmiMale maleAntZeroTest   = new FourmiMale(6);
        FourmiMale maleAnt   = new FourmiMale(6);
        
        this.ma_fourmiliere.add(queenAnt);
        //this.ma_fourmiliere.add(maleAntZeroTest);
        this.ma_fourmiliere.add(maleAnt);
        
        for(int i = 0; i<n-2; i++)
        {
            FourmiOuvriere worker = new FourmiOuvriere(6);
            this.ma_fourmiliere.add(worker);
        }
          
    }
    
    public boolean evolue()
    {
        Fourmi myAnt;	
        Fourmi[] tableauDeLarvesDeFourmis;
        boolean isThereQueen = false;
        
        for(int j = this.ma_fourmiliere.size()-1;j>=0;j--)
        {
            myAnt = this.ma_fourmiliere.get(j);
            myAnt = myAnt.evolue();//renvoie null si doit mourir
            
            if(myAnt == null)
            {
                this.ma_fourmiliere.remove(j);
            }
            else
            {
                
                this.ma_fourmiliere.set(j, myAnt);
                tableauDeLarvesDeFourmis = myAnt.pondre();
                
                if(tableauDeLarvesDeFourmis != null)
                {
                    for(int i = 0; i<tableauDeLarvesDeFourmis.length;i++)
                    {
                        this.ma_fourmiliere.add(tableauDeLarvesDeFourmis[i]);
                        isThereQueen = true; 
                    }
                }        
            }
        }
        return isThereQueen;
    }
    
    public String toString()
    {
        String str = "";
        
        for(int k = 0; k<this.ma_fourmiliere.size();k++)
        {
            Fourmi myAnt = this.ma_fourmiliere.get(k);
            str = str + myAnt.toString() + "\n";
        }
        return str;
    }
    
    public int nbFourmi()
    {
        int nb = 0;
        
        for(int k = 0; k<this.ma_fourmiliere.size();k++)
        {
            nb++;
        }
        return nb;
    }
    
    
}
