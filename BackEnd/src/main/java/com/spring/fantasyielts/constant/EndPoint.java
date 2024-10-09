package com.spring.fantasyielts.constant;

public class EndPoint {

    public static final String API_PREFIX = "";

    public static final class Auth {
        public static final String LOGIN = "/login";
        public static final String REGISTER = "/register";
    }

    public static final class User {
        public static final String BASE = API_PREFIX + "/users";
        public static final String ID = "{userId}";
        public static final String DELETE_MANY = "/delete-many";

    }

    public static final class Role {
        public static final String BASE = API_PREFIX + "/roles";
        public static final String ID = "{roleId}";
        public static final String DELETE_MANY = "/delete-many";
    }

    public static final class TestSerie {
        public static final String BASE = API_PREFIX + "/testSeries";
        public static final String ID = "{testSerieId}";
        public static final String GET_ALL_TESTS = "/{testSerieId}/getTests";
        public static final String CREATE = "/create";
        public static final String ADD_TEST = "/{testSerieId}/addTest";
        public static final String DELETE_MANY = "/delete-many";
    }

    public static final class Test {
        public static final String BASE = API_PREFIX + "/tests";
        public static final String ID = "{testId}";
        public static final String INIT = "/init";
        public static final String UPLOAD_TEST = "/{testId}/uploadTest";
        public static final String DELETE_MANY = "/delete-many";
    }

    public static final class Section {
        public static final String BASE = API_PREFIX + "/sections";
        public static final String ID = "{sectionId}";
        public static final String ADD = "/add";
        public static final String DELETE_MANY = "/delete-many";
    }

    public static final class Part {
        public static final String BASE = API_PREFIX + "/parts";
        public static final String ID = "{partId}";
        public static final String ADD = "/add";
        public static final String DELETE_MANY = "/delete-many";
    }

    public static final class Question {
        public static final String BASE = API_PREFIX + "/questions";
        public static final String ID = "{questionId}";
        public static final String ADD = "/add";
        public static final String DELETE_MANY = "/delete-many";
    }

    public static final class SubQuestion {
        public static final String BASE = API_PREFIX + "/subQuestions";
        public static final String ID = "{subQuestionId}";
        public static final String ADD = "/add";
        public static final String DELETE_MANY = "/delete-many";
    }

    


   

    
    
}
