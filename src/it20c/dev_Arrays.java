package it20c;

public class dev_Arrays {
      //initialize sampleMatrix array
    int[][] sampleMatrix = {
        {9, 8, 7},
        {6, 5, 4},
        {3, 2, 1}
        
    };

    
    public void printArray() {
        // For row
        for (int i = 0; i < sampleMatrix.length; i++) {
            // For column
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                // Print the value of the nested array
                System.out.print(sampleMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
