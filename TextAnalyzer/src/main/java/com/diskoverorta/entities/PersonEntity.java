package com.diskoverorta.entities;

import com.diskoverorta.osdep.SerendioNLP;

import java.util.List;

/**
 * Created by praveen on 15/10/14.
 * Edited by Subhasis : added serendioNLP, removed reference to stanfordNLP.
 */
public class PersonEntity implements BaseEntity
{
    public List<String> getEntities(String sentence)
    {
    	SerendioNLP nlp = new SerendioNLP();        
        return nlp.getEntities(sentence,"PERSON",3,3);
    }    
}
