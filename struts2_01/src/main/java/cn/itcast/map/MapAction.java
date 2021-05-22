package cn.itcast.map;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;
import java.util.Set;

public class MapAction extends ActionSupport {

    private Map<String,Object> map;

    @Override
    public String execute() throws Exception {
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+":"+ map.get(s));
        }
        return NONE;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}
