package pres;

import dao.DaoImpl;
import extension.DaoImpl2;
import metier.MetierImpl;
//injection des dependance par instanciation dynamique

public class Pres1 {
    public static void main(String[] args) {
        //n'est pas fermer a l'extension=couplage fort
        //DaoImpl dao=new DaoImpl();
        //Ouverte a l'extension
        //fabrique
        DaoImpl2 dao=new DaoImpl2(); //instanciation statique
        MetierImpl metier=new MetierImpl();
        //Injection des dépendance
        metier.setDao(dao);
        System.out.println("RES = "+metier.calcule());
    }
}
