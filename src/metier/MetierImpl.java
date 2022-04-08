package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;// Couplage faible
    @Override
    public double calcul(){
        double temp= dao.getData();
        double res = temp +275.15;
        return res;
    }
    /*
     Il permet d'injecter dans la variable DAO un objet
     qui implémente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
