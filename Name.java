
public class Name {

private String f,m,l;
   
public Name(String first, String middle, String last)
    {
        f = first;
        m = middle;
        l = last;
        
    }

public String getFirst() 
{
    return f;
}

public String getMiddle()
{
    return m;
}

public String getLast()
{
    return l;
}

public String firstMiddleLast()
{
    return f + " " + m + " " + l;
}


public String lastFirstMiddle()
{
    return l + " " + f + " " + m;
}

/*
public boolean equals(Name otherName)
{
    if(this.equalsIgnoreCase(otherName))
    {
        return true;
    }
    else
    	return false;
   
}
*/

public String initials()
{
    return f.substring(0,1) + m.substring(0,1) + l.substring(0,1);
}

public int length()
{
    int F_length = f.length();
    int M_length = m.length();		//	this is dumb and redundant i just realized :/
    int L_length = l.length(); 
    
    return F_length + M_length + L_length;
}

}