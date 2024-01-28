package Homepage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DellHomePage {
 @FindBy (xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li/button/span")
 List<WebElement> menus;
 @FindBy (xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li/button")
 List<WebElement> submenus;
 @FindBy (xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/ul/li[3]/ul/li/a")
 List<WebElement> produitlist;

public DellHomePage (WebDriver driver) {
PageFactory.initElements(Config.driver, this);	
}	
public void mousehover(String menuName,String submenuName) {
	Config.attente(10);
	for(WebElement menu:menus) {
		if(menu.getText().contains(menuName)) {
			Config.actions=new Actions(Config.driver);
			Config.actions.moveToElement(menu).build().perform();;
			Config.attente(10);
			for(WebElement submenu:submenus) {
				if(submenu.getText().contains(submenuName)) {
					Config.actions.moveToElement(submenu).perform();
				}
			}}}}
				public void clickonproduit(String ProduitName) {
					try {
					for(WebElement produit:produitlist) {
						if (produit.getText().contains(ProduitName)) {
							produit.click();
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
}
	
}


