package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunnerGenericType {
    public static void main(String[] args) {

        GenericClass<String> obje1 = new GenericClass<>();
        obje1.setType("Generic Type");

        String obje1S= obje1.getType(); //casting Islemi yapmama gerek kalmadi.

        GenericClass<Integer> obje2 = new GenericClass<>();
        obje2.setType(12);

        Integer obje2N= obje2.getType();

        //GenericClass<String> obje3=new GenericClass<>();
        //obje3.setType(12);//CTE, tür güvenliği sağlanır.-->ClassCastExc. önlüyor.




        List<String> list=new ArrayList<>();
        list.add("Advanced");
        list.add("Java");
        //  list.add(12);//CTE, tür güvenliği sağlanır.-->ClassCastExc. önlüyor.


        Map<String,Integer> map=new HashMap<>();
        map.put("generic",2);
        //    map.put(1,1);//CTE, tür güvenliği sağlanır.-->ClassCastExc. önlüyor.



        //============================Generic Class Two Param================================

        GenericClassTwoParam<String,Integer> mymap=new GenericClassTwoParam<>();
        mymap.setField("java");
        mymap.setType(12);

        System.out.println(mymap.getField()+"-----"+mymap.getType());

    }
}
