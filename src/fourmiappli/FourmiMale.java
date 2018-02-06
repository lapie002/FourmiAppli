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
public class FourmiMale extends FourmiAdulte {
    
    private static final String ROLE = "je suis un male";
    private static final int AGEMAX = 10;
    
    public FourmiMale(int a)
    {
        super(a);
    }
    
    public FourmiMale(int id,int age)
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
