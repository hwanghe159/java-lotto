package lotto;

import lotto.controller.LottoController;

public class ConsoleLottoApplication {
    public static void main(String[] args) {
        LottoController lottoController = new LottoController();
        lottoController.run();
    }
}
