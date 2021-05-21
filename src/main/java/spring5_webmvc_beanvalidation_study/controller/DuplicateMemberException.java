package spring5_webmvc_beanvalidation_study.controller;

public class DuplicateMemberException extends RuntimeException {
	
	public DuplicateMemberException(String message) {
		super(message);
	}

}
