package kz.tezdet.lessons.hibernate.main;

import kz.tezdet.lessons.hibernate.models.Stock;
import kz.tezdet.lessons.hibernate.utils.HibernateUtil;
import org.hibernate.Session;

public class App {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession() ;

        session.beginTransaction() ;

        Stock stock = new Stock() ;
        stock.setStockCode("4715");
        stock.setStockName("GENM");

        session.save(stock) ;

        session.getTransaction().commit();

        session.close();

    }
}
