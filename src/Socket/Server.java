package Socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import org.junit.Test;

public class Server {

    @Test
    public void testServer(){
        try{
            ServerSocket server = new ServerSocket(8989);
            Socket socket=null;
            //记录客户端的数量
            int count=0;
            System.out.println("***服务器即将启动，等待客户端的连接***");
            //循环监听等待客户端的连接
            while(true){
                //调用accept()方法开始监听，等待客户端的连接
                socket=server.accept();

                //统计客户端的数量
                count++;
                System.out.println("建立了socket实例时间："+new Date()+"，当前客户端的数量："+count+"，当前的socket："+socket.hashCode());
//	            InetAddress inetAddress = socket.getInetAddress();
//	            System.out.println("当前的IP："+inetAddress.getHostAddress()+",当前的本地主机IP："+inetAddress.getLocalHost()+",当前的socket 是"+socket.hashCode());

                //获取远程请求地址和端口
                InetAddress inetAddress = socket.getInetAddress();
                int port = socket.getPort();
                String hostAddress = inetAddress.getHostAddress();
                String hostName = inetAddress.getHostName();
                InetAddress localHost = inetAddress.getLocalHost();
                System.out.println("远程主机 ："+inetAddress+",远程端口："+port+",远程hostAddress："+hostAddress+",远程hostName："+hostName);

                //获取发起的地址和端口
                InetAddress localAddress = socket.getLocalAddress();
                int localPort = socket.getLocalPort();
                String hostAddress2 = localAddress.getHostAddress();
                String hostName2 = localAddress.getHostName();
                System.out.println("本地主机 ："+localAddress+",本地端口 :"+localPort+",本地hostAddress："+hostAddress2+",本地hostName："+hostName2);

                //创建一个新的线程
                ServerThread serverThread=new ServerThread(socket);
                //启动线程
                serverThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
