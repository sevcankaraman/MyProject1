package sorubankasi.encapsulation;

public class Test01 {
    private String gender = "Male";
    private int age = 23;
    private boolean disabled = false;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getGender() {
        return gender;
    }

}
