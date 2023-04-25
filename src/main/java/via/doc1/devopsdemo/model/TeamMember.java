package via.doc1.devopsdemo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name= "TeamMember")
@Table(name= "team_member")
public class TeamMember {
    @Id
    private String id;
    private String name;
    private String email;

    @OneToMany(fetch=FetchType.LAZY, mappedBy= "teamMember") 
    @JsonIgnore
    private List<Task> tasks = new ArrayList<>();

    public TeamMember(){
        
    }

    public TeamMember(String id, String name, String email, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tasks = tasks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return String.format(
                "TeamMember [" +
                "id=%s, " +
                "name=%s, " +
                "email=%s" +
                "tasks=%s]", id, name, email, tasks);
    }
}
