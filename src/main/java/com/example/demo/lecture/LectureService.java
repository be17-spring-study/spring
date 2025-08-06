package com.example.demo.lecture;

import com.example.demo.student.model.StudentEntity;
import com.example.demo.student.model.StudentDto;
import com.example.demo.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LectureService {
    private final  LectureRepository lectureRepository;

    public void register(LectureDto.Register dto) {
        lectureRepository.save(dto.toEntity());
    }

    public List<LectureDto.Lecture> list(){
        List<LectureEntity> result = lectureRepository.findAll();

        return result.stream().map(LectureDto.Lecture::from).toList();
    }

    public LectureDto.Lecture read(Integer idx){
        Optional<LectureEntity> result = lectureRepository.findById(idx);

        if (result.isPresent()){
            LectureEntity entity = result.get();

            return LectureDto.Lecture.from(entity);
        }

        return null;
    }
}
