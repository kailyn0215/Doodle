import doodlepad.*;
import java.util.*;

public class Hangman {
  
  public static void main(String[] args) {
    Pad pad = new Pad("Hangman", 630, 630);
    Image background = new Image("sky.jpg", 0, 0, 630, 630);

    Image rope = new Image("rope.png", 195, 75, 100, 125);
    
    Image post1 = new Image("wood.jpg", 100, 50, 250, 50);
    Image post2 = new Image("wood2.jpg", 100, 100, 50, 340);
    Image post3 = new Image("wood.jpg", 50, 440, 350, 50);

    Image guesses = new Image("scroll.png", 375, 45, 250, 250);

    Image armL = new Image("armL.png", 139, 190, 75, 100);
    Image armR = new Image("armR.png", 280, 190, 75, 100);
    Image legL = new Image("legL.png", 180, 340, 72, 100);
    Image legR = new Image("legR.png", 252, 340, 72, 100);
    Image torso = new Image("dadjoke.png", 182, 190, 125, 165);
    Image head = new Image("man head.png", 222, 125, 50, 80);

    

    System.out.print("Please enter the word / sentence for the other player to guess: ");
    boolean fin = false;
    Scanner word = new Scanner(System.in);
    String wordToGuess;
    String userList = "";
    String usedLetters = "";
    wordToGuess = word.nextLine();
    wordToGuess = wordToGuess.toLowerCase();
    int wL = wordToGuess.length();
    int cL = 0;
    for(int i = 0; i < wL; i++) {
      if(wordToGuess.substring(i, i + 1).equals(" ")) {
        userList += " ";
      }
      else {
        userList += "-";
      }
    }

    System.out.print("\033[H\033[2J"); // clear terminal
    
    System.out.println(userList);
    
    int mistakes = 0;
    
    while(mistakes < 6 || cL >= wL) {
      System.out.print("Please enter a letter: ");
      Scanner letter = new Scanner(System.in);
      String guess = letter.nextLine();
      guess = guess.toLowerCase();
      while(guess.length() > 1) {
        System.out.print("Please enter only one letter: ");
        guess = letter.nextLine();
      }
      boolean correct = false;
      for(int i = 0; i < wL; i++) {
        if(guess.equals(wordToGuess.substring(i, i+1))) {
          correct = true;
          cL++;
          userList = userList.substring(0, i) + guess + userList.substring(i+1);
          if(cL == wL) {
            System.out.println("You win!\n The word was " + wordToGuess);
            fin = true;
            break;
          }
        }
      }
      if(correct = false) {
        mistakes++;
        usedLetters += guess;
      }
      if(!fin) {
        System.out.println(userList);
        System.out.println("Used Letters: " + usedLetters);
        System.out.println("Mistakes: " + mistakes);
      }
      
    }

    Image slot1 = new Image("stone.jpg", 20, 540, 50, 5);
    if(wL < 1 || wordToGuess.substring(0, 1).equals(" ")) {
      slot1 = new Image("blank.png", 20, 540, 50, 5);
    }
    Image slot2 = new Image("stone.jpg", 80, 540, 50, 5);
    if(wL < 2 || wordToGuess.substring(1,2).equals(" ")) {
      slot2 = new Image("blank.png", 80, 540, 50, 5);
    }
    Image slot3 = new Image("stone.jpg", 140, 540, 50, 5);
    if(wL < 3 || wordToGuess.substring(2,3).equals(" ")) {
      slot3 = new Image("blank.png", 140, 540, 50, 5);
    }
    Image slot4 = new Image("stone.jpg", 200, 540, 50, 5);
    if(wL < 4 || wordToGuess.substring(3,4).equals(" ")) {
      slot4 = new Image("blank.png", 200, 540, 50, 5);
    }
    Image slot5 = new Image("stone.jpg", 260, 540, 50, 5);
    if(wL < 5 || wordToGuess.substring(4,5).equals(" ")) {
      slot5 = new Image("blank.png", 260, 540, 50, 5);
    }
    Image slot6 = new Image("stone.jpg", 320, 540, 50, 5);
    if(wL < 6 || wordToGuess.substring(5,6).equals(" ")) {
      slot6 = new Image("blank.png", 320, 540, 50, 5);
    }
    Image slot7 = new Image("stone.jpg", 380, 540, 50, 5);
    if(wL < 7 || wordToGuess.substring(6,7).equals(" ")) {
      slot7 = new Image("blank.png", 380, 540, 50, 5);
    }
    Image slot8 = new Image("stone.jpg", 440, 540, 50, 5);
    if(wL < 8 || wordToGuess.substring(7,8).equals(" ")) {
      slot8 = new Image("blank.png", 440, 540, 50, 5);
    }
    Image slot9 = new Image("stone.jpg", 500, 540, 50, 5);
    if(wL < 9 || wordToGuess.substring(8,9).equals(" ")) {
      slot9 = new Image("blank.png", 500, 540, 50, 5);
    }
    Image slot10 = new Image("stone.jpg", 560, 540, 50, 5);
    if(wL < 10 || wordToGuess.substring(9,10).equals(" ")) {
      slot10 = new Image("blank.png", 560, 540, 50, 5);
    }
    Image slot11 = new Image("stone.jpg", 20, 590, 50, 5);
    if(wL < 11 || wordToGuess.substring(10,11).equals(" ")) {
      slot11 = new Image("blank.png", 20, 590, 50, 5);
    }
    Image slot12 = new Image("stone.jpg", 80, 590, 50, 5);
    if(wL < 12 || wordToGuess.substring(11,12).equals(" ")) {
      slot12 = new Image("blank.png", 80, 590, 50, 5);
    }
    Image slot13 = new Image("stone.jpg", 140, 590, 50, 5);
    if(wL < 13 || wordToGuess.substring(12,13).equals(" ")) {
      slot13 = new Image("blank.png", 140, 590, 50, 5);
    }
    Image slot14 = new Image("stone.jpg", 200, 590, 50, 5);
    if(wL < 14 || wordToGuess.substring(13,14).equals(" ")) {
      slot14 = new Image("blank.png", 200, 590, 50, 5);
    }
    Image slot15 = new Image("stone.jpg", 260, 590, 50, 5);
    if(wL < 15 || wordToGuess.substring(14,15).equals(" ")) {
      slot15 = new Image("blank.png", 260, 590, 50, 5);
    }
    Image slot16 = new Image("stone.jpg", 320, 590, 50, 5);
    if(wL < 16 || wordToGuess.substring(15,16).equals(" ")) {
      slot16 = new Image("blank.png", 320, 590, 50, 5);
    }
    Image slot17 = new Image("stone.jpg", 380, 590, 50, 5);
    if(wL < 17 || wordToGuess.substring(16,17).equals(" ")) {
      slot17 = new Image("blank.png", 380, 590, 50, 5);
    }
    Image slot18 = new Image("stone.jpg", 440, 590, 50, 5);
    if(wL < 18 || wordToGuess.substring(17,18).equals(" ")) {
      slot18 = new Image("blank.png", 440, 590, 50, 5);
    }
    Image slot19 = new Image("stone.jpg", 500, 590, 50, 5);
    if(wL < 19 || wordToGuess.substring(18,19).equals(" ")) {
      slot19 = new Image("blank.png", 500, 590, 50, 5);
    }
    Image slot20 = new Image("stone.jpg", 560, 590, 50, 5);
    if(wL < 20 || wordToGuess.substring(19,20).equals(" ")) {
      slot20 = new Image("blank.png", 560, 590, 50, 5);
    }
    
    
    
    System.out.println("The word / sentence is " + wordToGuess.length() + " characters long.");
    String[] wordToGuessArray = new String[wordToGuess.length()];
    for (int i = 0; i < wordToGuess.length(); i++) {
      wordToGuessArray[i] = wordToGuess.substring(i, i + 1);
    }
    String[] guessedLetters = new String[wordToGuess.length()];
    for (int i = 0; i < wordToGuess.length(); i++) {
      guessedLetters[i] = "_";
    }
    int guessesLeft = 6;
    
  }

