
package com.rpms.controller;

import com.rpms.model.Interview;
import com.rpms.service.InterviewService;
import java.util.List;

public class InterviewController {

    private InterviewService interviewService;

    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    public boolean addInterview(Interview interview) {
        return interviewService.addInterview(interview);
    }

    public Interview getInterview(int id) {
        return interviewService.getInterviewById(id);
    }

    public List<Interview> getAllInterviews() {
        return interviewService.getAllInterviews();
    }
}
