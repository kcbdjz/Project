class Leetcode_9{
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else {
            int y = x;
            int t = 0;
            do {
                t = t * 10;
                t = t + y % 10;
                y = y / 10;
            } while (y > 0);
            if (t == x)
                return true;
            else
                return false;
        }
    }
}
