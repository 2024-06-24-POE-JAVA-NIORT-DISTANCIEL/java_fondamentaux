package journee_4_04_07_2024.cours.encapsulation;


//        Bonne encapsulation
public class BrowserGood {
    public void navigate(String url){
        String ip=findIpAddress(url,80);
        String html=sendHttpRequest(ip);
        System.out.println(html);
    }

    private String findIpAddress(String url,int port){
        return "127.0.0.1";
    }

    private String sendHttpRequest(String ip){
        return "<html><head></head><body></body></html>";
    }
}
