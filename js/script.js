const btn = document.querySelector("#ajouterBtn");
let contenu = document.getElementById("contenu");
let text = document.querySelector("#texte");

let cpt = 0;
const ajouter = () => {
    const p = document.createElement("p");
    p.textContent = text.value;
    contenu.appendChild(p);
    cpt+=1;
    p.className =  (cpt % 2 === 0) ? "droite" :  "gauche"
    text.value = "";
}

btn.addEventListener("click",ajouter);
