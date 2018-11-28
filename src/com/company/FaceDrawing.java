package com.company;

public class FaceDrawing {

    private String[][] faceFeatures;
    private String str;
    private int row;
    private int column;


    FaceDrawing(String[][] faceFeatures){
        faceFeatures = new String[][]{ };
        this.str = str;
        this.row = row;
        this.column = column;
    }

    void edit(String replace, int row, int column){

    }

    void fill(String str){

    }

    String toString(){
        while (row <= faceFeatures.length){
            while (column <= faceFeatures[row].length){
                System.out.print(faceFeatures[row][column]);
                column++;
            }
            row++;
            System.out.println();
        }
    }

}
