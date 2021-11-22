class Solution
{
    public int wateringPlants(int[] plants, int capacity)
    {
        int current = 0;
        int rem = capacity;
        int steps = 0;
        while(current < plants.length)
        {
            steps += 1;
            if(rem - plants[current] < 0)
            {
                rem = capacity;
                steps += (2*current);
            }
            rem -= plants[current];
            current++;
        }
        return steps;
    }
}