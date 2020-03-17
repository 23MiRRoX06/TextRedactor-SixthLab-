package ua.lviv.iot.editing;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class WordPrinterTest {

  @Test
  void testPrintingWordsFromText() {
    try (Scanner scanner = new Scanner(System.in)) {
      WordPrinter.printWordsFromText(scanner.nextLine());
    }
  }
}
