package pageObject;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$$;


public class ToDoPage {

    @FindBy(className = "input-text")
    private SelenideElement inputToDo;

    @FindBy(xpath = "//li[2]/input")
    private SelenideElement checkboxSecondPoint;

    @FindBy(css = ".input-submit")
    private SelenideElement submitButton;

    @FindBy(css = "li:nth-child(2) [type = 'button']")
    private SelenideElement deleteButtonSecondPoint;

    @FindBy(css = "li:nth-child(2) [style*=\"line-through\"]")
    private SelenideElement strikethroughLine;

    public SelenideElement getStrikethroughLine() {
        return strikethroughLine;
    }

    public SelenideElement getCheckboxSecondPoint() {
        return checkboxSecondPoint;
    }

    public void setFirstPoint(String firstCase){
        inputToDo.setValue(firstCase);
    }

    public void setSecondPoint(String secondCase){
        inputToDo.setValue(secondCase);
    }

    public void setThirdPoint(String thirdCase){
        inputToDo.setValue(thirdCase);
    }

    public void clickCheckboxSecondPoint(){
        checkboxSecondPoint.click();
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void clickDeleteButtonSecondPoint() {
        deleteButtonSecondPoint.click();
    }

    public Integer getCountOfElementsOnToDoPage(){
        return $$(byCssSelector("[type=\"checkbox\"]")).size();
    }
}
