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
    
    private static final String ROLE = "je suis une larve";
    private static final int AGEMAX = 5;
    
    public FourmiLarve()
    {
        super(0);
    }
    
    public FourmiLarve(int a)
    {
        super(a);
    }
    
    public String role()
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
        int id = super.vieillir();
        
        if(id==0)
        {
            return this;
        }
        else
        {
            return transform(id);
        }       
    }
    
    //methode transform est abstraite dans la classe FourmiLarve.
    public abstract Fourmi transform(int id);

}
