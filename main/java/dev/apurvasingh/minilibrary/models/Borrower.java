package dev.apurvasingh.minilibrary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;



@Entity
@Data
@Table(name = "borrower")
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    @Id
    @Column(nullable = false)
    private String borrowerId;
    private String name;
    private String email;

    @OneToMany(mappedBy = "borrower", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<BorrowRecord> borrowRecords;
}
