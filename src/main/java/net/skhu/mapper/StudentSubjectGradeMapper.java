package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.StudentSubjectGrade;

@Mapper
public interface StudentSubjectGradeMapper {
	List<StudentSubjectGrade> findSubjectIdList(int userNumber);
	List<StudentSubjectGrade> findById();
	List<StudentSubjectGrade> findByIdMustMajor(int id);
	List<StudentSubjectGrade> findByIdMustCulture(int id);
}
