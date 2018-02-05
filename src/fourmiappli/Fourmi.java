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
public abstract class Fourmi{
    
    //declaration des attributs
    int ident;
    int age;
    
    //constructeur vide
    public Fourmi(){}
    
    //constructeur avec un entier en parametre.
    public Fourmi(int a)
    {
        this.age = a;
        /*Appel de la methode nextId de la classe FourmiIdent.
        *L'appel est du type classe.methode(), car nextId est une methode static,
        *et peut s'appeler sans objet.*/
        this.ident = FourmiIdent.nextId();
    }
    
    public Fourmi(int id, int a)
    {
        this.ident = id;
        this.age = a;
    }
    
    public String toString()
    {
        String str = "";
        
        str = str + "Je suis la fourmi numéro " + this.ident + ", j'ai " 
                   + this.age + " jour(s) et " + this.role() + "\n" ; 
        
        return str;
    
    }
    
    public int vieillir()
    {
        int destin = 0;
        
        this.age++;
        
        if(testAgeMaxi(this.age))
        {
            destin = this.ident;
        }
        return destin; 
    }
    
    public Fourmi[] pondre()
    {
        return null; 
    }
    
    //methode role est abstraite dans la classe Fourmi.
    public abstract String role();
    
    //methode evolue est abstraite dans la classe Fourmi.
    public abstract Fourmi evolue();
    
    //methode testAgeMaxi est abstraite dans la classe Fourmi.
    public abstract boolean testAgeMaxi(int age);
    
    
}
