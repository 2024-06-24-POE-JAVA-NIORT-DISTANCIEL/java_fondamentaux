package journee_4_04_07_2024.cours.encapsulation;


//        Mauvaise encapsulation
public class BrowserBad {
    // -> Ecrire l'url dans la barre d'url
    // -> Trouver l'adresse ip correpondant au nom de domaine
    // -> Envoyer la requête
    public void navigate(String url){
        String ip=findIpAddress(url,80);
        String html=sendHttpRequest(ip);
        System.out.println(html);
    }

    public String findIpAddress(String url,int port){
        return "127.0.0.1";
    }

    public String sendHttpRequest(String ip){
        return "<html><head></head><body></body></html>";
    }
}
