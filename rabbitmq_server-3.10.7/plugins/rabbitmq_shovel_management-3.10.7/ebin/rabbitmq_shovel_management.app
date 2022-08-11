{application, 'rabbitmq_shovel_management', [
	{description, "Management extension for the Shovel plugin"},
	{vsn, "3.10.7"},
	{id, "v3.10.6-41-g04ce6e5"},
	{modules, ['rabbit_shovel_mgmt','rabbit_shovel_mgmt_util']},
	{registered, []},
	{applications, [kernel,stdlib,rabbit_common,rabbit,rabbitmq_management,rabbitmq_shovel]},
	{env, []},
		{broker_version_requirements, []}
]}.