package com.usopen.backend.common;

// respons 시 확인 되는 코드를 공통으로 묶어 관리한다.
public interface ResponseCode {

	// HTTP Status 200
	String SUCCESS = "SU";

	// HTTP Status 400
	String VALIDATION_FAILED = "VF";
	String DUPLICATE_EMAIL = "DE";
	String DUPLICATE_NICKNAME = "DN";
	String DUPLICATE_TEL_NUMBER = "DT";
	String NOT_EXISTED_USER = "NU";
	String NOT_EXISTED_BOARD = "NB";

	// HTTP Status 401
	String SIGN_IN_FAIL = "SF";
	String AUTHENTICATION_FAIL = "AF";

	// HTTP status 403
	String NO_PERMISSION = "NP";

	// HTTP Status 500
	String DATABASE_ERROR = "DBE";

}
