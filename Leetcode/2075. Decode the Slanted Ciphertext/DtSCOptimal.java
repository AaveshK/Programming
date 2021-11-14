class Solution
{
    public String decodeCiphertext(String encodedText, int rows)
    {
        if(rows == 1)
            return encodedText;
        int cols = encodedText.length()/rows;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cols; i++)
        {
            for(int j = i; j < rows*cols; j+=cols+1)
                sb.append(encodedText.charAt(j));
        }
        return sb.toString().stripTrailing();
    }
}