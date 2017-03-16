# Twierdzenie Bayesa

### Wzór

![img](img/2_clip_image001.png)

> P(A|B) = P(B|A)*P(A)/P(B)



### Przykład 1

G - pacjent ma grypę
T - pacjent ma wysoką temperaturę

P(G), P(T), P(T|G) ⇒ [twierdzenie bayesa] ⇒ P(G|T),

czyli znając:

- % chorych na grypę w populacji
- % gorączkujących w populacji
- % gorączkujących wśród chorych na grypę

Możemy obliczyć:

- % chorych na grypę wśród gorączkujących, czyli **prawdopodobieństwo, że ktoś ma grypę, jeśli gorączkuje** 


![Twierdzenie bayesa - przykład Grypa](img/1_clip_image001.png)


### Przykład 2

P(N) = 0,005 – % narkomanów w populacji (0,5%)
P(W) = 0,995 – % wolnych od uzależnienia w populacji (99,5%)
P(+|N) = 0,99 – czułość (% dodatnich wyników wśród narkomanów - 99%)
P(-|W) = 0,99 – swoistość (% ujemnych wśród wolnych od uzależnienia – 99%) 
P(+|W) = 1-P(-|W) = 0,01

P(N|+) = ? – wartość predykcyjna dodatnia (prawdopodobieństwo, że osoba z dodatnim wynikiem testu jest narkomanem)

P(N|+) = P(+|N) * P(N) / P(+) 

P(+) = P(+|N) * P(N) + P(+|W) * P(W)
P(+) = 0,99 * 0,005 + 0,01 * 0,995 = 0,00495 + 0,00995 = 0,0149

P(N|+) = 0,99 * 0,005 / 0,0149 ~= 0,332

Zatem wśród osób z dodatnim wynikiem testu, tyko ok. 33,2% to narkomani.

P(W|-) = P(-|W)*P(W)/P(-)



### Przykład 3

![Zrzut ekranu 2017-01-20 o 14.34.46](img/1_Zrzut ekranu 2017-01-20 o 14.34.14.png)

![Zrzut ekranu 2017-01-20 o 14.34.46](img/1_Zrzut ekranu 2017-01-20 o 14.34.46.png)

![Zrzut ekranu 2017-01-20 o 14.36.42](img/1_Zrzut ekranu 2017-01-20 o 14.36.42.png)



##Linkujące do tej strony

[links]


[/links]
!tag:
~

