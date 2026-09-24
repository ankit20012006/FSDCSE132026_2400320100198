#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter number of processes: ";
    cin >> n;
    int bt[n], wt[n], tat[n];
    for(int i = 0; i < n; i++) {
        cout << "Enter burst time for process " << i+1 << ": ";
        cin >> bt[i];
    }n 
    wt[0] = 0;
    for(int i = 1; i < n; i++) {
        wt[i] = wt[i-1] + bt[i-1];
    }
    for(int i = 0; i < n; i++) {
        tat[i] = wt[i] + bt[i];
    }
    float total_wt = 0, total_tat = 0;
    cout << "\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n";
    for(int i = 0; i < n; i++) {
        total_wt += wt[i];
        total_tat += tat[i];
        cout << i+1 << "\t\t" << bt[i] << "\t\t" << wt[i] << "\t\t" << tat[i] << endl;
    }
    cout << "\nAverage Waiting Time = " << total_wt/n;
    cout << "\nAverage Turnaround Time = " << total_tat/n;
    return 0;
}