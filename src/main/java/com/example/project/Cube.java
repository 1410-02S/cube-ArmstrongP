public class Rubiks {


    static String[][] face = {
        {"1","2","3"},
        {"4","5","6"},
        {"7","8","9"}
    };

    static String[][][] cube = {
        {
            {"1b","2b","3b"},
            {"4b","5b","6b"},
            {"7b","8b","9b"}
        },
        {
            {"1r","2r","3r"},
            {"4r","5r","6r"},
            {"7r","8r","9r"}
        },
        {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        },
        {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        },
        {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        },
        {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        },
    };

    static void show(String[][] Face){
        for(String[] i: Face){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    static void move(String[][][] Cube, String input){
        String[][][] tempCube = new String[6][3][3];

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                for(int k=0; k<3;k++)
                    tempCube[i][j][k] = Cube[i][j][k];
        
        switch(input){
            case "u":
                //Code Block
                break;
            default:
                //Code Block 
        }




    }


    static void rotateFace(String[][] Face, boolean clockwise){

        String[][] tempFace = new String[3][3];

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                tempFace[i][j] = Face[i][j];

        if(clockwise){
            //order is Face[y][x] or Face[row][col]

            Face[0][2] = tempFace[0][0];
            Face[0][1] = tempFace[1][0];
            Face[0][0] = tempFace[2][0];
            Face[1][0] = tempFace[2][1];
            Face[1][1] = tempFace[1][1];
            Face[1][2] = tempFace[0][1];
            Face[2][0] = tempFace[2][2];
            Face[2][1] = tempFace[1][2];
            Face[2][2] = tempFace[0][2];
        }else{

        }


    }


    public static void main(String[] args){
        rotateFace(face, true);
        show(face);
    }
}
