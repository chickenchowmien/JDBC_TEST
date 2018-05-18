import java.util.*;
class Data<T>{
    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }

    public Data(T obj) {
        this.obj = obj;
    }

    private T obj;

    public Object getObj() {
        return obj;
    }
}


class GenericClass<T>{
    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public GenericClass(T data) {
        this.data = data;
    }

    private T data;

}

public class BOOTCAMP {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add("String");
        set.add(1);

    }
}

class Pojo {
    private String id;

    public Pojo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return id == pojo.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
