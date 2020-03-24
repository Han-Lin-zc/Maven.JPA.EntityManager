package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {

    @Id
    private Integer id;
    private String name;
    private String primaryType;
    private String secondaryType;


}
