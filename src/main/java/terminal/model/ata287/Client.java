package terminal.model.ata287;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int balance;
    private int age;
    private int accountNumber;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "client_bank",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "bank_id"))
    private List<Bank> banks = new ArrayList<>();

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public List<Bank> getBanks()
    {
        return banks;
    }

    public void setBanks(List<Bank> banks)
    {
        this.banks = banks;
    }
}
