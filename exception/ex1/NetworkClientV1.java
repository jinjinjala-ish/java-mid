package exception.ex1;

import java.sql.SQLOutput;

public class NetworkClientV1 {

    private final String address;

    //시물레이션 용 필드 생성
    public boolean connectError;          //기본 값 false
    public boolean sendError;             //기본 값 false

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 실패
        if(connectError){ //connectError가 ture 일 때
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }

        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data){
        //전송실패
        if(sendError){ //sendError가 ture 일 때
            System.out.println(address + " 서버에 데이터 전송 실패");
            return "sendError";
        }

        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    //에러 확인
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
