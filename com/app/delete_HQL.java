package com.app;

import org.hibernate.query.Query;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class delete_HQL {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		 Transaction tx=null;
				cfg=new Configuration().configure("com/app/cfgs/hibernate.cfg.xml");
				factory=cfg.buildSessionFactory();
			ses=factory.openSession();
		
			tx=ses.beginTransaction();
			 String hql="delete from bigbazarModel where bazarid=:id";
			 Query q=ses.createQuery(hql);
			 		q.setParameter("id", 1003);
			 			int c=q.executeUpdate();
			 			//int count=Integer.parseUnsignedInt(c);
			 			tx.commit();
			 			System.out.println("\t\t"+c+" rows Deleted");
			 		
			 			factory.close();

	}

}
