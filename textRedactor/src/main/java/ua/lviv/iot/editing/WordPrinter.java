package ua.lviv.iot.editing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordPrinter {
  private static Pattern pattern;
  private static Matcher matcher;
  private static boolean wasTextFound;

  public static String orderWordsFromTextAlphabetically(String textToCheck) {
    StringBuffer result = new StringBuffer("    ");
    for (char character = 'a'; character <= 'z'; ++character) {
      String letter = String.valueOf(character);
      pattern = Pattern.compile("\\b[" + letter + "][a-zA-Z]*['’-]?[a-zA-Z]+['’]?",
          Pattern.CASE_INSENSITIVE);
      matcher = pattern.matcher(textToCheck);
      while (matcher.find()) {
        result.append(matcher.group() + " ");
        wasTextFound = true;
      }
      if (wasTextFound) {
        result.append("\n    ");
      }
      wasTextFound = false;
    }
    return result.toString();
  }
}
