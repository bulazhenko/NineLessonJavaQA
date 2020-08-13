package com.customertimes;

public class Main {
    public static void main(String[] args) {
        TaskOne.readFileContent("src\\com\\customertimes\\DataToCopy.txt");
        TaskOne.writeFileContent("src\\com\\customertimes\\DataToWrite.txt");
    }
}