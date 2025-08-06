package com.example.demo.movie;

import java.util.List;
import java.util.Optional;

public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {this.movieRepository = movieRepository;}
    
    public void register(MovieDto.Register dto){
        movieRepository.save(dto.toEntity());
    }

    public List<MovieDto.Movie> list(){
        List<MovieEntity> result = movieRepository.findAll();

        return result.stream().map(MovieDto.Movie::from).toList();
    }

    public MovieDto.Movie read(Integer idx){
        Optional<MovieEntity> result = movieRepository.findById(idx);

        if(result.isPresent()){
            MovieEntity entity = result.get();

            return MovieDto.Movie.from(entity);
        }
        return null;
    }

}
