package programs;

public class CountVowels { 
    public static void main(String[] args) {

        String str = "Vyshnavi";
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {  // only letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("String: " + str);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
