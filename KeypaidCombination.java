public class KeypaidCombination {
    public static String[] keypaid={".","abc","def","ghi","jkl","mno","pqrs","tu","wvx","yz"};
    public static void keypaidCom(String str,int idx,String combination){
        if(str.length()==idx){
            System.out.println(combination+"");
            return;
        }
        char currchar=str.charAt(idx);
         String mapping=keypaid[currchar-'0'];
         for(int i=0;i<mapping.length();i++){
             keypaidCom(str,idx+1,combination+mapping.charAt(i));
         }
    }
    public static void main(String []args){
        
        String s="4";
        keypaidCom(s,0,"");
    }
}
