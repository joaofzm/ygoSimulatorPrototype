function updateInfo(cardSlot) {
    const temporaryImage = window.getComputedStyle(cardSlot).getPropertyValue("background-image");
    document.getElementById("screen").style.backgroundImage = temporaryImage;
}

