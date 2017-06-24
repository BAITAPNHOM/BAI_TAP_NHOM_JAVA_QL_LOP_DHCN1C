create table SINHVIEN
(
	MaSV nvarchar(7) primary key not null,
	HoSV nvarchar(20) not null,
	TenSV nvarchar(10) not null,
	NgaySinh date not null,
	GioiTinh bit not null,
	Nhom int not null
)