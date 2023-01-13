insert into user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by) values
('admin', 'admin', 'ohy', 'ohy@gmail.com', 'this is memo', now(), 'ohy', now(), 'ohy'),
('hello', 'admin', 'JAva', 'JAva@gmail.com', 'this is memo', now(), 'JAva', now(), 'JAva'),
('hello3', 'admin', 'python', 'python@gmail.com', 'this is memo', now(), 'python', now(), 'python'),
('hello4', 'admin', 'kotlin', 'kotlin@gmail.com', 'this is memo', now(), 'kotlin', now(), 'kotlin'),
('hello5', 'admin', 'C', 'C@gmail.com', 'this is memo', now(), 'C', now(), 'C');

insert into article (user_account_id, title, content, hashtag, created_at, created_by, modified_at, modified_by) values
(1, 'first article', 'first test test test test test test', '#test1', '2021-03-10 08:48:50', 'ohy', '2021-05-30 23:53:46', 'ohy'),
(1, 'board', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.
Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.
Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.
#pink', '#test333', '2021-05-30 23:53:46', 'Kamilah', '2021-03-10 08:48:50', 'Murial'),
(2, 'notice', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#test',
 '2021-02-20 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(2, 'article888', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#aaaa',
 '2023-12-20 10:08:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(3, 'article6666', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#bbbb',
 '2023-12-20 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(3, 'article34323', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#cccc',
 '2021-09-20 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(4, 'article2`1111', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#aaaa',
 '2021-09-11 11:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(4, 'article121212', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#bbbb',
 '2022-12-31 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(5, 'article98989', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#cccc',
 '2023-1-31 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(5, 'article7777', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#aaaa',
 '2020-02-20 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia'),
(5, 'article4579346', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#cccc',
 '2022-01-02 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia');

insert into article_comment (user_account_id, article_id, content, created_at, created_by, modified_at, modified_by) values
(1, 1, 'reply', '2022-03-10 08:48:50', 'sbb', '2022-05-30 23:53:46', 'sbb'),
(1, 1, 'replywefrf 323 fdfsdf fewsf', '2022-04-10 08:48:50', 'Kamilah', '2022-06-30 23:53:46', 'sbb'),
(1, 2, 'article0_.created_at as created_2_0_,', '2021-09-10 08:48:50', 'sbb', '2022-05-30 23:53:46', 'sbb'),
(1, 2, '2023-01-11 11:22:08.581', '2021-08-10 08:48:50', 'Murial', '2022-02-10 23:53:46', 'sbb'),
(1, 2, 'Completed 200 OK', '2021-07-10 08:48:50', 'test', '2022-01-30 23:53:46', 'sbb');