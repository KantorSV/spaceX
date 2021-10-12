
public class Helper {

    public static void myMath(){
        System.out.println("hello");
        int a = 14;
        int b = 6;
        int c = a+b;
        System.out.println("a+b="+c);
        System.out.println("----------------------");
        c = a-b;
        System.out.println("a-b="+c);
        System.out.println("----------------------");
        System.out.println(a+"-"+b+"="+c);
        String text = String.format("%s-%s=%s", a,b,c);
        System.out.println(text);
        System.out.println("----------------------");
        c = a*b;
        text = String.format("%s*%s=%s", a,b,c);
        System.out.println(text);
        System.out.println("----------------------");
        c = a/b;
        text = String.format("%s/%s=%s", a,b,c);
        System.out.println(text);
        //int t = 0;
        //c= a/t;

        int t = 1;
        //increment
        System.out.println("t="+t);
        t++;
        System.out.println("t="+t);
        ++t;
        System.out.println("t="+t);
        t++;
        System.out.println("t="+t);
        int i=0;
        System.out.println("-----------------");
        System.out.println("i="+i);
        System.out.println("i="+(++i));
        System.out.println("i="+i);
        //decrement
        i--;
        System.out.println("i="+i);
        System.out.println("------------------------");
        int sum = 0;
        sum = sum +10;
        //sum = sum -10;
        //sum = sum *10;
        //sum = sum /10;
        System.out.println("sum="+sum);
        sum+=15;//sum = sum +10;
        System.out.println("sum="+sum);


    }

    public static void myMath2(){
        System.out.println("--------------byte---------------------");
        ///[-128;127]= 256 = 2^8
        //[-(2^8)/2;(2^8/2)-1]
        //12345678
        //01010111
        byte a = 127;
        //byte b = 127;
        //byte res = a+b;
        System.out.println("byte a="+a);
        a=(byte)(a+10);
        System.out.println("byte a++="+a);
        byte aMax = Byte.MAX_VALUE;
        System.out.println("maxByte="+aMax);

        System.out.println("--------------short----------------------------");
        //[-(2^16)/2;(2^16/2)-1]
        //1234567891234567
        //1010101010101010
        short b = 1;
        System.out.println("byte b="+b);
        b++;
        System.out.println("byte b++="+b);
        short bMax = Short.MAX_VALUE;
        System.out.println("maxShort="+bMax);

        System.out.println("--------------int----------------------------");
        //[-(2^32)/2;(2^32/2)-1]
        int c = 1;
        System.out.println("int c="+c);
        b++;
        System.out.println("int c++="+c);
        int cMax = Integer.MAX_VALUE;
        System.out.println("maxInt="+cMax);
        cMax++;
        System.out.println("maxInt++="+cMax);


        System.out.println("--------------long----------------------------");
        //[-(2^64)/2;(2^64/2)-1]
        long d = 1;
        System.out.println("int d="+d);
        d++;
        System.out.println("int d++="+d);
        long dMax = Long.MAX_VALUE;
        System.out.println("maxLong="+dMax);
        dMax++;
        System.out.println("maxLong++="+dMax);


        System.out.println("----------------boolean-------------------------------------");
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1="+b1);
        System.out.println("b2="+b2);
        boolean bRes = b1 || b2;
        System.out.println("bRes || (or)="+bRes);

        bRes = b1 && b2;
        System.out.println("bRes & (and)="+bRes);

        bRes = b1 ^ b2;
        //true^true-->false
        //false^false-->false
        //true^fasle->true
        //fasle^true->true
        System.out.println("bRes ^ ( xor )="+bRes);
        System.out.println("---------------------String------------------------------------------");
        String s = "Hello";
        String s1 = " World";
        //concatenation
        String sRes = s+s1;
        System.out.println(sRes);
        int n = sRes.length();
        System.out.println("sRes.length="+n);
        System.out.println(sRes.toLowerCase());
        System.out.println(sRes);

        System.out.println("---------------------------Char----------------------------------------------");
        char ch1 = 'q';
        System.out.println("ch1="+ch1);

        System.out.println("---------------------------float----------------------------------------------");
        float dataA = 1;
        float dataB = 2;
        float dataRes = dataA/dataB;
        System.out.println("float is "+dataRes);
        //float=int
        // //[-(2^32)/2;(2^32/2)-1]
        dataA = 1.02f;

        System.out.println("---------------------------double----------------------------------------------");
        double d1 = 1;
        double d2 = 2;
        double dRes = d1/d2;
        System.out.println("double is "+dRes);
        //double=long
        // //[-(2^64)/2;(2^64/2)-1]
        d1 = 10.023456789;
        System.out.println("d1="+d1);
        d1++;
        System.out.println("d1++="+d1);
        d1+=10;
        System.out.println("d1+=10="+d1);
        d1=d1+20+100;
        System.out.println("d1=d1+20+100="+d1);
    }
}
