package in.sp.main.dao;

import in.sp.main.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDuo  extends JpaRepository<Questions,Integer> {

    List<Questions> findByCategory(String category);

}
