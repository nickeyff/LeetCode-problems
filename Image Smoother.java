/*基础知识+写优秀高效的代码*/

/*Image Smoother
给定二维矩阵，表示图像的灰度。
对图像进行平滑处理，将每一个像素的值换成
其周围9个单元格的平均值。*/
public int[][] imageSmoother(int[][] M)
{
    int row = M.length;
    int col = M[0].length;
    int[][] temp = new int[row][col];
    int count = 0;
    int sum = 0;

    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j < col; j++)
        {
            sum = M[i][j];
            count = 1;

            if(i-1>=0)
            {
                sum += M[i-1][j];
                count ++;

                if(j-1>=0)
                {
                    sum += M[i-1][j-1];
                    count ++;
                }

                if(j+1<col)
                {
                    sum += M[i-1][j+1];
                    count ++;
                }
            }

            if(j+1<col)
            {
                sum += M[i][j+1];
                count ++;

                if(i+1<row)
                {
                    sum += M[i+1][j+1];
                    count ++;
                }
            }

            if(i+1<row)
            {
                sum += M[i+1][j];
                count ++;

                if(j-1>=0)
                {
                    sum += M[i+1][j-1];
                    count ++;
                }
            }

            if(j-1>=0)
            {
                sum += M[i][j-1];
                count ++;
            }

            temp[i][j] = sum / count;
        }
    }

    return temp;
}