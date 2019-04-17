package utils;

import com.fasterxml.jackson.core.JsonParseException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * Json工具类.gson是谷歌提供的一个工具类 很强大 号称可以解决所有对象之间的转换
 */
public class GsonUtils {
    private static Gson gson = new GsonBuilder().create();
    //对象转json
    public static String toJson(Object value) {
        return gson.toJson(value);
    }
    //json对象转实体类
    public static <T> T fromJson(String json, Class<T> classOfT) throws JsonParseException {
        return gson.fromJson(json, classOfT);
    }
    //json对象转各种数据类型 例如 map list
    public static <T> T fromJson(String json, Type typeOfT) throws JsonParseException {
        return (T) gson.fromJson(json, typeOfT);
    }
}