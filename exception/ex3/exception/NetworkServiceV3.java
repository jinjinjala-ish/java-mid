package exception.ex3.exception;


public class NetworkServiceV3 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //data에 에러 메세지가 있는지 확인

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e ) {
            System.out.println("[연결 오류] 주소: " + e.getMessage() + " , 메세지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + " , 메세지: " + e.getMessage());
        } finally{
            client.disconnect();
        }
    }
}
