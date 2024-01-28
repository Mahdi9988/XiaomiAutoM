package Testsuites;

import Helper.Config;
import Helper.Utils;
import io.cucumber.java.en.Given;


public class CommunStepDef {

	@Given("admin is on home page")
	public void admin_is_on_home_page() throws Exception {
	    Config.configchrome();
	    Config.maximaizewindow();
	    Config.navigate(Utils.getproprety("web_Portal_link"));
	   
	}
}
