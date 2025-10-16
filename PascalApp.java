public class PascalApp {
    public static void main(String[] args){
        //Create a two dimensional int array with 10 rows and 11 cols.
        int[][] pascalTriangle = new int[10][11];
        //Set the second place in the first row equal to 1.
        //I was able to figure all this out by drawing a simple figure (see screenshot in this week's word document)
        pascalTriangle[0][1] = 1;

        //Formatting.
        System.out.println("\n");

        //Print out the first line of the triangle.
        for(int k=1; k<11; k++){
            System.out.print(pascalTriangle[0][k] + " ");
        }

        //Formatting.
        System.out.println();

        //Use the first loop to iterate through the rows in the triangle.
        for(int i=1; i<10; i++){
            //This second loop iterates through each value in each row.
            for(int j=1; j<11; j++){
                //Calculate the current value using the last values.
                //Again, drawing a figure really helped figure this out.
                pascalTriangle[i][j] = pascalTriangle[i-1][j] + pascalTriangle[i-1][j-1];

                //Print out the rest of the rows of the triangle.
                System.out.print(pascalTriangle[i][j]+" ");
            }
            //Add a new line after each row.
            //If we don't do this, all the values are printed as one long string.
            System.out.println();
        }
        //Formatting Space.
        System.out.println("\n");

        //Tell the user the the program is ending.
        System.out.println("The program is ending...");

        //More formatting.
        System.out.println("\n");
    }
}