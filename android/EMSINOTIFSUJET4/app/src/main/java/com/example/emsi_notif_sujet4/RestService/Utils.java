package com.example.emsi_notif_sujet4.RestService;

public class Utils {

    private Utils(){};

    public static final String API_URL="http://10.0.2.2:8989/notif/";


    public static iPersonneService getUserService(){
        return RetrofitClient.getClient(API_URL).create(iPersonneService.class);
    }


}
