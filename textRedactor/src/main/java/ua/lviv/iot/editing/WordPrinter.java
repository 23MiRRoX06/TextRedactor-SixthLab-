package ua.lviv.iot.editing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordPrinter {
  private static Pattern pattern;
  private static Matcher matcher;
  private static String result = "    ";

  public static void printWordsFromText(String textToCheck) {
    for (char character = 'a'; character <= 'z'; ++character) {
      String letter = String.valueOf(character);
      pattern = Pattern.compile("\\b[" + letter + letter.toUpperCase() + "]\\w*['-]?\\w+[']?");
      matcher = pattern.matcher(textToCheck);
      while (matcher.find()) {
        result += matcher.group() + " ";
      }
      result += "\n    ";
    }
    System.out.println(result);
  }
}
