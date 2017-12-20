package com.app;

import org.hibernate.query.Query;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClass {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
				cfg=new Configuration().configure("com/app/cfgs/hibernate.cfg.xml");
				factory=cfg.buildSessionFactory();
			ses=factory.openSession();
		
			 String hql="select item_name from bigbazarModel where bazarid=:id";
			 Query q=ses.createQuery(hql);
			 		q.setParameter("id", 1001);
			 			String s=(String) q.uniqueResult();
			 			System.out.println("\t\t"+s);
			 			
			 			factory.close();

	}

}
