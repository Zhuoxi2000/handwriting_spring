package test.cn.wzx.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "wzx");
        hashMap.put("10002", "dlb");
        hashMap.put("10003", "818");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
