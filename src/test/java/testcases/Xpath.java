package testcases;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//realtive xpath -is defined by //tagname[@attribute='value'] $x stands for xpath in console
		//$x("//input[@name='identifier']") in console
		
		// relative xpath - you can use console to get to the relative path  
		//  
		//$x("//input[contains@name='identifier']")
		//$x("//input[starts-with@name='identifier']")
		//adding parents and sibling to xpath
		//
		
		//absolute xpath - starts with html tag
		//  /html/body/div[4]/div/div/div/div/div/form/div/div[2]/input
		// partial path derived from absolute path
		// //content/div[4]/div/div/div/div/div/form/div/div[2]/input
		//chropath for chrome is used for getting elements  
		
		//Description		 Xpath           			CSS Path
		//Direct Child		 //div/a 					div > a
		//Child or Subchild  //div//a			 		div a
		//Id 				 //div[@id=’idValue’]//a 	div#idValue a
		//Following Sibling //ul/li[@class=’first’]/following-siblin ul>li.first + li
	
	
	}	//Class 			 //div[@class=’classValue’]	//a div.classValue a

	
	
}
