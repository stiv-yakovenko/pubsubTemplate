package impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class ServerImpl {
    public static void main(String[] args) {
        String s = new Gson().toJson(new ArrayList<>());
        System.out.println(s);
    }
}
