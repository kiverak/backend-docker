package uz.kiverak.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import uz.kiverak.backend.entity.Customer;
import uz.kiverak.backend.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> findAll(){
        List<Customer> list =  repository.findAll();
        return ResponseEntity.ok(list);
    }

}
