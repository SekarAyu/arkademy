<?php
Class User_m extends CI_Model
{
	function gets()
	{}
	function get()
	{}
	public function add($data)
	{
		$this->db->insert("person",$data);
	}
	function edit()
	{}
	function del()
	{}
}