const t = setInterval(move, 20);
// Запускает функцию move каждые 20 миллисекунд
let pos = 0;
let dir = 1;
// let flag = true;
const box = document.getElementById('box');

// clearInterval(t); // остановить функцию setInterval
// function move() {
//     flag ? pos++ : pos--;
//     if (pos == 0 || pos == 150) {
//         flag = !flag;
//     }
//     box.style.left = pos + 'px';
//     box.style.top = pos + 'px';

//     // if (pos === 150) {
//     //     flag = false;
//     // }
//     // if (pos === 0) {
//     //     flag = true;
//     // }
    
//     // if (flag) {
//     //     pos++;
//     // } else {
//     //     pos--;
//     // }
// }

function move() {
    pos += dir; // pos = pos + dir;
    // pos == 0 || pos == 150 ? dir *= -1 : dir;
    if (pos == 0 || pos == 150) {
        dir *= -1; // dir = dir * -1;
    }

    box.style.left = pos + 'px';
    box.style.top = pos + 'px';
}

console.log(new Date());

setInterval (printTime, 1000);

function printTime() {
    const d = new Date();
    const h = d.getHours() > 9 ? d.getHours() : +('0' + d.getHours());
    const m = d.getMinutes() > 9 ? d.getMinutes() : +('0' + d.getMinutes());
    const s = d.getSeconds() > 9 ? d.getSeconds() : +('0' + d.getSeconds());
    const time = `${h} : ${m} : ${s}`;

    const h1 = document.createElement('h1');
    h1.innerText = time;

    h1.style.margin = '10px auto 0';
    h1.style.width = 'fit-content';

    if (document.body.children == 2) {
        document.body.appendChild(h1);
    } else {
        document.body.replaceChild(h1, document.body.lastElementChild)
    }

    // if (!document.querySelector("h1")) {
    //     const timeBox = document.createElement("h1");
    //     document.body.append(timeBox);
    // }
    // document.querySelector("h1").innerText = time;

}

/*
= - присвоение;
== - не строгое сравнение (сравнение значений без учёта типов данных);
=== - строгое сравнение (с учётом типов данных);

1 == '1'; -- true
1 === '1'; -- false

Сложение числа и строки называется конкатинацией.
Результатом будет "слипшаяся" строчка

*/