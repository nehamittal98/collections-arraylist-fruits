package com.stackroute.collections;

import java.util.*;
import java.util.stream.Collectors;

/*
 * This class contains methods for adding Fruits to a List and searching the fruits from the List
 */
public class FruitsListService {

    public static List<String> addFruitsToList(String fruitNames) {
        List<String> returnList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        if (!(fruitNames == null) && !(fruitNames == "")) {
            String[] fruitSplit = fruitNames.split(",");
            returnList.addAll(Arrays.asList(fruitSplit));

            for (String s : returnList) {
                if (searchFruitInListIgnoreCase(tempList, s) == -1) {
                    tempList.add(s);
                }
            }

            returnList = tempList;

        }
        return returnList;
    }

    public static int searchFruitInList(List<String> fruitList, String searchFruit) {
        int index = -1;
        if ((searchFruit == null) || (searchFruit == "") || (fruitList == null) || (fruitList.equals(""))) {
            index = -1;
        } else {
            if (fruitList.contains(searchFruit)) {
                index = fruitList.indexOf(searchFruit);
            }
        }
        return index;
    }

    public static int searchFruitInListIgnoreCase(List<String> fruitList, String searchFruit) {
        int index = -1;
        if ((searchFruit == null) || (searchFruit == "") || (fruitList == null) || (fruitList.equals(""))) {
            index = -1;
        } else {
            for (String search : fruitList) {
                if (search.equalsIgnoreCase(searchFruit)) {
                    index = fruitList.indexOf(search);
                }
            }
        }
        return index;
    }
}