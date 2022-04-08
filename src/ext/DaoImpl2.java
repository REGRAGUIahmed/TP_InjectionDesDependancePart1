package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("C'est la version capteur");
        double temp =80;
        return temp;
    }
}
