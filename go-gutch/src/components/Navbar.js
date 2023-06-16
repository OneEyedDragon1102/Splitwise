// import Link from 'next/link';   

export const Navbar = () => {
    return(
        <div className="navbar px-10 py-5 flex justify-around items-center">
            <h1 className="mr-auto font-semibold text-4xl">Go Gutch</h1>
            <ul className="flex gap-5 font-normal md:visible xs:hidden">
                <li className="p-2">Home</li>
                <li>
                    <button className="p-2 border rounded-md">
                        <a href="/signup">Sign Up</a>        
                    </button>
                </li>
                <li>
                    <button className="p-2 border rounded-md">
                            Log In
                    </button>
                    </li>
            </ul>
        </div>
    )
}