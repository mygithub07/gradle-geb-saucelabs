import geb.*
import spock.lang.Specification
import org.openqa.selenium.chrome.ChromeDriver
import geb.spock.GebSpec
 
 
 
class AllContent extends Module{
 
    static content = {
	  
	 // subHeading{$("#main-content > div > ng-view > div > div:nth-child(1) > div.choice-buttons.choice-api > h3").text()=="Api")}
	  subHeading{$("h3")}
	  //SelectSelenium{$("div",ng-click:"setConfig(0)", text:"Selenium")}
	  SelectSelenium{$("#main-content > div > ng-view > div > div:nth-child(1) > div.choice-buttons.choice-api > div:nth-child(2)")}
	  DeviceMenu{$("button.btn.btn-default.btn-display.select-logo.select-a-device")}
	  SelectPC{$("#desktop > div > div:nth-child(1) > div")}
	  SelectMAC {$("#desktop > div > div:nth-child(2) > div")}
	  SelectOS{$("#main-content > div > ng-view > div > div.spc-item.choice-os.configurator-select.col-md-12 > spc-select > div > button.btn.btn-default.btn-display.select-logo.select")}
	  SelectWinXP{$("#operating-system > div > div:nth-child(5) > div > span.el-text.ng-scope > span")}
	  SelectBrowserMenu{$("#main-content > div > ng-view > div > div.spc-item.configurator-select.col-md-12.webapp-browsers > div.choice-browser.fadein.fadeout > spc-select > div > button.btn.btn-default.btn-display.select-logo.select-a-browser")}
	  SelectChromeTab{$("#main-content > div > ng-view > div > div.spc-item.configurator-select.col-md-12.webapp-browsers > div.choice-browser.fadein.fadeout > spc-select > div > div > ul > li:nth-child(2) > a")}
	  SelectChrome40{$("#chrome > div:nth-child(2) > div:nth-child(4)")}
	 
	  SelectJava{$("#main-content > div > ng-view > div > div.spc-item.choice-code.configurator-select.col-md-12 > div > ul > li:nth-child(1) > a")}
	  CopyButton{$("#copy-code")}
	}
}
 

class SauceLabsPage extends Page{
             static url = "https://docs.saucelabs.com/reference/platforms-configurator/?_ga=1.5883444.608313.1428365147#/"
             //static at = {$("a",1, href: "http://acodediary.com/").text()=="Automation with Geb Soapui"}
             static at = {$("#title-text > a").text()=="Platform Configurator"}
			 static content = {
			 
			  Content { module AllContent }
			
			  
			 }
}
 

class FunctionalSpec extends GebSpec{
 
def NavigationConfigPage(){
 
  given:
    
    to SauceLabsPage
    
  when:
  at SauceLabsPage
   
  then:
  sleep(3000)
  Content.subHeading.text()=="API"
  sleep(3000)
  Content.SelectSelenium.click()
  sleep(3000)
  Content.DeviceMenu.click()
 sleep(3000)
  //waitFor(10) { SelectPC.present }
  Content.SelectPC.click()
  //waitFor { SelectOS.present }
  Content.SelectOS.click()
  sleep(3000)
  Content.SelectWinXP.click()
 sleep(3000)
  Content.SelectBrowserMenu.click()
 sleep(3000)
  Content.SelectChromeTab.click()
  sleep(5000)
  Content.SelectChrome40.click()
  //Content.SelectChrome40.class()
  sleep(3000)
  Content.SelectJava.click()
 sleep(3000)
  Content.CopyButton.click()
} 

 
}