
package it20c;

public class It20c {
  
    public static void main(String[] args) {
        //This one is intended for row limit
       int row = 5;
       //This For Loop is for the row
       for(int i = 0; i<row; i++){
            //This For Loop is for the column
           for(int j = 0; j<row-i-1;j++){
               System.out.print(" ");
           }
           for(int j=0;j<i;j++) {
           System.out.print(" *");
           }
            //This Println is to next line
           System.out.println(" ");
       }
       
    }
    
}
