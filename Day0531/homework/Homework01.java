package Day0531.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {
        DAO dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"king"));
        dao.save("003",new User(3,38,"smith"));

        List<User> list = dao.list();

        System.out.println(list);

        dao.update("003",new User(3,58,"milan"));
        System.out.println("=======修改后======");
        list = dao.list();
        System.out.println(list);
    }
}
/*
1.定义User类
2.定义Dao<T>泛型类

 */