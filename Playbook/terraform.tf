provider "aws"  {    
     region = "us-east-2"
} 
 resource "aws_instance" "web-server"{
    ami = ami-05a36e1502605b4aa
    instance_type = "t2.micro"
    security_groups = ["default"]"
    key_name= "GaneshO.pem"
    }

