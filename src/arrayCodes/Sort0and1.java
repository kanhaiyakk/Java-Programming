package arrayCodes;

public class Sort0and1 {
    public static int[] sort0and1(int[] arr,int n){
        int left=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,0,0,1,1};
        int n=7;
        int[] res=sort0and1(arr,n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
