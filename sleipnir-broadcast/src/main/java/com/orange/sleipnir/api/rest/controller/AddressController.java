package com.orange.sleipnir.api.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orange.sleipnir.repository.entity.Address;
import com.orange.sleipnir.repository.mapper.AddressMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/boardcast/address")
public class AddressController {

    private final AddressMapper addressMapper;

    public AddressController(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @GetMapping("/get")
    public Address getAddress(@RequestParam Long id) {
        return addressMapper.selectById(id);
    }

    @PostMapping("create")
    public Long create(@RequestBody Address address) {
        addressMapper.insert(address);
        return address.getId();
    }

    

}
