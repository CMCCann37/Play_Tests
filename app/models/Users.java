package models;

import play.db.ebean.*;
import javax.persistence.*;

@Entity
public class Users extends Model{

    @Id
    public String email;
    public String name;
    public String password;

    public void Users(String email, String name, String password){
        this.email=email;
        this.name=name;
        this.password=password;
    }

    public static Finder <String, Users> find = new Finder<>(String.class, Users.class);
}
