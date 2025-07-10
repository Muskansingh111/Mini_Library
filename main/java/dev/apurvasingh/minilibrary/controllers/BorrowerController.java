package dev.apurvasingh.minilibrary.controllers;

import dev.apurvasingh.minilibrary.models.BorrowRecord;
import dev.apurvasingh.minilibrary.models.Borrower;
import dev.apurvasingh.minilibrary.services.BorrowerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/Borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerServices borrowerServices ;

    //POST Add a new borrower
    @PostMapping(value = "addBorrower", consumes = "application/json")
    public Borrower addBorrower(@RequestBody Borrower borrower){
        return borrowerServices.addBorrower(borrower) ;
    }

    //Get borrowing history
//    @GetMapping("getBorrowingHistory/{id}")
//    public BorrowRecord getBorrowingHistory(@PathVariable String id){
//        return borrowerServices.getBorrowingHistory(id);
//    }

}
