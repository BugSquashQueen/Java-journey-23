

class Main {

    public static void main(String[] args) {

int result = countVowels("hellooi");
System.out.println(result);

    }

    static int countVowels(String word) {

        int count = 0;
        for(int i = 0; i < word.length(); i++) {


            char c = word.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u') {

                System.out.print(c + " ");
                count++;

        }

        }

        return count;
    }
}