package controllers;

import out.APIResponse;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import service.OccupationService;

import javax.inject.Inject;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class OccupationController extends Controller {

    @Inject
    private HttpExecutionContext ec;

    private OccupationService occupationService;

    @Inject
    public OccupationController(OccupationService occupationService) {
        this.occupationService = occupationService;
    }

    public CompletionStage<Result> findOccupation(Integer restaurant) {

        CompletableFuture<APIResponse> futureResponse = CompletableFuture.supplyAsync(() -> occupationService.getOccupation(restaurant), ec.current());

        CompletionStage<Result> result = futureResponse.thenApply(response -> {
            return ok(Json.toJson(response));
        });

        return result;
    }
}
