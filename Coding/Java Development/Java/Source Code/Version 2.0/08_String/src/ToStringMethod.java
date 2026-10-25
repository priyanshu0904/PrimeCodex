public class ToStringMethod {
    //string representation of an object and inherited from Object class
    //by-default returns Class_name@Hashcode
    //commonly overridden in custom classes for meaningful output
    //automatically called in string concatenation


    //consider this as a Car Class
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    //to generate this, directly use IDE, Generate and Constructor after right-click
    public ToStringMethod(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "My Car name is " + name;
//    }


    //generate and toString() after right-click
//    @Override
//    public String toString() {
//        return "ToStringMethod{" +
//                "noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", maxSpeed=" + maxSpeed +
//                ", name='" + name + '\'' +
//                ", modelNumber='" + modelNumber + '\'' +
//                ", company='" + company + '\'' +
//                '}';
//        //Gives description of my object
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToStringMethod{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }
    //using StringBuilder method for saving memory



    public static void main(String[] args) {
        ToStringMethod swift = new ToStringMethod(4, 4, 120, "Swift", "X234", "Maruti");
        System.out.println(swift.toString()); //this method is for every class by-default if not explicitly defined and returns Class_name@Hash_Code
        //otherwise whatever you want to return

        System.out.println(swift);
        //if you don't write toString() and directly use object name, then it will also return same thing
    }
}
