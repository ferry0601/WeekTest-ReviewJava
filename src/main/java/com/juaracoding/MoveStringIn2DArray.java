//package com.juaracoding;
//
//public class MoveStringIn2DArray {
//    public static void main(String[] args) {
//        // Create a sample 2D String array
//        String[][] data = {
//                {"A", "B", "C", "D", "E"},
//                {"F", "G", "H", "I", "J"},
//                {"K", "L", "M", "N", "O"}
//        };
//
//        // Specify source and destination indices
//        int row = 2;
//        int sourceColumn = 1;
//        int destinationColumn1 = 3;
//        int destinationColumn2 = 2;
//
//        // Check if the indices are valid
//        int numRows = data.length;
//        int numColumns = data[0].length;
//
//        if (row < 0 || row >= numRows || sourceColumn < 0 || sourceColumn >= numColumns ||
//                destinationColumn1 < 0 || destinationColumn1 >= numColumns ||
//                destinationColumn2 < 0 || destinationColumn2 >= numColumns) {
//            System.out.println("Invalid indices.");
//            return;
//        }
//
//        // Move the values
//        String temp1 = data[row][sourceColumn];
//        String temp2 = data[row][destinationColumn1];
//
//        data[row][sourceColumn] = data[row][destinationColumn2];
//        data[row][destinationColumn1] = temp1;
//        data[row][destinationColumn2] = temp2;
//
//        // Print the updated array
//        for (String[] rowArray : data) {
//            for (String value : rowArray) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//
