package ua.lviv.iot.editing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class WordPrinterTest {

  private String orderedTextView = "    app and Android and around and and \n    by \n    crafting code \n    developers \n"
      + "    existing \n    Flutter for Flutter free \n    Google’s \n    high-quality \n"
      + "    is interfaces iOS in is is \n    mobile \n"
      + "    native \n    on organisations open \n    quality \n    record \n"
      + "    SDK source \n    time the \n    used \n    works with world \n    ";

  @Test
  void testOrderingWordsByAlphabetWithScanner() {
    try (Scanner scanner = new Scanner(System.in)) {
      assertEquals(orderedTextView,
          WordPrinter.orderWordsFromTextAlphabetically(scanner.nextLine()));
    }
  }

  @Test
  void testOrderingWordsByAlphabet() {
    assertEquals(orderedTextView, WordPrinter.orderWordsFromTextAlphabetically(
        "Flutter is Google’s mobile app SDK for crafting high-quality "
            + "native interfaces on iOS and Android in record time. Flutter works with existing code, "
            + "is used by developers and organisations around the world, and is free and open source"));

  }
}
