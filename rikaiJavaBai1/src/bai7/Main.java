package bai7;

public class Main {
    public void main(){
        AppConfig.printPublicConfig();

        // quan sát lỗi vì db_password là biến privarte chỉ có thể truy cập trong class appconfig
//        System.out.println(AppConfig.DB_PASSWORD);
    }
}
