package edu.stanford.cs108.podpaper2;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Podcast {
    public String title;
    public String description;
    public String imagrUrl;

    //emoty constructor, possibly for Parcel?
    public void Podcast(){

    }

    public static Podcast fromJson(JSONObject JsonObject) throws JSONException{
        Podcast podcast = new Podcast();

        Log.e("Podcast!!!!!" ,JsonObject.toString());
        //Try to get the details and information from JsonObject. You can reference the file Tweet
        //for more inofrmation about how to get those details

        return podcast;
    }

    public static List<Podcast> fromJSONArray(JSONArray jsonArray) throws JSONException {
        List<Podcast> podcasts = new ArrayList<>();
        for (int i =0; i < jsonArray.length(); i ++){
            podcasts.add(fromJson(jsonArray.getJSONObject(i)));
        }

        return podcasts;
    }
}
