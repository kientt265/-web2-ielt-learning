package com.spring.fantasyielts.service.Test;

import org.bson.types.ObjectId;

import com.spring.fantasyielts.dto.Test.TestAddDTO;
import com.spring.fantasyielts.entity.Test;

public interface ITestService {
    public Test getTestById(ObjectId testId);
}
