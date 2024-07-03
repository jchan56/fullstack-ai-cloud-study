function rollDice() {
    return Math.floor(Math.random() * 6) + 1;
}

function playDiceGame() {
    let playerWins = 0;
    let comWins = 0;

    for (let i = 1; i <= 3; i++) { 
        const playerDice = rollDice(); 
        const comDice = rollDice();

        console.log(`${i} 라운드`);
        console.log(`플레이어 : ${playerDice}, 컴퓨터 : ${comDice}`);

        if (playerDice > comDice) {
            console.log("플레이어가 승리했습니다!")
            playerWins++;
        } else if (comDice > playerDice) {
            console.log("컴퓨터가 승리했습니다ㅠㅜ");
            comWins++;
        } else {
            console.log("비겼습니다:)");
        }

    }

        console.log('------------최종결과------------');
        console.log(`플레이어: ${playerWins}점, 컴퓨터: ${comWins}점`);

        if (playerWins > comWins) {
            console.log("플레이어가 승리했습니다!")
        } else if (comWins > playerWins) {
            console.log("컴퓨터가 승리했습니다ㅠㅜ");
        } else {
            console.log("비겼습니다:)");
        }

}

playDiceGame();