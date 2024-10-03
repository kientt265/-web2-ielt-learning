import { useState } from 'react'
import Header from './component/Header'
import Display from './component/Display'
import Footer from './component/Footer'

function App() {
  

  return (
    <div className='flex flex-col'>
    <Header/>
    <Display/>
    <Footer/>
    </div>
  )
}

export default App
