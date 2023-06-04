package Day0531.homework;

import java.util.*;

public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    //返回 map 中存放的所有 T 对象
    //遍历map [k-v]，将map的 所以value（T entity），封装到ArrayList返回即可
    public List<T> list() {
        //创建Arraylist
        List list = new ArrayList<>();

        //遍历map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public void save(String id,T entity) {
        map.put(id,entity);
    }
}
