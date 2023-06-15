import Image from 'next/image'

export const Hero = () => {
    return (
        <div className="Hero h-3/4 p-10 flex sm:gap-10 md:gap-20 xs:flex-col">
            <div className="left w-1/2">
                <h1 className="text-5xl w-3/4 sm:w-auto">Manage your Expenses Easily with Go Gutch</h1>
                <p className="mt-5 w-2/3 sm:w-auto">
                    Less stress when sharing expenses. Keep track of shared expenses and balances with family, friends, groups.
                    Track every penny effortlessly with our intuitive expense tracking app. Stay in control of finances and manage your money wisely.
                </p>
                <ul className="mt-5 flex gap-10">
                    <li>
                        <button className="p-2 border rounded-md">
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
            <div className="right">
                <Image src="/Card-1.png" alt='card' width={200} height={200} className='border'/>
                <Image src="/graph.png" alt='card' width={300} height={300} className='relative -top-5 left-40 border-2  rounded-md'/>
                <Image src="/Card-2.png" alt='card' width={200} height={200} className='border relative -top-10'/>
            </div>
        </div>
    )
}