import './style.css';
import carlos from '../assets/carlos.png';

export default function Home() {
  return (
    <main className="home">

      <section className="hero">

        <div className="hero-text">
          <h2>Homenagem ao Professor Carlos Anderson</h2>

          <p>
            Homenagem ao camisa 10 do SENAI que não pode assistir THE BOYS(porque a mulher não deixa).
          </p>

          <p>
            "Ao cara que é a favor do sistema FIEB (SANTA CATARINA)⚔️"
          </p>
        </div>

        <div className="hero-image">
          <img src={carlos} alt="Professor Carlos Anderson" />
        </div>

      </section>

      <section className="cards">

        <div className="card">
          <h3>💻 Conhecimento</h3>
          <p>
            Explica conteúdos de programação de forma clara e objetiva.
          </p>
        </div>

        <div className="card">
          <h3>🚀 Inspiração</h3>
          <p>
            Inspira ao uso correto da IA(ChatGPT, Gemini, CLAUDE).
          </p>
        </div>

        <div className="card">
          <h3>🤝 Apoio</h3>
          <p>
            Está sempre disposto a ajudar e esclarecer dúvidas.
          </p>
        </div>

      </section>

      <section className="quote">
        <p>
          "Menção honrosa à: Marta, que até hoje não sei quem é."
        </p>
      </section>

    </main>
  );
}
