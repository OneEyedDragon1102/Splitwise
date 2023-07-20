import React from 'react'
import {Link } from 'react-router-dom'

export const Navbar = () => {
  return (
    <div className='p-5 flex justify-between items-center border-b'>
        <h1 className='text-2xl font-semibold'>
            <Link to="/">
            Go Gutch
            </Link>
        </h1>
        <ul className='flex gap-5 font-medium'>
            <li>
                <Link to='/login'>
                    <button className='p-2 border rounded-md'>
                        Login
                    </button>
                </Link>
            </li>
            <li>
                <Link to='/signup'>
                    <button className='p-2 border rounded-md'>
                        Sign Up
                    </button>
                </Link>
            </li>
        </ul>
    </div>
  )
}
