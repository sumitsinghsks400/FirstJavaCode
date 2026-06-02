package DesignPattern.CreationalPattern.SingeltonPattern;
class AppSettings{
    //private static instance of class

    private  static  AppSettings  instance;


    private  String dataBaseUrl;
    private  String apiKEY;
// private  constructor  to prevent direct object creation
    private AppSettings() {
        this.dataBaseUrl = "Jdbc:mysql:localhost";
        this.apiKEY = "1234YUY";
    }
    // public static method  to get the single instance

    public  static  AppSettings getInstance(){
        if(instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }


    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public String getApiKEY() {
        return apiKEY;
    }
}
public class WithSingeltonPattern {

    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSetting1s = AppSettings.getInstance(); // avod  copy using singalton

        System.out.println(appSetting1s.getApiKEY());
        System.out.println(appSettings.getApiKEY());
        // more memory

        System.out.println(appSettings==appSetting1s);
    }
}
