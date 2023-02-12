package org.example.HibernateUtil;

import org.example.cars.compact_cars.CityCars;
import org.example.cars.compact_cars.CompactCars;
import org.example.cars.compact_cars.SubcompactCar;
import org.example.cars.compact_cars.Superminis;
import org.example.cars.luxury_cars.EntryLevelCar;
import org.example.cars.luxury_cars.HighEndCar;
import org.example.cars.luxury_cars.MidRangeCar;
import org.example.cars.midsize_cars.ExecutiveCar;
import org.example.cars.midsize_cars.FamilyCar;
import org.example.cars.midsize_cars.PremiumCar;
import org.example.cars.sport_utility_vehicles.CompactSUVs;
import org.example.cars.sport_utility_vehicles.FullSizeSUVs;
import org.example.cars.sport_utility_vehicles.MidSizeSUVs;
import org.example.cars.sports_cars.HighPerformanceCars;
import org.example.cars.sports_cars.SportsConvertibles;
import org.example.cars.sports_cars.SportsCoupes;
import org.example.cars.trucks.HeavyDutyTruck;
import org.example.cars.trucks.LightDutyTruck;
import org.example.cars.trucks.MediumDutyTruck;
import org.example.cars.vans.CommercialVans;
import org.example.cars.vans.FullSizeVans;
import org.example.cars.vans.Minivans;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;


public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://127.0.0.1:3306/test");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                settings.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(settings);

                configuration.addAnnotatedClass(CityCars.class);
                configuration.addAnnotatedClass(SubcompactCar.class);
                configuration.addAnnotatedClass(Superminis.class);

                configuration.addAnnotatedClass(EntryLevelCar.class);
                configuration.addAnnotatedClass(HighEndCar.class);
                configuration.addAnnotatedClass(MidRangeCar.class);

                configuration.addAnnotatedClass(ExecutiveCar.class);
                configuration.addAnnotatedClass(FamilyCar.class);
                configuration.addAnnotatedClass(PremiumCar.class);

                configuration.addAnnotatedClass(CompactSUVs.class);
                configuration.addAnnotatedClass(FullSizeSUVs.class);
                configuration.addAnnotatedClass(MidSizeSUVs.class);

                configuration.addAnnotatedClass(HighPerformanceCars.class);
                configuration.addAnnotatedClass(SportsConvertibles.class);
                configuration.addAnnotatedClass(SportsCoupes.class);

                configuration.addAnnotatedClass(HeavyDutyTruck.class);
                configuration.addAnnotatedClass(MediumDutyTruck.class);
                configuration.addAnnotatedClass(LightDutyTruck.class);

                configuration.addAnnotatedClass(CommercialVans.class);
                configuration.addAnnotatedClass(FullSizeVans.class);
                configuration.addAnnotatedClass(Minivans.class);






                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}