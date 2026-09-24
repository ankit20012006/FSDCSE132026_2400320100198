function IMDb({ movie }) {
  return (
    <div className="movie">
      <div className="movie-rank">{movie.rank}</div>

      <img
        src={movie.image}
        alt={movie.title}
        className="movie-poster"
      />

      <div className="movie-title">
        {movie.title}
      </div>
    </div>
  );
}

export default IMDb;