package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
      if (character > 0x0040 & character <= 0x007f) {
          if (character == 0x0061 || character == 0x0065 ||
          character == 0x0069 || character == 0x006f ||
          character == 0x0075 || character == 0x0079 ) {
          System.out.println("Vowel");}
          else {
              System.out.println("Consonant");}
      } else {
          System.out.println("wrong alphabet!");}
    }
}
