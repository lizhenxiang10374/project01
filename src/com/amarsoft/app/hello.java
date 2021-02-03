package com.amarsoft.app;

import java.io.File;
import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hello {
    private String username;
    private String ID;
    private static final String s = "222222222222222222222222222222222222222222222222222222222222222222222" +
            "2222222222222222222222222222222222222";

    public String getUsername() {
        return username;
    }

    public String getID() {
        return ID;
    }

    public static String getS() {
        return s;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public hello(String username, String ID) {
        this.username = username;
        this.ID = ID;
    }

    public static void main(String args[]) {

        List<String> list = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "11");
        map.put("2", "12");
        map.put("3", "13");
        list.add("2");
        if (list.size() > 0) {
            String Sss = "23234";
        }
        System.out.println(map.get("2"));
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println();
    }
    public  static  void method1(){
        File file =new File("");

    }
    public  static  void method2(){
        try {
            File file =new File("");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
}
