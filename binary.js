function reverseString(str) {
    var string = "";
    for (var i = str.length - 1; i >= 0; i--) {
        string += str[i];
    }
    return string;
}

function binaryToNum(str) {

    let total = 0;
    // for (let i = 0; i < str.length; i++) {
    //     if (str[i] == ".") {
    //         str = str.slice(0, i);
    //         console.log(str);
    //         break;
    //     }else {
    //         str += str[i]
    //     }
    // }
    for (let i = 0; i < str.length; i++) {
        if (i == 0 && str[i] == 1) {
            total += 1;
        }
        else if (i == 1 && str[i] == 1) {
            total += 2;
        }
        else if (i == 2 && str[i] == 1) {
            total += 4;
        }
        else if (i == 3 && str[i] == 1) {
            total += 8;
        }
        else if (i == 4 && str[i] == 1) {
            total += 16;
        }
        else if (i == 5 && str[i] == 1) {
            total += 32;
        }
        else if (i == 6 && str[i] == 1) {
            total += 64;
        }
        else if (i == 7 && str[i] == 1) {
            total += 128;
        }
    }
    console.log(str);
    return total;
}

// node tree

