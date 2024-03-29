USE [ChamCong]
GO
/****** Object:  Table [dbo].[ChamCong]    Script Date: 12/3/2023 8:01:15 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChamCong](
	[employeeID] [nvarchar](50) NULL,
	[date] [nvarchar](50) NULL,
	[checkin] [nvarchar](50) NULL,
	[checkout] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 12/3/2023 8:01:15 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[employeeID] [nvarchar](50) NULL,
	[name] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[ChamCong] ([employeeID], [date], [checkin], [checkout]) VALUES (N'b203', N'2023-12-03', N'19:59:14.295934500', N'19:59:40.399005')
INSERT [dbo].[ChamCong] ([employeeID], [date], [checkin], [checkout]) VALUES (N'b201', N'2023-12-03', N'19:57:32.408703700', N'19:58:42.429197900')
INSERT [dbo].[ChamCong] ([employeeID], [date], [checkin], [checkout]) VALUES (N'b201', N'2023-12-03', N'19:58:51.305431200', N'19:58:58.245981800')
INSERT [dbo].[ChamCong] ([employeeID], [date], [checkin], [checkout]) VALUES (N'b202', N'2023-12-03', N'19:59:06.535013800', N'19:59:22.672575400')
INSERT [dbo].[ChamCong] ([employeeID], [date], [checkin], [checkout]) VALUES (N'b202', N'2023-12-03', N'19:59:48.651364600', N'20:00:00.540716700')
GO
INSERT [dbo].[Employee] ([employeeID], [name], [password]) VALUES (N'b201', N'Nguyễn Thành Danh', N'123')
INSERT [dbo].[Employee] ([employeeID], [name], [password]) VALUES (N'b202', N'Nguyễn Lê Minh Quân', N'123')
INSERT [dbo].[Employee] ([employeeID], [name], [password]) VALUES (N'b203', N'Nguyễn Văn Nhật', N'123')
GO
