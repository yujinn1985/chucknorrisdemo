package com.gmail.myyujinn.chucknorrisdemo.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisRandomQuoteImpl implements ChuckNorrisRandomQuote {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisRandomQuoteImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String sayQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
