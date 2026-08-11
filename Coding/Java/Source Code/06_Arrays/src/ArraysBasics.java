public class ArraysBasics {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 98;
        myArr[1] = 88;
        myArr[3] = 78;
        myArr[4] = 97;
        myArr[2] = 55;

        int[] yourArr = {44, 87, 98, 25, 66}; //Automatically gets the length of array.
        int index = 2;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);
//        System.out.println(myArr[5]); -> ArrayIndexOutOfBoundsException

        System.out.println(yourArr[0]);
        System.out.println(yourArr[1]);
        System.out.println(yourArr[index]);
        System.out.println(yourArr[3]);
        System.out.println(yourArr[4]);
//        System.out.println(yourArr[-1]); -> ArrayIndexOutOfBoundsException


        //Array Traversal
        int[] hisArr = {55, 66, 88, 77, 99};
        int i = 0;
        while(i < hisArr.length){ //Property of arrays
            System.out.println(hisArr[i]);
            i++;
        }

        //You can declare any type of array

        //String Array
        String[] strArr = new String[4];
        strArr[0] = "Hi";
        strArr[1] = "Priyanshu";
        strArr[2] = "Raj";
        //strArr[3] exists whether you use or not
        System.out.println(strArr.length);

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length); //Gives length of array
    }
}
