package com.region.pack;

import java.util.ArrayList;

class Numbers implements UserInterface {

    int sum (int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += i;
        return sum;
    }

    void setArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++)
            arrayList.add(i);
        arrayList.forEach(n -> {if (n % 2 == 0) System.out.println(n); });
    }

    public void run() {
        System.out.println("run() -> Numbers implements UserInterface");
    }

    public String getUserId() {
        return (String) "getUserId() -> Numbers implements UserInterface";
    }
}
