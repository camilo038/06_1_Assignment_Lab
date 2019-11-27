Spring-Boot Camel 

#Instalar

mvn clean install

#Crear secrets

oc create -f secret.yml

#Crear Propiedades***********Por favor verfifique los valos correspodientes a su ambiente

oc create configmap gatewaysaldoencargos --from-literal=quickstart.jmsBrokerURL="tcp://broker-amq-headless.proyectopagos-dev.svc.cluster.local:61616" --from-literal=quickstart.jmsBrokerTimeOut="3000" --from-literal=quickstart.endpointCxfPath="/WsFXF-WsFXF-context-root/WsFXFPort"

#Desplegar en OpenShift
mvn clean -DskipTests fabric8:deploy -Popenshift

#To list all the running pods:

oc get pods
Log oc logs

#Desplegar Local
Spring-boot:run
