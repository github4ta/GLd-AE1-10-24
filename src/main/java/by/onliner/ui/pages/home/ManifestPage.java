package by.onliner.ui.pages.home;

import by.onliner.ui.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ManifestPage {
    private WebDriver driver;

    public ManifestPage(){
        driver = Driver.getDriver();
    }

    public ManifestPage(WebDriver driver){
        this.driver = driver;
    }



    public String getTitleManifest(){
        return driver.findElement(By.xpath(HomePageXpath.MANIFEST_TEXT_XPATH)).getText();
    }

    public String switchToWindow(){

        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        return driver.getCurrentUrl();
    }
}
