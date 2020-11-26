package com.luftsoft.examandroid.App;

import com.luftsoft.examandroid.Api.ApiServices;
import com.luftsoft.examandroid.Utils.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private  static ApiClient intance=null;
    private ApiServices apiServices;
    private Retrofit retrofit;

    public  ApiClient(){
        retrofit=new Retrofit.Builder()
                .baseUrl(Utils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiServices=retrofit.create(ApiServices.class);
    }

    public  static  ApiClient getInstance(){
        if (intance==null){
            intance=new ApiClient();
        }
        return  intance;
    }

    public  ApiServices getArcadiaService(){
        return apiServices;
    }
}
