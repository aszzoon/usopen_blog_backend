signIn 로그인

* request
{
email(필수)  : string
password(필수) : 문자열
}

* response

성공 
Http Status - 200(OK)
{
    code: "SU",
    message: "Success."
}

실패 

- 로그인 실패
Http status - 401 (Unauthorized)
{
    code: "SF",
    message: "Sign In Failed."
}
- 
- 데이터 베이스 에러
Http status - 500 (Internal Server Error)
{
    code: "DE",
    message: "Database Error."
}

==============================

Signup 회원가입

* request
  {
  email(필수)  : String
  password(필수) : String
  nickname(필수): String
  telNumber(필수) : String
  address(필수) : String
  addressDetail : String
  }

* response

성공
Http Status - 200(OK)
{
code: "SU",
message: "Success."
token: "jwt",
expiredDate: 123141412
}

실패

- 로그인 실패
  Http status - 401 (Unauthorized)
  {
  code: "SF",
  message: "Sign In Failed."
  }
-
- 데이터 베이스 에러
  Http status - 500 (Internal Server Error)
  {
  code: "DE",
  message: "Database Error."
  }

==============================

weekelyTop3List 주간 상위 3게시물

currentlist 최신게시물

popularWorldList 인기 검색어 리스트

searchList 검색 게시물 리스트

relativeWorldList 관련 검색어 리스트

boardDetail 게시물 상세

favoriteList 좋아요 리스트

putFavorite 좋아요 기능

commentList 댓글 리스트

postComment 댓글 쓰기

boardDelete 게시물 삭제

boardWrite 게시물 쓰기

boardUpdate 게시물 수정

