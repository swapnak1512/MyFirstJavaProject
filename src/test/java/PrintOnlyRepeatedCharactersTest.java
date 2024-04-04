import org.example.PrintOnlyRepeatedCharacters;
import org.testng.Assert;
import org.testng.annotations.Test;
public class PrintOnlyRepeatedCharactersTest {

    PrintOnlyRepeatedCharacters prc =new PrintOnlyRepeatedCharacters();

    @Test
    public void repeatedCharactersInSentence()
    {
        String input = "Hello, how are you today?";
        String modifiedInput = input.replaceAll(" ", ""); // Remove all spaces
        String repeatedChars = prc.findRepeatedCharactersInOrder(modifiedInput);

        Assert.assertEquals(repeatedChars, "aaeehhllooooyy");
    }

    @Test
    public void repeatedCharactersInWord()
    {
        String input="google";
        String repeatedChars = prc.findRepeatedCharactersInOrder(input);
        Assert.assertEquals(repeatedChars,"ggoo");
    }

    @Test
    public void repeatedCharactersInEmpty()
    {
        String input="";
        String repeatedChars = prc.findRepeatedCharactersInOrder(input);
        Assert.assertEquals(repeatedChars,"");
    }

    @Test
    public void repeatedCharactersInNullString()
    {
        String input=null;
       Assert.assertThrows(NullPointerException.class,
                () -> {
                    prc.findRepeatedCharactersInOrder(input);
                });
    }

    @Test
    public void repeatedCharactersInCaseSensitive()
    {
        String input="Google";
        String repeatedChars = prc.findRepeatedCharactersInOrder(input);
        Assert.assertEquals(repeatedChars,"ggoo");
    }




}
