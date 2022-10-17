build:
	mvn package -Dmaven.test.skip=true
	docker-compose build

up-local:
	docker-compose up