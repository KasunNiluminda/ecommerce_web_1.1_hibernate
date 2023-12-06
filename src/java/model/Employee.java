package model;
// Generated Nov 11, 2023 12:17:00 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="employee"
    ,catalog="j2eeb1"
)
public class Employee  implements java.io.Serializable {


     private Integer id;
     private String employeeno;
     private String firstname;
     private String lastname;
     private String mobileno;
     private String email;
     private Double salary;
     private String createduser;
     private Date createddatetime;
     private String lastupdateduser;
     private Date lastupdateddatetime;
     private Set<Login> logins = new HashSet<Login>(0);
     private Set<Cart> carts = new HashSet<Cart>(0);

    public Employee() {
    }
    
    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(String employeeno, String firstname, String lastname, String mobileno, String email, Double salary, String createduser, Date createddatetime, String lastupdateduser, Date lastupdateddatetime, Set<Login> logins, Set<Cart> carts) {
       this.employeeno = employeeno;
       this.firstname = firstname;
       this.lastname = lastname;
       this.mobileno = mobileno;
       this.email = email;
       this.salary = salary;
       this.createduser = createduser;
       this.createddatetime = createddatetime;
       this.lastupdateduser = lastupdateduser;
       this.lastupdateddatetime = lastupdateddatetime;
       this.logins = logins;
       this.carts = carts;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="employeeno", length=16)
    public String getEmployeeno() {
        return this.employeeno;
    }
    
    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno;
    }

    
    @Column(name="firstname", length=100)
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    @Column(name="lastname", length=100)
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    @Column(name="mobileno", length=15)
    public String getMobileno() {
        return this.mobileno;
    }
    
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    
    @Column(name="email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="salary", precision=10)
    public Double getSalary() {
        return this.salary;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    
    @Column(name="createduser", length=100)
    public String getCreateduser() {
        return this.createduser;
    }
    
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createddatetime", length=19)
    public Date getCreateddatetime() {
        return this.createddatetime;
    }
    
    public void setCreateddatetime(Date createddatetime) {
        this.createddatetime = createddatetime;
    }

    
    @Column(name="lastupdateduser", length=100)
    public String getLastupdateduser() {
        return this.lastupdateduser;
    }
    
    public void setLastupdateduser(String lastupdateduser) {
        this.lastupdateduser = lastupdateduser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastupdateddatetime", length=19)
    public Date getLastupdateddatetime() {
        return this.lastupdateddatetime;
    }
    
    public void setLastupdateddatetime(Date lastupdateddatetime) {
        this.lastupdateddatetime = lastupdateddatetime;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Login> getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set<Login> logins) {
        this.logins = logins;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Cart> getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }




}


