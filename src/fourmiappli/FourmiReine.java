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
public class FourmiReine extends FourmiAdulte {
    
    private static final String ROLE = "je suis une Reine";
    private static final int AGEMAX = 20;
    
    public FourmiReine(int a)
    {
        super(a);
    }
    
    public FourmiReine(int id,int age)
    {
        super(id,age);
    }
    
    public String role()
    {
        return this.ROLE;
    }
    
    public boolean testAgeMaxi(int age)
    {
        boolean atteint = false;
        
        if(this.age>AGEMAX)
        {
            atteint = true;
        }
        return atteint;
    }
    
}
