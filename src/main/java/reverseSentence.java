public class reverseSentence {

    public static void main(String[] args) {

                String input = "My name is Sachin";
                String reversedSentence = "";

                // Split the input string by spaces
                String[] words = input.split(" ");


                // Loop through each word
                for (String word : words) {
                    String reverseWord = "";
                    // Loop through the characters of each word in reverse
                    for (int i = word.length() - 1; i >= 0; i--) {
                        reverseWord = reverseWord + word.charAt(i);
                    }
                    // Append the reversed word to the result
                    reversedSentence = reversedSentence + reverseWord + " ";
                }

                System.out.println(reversedSentence.trim()); // .trim() removes the trailing space
            }
        }

