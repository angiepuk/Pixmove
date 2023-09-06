import org.junit.Before;
import org.junit.Test;
import pageObject.ToDoPage;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class ToDoListTest {
    public String URL = "https://forhemer.github.io/React-Todo-List/";
    private String element;
    private String element2;
    private String element3;

    @Before
    public void creationCases(){
        CreationRandomWords creationRandomCases = new CreationRandomWords();
        element = creationRandomCases.createRandomCase();
        element2 = creationRandomCases.createRandomCase2();
        element3 = creationRandomCases.createRandomCase3();
    }

    @Test
    public void oneSmokeTest() {
        ToDoPage toDoPage = open(URL, ToDoPage.class);
        toDoPage.setFirstPoint(element);
        toDoPage.clickSubmitButton();
        toDoPage.setSecondPoint(element2);
        toDoPage.clickSubmitButton();
        toDoPage.setThirdPoint(element3);
        toDoPage.clickSubmitButton();
        toDoPage.getCountOfElementsOnToDoPage().equals(3);
        toDoPage.clickCheckboxSecondPoint();
        toDoPage.getStrikethroughLine().shouldBe(exist);
        toDoPage.clickDeleteButtonSecondPoint();
        toDoPage.getCheckboxSecondPoint().shouldNotHave(text(element2));
    }
}