import { useState } from 'react'
import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'
import AdicionarUsuario from './pages/AdicionarUsuario'

function App() {

  return (
    <>
      <Header />
      <main>
      <AdicionarUsuario/>
      </main>
      <Footer />

      
    </>
  )
}

export default App
