package kaszucar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kaszucar.model.Cars;
import kaszucar.model.UsersHasCars;
import kaszucar.repository.CovoiturageRepository;

@Service
public class ImplCovoiturageService implements CovoiturageService {
	@Autowired
	private CovoiturageRepository CR;
	
	public List<Cars> getAllCarsByUser(int idUser){
		List<UsersHasCars> UserHasCars = CR.getAllCarsByUser(idUser);
		List<Cars> cars = new ArrayList<Cars>();
		for (UsersHasCars UsersHasCar : UserHasCars) {
			cars.add(UsersHasCar.getCars());
		}
		return cars;
	}
	
}