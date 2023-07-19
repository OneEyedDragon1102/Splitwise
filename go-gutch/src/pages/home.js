import React from 'react'
import Card1 from '../assets/Card-1.png'
import Graph from '../assets/graph.png'
import Card2 from '../assets/Card-2.png'

export const Home = () => {
  return (
    <div className='p-10 flex gap-5 md:flex-row flex-col'>
      <div className='my-auto md:w-1/2'>
        <h1 className='text-5xl font-bold my-3'>Go Gutch</h1>
        <p className='text-4xl'>
            Welcome to  
            <span className='font-bold'> Go gutch</span>
            , a simple app to help you keep track of your expenses.
            Manage your expenses easily with 
            <span className='font-bold'> go-gutch</span>.
        </p>
      </div>
      <div className='mt-10 md:w-1/2 md:px-40'>
        <img src={Card1} alt='card-1' className='border rounded-md' />
        <img src={Graph} alt='graph' className='border rounded-md relative md:left-16 left-5 bottom-4'/>
        <img src={Card2} alt='card-2' className='border rounded-md relative bottom-10'/>
      </div>
    </div>
  )
}
