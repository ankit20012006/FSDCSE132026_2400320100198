void main(){
    String s="Sun";
    switch dtype = switch(s){
        case "Mon","Tue","Wed","Thu","Fri"->Weekday;
        case "Sat","Sun"->Weekend;
        default->"Invalid day";
    };
    System.out.println("Day type: "+dtype); 
}