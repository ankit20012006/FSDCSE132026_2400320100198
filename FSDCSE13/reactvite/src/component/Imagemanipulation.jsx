import { useState } from 'react'

function Imagemanipulation() {
  const [height, setHeight] = useState(400);
  const [width, setWidth] = useState(400);
  const [red, setRed] = useState(0);
  const [green, setGreen] = useState(0);
  const [blue, setBlue] = useState(0);

  function enhanceHeight() {
    setHeight((currentHeight) => currentHeight + 50);
  }

  function enhanceWidth() {
    setWidth((currentWidth) => currentWidth + 50);
  }
  function changeColor(){
    setRed(Math.random() * 255);
    setGreen(Math.random() * 255);
    setBlue(Math.random() * 255);
  }

  return (
    <div>
        <h2 style={{color:'purple'}}>Image Manipulation</h2>
        <div
          style={{
            backgroundColor: `rgb(${red}, ${green}, ${blue})`,
            border: '5px solid red',
            padding: '10px',
            margin: '10px',
            height,
            width,
          }}
        >
          <img
            src="https://i.pinimg.com/736x/ae/e3/4d/aee34ddfd65c21d2696329a3a686a94c.jpg"
            alt="White kitten with blue eyes"
            style={{
              width: '100%',
              height: '100%',
              objectFit: 'contain',
            }}
          />
        </div>
        <button onClick={enhanceHeight} style={{margin: '10px'}}>Enhance height</button>
        <button onClick={enhanceWidth} style={{margin: '10px'}}>Enhance width</button>
        <button onClick={changeColor} style={{margin: '10px'}}>Change Color</button>
    </div>
  )
}

export default Imagemanipulation