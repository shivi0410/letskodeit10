package xpath;

public class PracticePage {

	public String bmwRadioButtonXpath = "//input[@id = 'bmwradio']";
	public String bmwRadioTextXpath = "//div[@id='radio-btn-example']//label[1]";
	public String benzRadioButtonXpath = "//input[@id='benzradio']";
	public String benzRadioTextXpath = "//div[@id='radio-btn-example']//label[2]";
    public String hondaRadioButtonXpath = "//input[@id='hondaradio']";
    public String hondaRadioTextXpath = "//div[@id='radio-btn-example']//label[3]";

	public String bmwDropDownXpath = "//option[contains(text(),'BMW')]";
	public String benzDropDownXpath = "//option[contains(text(),'Benz')]";
	public String hondaDropDownXpath = "//option[contains(text(),'Honda')]";

	public String appleXpath = "//option[contains(text(),'Apple')]";
	public String orangeXpath = " //option[contains(text(),'Orange')]";
	public String peachXpath = "//option[contains(text(),'Peach')]";

	public String bnwCheckBoxXpath = "//input[@id='bmwcheck']";
	public String benzCheckBoxXpath = "//input[@id='benzcheck']"; 
	public String hondaCheckBoxXpath = " //input[@id='hondacheck']";
}
