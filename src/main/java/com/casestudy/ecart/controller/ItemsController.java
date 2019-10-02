package com.casestudy.ecart.controller;

import com.casestudy.ecart.expection.ResourceNotFoundException;
import com.casestudy.ecart.model.Items;
import com.casestudy.ecart.repository.ItemsRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class ItemsController {

    @Autowired
    ItemsRegister itemsRegister;

    @GetMapping("/items")
    public List<Items> getAllItems()
    {
        return itemsRegister.findAll();
    }

    @PostMapping("/addDetails")
    public Items addItems(@Valid @RequestBody Items items)
    {
        return itemsRegister.save(items);
    }

    @GetMapping("/items/{id}")
    public Items getDetailsById(@PathVariable(value="id")Integer itemId)
    {
        return itemsRegister.findById(itemId).orElseThrow(()-> new ResourceNotFoundException("Details","Id",itemId));
    }
}
