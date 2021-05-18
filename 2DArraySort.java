
// 2D Array Sort

        Arrays.sort(envelopes, new Comparator<int[]>(){
        public int compare(int[] arr1, int[] arr2){
            if(arr1[0] == arr2[0]) // if first same
                return arr1[1] - arr2[1];// Choose second to sort
            else
                return arr1[0] - arr2[0];
       } 
    });
    

