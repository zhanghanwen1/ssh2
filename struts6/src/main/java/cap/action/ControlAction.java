package cap.action;

import cap.bean.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControlAction  extends ActionSupport {
    private Map<String,String> strMap=new HashMap<>();
    private  Map<String, User>userMap=new HashMap<>();
    private List<User> usersList=new ArrayList<>();

    public Map<String, String> getStrMap() {
        return strMap;
    }

    public void setStrMap(Map<String, String> strMap) {
        this.strMap = strMap;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public String control(){
        strMap.put("1","cdavtc1");
        strMap.put("2","cdavtc2");
        strMap.put("3","cdavtc3");
        User u1=new User(1,"zhw1","zhw1");
        User u2=new User(2,"zhw2","zhw2");
        userMap.put("one" ,u1);
        userMap.put("two",u2);
        usersList.add(u1);
        usersList.add(u2);
        return SUCCESS;
    }

}
