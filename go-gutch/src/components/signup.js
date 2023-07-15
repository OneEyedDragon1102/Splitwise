import React from 'react'
import { Testimonials } from './Testimonials'
import { Link } from 'react-router-dom'

export const SignUp = () => {
  return (
    <div className='md:m-20 md:p-10 m-5 p-5 rounded-md shadow-lg md:my-20 flex md:flex-row flex-col h-max gap-10'>
        <div className='md:w-1/2 space-y-5 bg-blue-100 p-2 rounded-md'>
          <h1 className='text-3xl ml-5'>Go Gutch</h1>
          <div className='text-center '>
            <h2 className='font-medium'>Let us help you manage your expenses on your fingertip. </h2>
            <h3 className='text-gray-400'>Here, is our registration which take less then a minute.</h3>
          </div>
          <div className='md:w-3/4 mx-auto md:p-1 p-5'>
            <Testimonials />
          </div>
        </div>
        <div className='md:mt-0 mt-10 md:w-1/2'>
          <h1 className='text-2xl font-medium'>Get Started</h1>
          <h3 className='text-gray-400'>Create your account now</h3>
          <form className='mt-10 flex flex-col space-y-2'> 
            <label className=''>Username</label>
            <input type='text' className='p-2 outline-none border rounded-md md:w-2/3'/>
            <label>Email</label>
            <input type='email' className='p-2 outline-none border rounded-md md:w-2/3'/>
            <label>Password</label>
            <input type='password' className='p-2 outline-none border rounded-md md:w-2/3'/>
            <button className='mt-5 p-2 border md:w-2/3 font-medium bg-blue-600 text-white rounded-md'>Signup</button>
          </form>
          <p className='mt-5 w-2/3 text-center'>
            Have an account? 
            <span className='font-medium text-blue-600 ml-1'>
              <Link to="/login">
                Login 
              </Link>
            </span> 
          </p>
        </div>
    </div>
  )
}
