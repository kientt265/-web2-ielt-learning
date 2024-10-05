import { useState } from 'react'
import Header from './component/Header'
import Display from './component/Display'
import Footer from './component/Footer'
import Main from './component/Main'
function App() {
  

  return (
    <div className='flex flex-col'>
    <Header onLoginClick={() => console.log('Login clicked')} onSignUpClick={() => console.log('Sign up clicked')} onHomeClick={() => console.log('Home')}/>
    <Main/>
    <Footer/>
    </div>
  )
}

export default App
