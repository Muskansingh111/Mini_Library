package dev.apurvasingh.minilibrary.models;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "BorrowRecord")
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "borrowerRecordId")
public class  BorrowRecord {
    @Id
    private String borrowerRecordId;

    private LocalDateTime borrowedDate;
    private LocalDateTime returnedDate;

    @ManyToOne
    @JoinColumn(name = "bookId", referencedColumnName = "bookId")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "borrowerId", referencedColumnName = "borrowerId")
    private Borrower borrower;
}


