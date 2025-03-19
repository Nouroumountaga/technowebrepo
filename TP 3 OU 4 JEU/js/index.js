const btnPlayer0 = document.querySelector("#player_0");
const btnPlayer1 = document.querySelector("#player_1");
const btnPlayer2 = document.querySelector("#player_2");

const btnComputer0 = document.querySelector("#Computer_0");
const btnComputer1 = document.querySelector("#Computer_1");
const btnComputer2 = document.querySelector("#Computer_2");


const arrayBtn = [btnPlayer0, btnPlayer1, btnPlayer2];
const computerBtn = [btnComputer0, btnComputer1, btnComputer2];

const scoreP = document.querySelector("#scoreP");
const scoreC = document.querySelector("#scoreC");

const gagnant = document.querySelector("#rewarder");
const divReward = document.querySelector(".reward")
const rejouerBtn = document.querySelector("#again");

const shifumi = {
    scoreP: 0,
    scoreC: 0,
    player: -1,
    pierre: 2,
    feuille: 0,
    ciseau: 1
}

const playerId = {
    player_0: "pierre",
    player_1: "feuille",
    player_2: "ciseau",
    Computer_0: "pierre",
    Computer_1: "feuille",
    Computer_2: "ciseau",
}

function Reset() {
    arrayBtn.forEach((btn) => btn.className = "");
    computerBtn.forEach((btn) => btn.className = "");
    shifumi.player = -1;
    divReward.className = "reward"
}

arrayBtn.forEach((btn) => {
    btn.addEventListener('click', () => {

        if (shifumi.player == -1) {
            const clickedBtnId = btn.id;
            const newArrayBtn = arrayBtn.filter((btnPlayer) => btnPlayer.id !== clickedBtnId);
            newArrayBtn.forEach((btn) => btn.className = "hide");
            computerBtn.forEach((btn) => btn.className = "hide");


            setTimeout(() => {
                const number = Math.floor(Math.random() * 3);
                computerBtn[number].className = ""
                const cmptChoix = shifumi[`${playerId[`${computerBtn[number].id}`]}`];
                const plyrChoix = shifumi[`${playerId[`${clickedBtnId}`]}`]

                if (cmptChoix > plyrChoix) {
                    shifumi.scoreC += 1
                }
                else if (cmptChoix < plyrChoix) {
                    shifumi.scoreP += 1
                }

                scoreC.innerHTML = shifumi.scoreC;
                scoreP.innerHTML = shifumi.scoreP;


                if (shifumi.scoreC === 3) {
                    gagnant.innerHTML = " Computeur ";
                    divReward.className = "";
                }

                if (shifumi.scoreP === 3) {
                    gagnant.innerHTML = " Player ";
                    divReward.className = "";
                }

                rejouerBtn.addEventListener("click", () => {
                    divReward.className = "rewarder"
                    Reset();
                })

                setTimeout(() => Reset(), 1000);
            }, 1000)
        }
    })
})


