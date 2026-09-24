import IMDb from "./IMDB";

function ICardGallery() {
  const movies = [
    {
      rank: 1,
      title: "Superman",
      image: "https://image.tmdb.org/t/p/w200/3V4kLQg0kSqPLctI5ziYWabAZYF.jpg"
    },
    {
      rank: 2,
      title: "Sinners",
      image: "https://image.tmdb.org/t/p/w200/jYfMTSiFFK7ffx1Yxw6T5M4jvB.jpg"
    },
    {
      rank: 3,
      title: "F1",
      image: "https://image.tmdb.org/t/p/w200/6H6p82aWQFEZQDLLaBWB6F9k5w.jpg"
    },
    {
      rank: 4,
      title: "One Battle After Another",
      image: "https://image.tmdb.org/t/p/w200/placeholder.jpg"
    },
    {
      rank: 5,
      title: "Jurassic World Rebirth",
      image: "https://image.tmdb.org/t/p/w200/placeholder.jpg"
    },
    {
      rank: 6,
      title: "Frankenstein",
      image: "https://image.tmdb.org/t/p/w200/placeholder.jpg"
    },
    {
      rank: 7,
      title: "Happy Gilmore 2",
      image: "https://image.tmdb.org/t/p/w200/placeholder.jpg"
    },
    {
      rank: 8,
      title: "Thunderbolts*",
      image: "https://image.tmdb.org/t/p/w200/placeholder.jpg"
    },
    {
      rank: 9,
      title: "Mission: Impossible",
      image: "https://image.tmdb.org/t/p/w200/placeholder.jpg"
    },
    {
      rank: 10,
      title: "F1",
      image: "https://image.tmdb.org/t/p/w200/placeholder.jpg"
    }
  ];

  return (
    <div className="imdb-card">

      <div className="top-heading">
        <div className="imdb-logo">IMDb</div>

        <div className="best-year">
          <span>BEST OF</span>
          <strong>2025</strong>
        </div>
      </div>

      <h1>MOST POPULAR MOVIES</h1>

      <div className="movies-grid">
        <div>
          {movies.slice(0, 5).map((movie) => (
            <IMDb
              key={movie.rank}
              movie={movie}
            />
          ))}
        </div>

        <div>
          {movies.slice(5, 10).map((movie) => (
            <IMDb
              key={movie.rank}
              movie={movie}
            />
          ))}
        </div>
      </div>

    </div>
  );
}

export default ICardGallery;