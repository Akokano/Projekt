package akokanoProjekt.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table (name = "savings")
public class Saving {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long Id;

    @Column (length = 3)
    private String currency;

    @Column
    private Number amountOfSaving;

    @Column 
    private LocalDate dateOfBeginingSaving;

    @Column
    private LocalDate dateOfEnding;

    @Column
    private String purposeOfSaving;

    @Column
    private Integer interestRate;

    @OneToMany
    @JoinColumn (name = "bank_id")
    private Bank bank;

    @OneToMany
    @JoinColumn (name = "user_id")
    private
     User user;


    
}
