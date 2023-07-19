import Profile from '../assets/person.png'

export const Testimonials = (props) => {
    return(
        <div className="bg-gray-600 rounded-md text-white space-y-5 p-5">
            <p className="md:text-lg text-sm text-justify">
                I'm impressed by the features it provides. It's east to use and very helpful. Within seconds you can keep track of your expenses.
            </p>
            <div className="flex gap-2 items-center">
                <img src={Profile} alt="" className="w-10"/>
                <div className="md:text-sm text-xs">
                    <h2>John Doe</h2>
                    <p>Customer</p>
                </div>
            </div>
        </div>
    )
}