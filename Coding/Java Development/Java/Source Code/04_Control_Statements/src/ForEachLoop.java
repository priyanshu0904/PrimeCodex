public class ForEachLoop {
    public static void main(String[] args) {
        System.out.println("Demo of for each loop");
        String[] array = new String[]{
            "Priyanshu", "Raj", "Priya", "Aarya", "Alok", "Nitish"
        };
        //printArray(array);
        printArrayForEach(array);
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void printArrayForEach(String[] array){
        //traversal without any tension of updation, variable maintenance etc
        //method for array iteration, readability

        for (String name : array){ //parameter first for item, optional second for index
            System.out.println(name);
            //using return, similar to continue in traditional loops
            //using break is not straightforward
            //perform action on each element and don't need to break early -> for each loop
        }
    }
}
