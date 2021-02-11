package java_calisma;

import javax.tools.Tool;

interface Exportable{
void  export();  // whatever method you declare in interface it will return it to public

}



public class tool implements Exportable{
public void export(){
    System.out.println("Tool::export");
    }

}



class reporttool extends tool {
 public void export(){
     System.out.println("RTool::export");
}

    public static void main(String[] args) {
        tool aTool=new reporttool() ;
        tool bTool=new tool();
        callExport(aTool);


    }

    public static void callExport(Exportable ex ){
     ex.export();



    }



}