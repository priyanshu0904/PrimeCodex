package com.DataTypes.Primitive;

public class CharacterType {
    public static void main(String[] args) {
        //16-bit or 2 Bytes
        char value = 'C'; //single character
        char unicodeValue = '\u0043';
        System.out.println("value is " + value);
        System.out.println("Unicode of the value above is \'\\u0043\' is " + unicodeValue);

        char unicode = '\u00A9'; //unicode representation of ©
        System.out.println("Unicode character is " + unicode);
    }
}
