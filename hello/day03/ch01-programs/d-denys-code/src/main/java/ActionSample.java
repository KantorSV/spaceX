public class ActionSample {

    public void makeAction(){
        int a = 1;
        boolean z = a>0;
        System.out.println("res="+z);
        //z = true;
        //z = false;
        z = a <0;
        System.out.println("res="+z);
        z = a == 0;
        System.out.println("res="+z);
    }

    public void makeAction2(){
        int a = 1;
        boolean z = a>0;
        if(z==true){
            System.out.println("This is > 0");
        }

        z = a <0;
        if(z==true){
            System.out.println("This is < 0");
        }

        z = a==0;
        if(z==true){
            System.out.println("this is 0");
        }
    }

    public void makeAction3(){
        int a = 1;
        boolean z = a>0;
        if(z){
            System.out.println("This is > 0");
        }

        z = a <0;
        if(z){
            System.out.println("This is < 0");
        }

        z = a==0;
        if(z){
            System.out.println("this is 0");
        }
    }

    public void makeAction4(){
        int a = 1;
        if(a > 0){
            System.out.println("This is > 0");
        }

        if(a<0){
            System.out.println("This is < 0");
        }

        if(a==0){
            System.out.println("this is 0");
        }
    }


    public void makeAction5(int a){
        if(a > 0){
            System.out.println("This is > 0");
        }

        if(a<0){
            System.out.println("This is < 0");
        }

        if(a==0){
            System.out.println("this is 0");
        }
    }




}
