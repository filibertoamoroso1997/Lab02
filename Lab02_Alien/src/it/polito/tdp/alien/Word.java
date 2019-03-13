package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String transaltion;
	
	
	
	
	
	public Word(String alienWord, String transaltion) {
		this.alienWord = alienWord;
		this.transaltion = transaltion;
	}



	public String getAlienWord() {
		return alienWord;
	}



	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}



	public String getTransaltion() {
		return transaltion;
	}



	public void setTransaltion(String transaltion) {
		this.transaltion = transaltion;
	}



	public boolean equals(Object obj) {
		Word wtemp = (Word)obj;
		if(this.getAlienWord().toLowerCase().compareTo(wtemp.getAlienWord().toLowerCase())==0)
			return true;
		else
			return false;
	}

}
