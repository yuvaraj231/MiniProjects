let boxes = document.querySelectorAll(".box");
let resetBtn = document.querySelector("#reset-btn");
let newGameBtn = document.querySelector("#new-btn");
let msgcontainer = document.querySelector(".msg-container");
let msg = document.querySelector("#msg")
let turn = true; //player X, player Y

const winPatterns = [
    [0, 1, 2],
    [0, 3, 6],
    [0, 4, 8],
    [1, 4, 7],
    [2, 5, 8],
    [2, 4, 6],
    [3, 4, 5],
    [6, 7, 8]
];
const resetGame = () =>
{
    turn = true;
    enableBoxes();
    msgcontainer.classList.add("hide")
};
boxes.forEach((box) =>
{
    box.addEventListener("click", () =>
    {
        
        if(turn)
        {
          box.innerText = "O" ;
          turn = false;
        }
        else
        {
            box.innerText = "X";
            turn = true;
        }
        box.disabled = true;
        checkwinner();
    });

});
const disableBoxes = () =>
{
    for(let box of boxes)
    {
        box.disabled = true;
    }
};
const enableBoxes = () =>
    {
        for(let box of boxes)
        {
            box.disabled = false;
            box.innerText = "";
        }
    };
const showWinner = (winner) =>
{
    msg.innerText = `Congratulations, Winner is ${winner}`;
    msgcontainer.classList.remove("hide");
}
const checkwinner = () =>
{
    for (let pattern of winPatterns)
    {
       
        let pos1Val = boxes[pattern[0]].innerText;
        let pos2Val = boxes[pattern[1]].innerText;
        let pos3Val = boxes[pattern[2]].innerText;
        if(pos1Val != "" && pos2Val != "" && pos3Val != "")
            {
                if(pos1Val === pos2Val && pos2Val === pos3Val)
                {
                    
                    
                    showWinner(pos1Val);
                }
            }
    }
};
newGameBtn.addEventListener("click",resetGame);
resetBtn.addEventListener("click",resetGame);