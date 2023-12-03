HƯỚNG DẪN SỬ DỤNG PHẦN MỀM CHẤM CÔNG
1. Kết nối Cơ sở dữ liệu SQLServer 
- Mở SQLServer, tạo 1 Database mới với tên ChamCong
- Chọn File -> Open -> File... sau đó chọn file có tên chamcong_sql.sql có trong folder
- Chọn tất cả câu lệnh và nhấn Execute

2. Sử dụng chương trình chấm công
- Mở Netbeans, chọn File -> Open Project -> chọn Project có trong folder -> Tiếp tục chọn Open Project
- Tiếp tục chọn Source Packages -> view -> chọn 1 file bất kì sau đó nhấn run
- Mã nhân viên: b201, b202, b203; Mật khẩu: 123

3. Trong trường hợp Không thể kết nối đến CSDL
- Mở SQLServer, copy tên server, ví dụ: DESKTOP-xxxxxxx\SQLEXPRESS
- Tại các file frmcheckIn, frmcheckOut, frmThongTin: thay đổi url hàm kn():
url = "jdbc:sqlserver://DESKTOP-G06V6DT\\SQLEXPRESS;databasename=ChamCong;" + "username=sa;password=sa2019";
thành url = "jdbc:sqlserver://DESKTOP-xxxxxxx\\SQLEXPRESS;databasename=ChamCong;" + "username=sa;password=sa2019";
với username và password là do bạn đặt từ trước.

4. Thông tin về Phần mềm:
- Phần mềm được triển khai trong phạm vi môn học CT240-Nguyên Lý Xây Dựng Phần Mềm,
do TS Trương Xuân Việt giảng dạy thuộc trường Công nghệ Thông tin và Truyền Thông, Đại học Cần Thơ
- Nhóm sinh viên thực hiện:
	+ B2012067 Nguyễn Thành Danh
	+ B2012122 Nguyễn Văn Nhật
	+ B2012131 Nguyễn Lê Minh Quân 