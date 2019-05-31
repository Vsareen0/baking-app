
package com.vinamrasareen.comaniacs.bakingApp.retrofit;

import com.vinamrasareen.comaniacs.bakingApp.pojo.Recipe;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;


public interface IRecipe {
    @GET("baking.json")
    Call<ArrayList<Recipe>> getRecipe();
}