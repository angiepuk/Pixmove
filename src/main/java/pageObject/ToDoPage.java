package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToDoPage {

    @FindBy(className = "input-text")   //Поле ToDo
    public SelenideElement inputToDo;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/ul/li[2]/input")  //ПЕРЕДЕЛАТЬ!
    public SelenideElement checkboxSecondPoint;


    @FindBy(css = ".input-submit")    //кнопка "Внести"
    public SelenideElement submitButton;

    @FindBy(css = "li[2][type=\"button\"][text=\"Delete\"]")   //кнопка удаления второго элемента списка
    public SelenideElement deleteButtonSecondPoint;

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

     public void clickDeleteButtonSecondPoint(){
         deleteButtonSecondPoint.click();
     }
}
