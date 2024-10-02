    import React from 'react'
    import VectorImage from '../assets/Vector.png'
    import Kiendeptrai from '../assets/anhcuatoi-removebg-preview.png'
    import cam from '../assets/cam.png'
    import xanh from '../assets/xanh.png'
    import rectangle from '../assets/Rectangle 2037.png'
    const Display = () => {
    return (
        <div className='relative'>
            <div className='w-full h-screen bg-gray-400 flex relative absolute'>
                <div>
                    <img src={xanh} alt="" />
                </div>
                <div className=' ml-[123px] flex flex-col'>
                    <div className='mt-[100px] text-[40px] '>
                        <p>Online <span className='font-bold text-[#525FE1]'>Learning</span></p>
                        <p><span className='font-bold text-[#525FE1]'>you can access</span> any</p>
                        <p>where easily!</p>
                    </div>
                    <div>
                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. <br /> Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.....</p>
                    </div>
                    <div className=' flex flex-row mt-3 items-center'>
                        <p className='bg-[#FFCF59] p-3 rounded font-bold cursor-pointer'>JOIN FREE</p>
                        <p className='ml-2 cursor-pointer'>See how it work?</p>
                    </div>
                </div>
                <div className='relative'>
                    <img src={cam} alt="" />
                    <img src={VectorImage} alt="" className='ababsolute top-0 left-0 '/>
                    <img src={Kiendeptrai} alt="" className='absolute top-0 left-0'/>
                </div>
            
            </div>
            <div className='absolute'>
                <img src={rectangle} alt="" className='z-10' />
            </div>
            <div className='bg-gray-400 mt-28'>
                <div className='p-10 '>
                    <div className='flex  flex-col items-center '>
                        <h1 className='text-[35px]'><span className='font-bold text-[#525FE1]   '>Why we are</span> best from others?</h1>
                        <p className='w-[70%]'>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.....</p>
                    </div>
                </div>
            </div>
        </div>
    )
    }

    export default Display