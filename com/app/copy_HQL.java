package com.app;

import org.hibernate.query.Query;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class copy_HQL {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		 Transaction tx=null;
				cfg=new Configuration().configure("com/app/cfgs/hibernate.cfg.xml");
				factory=cfg.buildSessionFactory();
			ses=factory.openSession();
		
			tx=ses.beginTransaction();
			 String hql="insert into newMall(mallid,item_name,item_price,item_quantity) "
			 			+ "select bazarid,item_name,item_price,item_quantity from bigbazarModel ";
			 Query q=ses.createQuery(hql);
			 			int c=q.executeUpdate();
			 			//int count=Integer.parseUnsignedInt(c);
			 			tx.commit();
			 			System.out.println("\t\t"+c+" rows Copied Successfully...");
			 		
			 			factory.close();

	}

}
