package com.groupeisi.dao;


import com.groupeisi.entity.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository extends CrudRepository<Etudiant,Integer>{

	Etudiant findByEmail(String email);

}
