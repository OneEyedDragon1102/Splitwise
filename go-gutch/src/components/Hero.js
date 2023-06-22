import Image from 'next/image'
import Link from 'next/link'

export const Hero = () => {
  return (
    <div className="Hero">
      <div className="p-10 md:flex sm:gap-10 md:gap-20 xs:flex-col">
        <div className="left md:w-1/2 mb-5">
          <h1 className="text-5xl md:w-3/4 xs:w-auto">
            Manage your Expenses Easily with Go Gutch
          </h1>
          <p className="mt-5 md:w-2/3 xs:w-auto">
            Less stress when sharing expenses. Keep track of shared expenses and
            balances with family, friends, groups. Track every penny
            effortlessly with our intuitive expense tracking app. Stay in
            control of finances and manage your money wisely.
          </p>
          <ul className="md:my-5 my-5 flex gap-10">
            <li>
              <button className="p-2 md:text-md xs:p-1 border rounded-md" id=''>
                Sign Up
              </button>
            </li>
            <li>
              <button className="p-2 border rounded-md" id='login'>
                <Link href="/Login">
                Log In
                </Link>
              </button>
            </li>
          </ul>
        </div>
        <div className="right md:mt-1 xs:mt-5">
          <Image
            src="/Card-1.png"
            alt="card"
            width={200}
            height={200}
            className="border-2"
          />
          <Image
            src="/graph.png"
            alt="card"
            width={300}
            height={300}
            className="relative -top-3 xs:-top-2 md:left-40 left-7 border-2 rounded-md"
          />
          <Image
            src="/Card-2.png"
            alt="card"
            width={200}
            height={200}
            className="border-2 relative md:-top-10 -top-8"
          />
        </div>
      </div>
      <div className="signup ml-10 p-5 text-left md:w-1/4 border shadow-md rounded-md w-3/4">
        <h1 className="text-3xl my-2 font-semibold">Sign Up</h1>
        <form className="flex flex-col space-y-2">
          <div className="username">
            <label for="userName" className="font-medium">
              Email
            </label>
            <input
              type="email"
              id="user"
              name="userName"
              className="border outline-none p-2"
            />
          </div>
          <div className="num">
            <label for="userName" className="font-medium">
              Contact Number
            </label>
            <input
              type='tel'
              id="user"
              name="userName"
              required
              maxlength="10"
              className="border outline-none p-2"
            />
          </div>
          <div className="name">
            <label for="name" className="font-medium">
              Name
            </label>
            <input
              type="text"
              id="name"
              name="name"
              required
              minlength="10"
              maxlength="20"
              className="border outline-none p-2"
            />
          </div>
          <div className="password">
            <label for="password" className="font-medium">
              Password
            </label>
            <input
              type="password"
              name="pass"
              id="pass"
              minlength="8"
              maxlength="12"
              className="p-2 border outline-none"
            />
          </div>
          <button type="submit" className="p-2 border font-semibold text-white rounded-sm w-max bg-blue-400">
            Log In
          </button>
        </form>
      </div>
      <div className="login mt-5 ml-10 p-5 border rounded-md shadow-lg md:w-1/4 w-3/4">
        <h1 className="my-2 text-3xl font-semibold" id="login" >Login</h1>
        <form action="" className="flex flex-col space-y-2">
            <div className="user">
            <label for="username" className="text-medium">Username</label>
            <input type="text" name="username" id="username" className="p-2 border outline-none"/>
            </div>
            <div className="password">
                <label for="password">Password</label>
                <input type="password" name="pass" id="pass" className="p-2 border outline-none "/>
            </div>
            <button className="p-2 mt-2 bg-blue-400 rounded-sm w-max text-white font-semibold">Sign Up</button>
        </form>
      </div>
    </div>
  );
};
