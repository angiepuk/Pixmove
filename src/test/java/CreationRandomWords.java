import org.apache.commons.lang3.RandomStringUtils;

public class CreationRandomWords {

    public static String createRandomCase(){
        return RandomStringUtils.randomAlphabetic(7, 20);
    }

    public static String createRandomCase2(){
        return RandomStringUtils.randomAlphabetic(5, 16);
    }

    public static String createRandomCase3(){
        return RandomStringUtils.randomAlphabetic(5, 16);
    }
}
