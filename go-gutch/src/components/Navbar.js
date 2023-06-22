import Link from 'next/link';   

export const Navbar = () => {
    return(
        <div className="navbar px-10 py-5 flex justify-around items-center">
            <h1 className="mr-auto font-semibold text-4xl xs:text-3xl">Go Gutch</h1>
            <ul className="md:inline-flex gap-5 font-normal md:visible hidden">
                <li className="p-2">Home</li>
                <li>
                        <Link href="/signup">
                    <button className="p-2 border rounded-md">
                            Sign Up
                    </button>
                        </Link>      
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