package com.tcs.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcs.model.Registration;
import com.tcs.services.CityService;
import com.tcs.services.CountrySerivce;
import com.tcs.services.RegistrationService;
import com.tcs.services.StateService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	@Autowired
	private CountrySerivce countryService;
	@Autowired
	private StateService stateService;
	@Autowired
	private CityService cityService;

	@GetMapping("/reg")
	public String loadForm(Model model) {
		Registration registration = new Registration();
		Map<Integer, String> country = countryService.getAllCountries();
		model.addAttribute("register", registration);
		model.addAttribute("country", country);
		return "registration";
	}

	@PostMapping("/saveForm")
	public String handleSubmitBtn(@ModelAttribute("register") Registration registration, Model model) {
		boolean saveUserDtls = service.saveUserDtls(registration);
		if (saveUserDtls) {
			model.addAttribute("userSucess", "user Details Strored sucessfully");
		}
		return "redirect:/reg";

	}

	@GetMapping("/validateEmail")
	@ResponseBody
	public String emailValidation(@RequestParam("email") String email) {

		String emailStatus = service.validateEmail(email);
		return emailStatus;
	}

	@GetMapping("/getStates")
	@ResponseBody
	public Map<Integer, String> getAllStates(@RequestParam("countryId") Integer countryId) {
		return stateService.getAllStates(countryId);
	}
	@GetMapping("/getCities")
	@ResponseBody
	public Map<Integer, String> getAllCities(@RequestParam("stateId") Integer stateId) {
		return cityService.getAllCitiesByStateId(stateId);
	}
}
