# Write your MySQL query statement below


select f.user_id,f.prompt_count,f.avg_tokens
from (
select user_id,count(prompt) as prompt_count , round(avg(tokens),2) as avg_tokens
,min(tokens) as minToken
from prompts
group by user_id
) as f 
where f.minToken<f.avg_tokens and f.prompt_count >= 3
order by f.avg_tokens desc , f.user_id asc;