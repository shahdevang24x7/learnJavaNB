/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.java.nb;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Devang
 */
public class MapDemo1 {

    public static void main(String[] args) {
        Map<String, Double> map = new LinkedHashMap();
        map.put("india", 1000d);
        map.put("lanka", 2000d);
        map.put("china", 3500d);
        map.put("korea", 1500d);
        map.put("japan", 50.25);
        /**
         * It shows same result as entered by user
         */
        System.out.println("LHShMap: " + map);

        /**
         * It sorts all the keys and display the keypair set
         */
        map = new TreeMap(map);
        System.out.println("TreeMap: " + map);

        /**
         * It reassemble the map and arrange all keypair according to hash
         */
        map = new HashMap(map);
        System.out.println("HashMap: " + map);
    }

}
