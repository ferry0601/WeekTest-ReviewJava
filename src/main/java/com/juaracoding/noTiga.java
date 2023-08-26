package com.juaracoding;

public class noTiga {
    public static void main(String[] args) {
        String data[][] = { {":T2:","SOAL3/2112/AB00000","0011 OD:0001234500","CDE5432100 SOAL003"," ABCDE12345 XAS SK","ILL TEST ESSAY .DT"},
                            {":T2:","SOAL3/2111/BC00001","1100 OD:0003452100","EFG2451300 SOAL003"," EFGHI25134 XAS SK","ILL TEST ESSAY .DT"},
                            {":T2:","SOAL3/2110/DE21003","1010 OD:0001524300","HIJ2145300 SOAL003"," JKLMN52431 XAS SK","ILL TEST ESSAY .DT"}};

        String temp1,temp2;
        temp1=data[0][1];
        temp2=data[0][2];
        data[0][1] = data[0][3];
        data[0][2] = data[0][4];
        data[0][3] = data[0][5];
        data[0][4] = temp1;
        data[0][5] = temp2;

        temp1=data[1][1];
        temp2=data[1][2];
        data[1][1] = data[1][3];
        data[1][2] = data[1][4];
        data[1][3] = data[1][5];
        data[1][4] = temp1;
        data[1][5] = temp2;

        temp1=data[2][1];
        temp2=data[2][2];
        data[2][1] = data[2][3];
        data[2][2] = data[2][4];
        data[2][3] = data[2][5];
        data[2][4] = temp1;
        data[2][5] = temp2;


        for (int i=0; i< data.length;i++){
            for(int j = 0; j < data[i].length; ++j){
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
        }

}

