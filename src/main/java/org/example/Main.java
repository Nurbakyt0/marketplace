package org.example;

import org.example.HibernateUtil.DatabaseSave;
import org.example.cars.Car;
import org.example.cars.compact_cars.CityCars;
import org.example.cars.compact_cars.CityCarsBuilder;
import org.example.cars.compact_cars.SubcompactCar;
import org.example.cars.compact_cars.Superminis;
import org.example.cars.luxury_cars.EntryLevelCar;
import org.example.cars.luxury_cars.EntryLevelCarBuilder;
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

    static void enterObject(){
        System.out.println("1. enterCityCar.\n2. enterEnryLevelCar.\n3. Выйти");
        int option = scan.nextInt();
        switch (option){
            case 1:
                enterCityCar(new CityCarsBuilder());
                break;
            case 2:
                enterEnryLevelCar(new EntryLevelCarBuilder());
            case 3:
                mainMenu();
        }
    }
    static void mainMenu() {
        System.out.println("1. Вывести список машины.\n2. Удалить объект с базы данных.\n3. Добавить объект в базы данных\n4. Выйти");
        int number = scan.nextInt();
        switch(number) {
            case 1:
                printOut();
                break;
            case 2:
                System.out.println("ВЫ ХОТИТЕ УДАЛИТЬ ОБЪЕКТ?\n 1 - Да\n 2 - Нет");
                int number1 = scan.nextInt();
                switch (number1){
                    case 1:
                        deleteObject();
                    case 2:
                      mainMenu();
                }

            case 3:
                enterObject();
                break;
            case 4:
                break;
        }
    }

    public static void enterCityCar(CityCarsBuilder cityCarsBuilder){
        System.out.println("1. Model.\n2. Make.\n3. Year.\n4. Number_of_seats\n5. Colour\n6. Price\n7. Engine_displacement\n8. Dovodchik\n9. Enter object\n10. Выйти");

        int option = scan.nextInt();
        switch (option){
            case 1:
              String model = scan.next();
              cityCarsBuilder.setModel(model);
              break;
            case 2:
                String make = scan.next();
                cityCarsBuilder.setMake(make);
                break;
            case 3:
                int year = scan.nextInt();
                cityCarsBuilder.setYear(year);
                break;
            case 4:
                int number_of_seats = scan.nextInt();
                cityCarsBuilder.setNumber_of_seats(number_of_seats);
                break;
            case 5:
                String colour = scan.next();
                cityCarsBuilder.setColour(colour);
                break;
            case 6:
                int price = scan.nextInt();
                cityCarsBuilder.setPrice(price);
                break;
            case 7:
                String engine_displacement = scan.next();
                cityCarsBuilder.setEngine_displacement(engine_displacement);
                break;
            case 8:
                String dovodchik = scan.next();
                cityCarsBuilder.setDovodchik(dovodchik);
                break;
            case 9:
                CityCars cityCars = cityCarsBuilder.build();
                DatabaseSave.save(cityCars);
                cityCars.print();
                break;
            case 10:
                mainMenu();
                return;
        }
        enterCityCar(cityCarsBuilder);
    }

    public static void enterEnryLevelCar(EntryLevelCarBuilder entryLevelCarBuilder){
        System.out.println("1. Model.\n2. Make.\n3. Year.\n4. Number_of_seats\n5. Colour\n6. Price\n7. Engine_displacement\n8. Panorama\n9. Enter object\n10. Выйти");

        int option = scan.nextInt();
        switch (option){
            case 1:
                String model = scan.next();
                entryLevelCarBuilder.setModel(model);
                break;
            case 2:
                String make = scan.next();
                entryLevelCarBuilder.setMake(make);
                break;
            case 3:
                int year = scan.nextInt();
                entryLevelCarBuilder.setYear(year);
                break;
            case 4:
                int number_of_seats = scan.nextInt();
                entryLevelCarBuilder.setNumber_of_seats(number_of_seats);
                break;
            case 5:
                String colour = scan.next();
                entryLevelCarBuilder.setColour(colour);
                break;
            case 6:
                int price = scan.nextInt();
                entryLevelCarBuilder.setPrice(price);
                break;
            case 7:
                String engine_displacement = scan.next();
                entryLevelCarBuilder.setEngine_displacement(engine_displacement);
                break;
            case 8:
                String panorama = scan.next();
                entryLevelCarBuilder.setPanorama(panorama);
                break;
            case 9:
                EntryLevelCar entryLevelCar = entryLevelCarBuilder.build();
                DatabaseSave.save(entryLevelCar);
                entryLevelCar.print();
                break;
            case 10:
                mainMenu();
                return;
            }
        enterEnryLevelCar(entryLevelCarBuilder);
        }

    }
