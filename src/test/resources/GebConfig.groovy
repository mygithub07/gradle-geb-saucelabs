import org.openqa.selenium.chrome.ChromeDriver
import geb.driver.SauceLabsDriverFactory
import geb.buildadapter.BuildAdapterFactory

//driver = { new ChromeDriver() }

def sauceBrowser = System.getProperty("geb.saucelabs.browser")
if (sauceBrowser) {
    driver = {
       def username = System.getenv("SAUCE_USERNAME")
       assert username
       def accessKey = System.getenv("SAUCE_ACCESS_KEY")
       assert accessKey
       new SauceLabsDriverFactory().create(sauceBrowser, username, accessKey)
    }
}