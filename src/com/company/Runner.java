package com.company;

public class Runner {

    public static void main(String[] args) {

        String [][] face = new String [5][10];
        FaceDrawing face1 = new FaceDrawing(face);

        face1.fill(" ");
        face1.edit(".",0,4);
        face1.edit("-", 0,5);
        face1.edit(".", 0,6);

        face1.edit("/", 1,3);
        face1.edit("'", 1,4);
        face1.edit("v", 1,5);
        face1.edit("'", 1,6);
        face1.edit("\\", 1,7);

        face1.edit("(", 2,2);
        face1.edit("/", 2,3);
        face1.edit("\\", 2,7);
        face1.edit(")", 2,8);

        face1.edit("=", 3,0);
        face1.edit("=", 3,1);
        face1.edit("=", 3,2);
        face1.edit("\"", 3,3);
        face1.edit("=", 3,4);
        face1.edit("=", 3,5);
        face1.edit("=", 3,6);
        face1.edit("\"", 3,7);
        face1.edit("=", 3,8);
        face1.edit("<", 3,9);

        face1.edit("|", 4,4);
        face1.edit("_", 4,5);
        face1.edit("|", 4,6);



        System.out.println(face1);

    }
}
