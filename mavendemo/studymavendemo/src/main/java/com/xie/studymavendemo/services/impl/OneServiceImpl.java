package com.xie.studymavendemo.services.impl;

import org.springframework.stereotype.Service;

import com.xie.studymavendemo.model.OneModel;
import com.xie.studymavendemo.services.OneService;



@Service("oneService")
public class OneServiceImpl implements OneService{

	public OneModel getOneModel(String name) {
		OneModel model=new OneModel();
		model.setName(name);
		return model;
	}

}
