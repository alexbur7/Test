package com.company;

public class Calculator {
    public int sum(int x, int y){
        return (x+y);
    }
    public int mult(int x,int y){
        return x*y;
    }
    public int r(int n){
        double w=0;
        int answer = 1;
        for(int i=1;i<=n;i++) {
            w += Math.sin(2 * i);
            answer *=i/w;
        }
        return answer;
    }
}
