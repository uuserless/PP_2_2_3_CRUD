package web.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty
    @Column(name = "Name")
    private String name;
    @Column(name = "Last_Name")
    private String lastName;
    @Min(value = 0)
    @Column(name = "Age")
    private int age;

    public User() {}

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        if (id != user.id) return false;
        if (getAge() != user.getAge()) return false;
        if (!getName().equals(user.getName())) return false;
        return getLastName().equals(user.getLastName());
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + getName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getAge();
        return result;
    }

}
