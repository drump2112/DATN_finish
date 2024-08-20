package com.sd59.application.service;

import com.sd59.application.entity.Comment;
import com.sd59.application.model.request.CreateCommentPostRequest;
import com.sd59.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
