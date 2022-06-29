package com.zss.sp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZSS
 * @date 2021/6/1 14:49
 * @desc application
 */
public class Application {

    public static void main(String[] args) {
        Map<String, Object> test = new HashMap<>();
        test.put("totalCount", 0);
        test.put("totalSize", 0L);
        viewMap(test);
        updateMap(test);
        viewMap(test);
    }

    private static void updateMap(Map<String, Object> test) {
        test.clear();
        test.put("totalCount", 2);
        test.put("totalSize", 2L);
    }

    private static void viewMap(Map<String, Object> map){
        for (Map.Entry<String, Object> entry : map.entrySet()){
            System.out.println("Key: [" + entry.getKey() + "], Value: [" + entry.getValue() + "]");
        }
    }
}
