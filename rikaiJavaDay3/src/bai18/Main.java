package bai18;

public class Main {
    static void main() {

    }


    static int sum(int ...params){
        int sum = 0;
        for(int x: params){
            sum+=x;
        }
        return sum;
    }

    static  double avegra(int ...params){
        int length= params.length;
        int sum = 0;
        for(int x: params){
            sum+=x;
        }
        return (double) sum/length;

    }

    static int range(int ...params){
        int max = params[0];
        int min = params[0];
        for(int i=1;i<params.length;i++){
            if(params[i]> max){
                max = params[i];
            }
            if(params[i]< min){
                min = params[i];
            }
        }
        return  max - min;
    }
}
