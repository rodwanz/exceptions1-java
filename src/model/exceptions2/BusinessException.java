package model.exceptions2;

public class BusinessException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BusinessException(String msg) {
		super(msg);
	}
	

}
