package com.boot.service.factory.front;

import java.util.HashMap;
import java.util.Map;

import com.boot.entity.ModelParams;
import com.boot.service.factory.AbstractCodelModel;

public class FrontBtnModel extends AbstractCodelModel {

	@Override
	public void generateCode(ModelParams modelParams) {
		modelParams.setFilePath(modelParams.getFilePathPre() + modelParams.getComponentPre() + "/children/");
		modelParams.setTemplateName("frontBtn");
		modelParams.setFileName(modelParams.getPackName() + "Btn");
		
		Map<String, Object> dataParams = new HashMap<>();
		
		this.generateFile(modelParams, dataParams, true);
	}

}
