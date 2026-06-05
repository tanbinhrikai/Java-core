package day5.bai9;

enum PhepToan {
    CONG {
        double apply(double a, double b) {
            return a + b;
        }
    },

    TRU {
        double apply(double a, double b) {
            return a - b;
        }
    },

    NHAN {
        double apply(double a, double b) {
            return a * b;
        }
    },

    CHIA {
        @Override
        double apply(double a, double b) {
            if(b == 0) {
                System.out.println("Loi khong the chia duoc cho 0");
                return 0;
            }
            return a/b;
        }
    };

    abstract double apply(double a, double b);
}