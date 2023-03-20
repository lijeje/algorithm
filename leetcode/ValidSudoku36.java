package Main.leetcode;

import java.util.HashSet;

public class ValidSudoku36 {

    public static void main(String[] args) {
        char[][] board =
                {
                     {'5','3','.','.','7','.','.','.','.'}
                    ,{'6','.','.','1','9','5','.','.','.'}
                    ,{'.','9','8','.','.','.','.','6','.'}
                    ,{'8','.','.','.','6','.','.','.','3'}
                    ,{'4','.','.','8','.','3','.','.','1'}
                    ,{'7','.','.','.','2','.','.','.','6'}
                    ,{'.','6','.','.','.','.','2','8','.'}
                    ,{'.','.','.','4','1','9','.','.','5'}
                    ,{'.','.','.','.','8','.','.','7','9'}
                };

        char[][] board2 =
                {
                        {'8','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}
                };

        ValidSudoku36 validSudoku = new ValidSudoku36();
        System.out.println(validSudoku.isValidSudoku(board));
        System.out.println(validSudoku.isValidSudoku(board2));
    }

    public boolean isValidSudoku(char[][] board) {
        // 중복저장시 false를 반환하는 Set의 성질을 이용
        HashSet<String> hashSet = new HashSet();

        for(int i = 0; i<9 ; i++) {
            for(int j = 0; j<9; j++) {
                char num = board[i][j]; // 모든 보드를 한번씩 돌게할 것
                if(num != '.'){
                    if (   !hashSet.add("row"+i+num)
                        || !hashSet.add("col"+j+num)
                        || !hashSet.add("block"+i/3+"-"+j/3+num)
                        ) return false;

                }
            }//j
        }//i

        return true;
    }
}
