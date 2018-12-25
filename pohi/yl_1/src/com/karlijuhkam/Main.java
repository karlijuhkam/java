package com.karlijuhkam;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        for(int row = 0; row < size; row++){
            for(int col=0; col< size; col++){
                System.out.format("%2d", size - 1 - Math.max(row, col));
            }
            System.out.println();
        }
    }
}
