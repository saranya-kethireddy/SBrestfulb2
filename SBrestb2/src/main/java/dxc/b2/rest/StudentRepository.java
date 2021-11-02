package dxc.b2.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
	 List<Student> findById(int id);

	  List<Student> findByName(String name);
}
