package dao;
import dao.IDao;

import java.util.Map;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        Se connecter à la base de donnée pour récupérer la température
         */
        System.out.println("La version base de données");
        double temp= Math.random()*40;
        return temp;
    }
}