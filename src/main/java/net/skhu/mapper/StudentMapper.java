package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
	List<Student> findAll();
	List<Student> findByDepartment(int departmentId);
	Student findOne(int id);
	void join(Student student);
	void delete(int id);
}