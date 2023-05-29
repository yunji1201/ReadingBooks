package core.code.chap2._2_1_array;

public class TowDimensionArray {
    public static void main(String[] args) {

        int[][] arr1 = new int[2][3];
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(arr.length); // 행의 길이를 말한다
        System.out.println(arr[0].length); // 열의 길이
        System.out.println(arr[1].length); // 열의 길이

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
        }

        System.out.println("==============================================");

        char[][] alphabets = new char[13][2];    //13행 2열의 이차원배열 선언
        char ch = 'A';    //알파벳을 아스키코드로 증가시키기 위한 변수 선언

        for (int i = 0; i < 13; i++) {        //바깥 for문 >> 개행
            for (int j = 0; j < alphabets[i].length; j++, ch++) {    //내부 for문 >> 열
                alphabets[i][j] = ch;    //아스키값으로 각 요소에 저장
                System.out.print(alphabets[i][j]); //열 출력 (i행의 j열)
            }
//            System.out.println();
        }
    }

//    line 5의 alphabets[i].length 는 열의 개수를 나타낸다.
//    일반적인 이차원 배열에서 열의 개수는 모든 행에서 동일하다.
//    line 5 for문에서 증감식이 꼭 하나일 필요는 없다.
//    line 7 열 출력시 println으로 출력하면 결과가 다르게 나오니 주의할 것.
}