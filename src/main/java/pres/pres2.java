package pres;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        //DaoImpl2 dao=new DaoImpl2(); //instanciation statique
        Scanner scanner =new Scanner(new File("config.txt"));
        String  daoClassName =scanner.nextLine();
        //System.out.println(daoClassName);
        //charger la classe en memoire

        Class cDao=Class.forName(daoClassName);

        //MetierImpl metier=new MetierImpl();
        //Injection des dépendance
        //metier.setDao(dao);
       //System.out.println("RES = "+metier.calcule());
    }
}
