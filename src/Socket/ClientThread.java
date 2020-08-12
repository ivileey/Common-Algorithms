package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread extends Thread{

    String info = null;

    public ClientThread(String info){
        this.info = info;
    }
    public void run(){
        try {
            Socket socket = new Socket("127.0.0.1", 8989);
            OutputStream os = socket.getOutputStream();
            os.write(info.getBytes());
            //强制刷新缓冲
            os.flush();
            // socket关闭输出通道
            socket.shutdownOutput();

            // 接受服务器返回的消息
            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            System.out.println("服务器返回消息说："+br.readLine());
            os.close();
            br.close();
            inputStream.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


