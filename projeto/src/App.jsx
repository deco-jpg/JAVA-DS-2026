import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import Mensagem from './components/Mensagem'
import InfoCurso from './components/InfoCurso'

function App() {
  return (
  <>
    <h1>Olá Mundo!</h1>
    <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deserunt accusantium, tempora in dignissimos nesciunt voluptatem? Itaque labore incidunt, perspiciatis iure vel suscipit voluptatem nesciunt ipsam molestiae provident dolorem dicta illum?</p>

  <Mensagem/>
  <InfoCurso/>
  </>  
  )
}

export default App
