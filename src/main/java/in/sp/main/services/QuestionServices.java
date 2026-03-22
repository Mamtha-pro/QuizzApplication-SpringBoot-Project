package in.sp.main.services;

import in.sp.main.Questions;
import in.sp.main.dao.QuestionDuo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServices {

    QuestionDuo questionDuo;

    public List<Questions> getAllQuestions() {
       return questionDuo.findAll();

    }

    public List<Questions> getQuestionByCategory(String category){
        return questionDuo.findByCategory(category);

    }

    public String addQuestions(Questions question) {
        questionDuo.save(question);
        return "sucess";

    }
}
