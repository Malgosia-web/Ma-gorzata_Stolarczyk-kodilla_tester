package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>(); //klucz i wartość w mapie (kluczem jest String, wartością lista słówek)

    //DODAWANIE JEDNEGO WPISU DO SŁOWNIKA
    public void addWord(String polishWord, EnglishWord englishWord) {
        //pobiera z mapy listę angielskich słów odpowiadjących polskiemu
        //jeśli nie ma słowa, to tworzymy pustą listę
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        //do listy dodawany jest nasz wpis
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);//wstawianie wpisu do mapy lub aktualizacja istniejącego
    }
    //DWIE METODY PRZECIĄŻONE
    //WYSZUKUJE ANGIELSKIE SŁOWO NA PODSTAWIE POLSKIEGO
    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
        //return Collections.emptyList(); //tworzenie i zwracanie pustej listy (jest potrzebna, bo typ zwracany to lista obiektów)
    }
    //WYSZUKUJE ANGIELSKIE SŁOWO DODATKOWO BIORĄC POD UWAGĘ CO TO ZA CZĘŚĆ MOWY
    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        //najpierw wyszukuje wszystkie pasujące do polskiego słowa, następnie w pętli przepisuje do result tylko te, których partofspeech jest zgodne
        for (EnglishWord englishWord : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
        //return Collections.emptyList();
    }
    //ILE POZYCJI JEST W SŁOWNIKU
    public int size() {
        return dictionary.size();
    }

}
