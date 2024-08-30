package com.collections;

import java.util.List;

public class Lists {
    public static int indexOf(String palabra, List<String> colores){
        for (int i = 0; i < colores.size(); i++) {
            if (palabra.equals(colores.get(i))) {
                return i;
            }
        }
        return -1;
    }
    public static int indexOfByIndex(String palabra, List<String> colores, int index){
        for (int i = index; i < colores.size(); i++) {
            if (palabra.equals(colores.get(i))) {
                return i;
            }
        }
        return -1;
    }
    public static int indexOfEmpty(List<String> colores){
        for (int i = 0; i < colores.size(); i++) {
            if (colores.get(i).equals("")){
                return i;
            }
        }
        return -1;
    }
    public static int put(String palabra, List<String> colores){
        for (int i = 0; i < colores.size(); i++) {
            if (colores.get(i).equals("")){
                colores.set(i, palabra);
                return i;
            }
        }
        return -1;
    }
    public static int remove(String palabra, List<String> colores){
        int t = 0;
        for (int i = 0; i < colores.size(); i++) {
            if (colores.get(i).equals(palabra)){
                colores.set(i ,"");
                t++;
            }
            }
        return t;
    }

}
