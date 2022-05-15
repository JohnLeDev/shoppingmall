Setup database in local machine
	docker pull postgres
	docker run --name shoppingmall -p 2345:5432 -e POSTGRES_PASSWORD=shopping -d postgres

