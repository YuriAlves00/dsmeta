package com.yurialves.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yurialves.dsmeta.entities.Sale;
import com.yurialves.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	SaleService service;
	
	@GetMapping
	public List<Sale> findSales() {
		return service.findSales();
	}
}
