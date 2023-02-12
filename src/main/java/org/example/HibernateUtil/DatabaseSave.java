package org.example.HibernateUtil;

import org.example.cars.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DatabaseSave {
    public static void save(Car cars) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.saveOrUpdate(cars);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public static void delete(Car cars) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.delete(cars);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public static <T> List<T> getDataFromDB(Class<T> entityClass) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //return session.get(Car.class,0); // return one object
            return session.createQuery("FROM " + entityClass.getName(), entityClass).list(); // return list of objects
        }
    }
}
