package akokanoProjekt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "banks")
public class Bank {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long Id;
    
    @Column (nullable = false)
    private String bankName;

    @ManyToOne
    @JoinColumn (name = "city_id")
    private City city;
}
