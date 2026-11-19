
package com.rpms.service;

import com.rpms.model.Interview;
import java.util.List;

public interface InterviewService {

    boolean addInterview(Interview interview);

    Interview getInterviewById(int id);

    List<Interview> getAllInterviews();

    boolean updateInterview(Interview interview);

    boolean deleteInterview(int id);
}