  //public void onPressed(Shape shp, double, x, double y, int button) {
    
  //}

  // cd src
  // cd main
  // cd java
  // javac -cp doodlepad.jar Hangman.java
  // java -cp .:doodlepad.jar Hangman
  // color palette: https://www.color-hex.com/color-palette/71279
}

/*Rectangle slot1 = new Rectangle(20, 515, 50, 5);
slot1.setFillColor(102,123,104);
slot1.setStrokeColor(102,123,104);
Rectangle slot2 = new Rectangle(80, 515, 50, 5);
slot2.setFillColor(102,123,104);
slot2.setStrokeColor(102,123,104);
Rectangle slot3 = new Rectangle(140, 515, 50, 5);
slot3.setFillColor(102,123,104);
slot3.setStrokeColor(102,123,104);
Rectangle slot4 = new Rectangle(200, 515, 50, 5);
slot4.setFillColor(102,123,104);
slot4.setStrokeColor(102,123,104);
Rectangle slot5 = new Rectangle(260, 515, 50, 5);
slot5.setFillColor(102,123,104);
slot5.setStrokeColor(102,123,104);
Rectangle slot6 = new Rectangle(320, 515, 50, 5);
slot6.setFillColor(102,123,104);
slot6.setStrokeColor(102,123,104);
Rectangle slot7 = new Rectangle(380, 515, 50, 5);
slot7.setFillColor(102,123,104);
slot7.setStrokeColor(102,123,104);
Rectangle slot8 = new Rectangle(440, 515, 50, 5);
slot8.setFillColor(102,123,104);
slot8.setStrokeColor(102,123,104);
Rectangle slot9 = new Rectangle(500, 515, 50, 5);
slot9.setFillColor(102,123,104);
slot9.setStrokeColor(102,123,104);
Rectangle slot10 = new Rectangle(560, 515, 50, 5);
slot10.setFillColor(102,123,104);
slot10.setStrokeColor(102,123,104);
Rectangle slot11 = new Rectangle(20, 565, 50, 5);
slot11.setFillColor(102,123,104);
slot11.setStrokeColor(102,123,104);
Rectangle slot12 = new Rectangle(80, 565, 50, 5);
slot12.setFillColor(102,123,104);
slot12.setStrokeColor(102,123,104);
Rectangle slot13 = new Rectangle(140, 565, 50, 5);
slot13.setFillColor(102,123,104);
slot13.setStrokeColor(102,123,104);
Rectangle slot14 = new Rectangle(200, 565, 50, 5);
slot14.setFillColor(102,123,104);
slot14.setStrokeColor(102,123,104);
Rectangle slot15 = new Rectangle(260, 565, 50, 5);
slot15.setFillColor(102,123,104);
slot15.setStrokeColor(102,123,104);
Rectangle slot16 = new Rectangle(320, 565, 50, 5);
slot16.setFillColor(102,123,104);
slot16.setStrokeColor(102,123,104);
Rectangle slot17 = new Rectangle(380, 565, 50, 5);
slot17.setFillColor(102,123,104);
slot17.setStrokeColor(102,123,104);
Rectangle slot18 = new Rectangle(440, 565, 50, 5);
slot18.setFillColor(102,123,104);
slot18.setStrokeColor(102,123,104);
Rectangle slot19 = new Rectangle(500, 565, 50, 5);
slot19.setFillColor(102,123,104);
slot19.setStrokeColor(102,123,104);
Rectangle slot20 = new Rectangle(560, 565, 50, 5);
slot20.setFillColor(102,123,104);
slot20.setStrokeColor(102,123,104); */

/*Rectangle post1 = new Rectangle(100, 50, 250, 50);
post1.setFillColor(163,184,153);
post1.setStrokeColor(163,184,153);
Rectangle post2 = new Rectangle(100, 100, 50, 300);
post2.setFillColor(163,184,153);
post2.setStrokeColor(163,184,153);
Rectangle post3 = new Rectangle(50, 400, 350, 50);
post3.setFillColor(163,184,153);
post3.setStrokeColor(163,184,153);*/
