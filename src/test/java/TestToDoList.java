import org.junit.Test;
import pageObject.ToDoPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.*;


public class TestToDoList {
    Integer elementSize;
    String case1 = "Buy peaches";
    String case2 = "Congrats cuisine";
    String case3 = "run in the park";
    @Test
    public void oneSmokeTest() {
        ToDoPage toDoPage = open("https://forhemer.github.io/React-Todo-List/", ToDoPage.class);  //пункт 1
        toDoPage.setFirstPoint(case1);    //Добавить поочерёдно 3 элемента в ToDo лист
        toDoPage.clickSubmitButton();
        toDoPage.setSecondPoint(case2);
        toDoPage.clickSubmitButton();
        toDoPage.setThirdPoint(case3);
        toDoPage.clickSubmitButton();
        elementSize = $$(byCssSelector("[type=\"checkbox\"]")).size();  //Проверить, что элементов в листе стало действительно 3
        elementSize.equals(3);
        toDoPage.clickCheckboxSecondPoint();  //Пометить один из элементов как выполненный (галочкой в чекбоксе)
        /*$(byCssSelector("[style*=\"line-through\"]")).shouldHave(text("line-through"));  //пункт 5
        toDoPage.clickDeleteButtonSecondPoint();  пункт 6 */

    }
}