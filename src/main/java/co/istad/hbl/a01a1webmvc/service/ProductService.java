package co.istad.hbl.a01a1webmvc.service;

import co.istad.hbl.a01a1webmvc.domain.Product;
import co.istad.hbl.a01a1webmvc.dto.CreateProductRequest;
import co.istad.hbl.a01a1webmvc.dto.ProductResponse;

public interface ProductService {

    ProductResponse createNewProduct(CreateProductRequest createProductRequest);

}