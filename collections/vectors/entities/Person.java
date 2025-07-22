package collections.vectors.entities;

public class Person {

    private String name;
    private Double height;
    private Integer age;
   
    public Person(String name, Double height, Integer age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
