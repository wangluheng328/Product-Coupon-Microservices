{application, 'osiris', [
	{description, "New project"},
	{vsn, "1.3.0"},
	{id, "v3.10.6-41-g04ce6e5"},
	{modules, ['osiris','osiris_app','osiris_bench','osiris_counters','osiris_log','osiris_replica','osiris_replica_reader','osiris_replica_reader_sup','osiris_retention','osiris_server_sup','osiris_sup','osiris_tracking','osiris_util','osiris_writer']},
	{registered, [osiris_sup]},
	{applications, [kernel,stdlib,sasl,crypto,gen_batch_server,seshat]},
	{mod, {osiris_app, []}},
	{env, [
	{data_dir, "/tmp/osiris"},
	{port_range, {6000, 6500}},
	{max_segment_size_chunks, 256000},
	{replication_transport, tcp},
	{replica_forced_gc_default_interval, 4999}
]}
]}.