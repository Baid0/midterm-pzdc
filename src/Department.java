import java.util.Objects;

public class Department {

    // velebi chveni shexedulebisamebr
    private String name;
    private int numOfEmployees;
    private String supervisorName;

    public Department(String name, int numOfEmployees, String supervisorName) {
        this.name = name;
        this.numOfEmployees = numOfEmployees;
        this.supervisorName = supervisorName;
    }


    public String getName() {
        return name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public String getSupervisorName() {
        return supervisorName;
    }


    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", numOfEmployees=" + numOfEmployees +
                ", supervisorName='" + supervisorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department department = (Department) obj;
        return numOfEmployees == department.numOfEmployees &&
                Objects.equals(name, department.name) &&
                Objects.equals(supervisorName, department.supervisorName);
    }
}