public class ReverseString {
    public static void main(String[] args) {

        String originalStr = "I am a Student of Muet";
        String reversedStr = "";
        System.out.println("Original String: " + originalStr);

        for(int i=0; i<originalStr.length(); i++){
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed String: "+ reversedStr);

    }
}
