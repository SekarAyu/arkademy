<?php
class User extends CI_Controller{
	function __construct()
	{
		parent :: __construct();
		$this->load->model("person_m");
	}
	public function form()
	{
		$this->load->view("form_v");
	}
	public function add()
	{

		$data = array('name' => $this->input->post("name"), 'hobbies' => $this->input->post("hobbies") );
		var_dump($data);
		$this->person_m->add($data);
	}
}