import Image from 'next/image'

export const Hero = () => {
    return (
        <div className="Hero h-3/4 p-10 md:flex sm:gap-10 md:gap-20 xs:flex-col">
            <div className="left md:w-1/2 mb-5">
                <h1 className="text-5xl md:w-3/4 xs:w-auto">Manage your Expenses Easily with Go Gutch</h1>
                <p className="mt-5 md:w-2/3 xs:w-auto">
                    Less stress when sharing expenses. Keep track of shared expenses and balances with family, friends, groups.
                    Track every penny effortlessly with our intuitive expense tracking app. Stay in control of finances and manage your money wisely.
                </p>
                <ul className="md:my-5 my-5 flex gap-10">
                    <li>
                        <button className="p-2 md:text-md xs:p-1 border rounded-md">
                            Sign Up
                        </button>
                    </li>
                    <li>
                        <button className="p-2 border rounded-md">
                            Log In
                        </button>
                    </li>
                </ul>
            </div>
            <div className="right md:mt-1 xs:mt-5">
                <Image src="/Card-1.png" alt='card' width={200} height={200} className='border-2'/>
                <Image src="/graph.png" alt='card' width={300} height={300} className='relative -top-3 xs:-top-2 md:left-40 left-7 border-2 rounded-md'/>
                <Image src="/Card-2.png" alt='card' width={200} height={200} className='border-2 relative md:-top-10 -top-8'/>
            </div>
        </div>
    )
}