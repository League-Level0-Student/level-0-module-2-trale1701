package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
String animal = JOptionPane.showInputDialog("What is your favorite animal?");
	/* 2. Make it so that the user can keep entering new animals. */
if(animal.equalsIgnoreCase("cow")) {
	playMoo();
}
else if(animal.equalsIgnoreCase("duck")) {
	playQuack();
}
else if(animal.equalsIgnoreCase("dog")) {
	playWoof();
}
else if(animal.equalsIgnoreCase("cat")) {
	playMeow();
}
else if(animal.equalsIgnoreCase("llama")) {
	playLlama();
}

}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}
void playMeow() {
	playNoise(meowFile);
}
void playLlama() {
	playNoise(llamaFile);
}


String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		AudioClip clip = JApplet.newAudioClip(getClass().getResource(soundFile));
		clip.play();
		Thread.sleep(3400);
	}
	catch (Exception ex) {
		ex.printStackTrace();
		
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

