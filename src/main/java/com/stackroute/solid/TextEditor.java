package com.stackroute.solid;

import java.util.Scanner;

class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Text text = new Text();
        UpperCaseDefinition upperCaseDefinition=new UpperCaseDefinition();
        DeleteSubStringDefinition deleteSubStringDefinition=new DeleteSubStringDefinition();
        TextPrintingDefinition textPrintingDefinition=new TextPrintingDefinition();
        System.out.println("Hello Dear!! how can i help you??");
        while (true) {
            System.out.println("1. Sir do want the text in uppercase ?\n\n" +
                    "2. Do you want to delete the substring ?\n\n" +
                    "3.Do you want to print the text ?\n\n" +
                    "Enter other key to stop\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    upperCaseDefinition.allLettersToUpperCase();
                    break;
                case 2:
                    deleteSubStringDefinition.findSubTextAndDelete("stackroute");
                    break;
                case 3:
                    textPrintingDefinition.printText();
                    break;
                default:
                    System.exit(0);
            }

        }
    }
}


