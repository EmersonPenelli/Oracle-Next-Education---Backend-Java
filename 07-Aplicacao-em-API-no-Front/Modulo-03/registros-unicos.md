# Retornando registros únicos

Dependendo das séries que você cadastrou no banco, podem ter aparecido menos registros do que 5. Isso porque a consulta gerada pela JPA era a seguinte:

```
select * from series s1_0 
left join episodios e1_0 
on s1_0.id=e1_0.serie_id 
order by e1_0.data_lancamento desc fetch first 5 rows only
```

Ao executar esse código, ele pega os 5 episodios mais recentes e retorna as séries correspondentes a eles, fazendo um left join. Porém, se seus episódios mais recentes forem de uma única série, ele retornará apenas essa série, não trazendo 5 resultados diferentes.

No desenvolvimento colaborativo, é muito comum encontrar problemas ao rodar códigos em máquinas diferentes, com registros diferentes. Por isso é importante que sejamos cuidadosos ao testar cada funcionalidade nova.

Para resolver esse problema, precisaremos recorrer às consultas JPQL, usando um inner join, diferente do left join, agrupando os dados por série, a fim de trazer 5 registros diferentes do banco. Abordaremos em vídeo sobre essa correção, mas caso você queira se adiantar, utilize o código a seguir no lugar da derived querie findTop5ByOrderByEpisodiosDataLancamentoDesc().
```
@Query("SELECT s FROM Serie s " +
            "JOIN s.episodios e " +
            "GROUP BY s " +
            "ORDER BY MAX(e.dataLancamento) DESC LIMIT 5")
    List<Serie> encontrarEpisodiosMaisRecentes();
```

Dessa forma, garantimos que estarão sempre vindo 5 séries distintas, baseado nas datas de lançamento dos episódios.
