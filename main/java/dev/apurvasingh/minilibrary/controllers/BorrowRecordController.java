package dev.apurvasingh.minilibrary.controllers;

import dev.apurvasingh.minilibrary.models.Book;
import dev.apurvasingh.minilibrary.models.BorrowRecord;
import dev.apurvasingh.minilibrary.models.Borrower;
import dev.apurvasingh.minilibrary.services.BorrowRecordServices;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
//@RequestMapping(path = "/BorrowRecords")
@RequestMapping
public class BorrowRecordController {

    @Autowired
    private BorrowRecordServices borrowRecordServices ;


    //Borrow a book (POST)
    @PostMapping("/BorrowBook")
    public ResponseEntity<BorrowRecord> borrowBook(@RequestParam String borrowerId,
                                                   @RequestParam String bookId) {
        BorrowRecord record = borrowRecordServices.borrowBook(borrowerId, bookId);
        return ResponseEntity.ok(record);
    }

    //Return a borrowed book
    @PostMapping("/return")
    public ResponseEntity<BorrowRecord> returnBook(@RequestParam String borrowerId,@RequestParam String bookId) {
        BorrowRecord record = borrowRecordServices.returnBook(borrowerId , bookId);
        return ResponseEntity.ok(record);
    }




}
