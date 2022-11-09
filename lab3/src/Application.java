public class Application {
    int sortNumbers(int arr[]){
    int aux;
    for(int i=0;i<=arr.length;i++){
        if (arr[i]>arr[i+1]){
            aux=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=aux;
        }
        else{
            aux=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=aux;
        }

    }
    return arr;
    }
}
