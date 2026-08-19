import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        //For 2D arrays consider or imagine it like a table of rows and columns.
        //Array of arrays.
        //Memory location linear but logic 2D

        //int[][] arr = {}; // Considered that it has 0 rows.
        //int[][] arr = {{}}; //Considered that it has 1 row and 0 column.
        //int[][] arr = {{}, {}}; //Considered that it has 2 row and 0 column.
        //System.out.println(arr.length);
        //System.out.println(arr[0].length);

        //Outer {} is for rows and inner is for columns
        int[][] arr = {{1,2,3}, {2,5}}; //In this type of declaration, number of columns can be different for each row -> Heterogeneous array, not recommended
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        int p = 0;
        while(p < arr.length){
            int j = 0;
            while(j < arr[0].length){
                System.out.println(arr[p][j]);
                j++;
            }
            System.out.println();
            p++;
        }

        //First [] is for rows and second is for column
        int[][] myArr = new int[2][4]; //In this type of declaration, number of columns of all rows must be same -> Homogeneous array
        myArr[1][2] = 29; //Initialization

        //2D Array Traversal
        //can be span in multiple lines
        int[][] yourArr = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        int i = 0;
        while(i < yourArr.length){
            int j = 0;
            while(j < yourArr[i].length){
                System.out.print(yourArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        //Can also take input from user

        int[][] hisArr = new int[2][3];
        //Taking Input
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(x < hisArr.length){
            int j = 0;
            while(j < hisArr[x].length){
                hisArr[x][j] = sc.nextInt();
                j++;
            }
            x++;
        }

        //Showing output
        int y = 0;
        while(y < hisArr.length){
            int j = 0;
            while(j < hisArr[y].length){
                System.out.print(hisArr[y][j] + " ");
                j++;
            }
            System.out.println();
            y++;
        }
    }
}
