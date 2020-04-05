package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> myCll = new ArrayList<>(10);
        List<Integer> newCll = new ArrayList<>();

        int a = -10, b = 30;
        for(int i=0;i<10;i++){
            myCll.add((int) ((Math.random()*(b-a))+a));
            if(myCll.get((int) i)>5){
                newCll.add(myCll.get((int) i));
            }
        }

        for (int f:myCll){
            System.out.println("no remove " + f);
        }

        for(int i=0;i<myCll.size();i++){
            if (myCll.get(i)>20) {
                myCll.remove(i);
                i--;
            }
        }


        for (int q:myCll){
            System.out.println("remove " + q);
        }
        for (int t:newCll){
            System.out.println("new " + t);
        }

        myCll.add(1, 1);
        myCll.add(4,-4);
        myCll.add(7,-3);

        System.out.println("position 2,8,5: elements " + myCll.get(1) + " " + myCll.get(7) + " " + myCll.get(4));

        Collections.sort(myCll);

        for(int h: myCll){
            System.out.println("sort " + h);
        }
    }
}
