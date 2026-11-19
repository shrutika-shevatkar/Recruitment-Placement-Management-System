package com.rpms.dao;

import java.util.List;
import com.rpms.model.Interview;

public interface InterviewDAO {

    void addInterview(Interview interview);

    List<Interview> getAllInterviews();

    Interview getInterviewById(int id);

    void updateInterview(Interview interview);

    void deleteInterview(int id);
}
