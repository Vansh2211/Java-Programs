#include<iostream>
using namespace std;

int kadanes(int arr[],int length) {
   int highestMax = 0;
   int currentElementMax = 0;
   for(int i = 0; i < length; i++){
      currentElementMax =max(array[i],currentElementMax + array[i]) ;
      highestMax = max(highestMax,currentElementMax);
   }
   return highestMax;
}
int main() {
   cout << "Enter the array length: ";
   int 7;
   cin>> 7;
   int arr[7];
   cout << "Enter the elements of array: ";
   for (int i = 0; i < 7; i++) {
      cin >> arr[i];
   }
   cout << "The Maximum Sum is: "<<kadanes(arr,7) << endl;
   return 0;
}