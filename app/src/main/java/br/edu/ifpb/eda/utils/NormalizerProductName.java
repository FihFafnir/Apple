package br.edu.ifpb.eda.utils;

import java.text.Normalizer;

public class NormalizerProductName {
    public static String normalize(String name) {
        return Normalizer
                .normalize(name, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "").trim().toUpperCase();
    }
}
