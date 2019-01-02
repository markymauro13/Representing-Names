public class TestNames  {
    
    public static void main(String[] args){

        Name n1 = new Name("Michael","Sebastian","Mauro");
        
        System.out.println(n1.firstMiddleLast());
        System.out.println(n1.lastFirstMiddle());
        System.out.println(n1.initials());
        System.out.println(n1.length());
        
        /*
        if(n1.equals(otherName))
        {
            return true;
        }
        else
        	return false;
        */
    }
    
}