package org.example.steps;

public interface Steps {
    AuthSteps AUTH_STEPS = new AuthSteps();
    StepCourse COURSE_STEPS = new StepCourse();
    StepProgress PROGRESS_STEPS = new StepProgress();
    StepRating RATING_EXPLORER_STEPS =new StepRating();
    StepRating RATING_KEEPER_STEPS =new StepRating();

    StepRefreshCourseTheme REFRESH_COURSE_THEME = new StepRefreshCourseTheme();

    StepRefreshCourse REFRESH_COURSE = new StepRefreshCourse();

}
