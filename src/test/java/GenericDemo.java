public class GenericDemo {
    public static void main(String[] args) {
        GenericData data = new GenericData(1,"chand");
        GenericData data2 = new GenericData("2","james");
        System.out.println("key: "+data.getKey()+" Value: "+data.getValue());
        System.out.println("key: "+data2.getKey()+" Value: "+data2.getValue());
        data.display(2, new GenericData<>("string", 1));
    }
}
class GenericData<K,V>{
    private K key;
    private V value;
    public <E,N> void display(E element, N number){
        System.out.println("Element: "+ element+" Number: "+number);
    }

    public GenericData(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericData{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {

        this.key = key;
    }

    public K getKey() {

        return key;
    }

    public V getValue() {

        return value;
    }
}
