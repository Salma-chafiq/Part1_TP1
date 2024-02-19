package extension;

import dao.IDao;

import java.sql.SQLOutput;
//Nouvelle extension pour la maintenance
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web services");
        double data=55;
        return data;
    }
}
