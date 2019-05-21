int circleOfNumbers(int n, int firstNumber) {
    int resultado = 0;
    int separacion = n / 2;

    if ( separacion > firstNumber ){
        resultado = firstNumber + separacion;
    } else {
        resultado = firstNumber - separacion;
    }

    return resultado;
}