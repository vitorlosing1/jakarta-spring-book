package br.com.appfinance.repositories;

import br.com.appfinance.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Integer> {
}
