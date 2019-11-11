import java.util.Calendar;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String middlename;
    private Calendar dateOfBirth;
    private String address;
    private String telephone;
    private String department;
    private int course;
    private int group;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Student(int id, String surname, String name, String middlename, Calendar dateOfBirth, String address,
                   String telephone, String department, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.telephone = telephone;
        this.department = department;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", dateOfBirth=" + dateOfBirth.get(Calendar.YEAR) +" год "+
                " " + dateOfBirth.get(Calendar.MONTH)+" "+
                " "+ dateOfBirth.get(Calendar.DAY_OF_MONTH)+
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", department='" + department + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
