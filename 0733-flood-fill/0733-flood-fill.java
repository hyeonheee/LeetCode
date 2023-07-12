class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {


        int startColor = image[sr][sc];
        // 시작값이 color와 동일하면 변경x
        if (startColor == color)
            return image;

        fill(image, sr, sc, startColor, color);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int startColor, int Color) {
        // 더 이상 검증할 수 없을 때
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != startColor) {
            return;
        }

        //시작 위치의 값이 newColor와 다르면 시작 위치의 값 업데이트
        image[sr][sc] = Color;

        fill(image, sr - 1, sc, startColor, Color);
        fill(image, sr + 1, sc, startColor, Color);
        fill(image, sr, sc - 1, startColor, Color);
        fill(image, sr, sc + 1, startColor, Color);
    }
}