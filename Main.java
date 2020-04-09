package com.boca.logistica;

import java.util.*;
public class Main {
    static final int N = 256;
    static String MaxOccuringChar(String str1) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] strch= str1.toCharArray();
        for (int i = 0; i < str1.length(); i++){

            if(map.containsKey(strch[i])) {
                map.put(strch[i],map.get(strch[i])+1);
            }else {
                map.put(strch[i],1);
            }
        }

        int maxValue=-1;
        String key = "";
        for (Map.Entry<Character, Integer> item : map.entrySet()){

            if(item.getValue()>maxValue){
                maxValue=item.getValue();
                key=String.valueOf(item.getKey());
            }
        }

        return key;
    }
    public static void main(String[] args) {
        String str1 = "17498357853865379359889999999999999999999999999999953985898588588588585555555555555533553535";
        System.out.println( MaxOccuringChar(str1));
    }
}
