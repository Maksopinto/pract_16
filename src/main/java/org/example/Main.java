package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Розробив Хрипко Максим");

        System.out.print("Введіть ваше прізвище, ім'я та по батькові: ");
        String fullName = scanner.nextLine();
        System.out.println("Привіт, " + fullName + "!");
        System.out.println("Почнемо тестування.\n");


        String[] questions = {
                "1. The book is on ___ table.",
                "2. I saw ___ UFO in the sky.",
                "3. She wants to be ___ doctor.",
                "4. Can I have ___ apple, please?",
                "5. ___ Earth is a beautiful planet."
        };

        String[] options = {
                "a) a   b) an   c) the   d) no article",
                "a) a   b) an   c) the   d) no article",
                "a) a   b) an   c) the   d) no article",
                "a) a   b) an   c) the   d) no article",
                "a) a   b) an   c) the   d) no article"
        };

        String[] answers = {"c", "d", "b", "a", "c"};

        int totalQuestions = questions.length;
        int correctAnswers = 0;

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);

            String userAnswer;
            do {
                System.out.print("Введіть відповідь (a, b, c, d) або 'q' для виходу: ");
                userAnswer = scanner.nextLine().toLowerCase();

                if (userAnswer.equals("q")) {
                    System.out.println("Ви вийшли з тестування.");
                    return;
                }

                if (!userAnswer.matches("[abcd]")) {
                    System.out.println("Неправильна відповідь. Введіть a, b, c або d.");
                }
            } while (!userAnswer.matches("[abcd]"));

            if (userAnswer.equals(answers[i])) {
                correctAnswers++;
            }
        }

        System.out.println("\nТестування завершено!");
        System.out.println("Ваш результат: " + (correctAnswers * 100 / totalQuestions) + "%");
        scanner.close();
    }
}
