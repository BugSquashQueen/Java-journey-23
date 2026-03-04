
public class hello {

    public static void main(String[] args) {

int output = countUpperCase("HELLO");
System.out.println(output);
        //edge cases
countUpperCase("HELLO");
countUpperCase("");
countUpperCase("hello");
countUpperCase("Hello1234");
countUpperCase("ABCDefG");
    }
    static int countUpperCase(String word) {

if (word == null) return  0; //prevents NullPointerException
        int count = 0;
        for (int i = 0; i < word.length()  ; i++) {

            char c = word.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        return count;
    }
}

//Write a program that counts how many uppercase letters exist in a word.