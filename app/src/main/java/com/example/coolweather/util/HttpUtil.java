package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ASUS on 2019/10/17.
 */

public class HttpUtil {
	public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
		OkHttpClient client=new OkHttpClient();
		Request request=new Request.Builder()
				.url(address)
				.build();
		client.newCall(request).enqueue(callback);
	}
}
