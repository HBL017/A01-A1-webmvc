package co.istad.hbl.a01a1webmvc.repository;

import co.istad.hbl.a01a1webmvc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}