package Testsuites;

import Helper.Config;
import Homepage.DellHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dellhomepagestepdef {



	@When("admin mousehover on menu {string} and submenu {string}")
	public void admin_mousehover_on_menu_and_submenu(String menutitle, String submenutitle) {
		DellHomePage page=new DellHomePage(Config.driver);
		page.mousehover(menutitle, submenutitle);
	}

	@When("admin Click on produit {string}")
	public void admin_click_on_produit(String Produit) {
		DellHomePage page=new DellHomePage(Config.driver);
		page.clickonproduit(Produit);
	}

	@Then("admin directed to the page produit")
	public void admin_directed_to_the_page_produit() {
	     
	}
}
