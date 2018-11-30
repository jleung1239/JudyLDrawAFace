package com.company;

public class FaceDrawing {

    private String[][] faceFeatures;
    private String str;
    private int row;
    private int column;
    private String replace;
    private String face;


    FaceDrawing(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
        this.str = str;
        this.row = row;
        this.column = column;
        this.replace = replace;
        this.face = face;
    }


    void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;

    }

    void fill(String str){
        row = 0;
        while (row < faceFeatures.length){
            column = 0;
            while(column < faceFeatures[row].length){
                faceFeatures[row][column] = str;
                column++;
            }
            row++;
        }
    }


    public String toString(){
        face = "";
        row = 0;
        while (row < faceFeatures.length){
            column = 0;
            while (column < faceFeatures[row].length){
                face = face + faceFeatures[row][column];
                column++;
            }
            face = face + "\n"; //tells the string to indent or go to next line
            row++;
        }
        return face;
    }

}
