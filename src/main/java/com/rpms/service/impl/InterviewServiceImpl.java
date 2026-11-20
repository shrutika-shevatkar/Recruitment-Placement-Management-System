
package com.rpms.service.impl;

import com.rpms.dao.InterviewDAO;
import com.rpms.dao.impl.InterviewDAOImpl;
import com.rpms.model.Interview;
import com.rpms.service.InterviewService;

import java.util.List;

public class InterviewServiceImpl implements InterviewService {

    private InterviewDAO interviewDAO = new InterviewDAOImpl();

    @Override
    public boolean addInterview(Interview interview) {
        return interviewDAO.addInterview(interview);
    }

    @Override
    public Interview getInterviewById(int id) {
        return interviewDAO.getInterviewById(id);
    }

    @Override
    public List<Interview> getAllInterviews() {
        return interviewDAO.getAllInterviews();
    }

    @Override
    public boolean updateInterview(Interview interview) {
        return interviewDAO.updateInterview(interview);
    }

    @Override
    public boolean deleteInterview(int id) {
        return interviewDAO.deleteInterview(id);
    }
}

