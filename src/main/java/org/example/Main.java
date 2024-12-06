package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Publish<Integer> integerPublish = new Publish<>();
        integerPublish.setValue(10);
        int publishValue = integerPublish.getValue();
        System.out.println(publishValue);
        InheritanceGeneric inheritanceGeneric = new InheritanceGeneric();
        inheritanceGeneric.setValue("Ma-moni");
        System.out.println(inheritanceGeneric.getValue());
        GenericSubClass<String> genericSubClass = new GenericSubClass<>();
        genericSubClass.setValue("Najeebah Arwah");
        System.out.println(genericSubClass.getValue());
        Pair<String,Integer> pairObj = new Pair<>();
        pairObj.put("Hello",100);

        Print printObj = new Print();
        printObj.setValue(new Bus());

        //raw type
        Publish publish = new Publish();
        publish.setValue(10);
        publish.setValue("String");

        //upperbound
        UpperBound<Integer> intValue = new UpperBound<>();
        intValue.setValue(10);
        System.out.print("Upper Bound:");
        System.out.println(intValue.printValue());
        UpperBound<Double> doubleValue = new UpperBound<>();
        doubleValue.setValue(10.098732);
        System.out.print("Upper Bound:");
        System.out.println(doubleValue.printValue());
        MultiBound<ChildMultiBound> obj = new MultiBound<>();

        //Upper Bound Wild Card
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bus());
        vehicles.add(new Car());
        UpperBoundWildCard vehicleUpperBound = new UpperBoundWildCard();
        vehicleUpperBound.setValues(vehicles);
        List<Bus> buses = new ArrayList<>();
        vehicleUpperBound.setValues(buses);
        List<Car> cars = new ArrayList<>();
        vehicleUpperBound.setValues(cars);

        LowerBoundWildCard lowerBoundWildCard = new LowerBoundWildCard();
        lowerBoundWildCard.setValues(cars);
        lowerBoundWildCard.setValues(vehicles);
        //lowerBoundWildCard.setValues(buses);//Not Allowed

        Compare compare = new Compare();
        List<Integer> wildCardInt = new ArrayList<>();
        List<Double> wildCardDouble = new ArrayList<>();
        compare.cmputeList(wildCardInt,wildCardDouble);
//        compare.cmputeList1(wildCardInt,wildCardDouble);//Not Allowed
        compare.cmputeList1(wildCardInt,wildCardInt);

        UnBoundClass unBoundClass = new UnBoundClass();
        unBoundClass.cmputeList(new ArrayList<Integer>());//UnBound is used when methods of Object class are enough for operation
    }
}