# Write your MySQL query statement below
select l.book_id,l.title,l.author,l.genre ,l.publication_year , l.total_copies as current_borrowers
from library_books as l
join 
(SELECT book_id,COUNT(*) AS return_date
FROM borrowing_records
WHERE return_date IS NULL
GROUP BY book_id) as f
on l.book_id=f.book_id
where l.total_copies = f.return_date
order by l.total_copies desc , l.title asc;