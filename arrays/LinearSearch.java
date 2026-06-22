public class LinearSearch {

    static int linearSearch(int ar[],int key){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[]={50,10,33,40,26};
        int key=40;
        System.out.println(linearSearch(ar,key));
    }

}
