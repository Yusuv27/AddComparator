package org.springframework;

public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        boolean vasyaMiddle = true;
        boolean katyaMiddle= true;

        if(vasyaAge > katyaAge && vasyaAge > mishaAge) {
            vasyaMiddle = false;
            max = vasyaAge;
        } else if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            katyaMiddle = false;
            max = katyaAge;
        } else {
            max = mishaAge;
        }

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) {
            vasyaMiddle = false;
            min = vasyaAge;
        } else if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            katyaMiddle = false;
            min = katyaAge;
        } else {
            min = mishaAge;
        }

        if(vasyaMiddle){
            middle = vasyaAge;
        } else if (katyaMiddle) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }


        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}