package me.dio.data;
import java.util.List;

import me.dio.domain.Match;
import retrofit2.Call;

public interface MatchesApi {
    Call<List<Match>> getMatches

}
