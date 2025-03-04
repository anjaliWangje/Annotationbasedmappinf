package ExampleofHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {


        public static void main(String[] args) {

            Configuration cfg=new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory sf= cfg.buildSessionFactory();
           // Alien


          //  Alien telusko=new Alien();
            Alien telusko=new Alien();

            telusko.setAid(101);
          // telusko.setAname("anjali");
           telusko.setColor("green");


            Session session= sf.openSession();
            Transaction tx=session.beginTransaction();
           // telusko=(Alien)session.get(Alien.class,101);

            session. save(telusko);
            tx.commit();
            session.close();



        }
    }


