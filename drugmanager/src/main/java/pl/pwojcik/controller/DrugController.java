package pl.pwojcik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.pwojcik.model.Drug;
import pl.pwojcik.repository.DrugRepository;

@RestController
public class DrugController {
	@Autowired
	private DrugRepository drugRepository;
	

	//for barcode detection
	@RequestMapping(value="/drugs/{ean}")
	public Drug getDrugByEan(@PathVariable("ean")String ean) {

		return drugRepository.findByEan(ean);
	}
	
	@RequestMapping(value="/drugs/name/{name}")
	public List<Drug> findDrugsByName(@PathVariable("name")String name){
		
		return drugRepository.findDrugsByName(name);
	}
	
	@RequestMapping(value="/drugs/suggestions/{name}")
	public List<String> findSuggestionsForDrug(@PathVariable("name")String name){
		
		return drugRepository.findDrugNameSuggestion(name);
	}
	//dummy mapping
	@RequestMapping(value="/")
	public String welcome(){
		
		return "Hello world!";
	}
}
