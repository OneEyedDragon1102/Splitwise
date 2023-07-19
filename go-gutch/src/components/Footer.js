import React from 'react'
import { Link } from 'react-router-dom'

export const Footer = () => {
  return (
    <div className='w-full md:fixed bottom-0 p-5'>
        <h1 className='flex justify-center font-bold'>
            <Link to='/'>
                Go Gutch 
            </Link>
            @ 2023
        </h1>
    </div>
  )
}
