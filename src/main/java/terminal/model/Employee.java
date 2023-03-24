package terminal.model;

public class Employee
{
    private int id;
    private String name;
    private String gender;
    private int age;
    private String assignment;
    private String fingerprint;
    private String physicalStatus;
    private String mentalStatus;

    public Employee(String nameEmployee, int idEmployee, String genderEmployee, int age,
                    String assignmentEmployee, String fingerprintEmployee,
                    String physicalStatusEmployee, String mentalStatusEmployee)
    {
        this.name = nameEmployee;
        this.id = idEmployee;
        this.gender = genderEmployee;
        this.age = age;
        this.assignment = assignmentEmployee;
        this.fingerprint = fingerprintEmployee;
        this.physicalStatus = physicalStatusEmployee;
        this.mentalStatus = mentalStatusEmployee;
    }

    public Employee()
    {

    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAssignment()
    {
        return assignment;
    }

    public void setAssignment(String assignment)
    {
        this.assignment = assignment;
    }

    public String getFingerprint()
    {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint)
    {
        this.fingerprint = fingerprint;
    }

    public String getPhysicalStatus()
    {
        return physicalStatus;
    }

    public void setPhysicalStatus(String physicalStatus)
    {
        this.physicalStatus = physicalStatus;
    }

    public String getMentalStatus()
    {
        return mentalStatus;
    }

    public void setMentalStatus(String mentalStatus)
    {
        this.mentalStatus = mentalStatus;
    }

    @Override
    public String toString()
    {
        return id + " | " +
                name + " | " +
                gender + " | " +
                age + " | " +
                assignment + " | " +
                fingerprint + " | " +
                physicalStatus + " | " +
                mentalStatus;
    }
}
