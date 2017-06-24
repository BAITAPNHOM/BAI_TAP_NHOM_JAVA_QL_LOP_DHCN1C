create table THONGTINSV
(

	MaSV nvarchar(7) FOREIGN KEY REFERENCES SINHVIEN(MaSV) on delete cascade on update 		cascade  NOT NULL,
	DiaChi nvarchar(50) not null,
	SoDT int ,
	Email varchar(30),
	FaceBook varchar(50),
	DoanVien bit not null,
	SoCMND int not null,
	DanToc nvarchar(20),
	constraint pk primary key (MaSV)

)
