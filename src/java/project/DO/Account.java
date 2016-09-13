package project.DO;
// Generated Sep 11, 2016 4:47:28 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name="account"
    ,catalog="mydb"
)
public class Account  implements java.io.Serializable {


     private Integer idaccount;
     private String username;
     private String password;
     private String accountName;
     private Date createDate;

    public Account() {
    }

    public Account(String username, String password, String accountName, Date createDate) {
       this.username = username;
       this.password = password;
       this.accountName = accountName;
       this.createDate = createDate;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idaccount", unique=true, nullable=false)
    public Integer getIdaccount() {
        return this.idaccount;
    }
    
    public void setIdaccount(Integer idaccount) {
        this.idaccount = idaccount;
    }

    
    @Column(name="username", nullable=false, length=100)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", nullable=false, length=100)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="account_name", nullable=false, length=100)
    public String getAccountName() {
        return this.accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", nullable=false, length=19)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }




}


