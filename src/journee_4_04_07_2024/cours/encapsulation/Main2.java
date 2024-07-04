package journee_4_04_07_2024.cours.encapsulation;

public class Main2 {
    public static void main(String[] args) {
        //        Mauvaise encapsulation
        BrowserBad chrome=new BrowserBad();
        chrome.navigate("https://nike.com");

        chrome.findIpAddress("https://nike.com",70);
        chrome.sendHttpRequest("100.6.9.56");
    }
}
