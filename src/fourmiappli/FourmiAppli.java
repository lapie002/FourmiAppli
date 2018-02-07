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
public class FourmiAppli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                boolean fviable=true;
		Fourmiliere ma_fourmiliere;
                // création de 10 fourmis
		ma_fourmiliere =new Fourmiliere(10); 
		String s = ma_fourmiliere.toString();
		System.out.println(s);
		int cycle=1; // compte le nombre de jours
		while(fviable &&  cycle<=10) // ici on teste sur 10 jours
		{
                    fviable = ma_fourmiliere.evolue();
                    
                    System.out.print("il y a une reine dans la fourmiliére "+fviable+" au jour: "+cycle+"\n");
                    s=ma_fourmiliere.toString();
                    System.out.println(s);
                    int nb = ma_fourmiliere.nbFourmi();
                    System.out.println("le nombre de fourmi dans la colonie "+nb+"\n");
                    cycle++;
		}
        
    }
    
}
