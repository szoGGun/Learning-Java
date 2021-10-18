// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song. ✓
// The program will have an Album class containing a list of songs. ✓
// The albums will be stored in an ArrayList ✓
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added. ✓
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove())

package com.przemyslawrutkowski;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Этажи", "Молчат Дома");
        album.addSong("На дне", 4.07);
        album.addSong("Танцевать", 3.22);
        album.addSong("Фильмы", 4.17);
        album.addSong("Волны", 4.21);
        album.addSong("Тоска", 3.09);
        album.addSong("Прогноз", 3.04);
        album.addSong("Судно (Борис Рыжий)", 2.21);
        album.addSong("Коммерсанты", 3.49);
        album.addSong("Клетка", 4.43);
        albums.add(album);

        album = new Album("Куда птицы улетают умирать", "Ploho");
        album.addSong("Сердце получает нож", 2.11);
        album.addSong("У бога есть ад", 3.06);
        album.addSong("Мысли и их люди", 3.04);
        album.addSong("Страна дураков", 4.21);
        album.addSong("Молодость", 2.48);
        album.addSong("Холод", 2.17);
        album.addSong("Притяжение", 3.47);
        album.addSong("Когда ты дома", 3.09);
        albums.add(album);

        List<Song> playlist = new ArrayList<Song>();
        albums.get(0).addToPlaylist("Танцевать", playlist);
        albums.get(0).addToPlaylist("JD", playlist); // No track
        albums.get(0).addToPlaylist("Тоска", playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(0).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(4, playlist);
        albums.get(1).addToPlaylist(24, playlist); // No track

        play(playlist);
    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs on playlist");
            return;
        } else {
            System.out.println("\nNow playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {

                case 0:
                    System.out.println("Quiting...");
                    quit = true;
                    break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We've reached end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;

                case 4:
                    printList(playlist);
                    break;

                case 5:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    if (playlist.size() == 0) {
                        System.out.println("No songs in playlist");
                        return;
                    }
                    break;

                case 6:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("\nAvailible actions: \n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - remove current song from playlist\n" +
                "6 - print available actions");
    }

    public static void printList(List   <Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("=======================");
    }
}
