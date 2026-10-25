public class FinalConstructor {
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    public FinalConstructor(int noOfWheels, String model, String engineInLiters) {
        this.noOfWheels = noOfWheels;
        this.model = model;
        this.engineInLiters = engineInLiters;
        //this.noOfWheels++; error
    }

    //immuatble class, nothing can be changed

    public static void main(String[] args) {
        FinalConstructor fc = new FinalConstructor(4, "BMW", "10x");
        System.out.println(fc.noOfWheels);
        System.out.println(fc.model);
        System.out.println(fc.engineInLiters);
        //fc.noOfWheels++; error
    }
}
