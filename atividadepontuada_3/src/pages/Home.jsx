import './style.css';

import mae1 from '../assets/mae1.jpg';
import mae2 from '../assets/mae2.jpg';
import pai1 from '../assets/pai1.jpg';
import pai2 from '../assets/pai2.jpg';

function Home() {
  return (
    <main className="home">

      <section className="banner">
        <h2>As Pessoas Mais Importantes da Minha Vida ❤️</h2>
        <p>
          Esta página representa um pouco da gratidão que sinto pelos meus pais.
          Obrigada por cada ensinamento, cada conselho e todo amor recebido.
        </p>
      </section>

      <section className="polaroids">

        <div className="polaroid esquerda">
          <img src={mae1} alt="Mãe" />
          <h3>Minha Mãe ❤️</h3>
          <p>
            Seu amor e dedicação me inspiram todos os dias.
          </p>
        </div>

        <div className="polaroid direita">
          <img src={pai1} alt="Pai" />
          <h3>Meu Pai 💙</h3>
          <p>
            Seu exemplo de força e caráter me acompanha sempre.
          </p>
        </div>

      </section>

      <section className="timeline">

        <h2>Momentos Marcantes</h2>

        <div className="evento">
          <span>❤️</span>
          <p>Infância cercada de amor e carinho.</p>
        </div>

        <div className="evento">
          <span>📚</span>
          <p>Apoio constante durante os estudos.</p>
        </div>

        <div className="evento">
          <span>🎉</span>
          <p>Celebrando juntos cada conquista.</p>
        </div>

      </section>

      <section className="galeria">

        <h2>Memórias</h2>

        <div className="mural">
          <img src={mae1} alt="" />
          <img src={mae2} alt="" />
          <img src={pai1} alt="" />
          <img src={pai2} alt="" />
        </div>

      </section>

      <section className="carta">

        <h2>Recadinho especial 💌</h2>

        <p>
          Queridos pais,
          obrigado por tudo o que fizeram por mim ao longo da vida.
          Cada conselho, cada esforço e cada demonstração de amor ajudaram
          a construir a pessoa que sou hoje.
          Sou profundamente grata por ter vocês ao meu lado.
          Amo vocês infinitamente.
        </p>

      </section>

    </main>
  );
}

export default Home;