import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question
{
private String question;
ArrayList<String> choices;
int correctChoice;

public Question(String question, ArrayList<String> choices, int correctChoice)
{
this.question = question;
this.choices = choices;
this.correctChoice = correctChoice;
}

public String getQuestion()
{
StringBuilder questionString = new StringBuilder(question + "\n");
for (int i = 0; i < choices.size(); i++)
{
questionString.append((char) ('A' + i)).append(". ").append(choices.get(i)).append("\n");
}
return questionString.toString();
}

public boolean isCorrect(int userChoiceIndex)
{
return correctChoice == userChoiceIndex;
}
}

class Quiz
{
private ArrayList<Question> questions;
private int score;

public Quiz()
{
this.questions = new ArrayList<>();
this.score = 0;
}

public void addQuestion(Question question)
{
questions.add(question);
}

public void startQuiz()
{
Scanner scanner = new Scanner(System.in);
System.out.println("Hello user Welcome to quiz\n");
System.out.println("*************************************************************************");

for (Question question : questions)
{
System.out.println(question.getQuestion());
System.out.println("*************************************************************************");

System.out.print("Your choice (A, B, C, D...): ");
char userChoice = scanner.nextLine().toUpperCase().charAt(0);


int userChoiceIndex = userChoice - 'A';
if (userChoiceIndex >= 0 && userChoiceIndex < question.choices.size())
{
if (question.isCorrect(userChoiceIndex))
{
System.out.println("Correct!\n");
score++;
} else
{
System.out.println("Incorrect. The correct answer is: " +
(char) ('A' + question.correctChoice) + ". " + question.choices.get(question.correctChoice) + "\n");
}
} else
{
System.out.println("Invalid choice. Skipping this question.\n");
}
}

System.out.println("Well done Your Quiz is completed. Your score: " + score + "/" + questions.size());
}
}

public class QuizAppln
{
public static void main(String[] args)
{
        // quiz questions and answers here..
ArrayList<String> choices1 = new ArrayList<>(List.of("Java Virtual Machine" , "Java Virtual Method", "Java visual Machine ", "Java Variable Machine"));
Question question1 = new Question("1)What does JVM stand for?", choices1, 0);


ArrayList<String> choices2 = new ArrayList<>(L`ist.of("cont", "static", "final", "constant"));
Question question2 = new Question("2)Which keyword is used to declare a constant in Java?", choices2, 2);

ArrayList<String> choices3 = new ArrayList<>(List.of("2.5","2.0","2","2.2"));
Question question3 = new Question("3)What is the output of the following code snippet?\n int x = 5;\n" + "int y = 2;\n" + "System.out.println(x / y);",choices3, 2);

ArrayList<String> choices4 = new ArrayList<>(List.of("ArrayList", "LinkedList","HashMap" ,"Vector"));
Question question4 = new Question("4)Which of the following collections is synchronized by default in Java?", choices4, 3);

ArrayList<String> choices5 = new ArrayList<>(List.of("ArrayListTerminate the program", "Exit the loop or switch statement","Skip the current iteration in a loop"," Jump to a specific label in the code"));
Question question5 = new Question("5)What is the purpose of the 'break' statement in Java?", choices5, 1);

ArrayList<String> choices6 = new ArrayList<>(List.of("start()", "execute()","run()" ,"begin()"));
Question question6 = new Question("6)Which method is used to start the execution of a thread in Java?", choices6, 0);

ArrayList<String> choices7 = new ArrayList<>(List.of("private", "protected","public" ,"default"));
Question question7 = new Question("7)In Java, which access modifier is used for a class so that it can be accessed from any other class?", choices7, 2);


ArrayList<String> choices8 = new ArrayList<>(List.of("my_variable", "_myVariable","123variable" ,"$variable"));
Question question8 = new Question("8)Which of the following is not a valid identifier in Java?", choices8, 2);

ArrayList<String> choices9 = new ArrayList<>(List.of("Check if an object is an instance of a specific class","Compare two objects for equality"," Check if an object is null","Determine the type of a primitive variable"));
Question question9 = new Question("9)What is the purpose of the instanceof operator in Java?", choices9, 0);

ArrayList<String> choices10= new ArrayList<>(List.of("NullPointerException", "ArrayIndexOutOfBoundsException","IOException" ,"ArithmeticException"));
Question question10 = new Question("10)Which of the following exceptions is a checked exception in Java?", choices10, 2);
        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);
        quiz.addQuestion(question4);
        quiz.addQuestion(question5);
        quiz.addQuestion(question6);
        quiz.addQuestion(question7);
        quiz.addQuestion(question8);
        quiz.addQuestion(question9);
        quiz.addQuestion(question10);


        quiz.startQuiz();
}
}
