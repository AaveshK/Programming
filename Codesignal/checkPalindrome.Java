boolean checkPalindrome(String inputString)
{
    String str="";
    int len = inputString.length()-1;
    while(len >= 0)
    {
        str=str+inputString.charAt(len--);
    }
    if(str.compareTo(inputString) == 0)
        return true;
    return false;
}