insert into user_account (user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by) values
('admin', 'admin', 'ohy', 'ohy@gmail.com', 'this is memo', now(), 'ohy', now(), 'ohy');

insert into article (title, content, hashtag, created_at, created_by, modified_at, modified_by) values
('first article', 'first test test test test test test', '#test', '2021-03-10 08:48:50', 'ohy', '2021-05-30 23:53:46', 'ohy'),
('board', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis.
Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus.
Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero.
#pink', '#test', '2021-05-30 23:53:46', 'Kamilah', '2021-03-10 08:48:50', 'Murial'),
('notice', 'Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est.', '#test',
 '2021-02-20 10:06:13', 'Cookie', '2021-10-10 06:05:30', 'Rosalia');

insert into article_comment (article_id, content, created_at, created_by, modified_at, modified_by) values
(1, 'reply', '2022-03-10 08:48:50', 'sbb', '2022-05-30 23:53:46', 'sbb'),
(1, 'replywefrf 323 fdfsdf fewsf', '2022-04-10 08:48:50', 'Kamilah', '2022-06-30 23:53:46', 'sbb'),
(2, 'article0_.created_at as created_2_0_,', '2021-09-10 08:48:50', 'sbb', '2022-05-30 23:53:46', 'sbb'),
(2, '2023-01-11 11:22:08.581', '2021-08-10 08:48:50', 'Murial', '2022-02-10 23:53:46', 'sbb'),
(2, 'Completed 200 OK', '2021-07-10 08:48:50', 'test', '2022-01-30 23:53:46', 'sbb');