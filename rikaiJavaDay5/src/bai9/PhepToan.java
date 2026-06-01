package bai9;

public enum PhepToan {
    CONG{
        @Override
        int apply(int a, int b) {
            return a+b;
        }
    },
    TRU{
        @Override
        int apply(int a, int b) {
            return  a - b;
        }
    },
    NHAN{
        @Override
        int apply(int a, int b) {
            return a*b;
        }
    },
    CHIA{
        @Override
        int apply(int a, int b) {
            return  a/b;
        }
    };
    abstract int apply(int a,int b);
}
