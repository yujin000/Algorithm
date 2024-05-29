-- 코드를 작성해주세요
SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR, 
(SELECT MAX(SIZE_OF_COLONY) FROM ECOLI_DATA 
WHERE YEAR(DIFFERENTIATION_DATE) = YEAR(E.DIFFERENTIATION_DATE)) - SIZE_OF_COLONY 
AS YEAR_DEV, ID
FROM ECOLI_DATA AS E
WHERE DIFFERENTIATION_DATE IS NOT NULL
ORDER BY YEAR, YEAR_DEV