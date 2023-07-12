package com.qsp.bootdemo.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.qsp.bootdemo.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	public List<Student> findByName(String name);
	public List<Student> findByAge(int age);
	public List<Student> findByAgeGreaterThan(int age);
	public List<Student> findByAgeLessThan(int age);
	public List<Student> findByAgeBetween(int age1,int ag2);
	public List<Student> findByAgeEquals(int age);
	public List<Student> findByAgeGreaterThanEqual(int age);
	public List<Student> findByAgeLessThanEqual(int age);
	
	

}