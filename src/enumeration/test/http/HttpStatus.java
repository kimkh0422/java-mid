package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK"), BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404,"Not Found"), INTERNAL_SERVER_ERROR(500,"Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code){
        HttpStatus[] values = values();  //values의 모든 값을 가져와서
        for (HttpStatus status : values) { //status에 하나씩 넣고 루프 돌려서
            if(status.getCode()==code){ // 인수로 받은 code와 status에 있는 코드가 일치하면
                return status;          // 그때 찾은 status를 리턴해줌
            }
        }
        return null;
    }

    public boolean isSuccess(){
        if((code>=200)&&(code<=299)){
            return true;
        }else{
            return false;
        }
    }
}
