import org.openqa.selenium.chrome.ChromeDriver
import geb.driver.SauceLabsDriverFactory
import geb.buildadapter.BuildAdapterFactory

//driver = { new ChromeDriver() }

def sauceBrowser = System.getProperty("geb.saucelabs.browser")
if (sauceBrowser) {
    driver = {
       def username = System.getenv("neeshpal")
       assert username
       def accessKey = System.getenv("6c502a2d-542d-472c-9a0d-a855ee7b8236")
       assert accessKey
       new SauceLabsDriverFactory().create(sauceBrowser, username, accessKey)
    }
}