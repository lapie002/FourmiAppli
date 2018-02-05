/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourmiappli;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author lapie
 */
public class FourmiIdent {
    
    //declaration d'un attribut , qui est un objet de type AtomicInteger(proteger en ecriture).
    private static AtomicInteger x = new AtomicInteger(0);
    
    //methode d'incrementation et de retour de x, sous la forme d'un entier.
    public static int nextId()
    {
        return x.incrementAndGet();
    }
    
    
}
