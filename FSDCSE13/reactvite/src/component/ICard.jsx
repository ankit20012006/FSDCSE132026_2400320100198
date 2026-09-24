import React from 'react'

function ICard({data}) {
  return (
    <div style={{border:'5px solid blue', padding:'10px', margin:'10px'}}>
        <img src={data.photo} width="150" height="150"/>
        <h2>Name: {data.name}</h2>
        <h3>Branch: {data.branch}</h3>
        <h3>Roll No: {data.rollNo}</h3>
        <h3>College: {data.college}</h3>
        
    </div>
  )
}

export default ICard