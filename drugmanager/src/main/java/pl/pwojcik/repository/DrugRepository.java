package pl.pwojcik.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.pwojcik.model.Drug;

@Repository
public interface DrugRepository extends CrudRepository<Drug, Integer> {

	@Query("SELECT d FROM Drug d WHERE d.packQuantity like %?1%")
	public Drug findByEan(String ean);
	@Query("SELECT d FROM Drug d WHERE d.name like %?1% order by d.name")
	public List<Drug> findDrugsByName(String name);
	
	@Query("SELECT d.name FROM Drug d WHERE d.name like ?1%")
	public List<String> findDrugNameSuggestion(String paramName);

}
