const dividir = (a, b) => {
    if (b === 0) {
        return 'Impossivel dividir por zero';
    } else {
        return a / b;
    }
}

export {dividir};