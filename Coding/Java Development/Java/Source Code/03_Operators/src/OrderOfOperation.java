public class OrderOfOperation {
    public static void main(String[] args){
        System.out.println("Order of operation: ");
        int a = 5, b = 9, c = 10, d = 17;
        System.out.println(a-b+c/d); //BODMAS or PEMDAS, precedence in case of different operator
        System.out.println(a/b/c); //Associativity in case of same operator, here left to right
        System.out.println((a/b + 50)/d-c); //Solve bracket to get one number from it and replaced by that number

        //All operators have precedence and if there are operators of same precedence then use associativity in case of that
    }
}
