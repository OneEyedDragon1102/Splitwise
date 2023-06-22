import {Navbar} from '../components/Navbar'
import { Hero } from '@/components/Hero'
import { Footer } from '@/components/Footer'
// import {SignUp} from '@/components/Signup'
// import {useState} from 'react'

export default function Home() {
  // const [darkMode, useDarkMode] = useState(false);
  return (
    <div className='bg-white text-black'>
      <Navbar className=""/>
      <Hero />
      <Footer />
    </div>
  )
}
