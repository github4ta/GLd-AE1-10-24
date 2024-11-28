package by.onliner.ui.utils.socialMediaMethods;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SocialMediaUrl {
    private WebDriver driver;

    public SocialMediaUrl(WebDriver driver) {
        this.driver = driver;
    }

    public static void switchToWindow(WebDriver driver) {
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public String getActualLink() {
        switchToWindow(driver);
        String url = driver.getCurrentUrl();
        return url;
    }
}
