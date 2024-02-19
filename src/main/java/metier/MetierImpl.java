package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao ;//par defaut null
    //Couplagefaible :depend a un interface
    @Override
    public double calcule() {
        double data =dao.getData();//la methode getdata de l'interface
        double res=data*11.4;
        return res;
    }
    //setter permettre d'injecter (Modifier) dans la variable dao
    //un objet d'une classe qui implemente l'interface IDao
    public void setDao(IDao dao){
        this.dao=dao;
    }

}
