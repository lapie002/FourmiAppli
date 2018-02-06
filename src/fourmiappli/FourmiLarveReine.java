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
public class FourmiLarveReine extends FourmiLarve {
    
    public FourmiLarveReine()
    {
        super();
    }
    
    public Fourmi transform(int id)
    {
        FourmiReine queenAnt = new FourmiReine(5,id);
        
        return queenAnt;
    }
    
}
