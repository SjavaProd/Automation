/*Написать метод который принимает в себя строку с несколькими словами и возвращает строку с одним словом,
которое идёт за текущим в upper case (например мы ищем строке
“Get a modern feel  with a smudge-resistant only for $2.50, you can finish now”
слово которой идёт после слова “feel” (т.е. должен вернуть “WITH” )
 */

package com.homework3;

public class Task3 {
    public static void main(String[] args) {
        /*String sentence = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";
        int prevWordIndex = sentence.indexOf("feel");
        String previousWord = sentence.substring(prevWordIndex, sentence.indexOf(' ', prevWordIndex));
        String newWord = sentence.substring(prevWordIndex+previousWord.length()+1,sentence.indexOf(' ',prevWordIndex+previousWord.length()+1));
        System.out.println(newWord.toUpperCase());*/

        String sentence = getSentence();
        String requiredWord = getRequiredWord(sentence);
        System.out.println("Required word is: " + requiredWord.toUpperCase());
    }

    public static String getSentence() {
        String input = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";
        return input;
    }

    public static String getRequiredWord(String input) {
        //previous word is "feel"
        int prevWordIndex = input.indexOf("feel");
        String prevWord = input.substring(prevWordIndex, input.indexOf(' ', prevWordIndex));
        //index of the space after previous word
        int requiredWordIndex = prevWordIndex + prevWord.length() + 1;
        String requiredWord = input.substring(requiredWordIndex, input.indexOf(' ', requiredWordIndex));
        return requiredWord;
    }

}

