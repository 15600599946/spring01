package pojo;

import java.util.*;

public class User {
    //Spring 通过属性名称 自动顺找对应的set方法
    /*
        private String studentName ==>

        public void setStudentName(String studentName){
            this.studentName = studentName;
        }

        通过 String xx 返回一个参数

     */

    private String name;
    private int age;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> cards;
    private Set<String> games;
    private String wife;
    private Properties properties;


    public User() {
        System.out.println("---------------------无参");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


    /*public void setName1(String name) {
        this.name = name;
    }*/
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCards() {
        return cards;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", cards=" + cards +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", properties=" + properties +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(getSet("sssNnn"));

        System.out.println(getProperty("setNameAge"));
    }

    public static String getSet(String xxxx){
        // xxxYyyZzz
        // setXxxYyyZzz
        // String substring = xxxx.substring(1);
        // String toUp = xxxx.substring(0, 1);
        return "set"+xxxx.substring(0, 1).toUpperCase()+xxxx.substring(1); //setxxxYyyZzz
    }

    public static String getProperty(String setProperty){
        String substring = setProperty.substring(3);
       //        Property
        String substring1 = substring.substring(1);
        String s = substring.substring(0, 1).toLowerCase();
        return s+substring1;
    }
}
