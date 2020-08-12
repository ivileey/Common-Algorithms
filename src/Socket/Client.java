package Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import org.junit.Test;

public class Client {
    @Test
    public void testClientThread(){
        while(true){
            InputStream is=null;
            InputStreamReader isr=null;
            BufferedReader br=null;
            try {
                // 从控制台输入
                is = System.in;
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
                String info=null;
                //这里一次输入一行
                while((info=br.readLine())!=null){
                    System.out.println("当前输入的信息是："+info);
                    ClientThread thread = new ClientThread(info);
                    thread.start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
