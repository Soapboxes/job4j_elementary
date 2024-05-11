package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (post.length > word.length) {
            return false;
        }
        if (word == null || post == null || word.length == 0 || post.length == 0) {
            return false;
        }
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}