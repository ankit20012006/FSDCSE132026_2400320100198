// function sum(){
//     return 1+1;
// }
// function sumofsum(){
//     console.log(sum()+sum());
// }
// sumofsum();
// function sum(a, b){
//     return a + b;
// }
// function sumofsum(){
//     console.log(sum(40, 20) + sum(100, 80));
// }
// sumofsum();

// function Info(name,age,rollno){
// return this.name=name,this.age=age,this.rollno=rollno;
// }
// function myfunction(){
// count=Info("Alice", 20, 1);
// }
// console.log(myfunction());


// const geneatedNumbers=function generateNumbers(){
//     return Math.floor(Math.random()*1000);
// }
// const randomNumbers= generateNumbers();
// console.log(randomNumbers);

// function findEvenNumbers(){
//     if(randomNumbers%2==0){

//         console.log("Even Number");
//     }
// }
// findEvenNumbers();



// const sum=(a,b) => {
//     return a+b;
// }
// const result=sum(10,20);


//IIFF(Imagitaely Invoked Function Expression)
// (()=>{console.log("Hey ..... using IIFF")})();

//CALLBACK FUNCTION
// function sum(a,b){
//     return a+b;
// }
// function sumWithMsg(clbk,msg){
//     const result=clbk(20,40);
//     return msg+result;
// }
// console.log(sumWithMsg(sum,"The sum is:"));


// function login(msg,error){
//     if(error){
//         console.log("Error: " +error);
//     }
//     else{
//         console.log(msg);
//     }
// }

// function loginHandler(username,password,clbk){
//     const myUsername="Prompt40";
//     const myPassword="12345";
//     if(username==myUsername && password==myPassword){
//         clbk("Login successful", false);
//     }
//     else{
//         clbk(null, "Username or password is incorrect");
//     }
// }
// loginHandler("Prompt40","12345",login);


//CALLBACK HELL
// setTimeout(() => {
//     console.log("ONE");
//     setTimeout(() => {
//         console.log("TWO");
//         setTimeout(() => {
//             console.log("THREE");
//             setTimeout(() => {
//                 console.log("FOUR");
//                 setTimeout(() => {
//                     console.log("FIVE");
//                     setTimeout(() => {
//                         console.log("SIX");
//                         setTimeout(() => {
//                             console.log("SEVEN");
//                             setTimeout(() => {
//                                 console.log("EIGHT");
//                                 setTimeout(() => {
//                                     console.log("NINE");
//                                     setTimeout(() => {
//                                         console.log("TEN");
//                                     }, 1000);
//                                 }, 1000);
//                             }, 1000);
//                         }, 1000);
//                     }, 1000);
//                 }, 1000);
//             }, 1000);
//         }, 1000);
//     }, 1000);
// }, 1000);


// function sumofsqrt(a, b) {
//     return Math.sqrt(a) + Math.sqrt(b);
// }
// function sumofmsg(clbk, msg) {
//     const sum = clbk(20,10);
//     return msg + sum;
// }
// console.log(sumofmsg(sumofsqrt, "The sum of two sqrt numbers are: "));

//PROMISE IN JS
// const mypromise = new Promise((resolve,reject)=>{
//   let username="Prompt40";
//   let password="12345";
//   if(username=="Prompt40"&& password=="12345"){
//     resolve("success");
//   }
//   else{
//     reject("failure");
//   }
// })

// mypromise.then((msg)=>{
//   console.log(msg);
// }).catch((error)=>{
//   console.log(error);
// })
// .finally(()=>{
//   console.log("All resource has been closed");
// }) 


let myPromise = new Promise((resolve, reject) => {
    let loginSuccess = true;
    if (loginSuccess) {
        resolve("Login successful");
    } else {
        reject("Login failed");
    }
});

async function loginhandler() {
    try {
        const loginStatus = await myPromise;
        console.log(loginStatus);
    }
    catch (e) {
        console.log(e);
    }
    finally {
        console.log("Closing all the open resources....");
    }
}
loginhandler();