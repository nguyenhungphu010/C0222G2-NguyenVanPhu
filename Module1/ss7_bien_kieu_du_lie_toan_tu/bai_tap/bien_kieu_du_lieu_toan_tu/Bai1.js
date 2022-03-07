let inputPhysic;
let inputChem;
let inputBio;

inputPhysic= prompt("enter the physic score : ");
inputChem= prompt("enter the chemistry score");
inputBio= prompt("enter the biology score");

let physic = parseInt(inputPhysic);
let chem = parseInt(inputChem);
let bio = parseInt(inputBio);

let average= ( physic + chem + bio)/3;
document.write("The average score: " + average);