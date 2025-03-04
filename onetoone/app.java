package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app {
    public static void main(String[] args) {


        Configuration cfg = new Configuration();


        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        laptop laptop=new laptop();
        laptop.setLid(101);
        laptop.setLname("victus");




        Student s= new Student();
        s.setName("anjali");
        s.setRollno(1);
        s.setMarks(50);
        s.setLaptop(laptop);
        Session session= sf.openSession();
        Transaction tx=session.beginTransaction();

        session. save(laptop);
        session.save(s);
        tx.commit();
        session.close();

    }
}