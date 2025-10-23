 // public String reverseStr(String s, int k) {
    //     StringBuilder ans = new StringBuilder();
    //     int n = s.length();

    //     for(int i=0; i<n; i += 2*k){
    //         int end = Math.min(i+k, n);

    //         StringBuilder part = new StringBuilder(s.substring(i, end));
    //         part.reverse();
    //         ans.append(part);

    //         if(end < n){
    //             int nextEnd = Math.min(i+2*k, n);
    //             ans.append(s.substring(end, nextEnd));
    //         }
    //     }

    //     return ans.toString();
    // }

    public String reverseStr(String s, int k) {
        int l = 0;
        int r = Math.min(k, s.length());
        char[] charArray =s.toCharArray();

        while(l < s.length()){
            reverse(charArray, l, r);
            l = l + 2*k;
            r = Math.min(l+k, s.length());
        }

        return new String(charArray);
    }

    private void reverse(char arr[], int i, int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j-1];
            arr[j-1] = temp;
            i++;
            j--;
        }
    }
