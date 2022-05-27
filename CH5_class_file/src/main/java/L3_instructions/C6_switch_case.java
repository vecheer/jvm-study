package L3_instructions;

public class C6_switch_case {

    public void table_switch(int num,String str){

        int result;

        switch (num){
            case 1:
                result = 111;
                break;
            case 3:
                result = 333;
                break;
            case 2:
                result = 222;
        }

        switch (num){
            case 100:
                result = 100001;
                break;
            case 700:
                result = 700007;
                break;
            case 200:
                result = 200002;
        }

        switch (str){
            case "hello":
                result = 6;
                break;
            case "bye":
                result = 88;
                break;
            case "yes":
                result = 1;
        }
    }

}
