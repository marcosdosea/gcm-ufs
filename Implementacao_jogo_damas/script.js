// Create the canvas element
const canvas = document.createElement('canvas');
canvas.width = 400; // Set the desired width of the canvas
canvas.height = 400; // Set the desired height of the canvas
document.body.appendChild(canvas);

// Get the 2D rendering context
const ctx = canvas.getContext('2d');

// Draw the checkerboard
function drawCheckerboard() {
    const squareSize = canvas.width / 8; // Calculate the size of each square

    for (let row = 0; row < 8; row++) {
        for (let col = 0; col < 8; col++) {
            // Alternate the color of each square
            const isEvenSquare = (row + col) % 2 === 0;
            const squareColor = isEvenSquare ? '#FFFFFF' : '#000000';

            // Draw the square
            ctx.fillStyle = squareColor;
            ctx.fillRect(col * squareSize, row * squareSize, squareSize, squareSize);
        }
    }
}


function drawCheckers(){

    const circleSize = canvas.width/16;
    //...
}

// Call the drawCheckerboard function to draw the initial checkerboard
drawCheckerboard();