package in.sp.main.services;

import in.sp.main.Questions;
import in.sp.main.dao.QuestionDuo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServices {

    @Autowired
    QuestionDuo questionDuo;

    public ResponseEntity<List<Questions>> getAllQuestions() {

        try{
            return new ResponseEntity<>(questionDuo.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
       return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<List<Questions>> getQuestionByCategory(String category){
        try{
            return new ResponseEntity<>(questionDuo.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<String> addQuestions(Questions question) {
        questionDuo.save(question);
        return new ResponseEntity<>("sucess",HttpStatus.CREATED);

    }
}
