package bai12;

public class Matrix {
    private final int[][] data;
    private final  int rows;
    private final int cols;

    public Matrix(int[][] data, int rows, int cols) {
        this.data = data;
        this.rows = rows;
        this.cols = cols;
    }

    public Matrix add(Matrix other){
        if(other.cols != this.cols || other.rows != this.rows){
            System.out.println("khong thoa man dieu kien de cong hai ma tran");
            return null;
        }
        int[][] arrayResult  = new int[this.rows][this.cols];
        for(int i= 0;i<this.rows ;i++){
            for (int j = 0; j<this.cols;j++){
                arrayResult[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return  new Matrix(arrayResult , this.rows , this.cols);
    }

    public Matrix  multiply(Matrix other){
        if(this.cols != other.rows){
            System.out.println("khong thoa man dieu kien de nhan hai ma tran ");
            return  null;
        }
        int[][] newData = new int[this.rows][other.cols];
        for(int i=0;i<this.rows;i++){
            for(int j = 0;j<other.cols;j++){
                newData[i][j] = this.data[i][j] + other.data[j][i];
            }
        }
        return  new Matrix(newData , this.rows , other.cols);

    }

    public Matrix  transpose(){
        int[][] newData = new int[this.cols][this.rows];
        for(int i = 0;i<this.rows;i++){
            for (int j = 0; j<this.cols;j++){
                newData[j][i] = this.data[i][j];
            }
        }
        return  new Matrix(newData, cols , rows);
    }
}
