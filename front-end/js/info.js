function updateInfo(cardSlot) {
    const temporaryImage = window.getComputedStyle(cardSlot).getPropertyValue("background-image");
    document.getElementById("screen").style.backgroundImage = temporaryImage;
}

document.getElementById("playerMonsterZone5").addEventListener("mouseover", function () {
    updateInfo(playerMonsterZone5)
});

document.getElementById("playerMonsterZone4").addEventListener("mouseover", function () {
    updateInfo(playerMonsterZone4)
});

document.getElementById("playerMonsterZone3").addEventListener("mouseover", function () {
    updateInfo(playerMonsterZone3)
});