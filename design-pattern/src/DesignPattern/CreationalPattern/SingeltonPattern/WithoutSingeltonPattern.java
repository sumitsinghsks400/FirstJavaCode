package DesignPattern.CreationalPattern.SingeltonPattern;

class AppSetting{
    private  String dataBaseUrl;
    private  String apiKEY;

    public AppSetting() {
        this.dataBaseUrl = "Jdbc:mysql:localhost";
        this.apiKEY = "1234YUY";
    }

    public String getDataBaseUrl() {
        return dataBaseUrl;
    }

    public String getApiKEY() {
        return apiKEY;
    }
}

public class WithoutSingeltonPattern {
    public static void main(String[] args) {

        AppSetting appSetting = new AppSetting();
        AppSetting appSetting1 = new AppSetting(); // avod  copy using singalton

        System.out.println(appSetting1.getApiKEY());
        System.out.println(appSetting.getApiKEY());
        // more memory

        System.out.println(appSetting1==appSetting);

    }
}
