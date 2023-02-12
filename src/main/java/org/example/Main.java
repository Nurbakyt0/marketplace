package org.example;

import org.example.HibernateUtil.DatabaseSave;
import org.example.cars.Car;
import org.example.cars.compact_cars.CityCars;
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

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Car> CarArrayList = new ArrayList<>();

    public static void main(String[] args) {

        CarArrayList.addAll(DatabaseSave.getDataFromDB(CityCars.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(SubcompactCar.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(Superminis.class));

        CarArrayList.addAll(DatabaseSave.getDataFromDB(EntryLevelCar.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(HighEndCar.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(MidRangeCar.class));

        CarArrayList.addAll(DatabaseSave.getDataFromDB(ExecutiveCar.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(FamilyCar.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(PremiumCar.class));

        CarArrayList.addAll(DatabaseSave.getDataFromDB(CompactSUVs.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(FullSizeSUVs.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(MidSizeSUVs.class));

        CarArrayList.addAll(DatabaseSave.getDataFromDB(HighPerformanceCars.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(SportsConvertibles.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(SportsCoupes.class));

        CarArrayList.addAll(DatabaseSave.getDataFromDB(HeavyDutyTruck.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(LightDutyTruck.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(MediumDutyTruck.class));

        CarArrayList.addAll(DatabaseSave.getDataFromDB(CommercialVans.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(FullSizeVans.class));
        CarArrayList.addAll(DatabaseSave.getDataFromDB(Minivans.class));
        mainMenu();
    }
    static void printOut() {
        int count = 0;
        for(Car e: CarArrayList) {
            System.out.print(count + "\t");
            e.print();
            count++;
        }
        mainMenu();
    }

    static void deleteObject() {
        System.out.println("Введите ID объекта для удаления: ");

        int number = scan.nextInt();
        DatabaseSave.delete(CarArrayList.get(number));
        CarArrayList.remove(number);
        System.out.println("Deleted successfully");
        mainMenu();
    }
    static void mainMenu() {
        System.out.println("1. Вывести список машины.\n2. Удалить объект с базы данных.\n3. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                printOut();
                break;
            case 2:
                deleteObject();
                break;
            case 3:
                break;
        }
    }
}