package 종합.과제2인.model.dto;

public class RegiDto {
    // 멤버변수
        private int no;
        private String id;
        private int pw;
        private String name;
        private String phone;

        public RegiDto(int pw, String phone, String name, String id, int no) {
            this.pw = pw;
            this.phone = phone;
            this.name = name;
            this.id = id;
            this.no = no;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public int getPw() {
            return pw;
        }

        public void setPw(int pw) {
            this.pw = pw;
        }

        @Override
        public String toString() {
            return "RegiDto{" +
                    "no=" + no +
                    ", id='" + id + '\'' +
                    ", pw=" + pw +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
