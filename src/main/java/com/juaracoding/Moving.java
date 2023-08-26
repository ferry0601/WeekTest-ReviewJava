//package com.juaracoding;
//
//public class Moving {
//
//        public static void main(String[] args) {
//            // Create a sample one-dimensional String array
//            String[] data = {"K", "L", "M", "N", "O", "P"};
//
//            // Specify the source and destination indices
//            int[] sourceIndices = {3, 4, 5};
//            int[] destinationIndices = {1, 2, 3};
//
//            // Check if the indices are valid
//            int length = data.length;
//
//            for (int sourceIndex : sourceIndices) {
//                if (sourceIndex < 0 || sourceIndex >= length) {
//                    System.out.println("Invalid source index.");
//                    return;
//                }
//            }
//
//            for (int destinationIndex : destinationIndices) {
//                if (destinationIndex < 0 || destinationIndex >= length) {
//                    System.out.println("Invalid destination index.");
//                    return;
//                }
//            }
//
//            // Create a temporary array to hold the moved elements
//            String[] temp = new String[sourceIndices.length];
//
//            // Copy the elements to be moved into the temporary array
//            for (int i = 0; i < sourceIndices.length; i++) {
//                temp[i] = data[sourceIndices[i]];
//            }
//
//            // Shift the elements in the destination area to the right
//            for (int i = sourceIndices.length - 1; i >= 0; i--) {
//                for (int j = sourceIndices[i]; j > destinationIndices[i]; j--) {
//                    data[j] = data[j - 1];
//                }
//            }
//
//            // Place the elements from the temporary array into their new positions
//            for (int i = 0; i < destinationIndices.length; i++) {
//                data[destinationIndices[i]] = temp[i];
//            }
//
//            // Print the updated array
//            for (String value : data) {
//                System.out.print(value + " ");
//            }
//        }
//
//
//}
//
