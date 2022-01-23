import java.util.List;

public class answer6 {
    private static OptionsTest.WebDriver driver;

    public static void beforeAll() {
        System.setProperty("WebDriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
        OptionsTest.ChromeOptions options = new OptionsTest.ChromeOptions();
        driver = new OptionsTest.WebDriver(options);
        driver.get("https://dgotlieb.github.io/Controllers/");
    }

    public void test1_controllers() {
        WebDriver chromeDriver = null;
        List<WebElement> List = chromeDriver.findElement(By.name("cheese option"));
    }

    private WebDriver chromeDriver;
    Select selection = new Select(chromeDriver.findElement(By.name("dropdownmenu")));


    private class Select {
        private Object butter;

        public Select(List<WebElement> dropdownmenu) {
            selection.selectByValue("Butter");
            System.out.println(selection.getOptions());


        }

        




