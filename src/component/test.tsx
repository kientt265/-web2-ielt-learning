import React from 'react';
import VectorImage from '../assets/Vector.png'; // Đảm bảo đường dẫn đúng
import Kiendeptrai from '../assets/Kiendeptrai.png'; // Đảm bảo đường dẫn đúng

const Display = () => {
  return (
    <div className='relative w-full h-screen bg-gray-400'>
      <div className='relative'>
        {/* Ảnh đầu tiên */}
        <img src={VectorImage} alt="Vector" className='absolute top-0 left-0' />
        {/* Ảnh thứ hai */}
        <img src={Kiendeptrai} alt="Kiendeptrai" className='absolute top-0 left-0' />
      </div>
      <div className='ml-[123px] flex flex-col'>
        <div className='mt-[100px] text-[40px]'>
          <p>Online <span className='font-bold text-[#525FE1]'>Learning</span></p>
          <p><span className='font-bold text-[#525FE1]'>you can access</span> any</p>
          <p>where easily!</p>
        </div>
        <div>
          <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. <br /> Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.....</p>
        </div>
        <div className='flex flex-row mt-3 items-center'>
          <p className='bg-[#FFCF59] p-3 rounded font-bold cursor-pointer'>JOIN FREE</p>
          <p className='ml-2 cursor-pointer'>See how it work?</p>
        </div>
      </div>
    </div>
  );
}

export default Display;
