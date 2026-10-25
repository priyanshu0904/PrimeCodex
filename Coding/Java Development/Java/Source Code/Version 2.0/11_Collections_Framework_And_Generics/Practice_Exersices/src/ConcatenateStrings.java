public class ConcatenateStrings {
    static void main(String[] args) {
        System.out.println(concatenate("Priyanshu"));
        System.out.println(concatenate("Priyanshu", "Raj"));
        System.out.println(concatenate("Prime", "Codex", "Is", "Best"));
    }

    public static String concatenate(String... str){
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            sb.append(string).append(" ");
        }
        return sb.toString();
    }
}
