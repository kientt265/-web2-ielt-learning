package com.spring.fantasyielts.responses.SubQuestion;

import org.bson.types.ObjectId;

import java.util.List;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubQuestionResponse {
    @Id
    private ObjectId _id;

    private String title;

    private List<String> options;
}
