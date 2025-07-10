package dev.apurvasingh.minilibrary.repository;

import dev.apurvasingh.minilibrary.models.Book;
import dev.apurvasingh.minilibrary.models.BorrowRecord;
import dev.apurvasingh.minilibrary.models.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BorrowRecordRepository extends JpaRepository<BorrowRecord , String>
{

    BorrowRecord findByBorrowerAndBookAndReturnedDateIsNull(Borrower borrower, Book book);

}
