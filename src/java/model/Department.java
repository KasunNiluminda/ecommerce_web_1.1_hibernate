package model;
// Generated Nov 11, 2023 12:17:00 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name="department"
    ,catalog="j2eeb1"
)
public class Department  implements java.io.Serializable {


     private String code;
     private String name;
     private Boolean isactive;

    public Department() {
    }

	
    public Department(String code) {
        this.code = code;
    }
    public Department(String code, String name, Boolean isactive) {
       this.code = code;
       this.name = name;
       this.isactive = isactive;
    }
   
     @Id 

    
    @Column(name="code", unique=true, nullable=false, length=16)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="isactive")
    public Boolean getIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }




}


