import './style.css'
import lupa from '../../assets/lupa.png'

export default function Baixar() {
  return (
    <div className="pesquisa">
        <h3>Digite o nome do jogo</h3>
        <img className="lupa" src={lupa} alt="lupa" />
    </div>
  )
}