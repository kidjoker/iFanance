package cn.kidjoker.htmlData.service;

import cn.kidjoker.htmlData.service.bo.CoinColaBo;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public interface ParseHtmlService {
    public Document getHtmlData() throws IOException;

    public Object parseDataFromCoinCola(Document doc) throws Exception;

    public void persistentDictionary(List<CoinColaBo> coinColaBoList) throws Exception;
}
