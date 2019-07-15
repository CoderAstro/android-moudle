package com.sctx.app.android.recycleviewmodel.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 数据加工工具类，用于产生json数据
 */
public class DataProcess {


    static String[] images = new String[]{
            "https://images.sctx.com/shopimg/shop/2/gallery/2019/03/08/15520334059814.jpg",
            "https://images.sctx.com/upload/shop/store/goods/3/3_05929254921120883.jpg",
            "https://images.sctx.com/upload/shop/store/goods/3/3_05787406823797179.jpg",
            "https://images.sctx.com/shopimg/shop/2/gallery/2019/03/08/15520335617320.jpg",
            "https://images.sctx.com/upload/shop/store/goods/2354/2354_05598525066783227.jpg"};


    public static String getJsonData() {
        JSONObject Basejson = new JSONObject();
        try {
            Basejson.put("code", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < 5; i++) {
            JSONObject jsonObject = new JSONObject();

            try {
                jsonObject.put("title", "标题" + i);
                jsonObject.put("content", "这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。这里是二级文本。");
                jsonObject.put("url", images[i]);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jsonArray.put(jsonObject);

        }
        try {
            Basejson.put("data", jsonArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return Basejson.toString();
    }

}
