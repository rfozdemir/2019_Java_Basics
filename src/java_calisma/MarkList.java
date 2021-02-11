package java_calisma;

import com.microsoft.schemas.vml.STExt;

public class MarkList {
    int num;

    public static void graceMarks(MarkList obj) {
        obj.num+=10;
        System.out.println(obj.num);
        MarkList abc=new MarkList();
        abc.num=748;

    }

    public static void main(String[] args) {
        MarkList obj1=new MarkList();
        MarkList obj2=obj1;
        MarkList obj3=null;
        obj2.num=60;
        graceMarks(obj2);


    }


}