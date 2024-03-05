const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite um número inteiro para ser verificado na sequência de Fibonacci: ', (answer) => {
  let number = parseInt(answer);

  const result = fibonacci(number);

  console.log(result);

  rl.close();
});

function fibonacci(number) {
  let lastNumber = 0;
  let thisNumber = 1;

  while (thisNumber <= number) {
    if (thisNumber === number) {
      return "O número está na sequência";
    }

    let nextNumber = lastNumber + thisNumber;
    lastNumber = thisNumber;
    thisNumber = nextNumber;
  }
  
  return "O número não está na sequência";
}
