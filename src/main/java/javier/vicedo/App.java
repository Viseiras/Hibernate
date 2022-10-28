package javier.vicedo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Esta aplicación creará un par de empleados
 */
public class App {
    public static void main(String[] args) {
        SessionFactory sf= HibernateUtil.getSessionFactory();
        Session session= sf.openSession();
        Transaction tr = session.beginTransaction();

        empleado e1 = new empleado("Nacho Pérez",4000);
        empleado e2 = new empleado("Nuño Navarro",4000);
        session.persist(e1);
        session.persist(e2);

        tr.commit();
        session.close();
    }
}
