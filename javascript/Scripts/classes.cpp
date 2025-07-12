#include<iostream>
using namespace std;

class Student{
    private:
    int age;
    string lname;
    string fname;
    int std;

    public:
    void set_age(int Age){
        age = Age;
    }
    int get_age(int Age){
        return Age;
    }

    void set_standard(int standard){
        standard =  std;
    }
    int get_standard(int standard){
        return std;
    }

    void set_firstname(string firstname){
        firstname =  fname;
    }
    int get_firstname(string firstname){
        return fname;
    }

    void set_lastname(string lastname){
        lastname = lname;
    }
    int get_lastname(string lastname){
        return lname;
    }

}
