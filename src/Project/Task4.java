package Project;

public class Task4 {

}
/* Provide Implementation for the diagram below.
 * Then create a test class in which you need to create Objects of ChromeDriver, FirefoxDrive and SafariDriver
 * classes and see which methods available to them.
 */

interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("open the Chrome browser");
    }
    @Override
    public void close() {
        System.out.println("close the Chrome browser");
    }
    @Override
   public String getTitle() {
        String title = "Chrome";
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Chrome browser");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Chrome browser");
    }
}

class FirefoxDrive implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("open the Firefox");
    }
    @Override
    public void close() {
        System.out.println("close the Firefox");
    }
    @Override
    public String getTitle() {
        String title = "Firefox";
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Firefox");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Firefox");
    }
}

class SafariDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("open the Safari");
    }
    @Override
    public void close() {
        System.out.println("close the Safari");
    }
    @Override
    public String getTitle() {
        String title = "Safari";
        return title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("get screenshoot the Safari");
    }
    @Override
    public void navigate() {
        System.out.println("navigate the Safari");
    }
}

class Test {
    public static void main(String[] args) {

        RemoteWebDriver[] array = {new ChromeDriver(), new FirefoxDrive(), new SafariDriver()};

        for(RemoteWebDriver web : array) {

            web.open();
            web.close();
            System.out.println(web.getTitle());
            web.getScreenshot();
            web.navigate();
            System.out.println("----------------------");

        }
    }
}