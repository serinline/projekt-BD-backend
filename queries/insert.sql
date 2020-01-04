insert into pracownik (id_pracownik, imie, nazwisko, pesel, obywatelstwo, stanowisko) values 
		      (1, 'Augustyn', 'Skalski', ...., 'PL', 'pilot'),
		      (2, 'Jenny', 'Watson', ...., 'GB', 'steward'),
		      (3, 'Augustyn', 'Skalski', ...., 'PL', 'stewardessa');

insert into lot (id_lot, lotnisko_wylot, lotnisko_przylot, wylot, przylot) values 
		      (1, 'WMI', 'CRL', '2020-06-22 19:10:25', '2020-06-22 21:20:25'),
		      (2, 'WMI', 'LBA', '2020-03-18 13:20:25', '2020-03-18 15:00:25'),
		      (3, 'CRL', 'WMI', '2020-06-22 21:40:25', '2020-06-22 23:50:25'),
		      (4, 'LUZ', 'ANR', '2019-12-23 14:00:25', '2019-12-23 16:35:25'),
		      (5, 'WMI', 'RMI', '2020-03-30 20:55:25', '2020-03-30 22:55:25');

create table miejsca (
    id_samolot Integer,
    miejsce Varchar(3)
);

insert into miejsca (id_samolot, miejsce)  values
                                                  (1, 'A1'),
                                                  (1, 'B1'),
                                                  (1, 'C1'),
                                                  (1, 'A2'),
                                                  (1, 'B2'),
                                                  (1, 'C2'),
                                                  (1, 'A3'),
                                                  (1, 'B3'),
                                                  (1, 'C3'),

                                                  (2, 'A1'),
                                                  (2, 'B1'),
                                                  (2, 'C1'),
                                                  (2, 'A2'),
                                                  (2, 'B2'),
                                                  (2, 'C2'),
                                                  (2, 'A3'),
                                                  (2, 'B3'),
                                                  (2, 'C3')
                                                  
                                               ;