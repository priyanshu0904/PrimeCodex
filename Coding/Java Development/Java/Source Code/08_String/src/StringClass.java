public class StringClass {
    public static void main(String[] args) {
        //String is special type of object, it is also considered as character array
        //string object's value can't change, modification creates new string object -> immutable
        //Java maintains a pool of strings for efficiency, when a new object created, it is checked against the pool for a match to reuse
        //comparison -> .equals() for value and == for reference only
        //not uses in thread environment
        //Slowest speed than StringBuffer and StringBuilder

        String str1 = "abc"; //str1 and str2 refers to same object, in string pool, inside special portion in heap memory, immutable
        String str2 = "abc"; //from this mehtod, stored in string pool
        String str3 = new String("abc"); //str3 is not in string pool, is in heap memory
        String strNew = new String("abc"); //heap, not same reference as str3
        //from new method, stored in heap memory like other objects

        System.out.println(str1 == str2); //true, because the reference is same, doesn't compare actual value
        System.out.println(str1 == str3); //false, because the reference is different, doesn't compare actual value
        //if you want to compare any object value, since they are not primitive, use .equal() method
        //every object have .equal() method by-default
        System.out.println(str1.equals(str3)); //true
        System.out.println(str3.equals(str1)); //true

        System.out.println(str3 == strNew); //false

        String str4 = new String("ABC");
        System.out.println(str2.equals(str4)); //false, since it compares exactly, case-sensitive
        System.out.println(str1.equalsIgnoreCase(str4)); //true, compares case-insensitive
        str1 = str1 + "1";
        //since string is immutable, then when if i want to change the value, then actual value doesn't change, it creates new string with that new value and store in new reference in string pool
        System.out.println(str1); //string changed
        System.out.println(str1 == str2); //false, because refernece changed

        String newString = "currentFuelInLiters";
        System.out.println(newString.length()); //gives length of string, here it is method, in array this was property
        System.out.println(newString.substring(5,8)); //generates substring from given indexes, last index is exclusive
        System.out.println(newString.equals(newString)); //compares value
        System.out.println(newString.compareTo("HelloBaccho")); //compares in dictionary order
        System.out.println(newString.indexOf("Fuel")); //finds index of input if exists in string and returns first index where found
        System.out.println(newString.indexOf("Hey")); //if not found return -1

        System.out.println(newString + " is " + str1 + " and");
        //string is concatenated using + operator, if one string comes in this then it consider all the things as a string only whether it is a number or anything
        //each concatenation creates new string in string pool, it is immutable, so concatenating more strings will use more memory when frequently modified
    }
}
