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
public class FourmiLarveOuvriere extends FourmiLarve {
    
    public FourmiLarveOuvriere()
    {
        super();
    }
    
    public Fourmi transform(int id)
    {
        //ant = this.transform(this.vieillir());
        FourmiOuvriere workerAnt = new FourmiOuvriere(5,id);
        
        return workerAnt;
    }
    
}
