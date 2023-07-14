import React from 'react'
import { Testimonials } from './Testimonials'

export const LogIn = () => {
  return (
    <div className='m-5 p-5 border rounded-md flex'>
        {/* <p className='text-center text-xl font-semibold'>Login page under construction 🚧</p> */}
        <div className='w-1/2'>
          <h1>Go Gutch</h1>
          <div>
            <h2>Let us help you manage your expenses on your fingertip. </h2>
            <h3>Here, is our registration which take less then a minute.</h3>
          </div>
          <div className=''>
            <Testimonials />
          </div>
        </div>
        <div className='w-1/2'>
          <h1>Get Started</h1>
          <h3>Create your account now</h3>
          <form className='flex flex-col'> 
            <label>Username</label>
            <input type='text'/>
            <label>Email</label>
            <input type='email'/>
            <label>Password</label>
            <input type='password'/>
          </form>
        </div>
    </div>
  )
}
