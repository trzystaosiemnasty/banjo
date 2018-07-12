package pl.javageek.banjo.lists;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.javageek.banjo.games.Game;
import pl.javageek.banjo.games.Genre;

import java.util.HashSet;

@Controller
@RequestMapping("/")
public class ListController {

    @GetMapping
    public String getList(Model model) {
        ScoreList list = new ScoreList();
        Score score = new Score();
        Game game = new Game();
        game.setGenre(Genre.FPS);
        game.setTitle("Call of Duty");
        score.setGame(game);
        score.setScore(10);
        list.setScores(new HashSet<>());
        list.getScores().add(score);
        model.addAttribute("list", list);
        return "list";
    }
}
