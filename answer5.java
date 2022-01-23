import jdk.jshell.Snippet;
import org.testng.Assert;

import java.io.File;
import java.util.List;

import static java.sql.DriverManager.getDriver;

public class answer5<doubleClickElement> {
    private static WebDriver driver;
    private static Object options;
    private final Object myAction = null;
    private Object doubleClickAction = null;
    private Snippet By;
    private Object getDriver;

    public answer5(Object FILE) {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        getDriver().get("https://dgotlieb.github.io/Actions");
        Object destinationElement = null;
        assert destinationElement != null;
        File screenShotFile = FILE.getScreenshotAs(destinationElement);
        try {
            FileUtils.copyFile(screenShotFile, new File("element-screenshot.png"));
        } finally {

        }

    }

    public void test1_doubleClick() {
        WebElement buttonElement = driver.findElement(By.id("Button");
        Actions myActions = new Actions(driver);
            myActions.doubleClick(buttonElement);
            myActions.perform();
            String result = getDriver().findElement(By.id("demo")).getText();
            Assert.assertEquals("You double clicked", result);
        }

      public void test2_mouseHover() {
            actions hoverAction = new actions(driver);
            WebElement myElement = driver.findElement(By.id("close"));
            hoverAction.moveToElement(myElement).perform();
            removeFocus();
        }

     public void test3_twoItems() {
         List<WebElement> elementsList = driver.findElements(By.name("kind"));
         Actions builder = new Actions(driver);
         builder.clickAndHold(elementsList.get(0)).clickAndHold(elementsList.get(2)).click();
         builder.build().perform();
     }
            public void test4_scroll() {
                WebElement element = driver.findElement(By.id("clickMe"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            }

                public void test5_uploadFile() {
                    driver.findElement(By.name("pic")).sendKeys("shimon.jpg");
                }













    }

    private void sendKeys(String s) {

    }

    private void removeFocus() {

    }


    private class JavascriptExecutor {
        public void executeScript(String s, WebElement element) {

        }
    }
}

    private void removeFocus() {

    }

    private WebDriver getDriver() {


    }

    @Override
                public void build() {

                }

    private class FILE {
    }

private class OutputTipe {
    }

private class actions {
    public actions(WebDriver driver) {

    }

    public Actions moveToElement(WebElement myElement) {


        }
    }

    private static class FileUtils {
        public static void copyFile(File screenShotFile, File file) {

        }
    }
};
            doubleClickAction.doubleClick(doubleClickElement);
            doubleClickAction.build();





    }

    private String getString() {
        return "Double-click";
    }

    private WebDriver getWebDriver() {
        return driver;
    }

    private WebDriver getDriver() {
        return driver;
    }

    private Object destinationElement;
    File screenShotFile;
    WebElement myElement;

    public static class WebElement {
    }

public static class WebElement {
    }

public enum WebElement {}

private static class WebElement {
    }

public static class WebElement {
    }

public enum WebElement {}

public interface WebElement {
    }

public interface WebElement {
    }

private static class WebElement {
    }

private static class WebElement {
    }

    {


    private class By {
        public static Object name(String cheese_option) {


        }
    }

    private class Actions extends actions {
        public Actions(WebDriver driver) {

        }

        public void doubleClick(WebElement doubleClickElement) {

        }

        public ConsoleIOContext.Fix build() {


        }

        public void perform() {

        }

        public Actions clickAndHold(WebElement element) {


        }

        public void click() {

        }
    }

    private class Actions {
    }

        private class Actions {
            public Actions(WebDriver driver) {
            }
        }