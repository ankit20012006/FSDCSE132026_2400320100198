import React, { useState } from 'react'

function UseReactState() {
    const [counter, setCounter] = useState(0);

    function incrementValue() {
        setCounter(counter + 1);
    }
    function decrementValue(){
        setCounter(counter -1)
    }

    return (
        <div>
            <h2 style={{color:'green'}}>Use React State</h2>
            <h1 style={{color:'blue'}}>Counter: {counter}</h1>
            <button onClick={incrementValue}>Increment</button>
            <button onClick={decrementValue}>Decrement</button>
        </div>
  )
}

export default UseReactState
