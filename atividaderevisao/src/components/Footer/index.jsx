import './style.css'

export default function Footer(){
    return(
        <footer className='footer'>
            <p>
                &copy; {new Date().getFullYear()} TODOS OS DIREITOS RESERVADOS - BAIXAKI
                <br/>
                Clique e saiba mais
            </p>
            
            

        </footer>
    )
}