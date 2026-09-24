def fcfs(processes, burst_time):
    n = len(processes)   
    waiting_time = [0] * n
    turnaround_time = [0] * n

    # Waiting Time Calculation
    for i in range(1, n):
        waiting_time[i] = waiting_time[i-1] + burst_time[i-1]

    # Turnaround Time Calculation
    for i in range(n):
        turnaround_time[i] = waiting_time[i] + burst_time[i]

    # Output
    print("Process\tBurst Time\tWaiting Time\tTurnaround Time")
    
    total_wt = 0
    total_tat = 0

    for i in range(n):
        total_wt += waiting_time[i]
        total_tat += turnaround_time[i]
        print(f"{processes[i]}\t\t{burst_time[i]}\t\t{waiting_time[i]}\t\t{turnaround_time[i]}")
    print("\nAverage Waiting Time =", total_wt / n)
    print("Average Turnaround Time =", total_tat / n)
processes = [1, 2, 3, 4]
burst_time = [5, 3, 8, 6]

fcfs(processes, burst_time)
