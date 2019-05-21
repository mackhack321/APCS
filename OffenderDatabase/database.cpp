#include <iostream>
#include <string>
#include <fstream>
#include <cstring>

using namespace std;

void showNamesStartingWith(char letter, string datapath)
{
    string line;
    ifstream database(datapath);
    while(getline(database,line))
    {
        string newline[5];
        newline[0] = line.substr(0,line.find(","));
        if (newline[0].at(0)==toupper(letter))
        {
            cout << newline[0] << endl;
        }
    }
    database.close();
    cout << endl << "End of search results.  ";
    system("pause");
}

void addNewPerson(string fname, string lname, string gender, string race, string age, string minor, string datapath)
{
    ofstream database;
    database.open(datapath, ios_base::app);
    database << fname << "," << lname << "," << gender << "," << race << "," << age << "," << minor;
    database.close();
    cout << "Added new person.";
}

void findMinorVictims(string datapath)
{
    string line;
    ifstream database(datapath);
    while (getline(database,line))
    {
        break;
    }
}

void launcher()
{
    string DATAPATH = "database.csv";
    cout << "====== Database ======" << endl
         << "1) Search By First Letter" << endl
         << "2) Add New Entry" << endl
         << "3) Exit" << endl
         << "======================" << endl << endl
         << "Enter your choice :: ";
    string user;
    cin >> user;
    cout << endl;
    if (user.compare("1")==0)
    {
        string letter;
        cout << "Enter the letter to search for :: ";
        cin >> letter;
        char arr[1];
        strcpy(arr,letter.c_str());
        showNamesStartingWith(arr[0], DATAPATH);
        launcher();
    }
    if (user.compare("3")==0) {exit(0);}
}

int main()
{
    launcher();
    return 0;
}
