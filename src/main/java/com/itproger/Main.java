package com.itproger;

public class Main {
    public static void main(String[] args) {
        String sentence = "Я люблю програмування на Java";
        String wordToFind = "Java";
        String wordToReplace = "Python";

        String result = sentence.replace(wordToFind, wordToReplace);

        System.out.println(result);
    }
}
