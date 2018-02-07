/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourmiappli;
import java.util.Random;

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
    
    public Fourmi[] pondre()
    {
        // a ecrire ...
        Fourmi[] tabForumiLarve = new Fourmi[3];
        
        Random nbRandom = new Random(); 
        
        int chance;
        
        for(int i=0;i<tabForumiLarve.length;i++)
        {
            chance = nbRandom.nextInt(10);
            
            switch(chance)
            {
                case 0:
                    FourmiLarveMale lm1  = new FourmiLarveMale();
                    tabForumiLarve[i] = lm1;
                    break;
                case 1:
                    FourmiLarveReine lr  = new FourmiLarveReine();
                    tabForumiLarve[i] = lr;
                    break;
                case 2:
                    FourmiLarveMale lm2  = new FourmiLarveMale();
                    tabForumiLarve[i] = lm2;
                    break;
                default:
                    FourmiLarveOuvriere louv  = new FourmiLarveOuvriere();
                    tabForumiLarve[i] = louv;
            }
        }
        return tabForumiLarve;
    }
    
    
    
}
