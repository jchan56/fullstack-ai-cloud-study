package com.control;

public class ControlStatement {
    public static void main(String[] args) {

        boolean go = true;
        int i = 0;
        while(go) {
            i++;
            go = i < 10 ? true : false;
            System.out.println(i+" ");
        }

    }


}