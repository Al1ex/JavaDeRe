import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.Base64;
import java.util.Base64.Encoder;
/*
 * Base64加密class文件
 */
public class encode {
    public static void main(String args[]) {
        byte[] buffer = null;
        //获取当前路径，这里是java工程路径
        String str = System.getProperty("user.dir");
        String filepath = "D:\\Environment\\JAVA\\Project\\Spring4Shell\\target\\classes\\Evil.class";
        try {
            FileInputStream fis = new FileInputStream(filepath);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while((n = fis.read(b))!=-1) {
                bos.write(b,0,n);
            }
            fis.close();
            bos.close();
            buffer = bos.toByteArray();
        }catch(Exception e) {
            e.printStackTrace();
        }
        Encoder encoder = Base64.getEncoder();
        String value = encoder.encodeToString(buffer);
        System.out.println(value);
    }
}