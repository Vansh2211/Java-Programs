#include <iostream>
#include <sstream>
using namespace std;

class Student{
    private: 
    int age;
    String fname;
    String lname;
    int std;
    
    public:
    void set_age(int Age){
    age = Age;
    }
    int get_age(){
        return age;
    }
    void set_standard(int standard){
        std = standard;
    }
    int get_standard(){
        return std;
    }
    void set_first_name(string first_name);
         fname = first_name;

    void displayInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }
    String get_first_name(){
        return  fname;
    }
    void set_last_name(String last_name){
        lname = last_name;
    }
    String get_last_name(){
        return lname;
    }
    String to_string(){
    Stringstream ss;
        char ch =',';
        ss<<age<<ch<<fname<<ch<<lname<<ch<<std;
        return ss.str;
        
        
    }
}

int main() {
    int age, standard;
    string first_name, last_name;
    
    cin >> age >> first_name >> last_name >> standard;
    
    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);
    
    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    cout << st.to_string();
    
    return 0;
}
public void displayInfo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
}