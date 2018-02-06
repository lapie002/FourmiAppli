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
public abstract class FourmiLarve extends Fourmi {
    
    protected static final String ROLE = "je suis une larve";
    protected static final int AGEMAX = 5;
    
    public FourmiLarve()
    {
        super(0);
    }
    
    public FourmiLarve(int a)
    {
        super(a);
    }
    
    public String toString()
    {
        return this.ROLE;
    }
    
    public boolean testAgeMaxi(int age)
    {
        boolean atteint = false;
        
        if(age>this.AGEMAX)
        {
            atteint = true;
        }
        return atteint;
    }
    
    public Fourmi evolue()
    {
        Fourmi ant;
        
        // si babyAnt n a pas encore atteint son age max
        if(this.vieillir() != 0)
        {
            ant = this;
        }
        else
        {
            ant = this.transform(this.vieillir());
        }
        
        return ant;
    
    }
    
    //methode transform est abstraite dans la classe FourmiLarve.
    public abstract Fourmi transform(int id);
    
    
    
    
}
