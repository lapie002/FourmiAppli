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
public class FourmiLarveMale extends FourmiLarve{
    
    public FourmiLarveMale()
    {
        super();
    }
    
    public Fourmi transform(int id)
    {
        FourmiMale maleAnt = new FourmiMale(5,id);
        
        return maleAnt;
    }
    
}
