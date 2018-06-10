package service;

import model.InitialData;

import java.util.*;

public class InitialDataLoad {


    public static List<InitialData> getWithExpandedTimeBox(){

        List<InitialData> initialDataList = InitialDataLoad.getData();

        for (InitialData initialData : initialDataList) {

            Set<Map.Entry<Integer, Integer>> entries = initialData.getOccupation().entrySet();
            Object[] array = entries.toArray();

            Map<String, Integer> newOccupation = new HashMap<String, Integer>();
            for (int i = 0; i < array.length-1; i++) {
                Map.Entry<Integer, Integer> item = (Map.Entry<Integer, Integer>)array[i];
                Map.Entry<Integer, Integer> next = (Map.Entry<Integer, Integer>)array[i+1];

                Integer value = item.getValue();
                Integer nextValue = next.getValue();
                Integer half = (value+nextValue)/2;
                Integer firstQuarter = (value+half)/2;
                Integer thirdQuarter = (half+nextValue)/2;

                newOccupation.put(item.getKey()+"_0", value);
                newOccupation.put(item.getKey()+"_1", firstQuarter);
                newOccupation.put(item.getKey()+"_2", half);
                newOccupation.put(item.getKey()+"_3", thirdQuarter);
                newOccupation.put(next.getKey()+"_0", nextValue);
            }
            initialData.setExpandedOccupation(newOccupation);
        }
        return initialDataList;

    }

    public static List<InitialData> getData(){
        List<InitialData> response = new ArrayList<InitialData>();
        response.addAll(restauranteCentral());
        response.addAll(restauranteFisica());
        response.addAll(restauranteQuimica());
        response.addAll(restaurantePrefeitura());
        return response;
    }


    private static Collection<InitialData> restauranteCentral(){
        List<String> occs = new ArrayList<String>();
        occs.add("11\t8\t10\t8\t13\t11\t2\t0");
        occs.add("12\t46\t40\t42\t56\t43\t16\t0");
        occs.add("13\t91\t84\t85\t100\t77\t38\t0");
        occs.add("14\t69\t66\t66\t66\t60\t34\t0");
        occs.add("17\t3\t3\t2\t1\t2\t0\t0");
        occs.add("18\t16\t18\t20\t12\t14\t0\t0");
        occs.add("19\t33\t40\t47\t48\t28\t0\t0");

        List<String> menus = new ArrayList<String>();
        menus.add("1\t4\t2\t5\t1\t2\t?");
        menus.add("5\t3\t5\t5\t6\t?\t?");

        return parseData(1, occs, menus);
    }

    private static Collection<InitialData> restauranteFisica(){
        List<String> occs = new ArrayList<String>();
        occs.add("11\t4\t2\t3\t6\t2\t0\t0");
        occs.add("12\t42\t35\t41\t50\t31\t0\t0");
        occs.add("13\t91\t79\t87\t100\t70\t0\t0");
        occs.add("14\t61\t51\t55\t62\t43\t0\t0");
        occs.add("17\t1\t1\t1\t1\t1\t0\t0");
        occs.add("18\t10\t10\t7\t11\t9\t0\t0");
        occs.add("19\t32\t29\t43\t47\t19\t0\t0");

        List<String> menus = new ArrayList<String>();
        menus.add("1\t4\t2\t5\t1\t?\t?");
        menus.add("5\t3\t5\t5\t6\t?\t?");

        return parseData(2, occs, menus);
    }

    private static Collection<InitialData> restauranteQuimica(){
        List<String> occs = new ArrayList<String>();
        occs.add("11\t3\t8\t10\t4\t11\t0\t2");
        occs.add("12\t41\t42\t40\t42\t43\t0\t16");
        occs.add("13\t87\t85\t84\t91\t77\t0\t38");
        occs.add("14\t55\t66\t66\t61\t60\t0\t34");
        occs.add("17\t1\t3\t3\t3\t1\t0\t0");
        occs.add("18\t10\t16\t18\t16\t9\t0\t0");
        occs.add("19\t29\t33\t40\t33\t19\t0\t0");

        List<String> menus = new ArrayList<String>();
        menus.add("2\t6\t4\t2\t5\t?\t2");
        menus.add("5\t2\t6\t5\t2\t?\t?");

        return parseData(3, occs, menus);
    }

    private static Collection<InitialData> restaurantePrefeitura(){
        List<String> occs = new ArrayList<String>();
        occs.add("11\t2\t3\t4\t3\t6\t0\t0");
        occs.add("12\t35\t40\t42\t41\t50\t0\t0");
        occs.add("13\t79\t85\t91\t87\t100\t0\t0");
        occs.add("14\t51\t59\t61\t55\t62\t0\t0");

        List<String> menus = new ArrayList<String>();
        menus.add("4\t2\t1\t2\t5\t?\t?");
        menus.add("?\t?\t?\t?\t?\t?\t?");

        return parseData(4, occs, menus);
    }

    private static Collection<InitialData> parseData(Integer restId, List<String> occs, List<String> menus){

        Map<String, InitialData> response = new HashMap<String, InitialData>();

        String[] lunchMenus = menus.get(0).split("\t");
        String[] dinnerMenus = menus.get(1).split("\t");

        for (String occ : occs) {
            String[] oc = occ.split("\t");
            Integer hour = Integer.parseInt(oc[0]);
            for (int i = 1; i < oc.length; i++) {
                String key;
                Integer menu;
                if(hour < 16){
                    key = i+"_l";
                    if(lunchMenus[i-1].equals("?")){
                        continue;
                    }
                    menu =  Integer.parseInt(lunchMenus[i-1]);
                } else {
                    key = i+"_d";
                    if(dinnerMenus[i-1].equals("?")){
                        continue;
                    }
                    menu = Integer.parseInt(dinnerMenus[i-1]);
                }
                InitialData data = response.get(key);
                if(data == null){
                    data = new InitialData();
                    response.put(key, data);
                    data.setRestauranteId(restId);
                    data.setDayOfWeek(i-1);
                    data.setMenu(menu);
                    if(data.getOccupation() == null){
                        data.setOccupation(new HashMap<Integer, Integer>());
                    }
                }
                data.getOccupation().put(hour, Integer.parseInt(oc[i]));
            }

        }
        return response.values();
    }



}
