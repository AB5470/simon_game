class Main{

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int a=0;
        int l=arr.length;
        int[] ar=new int[l];
        for(int i=l;i<0;i--){
            ar[a]=arr[l-1];
            a++;
        }
        for (int i = 0; i < l; i++) {
            System.out.println(ar[i]);
        }

    }

    
}