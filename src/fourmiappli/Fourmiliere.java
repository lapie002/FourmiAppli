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
        
        FourmiReine queenAnt = new FourmiReine(6);
        FourmiMale maleAnt   = new FourmiMale(6);
        
        this.ma_fourmiliere.add(queenAnt);
        this.ma_fourmiliere.add(maleAnt);
        
        for(int i = 0; i<n-2; i++)
        {
            FourmiOuvriere worker = new FourmiOuvriere(6);
            this.ma_fourmiliere.add(worker);
        }
          
    }
    
    public void evolue()
    {
        for(int j = 0; j<this.ma_fourmiliere.size();j++)
        {
            Fourmi myAnt = this.ma_fourmiliere.get(j);
            myAnt.evolue();
            
            if(myAnt==null)
            {
                this.ma_fourmiliere.remove(j);
                j--;
            }
            else if(myAnt!=this.ma_fourmiliere.get(j))
            {
                this.ma_fourmiliere.remove(j);
                j--;
                this.ma_fourmiliere.add(myAnt);
            }
        }
        
        this.pondre();
    
    }
    
    public void pondre()
    {
    //a ecrire ...
    
    }
    
}
