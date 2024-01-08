package org.enes;

import org.enes.controller.MainController;
import org.enes.service.DoktorService;
import org.enes.service.HastaService;
import org.enes.utility.CreateRepoIml;

public class Runner {
    public static void main(String[] args) {

        new MainController().app();

    }
}
