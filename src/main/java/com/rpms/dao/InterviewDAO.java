
package com.rpms.dao;

import java.util.List;
import com.rpms.model.Interview;

public interface InterviewDAO {

    boolean addInterview(Interview interview);

    List<Interview> getAllInterviews();

    Interview getInterviewById(int id);

    boolean updateInterview(Interview interview);

    boolean deleteInterview(int id);
}

