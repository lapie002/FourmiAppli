/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourmiappli;

/**
 *
 * @author lapie
 */
public abstract class FourmiAdulte extends Fourmi{
    
    public FourmiAdulte(int a)
    {
        super(a);
    }
    
    public FourmiAdulte(int id, int a)
    {
        super(id,a);
    }
    
    public Fourmi evolue()
    {
        Fourmi ant = this;
        
        if(ant.vieillir()!=0)
        {
            ant = null;
        }
        
        return ant;
    }
    
}
