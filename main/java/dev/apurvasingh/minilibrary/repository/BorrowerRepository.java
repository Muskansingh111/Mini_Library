package dev.apurvasingh.minilibrary.repository;

import dev.apurvasingh.minilibrary.models.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower ,String>
{

}
