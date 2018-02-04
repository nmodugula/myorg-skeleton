package com.myorg.ecomm.sample.model;

import java.io.Serializable;
import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse implements Serializable {

	private static final long serialVersionUID = 8160346522097565319L;

	private String errorCode;

	private String errorDescription;

	private Map<String, String> additionalErrorDetails;

}
/*
 * Copyright 2016 Capital One Financial Corporation All Rights Reserved.
 * 
 * This software contains valuable trade secrets and proprietary information of
 * Capital One and is protected by law. It may not be copied or distributed in
 * any form or medium, disclosed to third parties, reverse engineered or used in
 * any manner without prior written authorization from Capital One.
 */