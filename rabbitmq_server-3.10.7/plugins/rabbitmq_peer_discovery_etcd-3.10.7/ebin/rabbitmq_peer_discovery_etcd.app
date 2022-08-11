{application, 'rabbitmq_peer_discovery_etcd', [
	{description, "etcd-based RabbitMQ peer discovery backend"},
	{vsn, "3.10.7"},
	{id, "v3.10.6-41-g04ce6e5"},
	{modules, ['rabbit_peer_discovery_etcd','rabbitmq_peer_discovery_etcd','rabbitmq_peer_discovery_etcd_app','rabbitmq_peer_discovery_etcd_sup','rabbitmq_peer_discovery_etcd_v3_client']},
	{registered, [rabbitmq_peer_discovery_etcd_sup]},
	{applications, [kernel,stdlib,rabbit_common,rabbitmq_peer_discovery_common,rabbit,eetcd,gun]},
	{mod, {rabbitmq_peer_discovery_etcd_app, []}},
	{env, []}
]}.