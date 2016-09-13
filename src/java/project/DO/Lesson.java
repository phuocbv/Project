package project.DO;
// Generated Sep 11, 2016 4:47:28 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Lesson generated by hbm2java
 */
@Entity
@Table(name="lesson"
    ,catalog="mydb"
)
public class Lesson  implements java.io.Serializable {


     private Integer id;
     private String lessonName;
     private String title;
     private String content;
     private String createDate;
     private String updateDate;
     private Integer idCource;

    public Lesson() {
    }

	
    public Lesson(String lessonName, String title, String content, String createDate) {
        this.lessonName = lessonName;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }
    public Lesson(String lessonName, String title, String content, String createDate, String updateDate, Integer idCource) {
       this.lessonName = lessonName;
       this.title = title;
       this.content = content;
       this.createDate = createDate;
       this.updateDate = updateDate;
       this.idCource = idCource;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="lesson_name", nullable=false, length=100)
    public String getLessonName() {
        return this.lessonName;
    }
    
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    
    @Column(name="title", nullable=false, length=100)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="content", nullable=false, length=65535)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    
    @Column(name="create_date", nullable=false, length=100)
    public String getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    
    @Column(name="update_date", length=100)
    public String getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    
    @Column(name="id_cource")
    public Integer getIdCource() {
        return this.idCource;
    }
    
    public void setIdCource(Integer idCource) {
        this.idCource = idCource;
    }




}

