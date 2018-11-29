package com.company;

public class Runner {

    public static void main(String[] args) {

        String [][] face = new String [5][8];
        FaceDrawing face1 = new FaceDrawing(face);

        face1.fill("X");
        face1.edit(" ",0,0);

        System.out.println(face1);
        
    }
}
