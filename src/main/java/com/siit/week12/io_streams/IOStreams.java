package com.siit.week12.io_streams;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;

public class IOStreams {

    private static Path file = Paths.get("find_out_more.txt");
    private static Path file1 = Paths.get("find_out_more1.txt");

    public static void main(String[] args) {
        getListAllFiles(file);
        getFileByExtension(file, "txt");
        checkFileIfDirectoryExists(file);
        checkPathPermissions(file);
        checkIfPathIsDirectoryOrFile(file);
        comparePathsLexicographically(file, file1);
        getLastModifiedTime(file);
        getInputFromConsole();
        getFileSize(file);
        readContentFromFileToByteArray(file);
        readContentByLine(file);
        readFileLineByLine("file.txt");
        readPlainText("filePath");
        getTextIntoArray(file);
        getPlainTextFile(file, file1);
        appendTextToFile(file, "To be appended");
        getFirstThreeLinesFromFile(file);
        findLongestWordInText(file);
    }

    //methods
    //    1. Implement a method to get a list of all file/directory names from the given.
    @SneakyThrows
    public static void getListAllFiles(Path path) {
        Stream<Path> pathStream = Files.list(path.getParent());
        pathStream.forEach(System.out::println);
    }

    //2. Implement a method to get specific files by extensions from a specified folder.
    @SneakyThrows
    public static void getFileByExtension(Path path, String extension) {
        Stream<Path> list = Files.list(path.getParent())
                .filter(p -> !Files.isDirectory(p))
                .filter(p -> p.toString().endsWith(extension));{

            list.forEach(System.out::println);
        }
    }

    //3. Implement a method to check if a file or directory specified by pathname exists or not.
    public static boolean checkFileIfDirectoryExists(Path path) {
        if (Files.exists(path)) {
            System.out.println(path.toString() + " exists.");
            return true;
        } else {
            System.out.println(path.toString() + " does not exist.");
            return false;
        }
    }

    //4. Implement a method to check if a file or directory has read and write permission.
    public static void checkPathPermissions(Path path) {
        System.out.print(path.toString() + "\t\tread -> " + Files.isReadable(path) + "\t\twrite -> " +
                Files.isWritable(path) + "\n");
    }

    //5. Implement a method to check if given pathname is a directory or a file.
    public static void checkIfPathIsDirectoryOrFile(Path path) {
        Predicate<Path> isDirectory = p -> Files.isDirectory(path);
        Predicate<Path> isFile = p -> Files.isRegularFile(path);

        if (isDirectory.test(path)) {
            System.out.println(path.toString() + " is directory");
        } else if (isFile.test(path)) {
            System.out.println(path.toString() + " is file");
        }
    }

    //6. Implement a method to compare two files lexicographically.
    public static int comparePathsLexicographically(Path path1, Path path2) {
        return path1.compareTo(path2);
    }

    //7. Implement a method to get last modified time of a file.
    @SneakyThrows
    public static void getLastModifiedTime(Path path) {
        System.out.println(Files.getLastModifiedTime(path));
    }

    //8. Implement method to read input from java console.

    public static void getInputFromConsole() {
        String name = System.console().readLine();
        System.out.println("name = " + name);
    }

    //9. Implement a method to get file size in bytes, kb, mb.
    @SneakyThrows
    public static void getFileSize(Path path) {
        long b = Files.size(path) % 1024;
        long kb = Files.size(path) / 1024;
        long mb = Files.size(path) / (1024 * 1024);
        System.out.println("The size can be: " + b + " bytes.");
        System.out.println("The size can be: " + kb + " KB.");
        System.out.println("The size can be: " + mb + " MB.");
    }

    //10. Implement a method to read contents from a file into byte array.
    @SneakyThrows
    public static void readContentFromFileToByteArray(Path path) {
        byte[] byteArray = Files.readAllBytes(path);
        System.out.println(byteArray.toString());
    }

    //11. Implement a method to read a file content line by line.
    @SneakyThrows
    public static void readContentByLine(Path path) {
        List<String> list = Files.readAllLines(path);
        System.out.println("The file has the following size: " + list.size());
    }

    //12. Implement a method to read a plain text file.
    @SneakyThrows
    public static void readPlainText(String path) {
        String text = Files.readString(Paths.get(path));
        System.out.println(text);
    }

    //13. Implement a method to read a file line by line and store it into a variable.
    @SneakyThrows
    public static void readFileLineByLine(String path) {
        String newString = "";
        String str = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while ((str = bufferedReader.readLine()) != null) {
            newString = newString + bufferedReader + "\n.";
        }
        System.out.println(newString);
    }

    //14. Implement a method to store text file content line by line into an array.
    @SneakyThrows
    public static void getTextIntoArray(Path path) {
        List<String> textLines = Files.readAllLines(path);
        String[] arrayOfLines = textLines.toArray(new String[0]);
        System.out.println("The total no. of lines is: " + arrayOfLines.length);
    }

    //15. Implement a method to write and read a plain text file.
    @SneakyThrows
    public static int getPlainTextFile(Path path1, Path path2) {
        FileReader fileReader = new FileReader(path1.toFile());
        FileWriter fileWriter = new FileWriter(path2.toFile(), false);{
            int charRead;
            while ((charRead = fileReader.read()) != -1) {
                fileWriter.write(charRead);
            }
            return 1;
        }
    }

    //16. Implement a method to append text to an existing file.
    @SneakyThrows
    public static void appendTextToFile(Path path, String textToAppend) {
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path, APPEND);
        bufferedWriter.write(textToAppend);
        System.out.println("The resulting text is: " + bufferedWriter);
    }

    //17. Implement a method to read first 3 lines from a file.
    @SneakyThrows
    public static void getFirstThreeLinesFromFile(Path path) {
        String line;
        ArrayList<String> text = new ArrayList<>();
        BufferedReader bufferedReader = Files.newBufferedReader(path);
        for (int i = 0; i < 3; i++) {
            line = bufferedReader.readLine().trim();
            text.add(line);
        }
        System.out.println(text.size() + " lines read from the text");
    }

    //18. Implement a method to find the longest word in a text file.
    @SneakyThrows
    public static String findLongestWordInText(Path path) {
        String currentWord;
        String longestWord = "";
        int maxLength = 0;
        Scanner sc = new Scanner(path);
        while (sc.hasNext()) {
            currentWord = sc.next().replaceAll("[^A-Za-z]+", "");
            if (currentWord.length() > maxLength) {
                maxLength = currentWord.length();
                longestWord = currentWord;
            }
        }
        return longestWord;
    }
}

