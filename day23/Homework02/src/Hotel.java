public class Hotel implements Screen{

    private Room[][] rooms;
    public Hotel(int a, int b) {
        rooms = new Room[a][b];

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room();
                rooms[i][j].setNo((i+1) * 100 + j + 1);
                rooms[i][j].setFree(true);
            }
        }

        for (int i = 0; i < a/2 + 1; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j].setType("单人房");
            }
        }

        for (int i = a/2 + 1; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j].setType("双人房");
            }
        }

    }
    public void bookRoom(int no) {
       int a = no / 100 - 1;
       int b = no % 100 - 1;
       if (rooms[a][b].isFree() == true) {
           rooms[a][b].setFree(false);
           System.out.println(rooms[a][b].getNo() + "号房间预订成功");
           System.out.println("类型：" + rooms[a][b].getType());
       }else {
           System.out.println("对不起，您选择的" + rooms[a][b].getNo() + "号房间已经被预订！");
       }
    }


    public void checkOut(int no) {
        int a = no / 100 - 1;
        int b = no % 100 - 1;
        if (rooms[a][b].isFree() == false) {
            rooms[a][b].setFree(true);
            System.out.println("房间已经成功退订！");
        }else {
            System.out.println("已经空闲的房间无法再次退订");
        }
    }


    public void showDetails() {
        int sum = 0;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(rooms[i][j].isFree() == true) sum += 1;
            }
        }
        System.out.println("本酒店目前还有" + sum + "间房空闲");
        System.out.println("它们是：");
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(rooms[i][j].isFree() == true) System.out.print(rooms[i][j].getNo() + ":" + rooms[i][j].getType() + " ");
                if ((j+1) % rooms[i].length == 0) {
                    System.out.println();
                }
            }
        }
    }
}

class Room{
    private int no;
    private String type;
    private boolean free;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
