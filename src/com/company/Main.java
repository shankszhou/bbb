package com.company;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("aaa");
        int a = 1;
        try {
            if(a == 1){
                throw new Two("aaa");
            }
        } catch (Two two) {
            two.printStackTrace();
        }*/

        for (int i=0;i<10;i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println("["+uuid+"]");
        }

        System.out.println("test...");

        System.out.println("dev_redis...");

        System.out.println("dev_to_test00");

        System.out.println("dev");

        System.out.println("dev02");

        System.out.println("dev03");

    }

    public void test(int a ){
        if(a == 1){
            throw new Two("aaa");
        }
    }
}

class Two extends RuntimeException {

    public Two(String code){
        super(code);
    }
}