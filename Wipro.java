

/*class Wipro{
    public static void main(String[] args) {
        int n=4;
        int a=n-1;
       
        for(int i=n-1;i<=6;i++){
            
            for(int j=n-1;j<=i;j++){
                 System.out.print(i+" ");
            }
            System.out.println();
           
        }
       
        for(int i=6;i>=n-1;i--){
            
            for(int j=i;j>=n-1;j--){
                 System.out.print(i+" ");
            }
            System.out.println();

           
        }
    }
}*/



//Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

//For example, there are n=7 socks with colors ar = {1,2,1,2,1,3,2}. There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.



/*class Wipro{
    public static void main(String[] args) {
        int arr[]={ 10 ,20 ,20 ,10, 10, 30, 50, 10, 20};
        int n=arr.length;
        int freq[]=new int[100];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        int result=0;
        for(int i=0;i<100;i++){
            result+=freq[i]/2;
        }
        System.out.println(result);
    }
}*/

//sum of all element in an array

/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}*/


//check if an element is present in an array

/*class Wipro{
    public static void main(String[] args) {
        
        int ele=53;
        int arr[]={1,5,7,9};
        boolean result=false;
        int n=arr.length;
        for(int i=0;i<n;i++){
           if(arr[i]==ele){
              result=true;
           }
        }
        System.out.println(result);
    }
}*/


/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                  even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("even count is "+even_count);
        System.out.println("odd count is "+odd_count);
    }
}*/


//sort an array in ascending order

/*class Wipro{
    public static void main(String[] args) {
        int arr[]={3,5,1,2,8,9};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}*/


//largest element

/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1,6,4,9,7,10};
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}*/


//second largest

/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1,6,3,88,44,665,22};
        int n=arr.length;
        int max=0;
        int second_max=-1;
        for(int i=0;i<n;i++){
              if(arr[i]>max){
                second_max=max;
                max=arr[i];
              }
              else if(arr[i]!=max &&arr[i]>second_max){
                second_max=arr[i];
              }
        }
        System.out.println(second_max);
       
    }
}*/


//reverse an array


/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1,2,3,400,55};
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/



//remove dupliactes from a sorted array


/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1,3,3,4,5,5,6};

        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
               arr[res++]=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/


//remove duplicates form an unsorted array

import java.util.HashMap;

/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1,7,4,1,7,6,4,7,8};
        int n=arr.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mpp.containsKey(arr[i])){
                System.out.print(arr[i]+" ");
                mpp.put(arr[i],1);
            }
        }
    }
}*/

//rotate an array by d palaces

/*class Wipro{
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int n=arr.length;
        int d=2;
        rotate_by_d_places(arr,n,d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate_by_d_places(int arr[],int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int low,int high){

        while(low<high){
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }

    }
}*/


//move zeroes to the end of the array

class Wipro{
    public static void main(String[] args) {
        int arr[]={10,8,0,0,12,0,6};
        int n=arr.length;

        int count=0;
       for(int i=0;i<n;i++){
        if(arr[i]!=0){
            arr[count++]=arr[i];
        }
       }

       while(count<n){
        arr[count++]=0;
       }

       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
}