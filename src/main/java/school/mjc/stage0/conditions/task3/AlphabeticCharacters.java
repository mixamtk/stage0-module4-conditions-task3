package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
      if (symbol > 0x0040 & symbol <= 0x007f) {
          if (symbol == 0x0061 || symbol == 0x0065 ||
          symbol == 0x0069 || symbol == 0x006f ||
          symbol == 0x0075 || symbol == 0x0079 ) {
          System.out.println("Vowel");}
          else {
              System.out.println("Consonant");}
      } else {
          System.out.println("wrong alphabet!");}
    }
}
