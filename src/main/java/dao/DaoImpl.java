package dao;

public class DaoImpl implements IDao{
//ne depend pas au une autre classe
    @Override
    public double getData() {
        System.out.println("Version de la base de donnees ");
        double data =34;
        return data;
    }



}
