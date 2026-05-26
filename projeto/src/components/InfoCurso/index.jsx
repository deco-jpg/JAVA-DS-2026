import './style.css'
import { useState } from 'react'

export default function InfoCurso(){
    const [nome, setNome] = useState('lógica de programação.')
    const [carga, setCarga] = useState('162h')
    const [dataInicio, setDataInicio] = useState('15/02/2025')
    const [dataTermino, setDataTermino] = useState('15/12/2025')
    const [modeloCurso, setModeloCurso] = useState('Presencial')
    const [turno, setTurno] = useState('Noturno')
    return(
        <div className='info-curso'>
            <h2>Dados do curso</h2>
            <p><strong>Nome: { nome } </strong></p>
            <p><strong>Carga: { carga } </strong></p>
            <p><strong>Data de inicio: { dataInicio } </strong></p>
            <p><strong>Data de término: { dataTermino } </strong></p>
            <p><strong>Modelo do Curso: { modeloCurso }</strong></p>
            <p><strong>Turno: { turno }</strong></p>

        </div>
    )
}