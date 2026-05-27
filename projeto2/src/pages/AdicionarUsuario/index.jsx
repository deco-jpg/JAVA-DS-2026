import './style.css'

export default function AdicionarUsuario(){
    cont [nome, setNome] = useState('')
    cont [email, setEmail] = useState('')
    cont [lista, setListaUsuarios] = useState('[]')

    const adicionarNovoUsuario = (event) =>{
        event.preventDefault()
        if (nome && email) {
            setListaUsuarios([...listaUsuarios, {nome, email}])
            setNome('')
            setEmail('')
        }
    }

    return(
        <h1>Adicionar usuário</h1>
    )
}