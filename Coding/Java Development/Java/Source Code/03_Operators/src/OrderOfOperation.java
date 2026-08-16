public class OrderOfOperation {
    public static void main(String[] args){
        System.out.println("Order of operation: ");
        int a = 5, b = 9, c = 10, d = 17;
        System.out.println(a-b+c/d); //BODMAS or PEMDAS
        System.out.println(a/b/c); //Associativity in case of same operator, here left to right
        System.out.println((a/b + 50)/d-c); //Solved bracket to get one number from it and replaced by that number
    }
}
