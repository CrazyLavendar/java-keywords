
// 2D Array Sort

        Arrays.sort(envelopes, new Comparator<int[]>(){
        public int compare(int[] arr1, int[] arr2){
            if(arr1[0] == arr2[0]) // if first same
                return arr1[1] - arr2[1];// Choose second to sort
            else
                return arr1[0] - arr2[0];
       } 
    });
    
//Collections sort
        
      Collections.sort(queue, new Comparator<List<Integer>>(){
    public int compare(List<Integer> l1 , List<Integer> l2){
            if(l1.get(0) == l2.get(0)) // if first same
                return l1.get(1)- l2.get(1);// Choose second to sort
            else
                return l1.get(0)- l2.get(0);
       } 
    });

    // Sorting Tricks 2D array
Arrays.sort(arr , Comparator);
Arrays.sort(arr, (int[] a, int[] b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]); 

    // Processing Queue
PriorityQueue<E> q =  new PriorityQueue<>(E Comparator)a
PriorityQueue<Task> processingQ = new PriorityQueue<>((Task a , Task b) -> (a.exec == b.exec) ? a.index - b.index : a.exec - b.exec);

Sort Syting array based on length
Arrays.sort(words , (a ,b) -> a.length() - b.length() );