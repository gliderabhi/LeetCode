package FirstSets;

import java.util.*;

public class Orders {

    public static void main(String[] args) {
        String[][] orderList = {{"David","3","Ceviche"},
                                {"Corina","10","Beef Burrito"},
                {"David","3","Fried Chicken"},{"Carla","5","Water"},
                {"Carla","5","Ceviche"},{"Rous","3","Ceviche"}};
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<orderList.length;i++){
            ArrayList<String> s1 = new ArrayList<>();
            for(int j=0;j<3;j++){
                s1.add(orderList[i][j]);
            }
            list.add(s1);
        }

        list = getOrderDetails(list);
    }

    private static List<List<String>> getOrderDetails(List<List<String>> orders) {
        List<List<String>> result = new ArrayList<>();
        Set<String> food = new TreeSet<>();
        Map<String, Integer> map = new TreeMap<>();
        Set<Integer> number = new TreeSet<>();
        for(int i=0; i < orders.size(); i++){

            food.add(orders.get(i).get(2));//存储食物
            number.add(Integer.valueOf(orders.get(i).get(1)));//存储桌号
            String tmp = orders.get(i).get(1) + "+" + orders.get(i).get(2);
            // System.out.println(tmp);
            // System.out.println(map.get(tmp));
            if(map.get(tmp) == null){
                map.put(tmp,1);

            }else{
                map.put(tmp,map.get(tmp)+1);
            }

        }
        //填充
        List<String> table = new ArrayList<>();
        table.add("Table");
        for(String s: food){
            table.add(s);
        }
        result.add(table);
        for(Integer k : number){
            List<String> row = new ArrayList<>();
            row.add(k+"");
            for(String s : food){

                if(map.get(k+"+"+s) != null){
                    row.add(String.valueOf(map.get(k+"+"+s)));
                }else{
                    row.add("0");
                }
            }
            result.add(row);
        }
        return result;



    }
}
