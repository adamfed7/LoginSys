package pl.adamkurs;

import java.util.HashMap;
import java.util.HashSet;

public class IdAndPassword {
    HashMap<String, String> logininfo = new HashMap<String, String>();
    IdAndPassword(){
        logininfo.put("Adam", "adam123");
        logininfo.put("user", "password");
        logininfo.put("Jan", "jan123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
