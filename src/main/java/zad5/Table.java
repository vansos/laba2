package zad5;

public class Table {
    private int[][] table;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return cols;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(table[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }

    public double average() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += table[i][j];
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}
