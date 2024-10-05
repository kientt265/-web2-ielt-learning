import React from 'react'
interface HeaderProps {
    onLoginClick: () => void;
    onSignUpClick: () => void;
    onHomeClick: () => void;
  }
const Header: React.FC<HeaderProps> = ({ onLoginClick, onSignUpClick, onHomeClick }) => {
  return (
    <div className='fixed top-0 left-0 w-full z-50 bg-slate-200'>
        <div className='flex  bg-white-300 p-3 items-center'>
        <div className='flex gap-1 w-[20%] ml-5 cursor-pointer' onClick={onHomeClick}>
            <h1 className='font-bold text-blue-700'>Fantasy</h1>
            <h1 className='font-bold'>IELTS</h1>
        </div>
        <div className='flex justify-center gap-7 w-[60%] text-[80%] '>
            <a href="#" className='font-bold'>Home</a>
            <a href="#">IELTS Exam Library</a>
            <a href="#">TED Videos</a>
            <a href="#">About Us</a>
        </div>
        <div className='flex justify-around items-center w-[20%]'>
                <p className='font-bold cursor-pointer bg-[#FFFFFF] rounded p-2 ' onClick={onLoginClick}>Log In</p>
                <div>
                <p className='font-bold bg-[#525FE1] rounded p-2 cursor-pointer' onClick={onSignUpClick}>Sign Up</p>
                </div>
        </div>
        </div>
    </div>
  )
}

export default Header