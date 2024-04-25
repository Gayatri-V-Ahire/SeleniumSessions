package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
     BrowserUtil brUtil = new BrowserUtil();
     
     String bw = "chrome";
     
     brUtil.launchBrowser(bw);
     brUtil.launchURL("http://amazon.com");
     
     String brtitle = brUtil.getPageTitle();
     System.out.println(brtitle);
     if(brtitle.equals("Amazon.com. Spend less. Smile more.")) {
    	 System.out.println("title---passed");
     }
     else {
    	 System.out.println("title---failed");
     }
     
     String brURL = brUtil.getPageURL();
     System.out.println(brURL);
     
     if(brURL.contains("amazon.com")) {
    	 System.out.println("url---passed");
     }
     else {
    	 System.err.println("url---failed");
    	 
     }
     brUtil.closeBrowser();
	}

}
