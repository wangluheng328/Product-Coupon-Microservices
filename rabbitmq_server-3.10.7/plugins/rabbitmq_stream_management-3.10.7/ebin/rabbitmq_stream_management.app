{application, 'rabbitmq_stream_management', [
	{description, "RabbitMQ Stream Management"},
	{vsn, "3.10.7"},
	{id, "v3.10.6-41-g04ce6e5"},
	{modules, ['rabbit_stream_connection_consumers_mgmt','rabbit_stream_connection_mgmt','rabbit_stream_connection_publishers_mgmt','rabbit_stream_connections_mgmt','rabbit_stream_connections_vhost_mgmt','rabbit_stream_consumers_mgmt','rabbit_stream_management_utils','rabbit_stream_mgmt_db','rabbit_stream_publishers_mgmt']},
	{registered, []},
	{applications, [kernel,stdlib,rabbit,rabbitmq_management,rabbitmq_stream]},
	{env, [
]}
]}.