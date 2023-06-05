export const Navbar = () => {
    return(
        <div className="navbar p-3 flex justify-around items-center">
            <h1 className="mr-auto font-bold text-4xl">Go Gutch</h1>
            <ul className="flex gap-5">
                <li className="p-2 font-semibold">Home</li>
                <li><button className="p-2 font-semibold rounded-md hover:bg-blue-400">Sign Up</button></li>
                <li><button className="p-2 font-semibold rounded-sm hover:bg-green-400">Log In</button></li>
            </ul>
        </div>
    )
}