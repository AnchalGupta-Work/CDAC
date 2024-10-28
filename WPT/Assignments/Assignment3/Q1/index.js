let btn = document.querySelector("button");
let para = document.querySelector("p");

let count = 0;
btn.addEventListener('click',()=> {
    if(count%2==0) {
        para.textContent = "Tit-Lee";
        count++;
    }
    else {
        para.textContent = ":D";
    }
  
})

