package exception.ex2;



public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //data에 에러 메세지가 있는지 확인

        client.connect();
        client.send(data);
        client.disconnect();

    }
}
