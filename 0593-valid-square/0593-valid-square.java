class Solution {
    private double dis(int[] a , int[] b) {
        return (b[1]-a[1])*(b[1]-a[1]) + (b[0]-a[0])*(b[0]-a[0]);
     }
    private boolean check(int[] p1,int[] p2,int[] p3, int[] p4) {
        return dis(p1,p2) >0 && dis(p1,p2) == dis(p2,p3) && dis(p2,p3) == dis(p3,p4) && dis(p3,p4) == dis(p4,p1) && dis(p1,p3) == dis(p2,p4);
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if(dis(p1,p2) == 0 || dis(p1,p3) == 0 || dis(p1,p4) == 0) return false;
        return check(p1,p2,p3,p4) || check(p1,p3,p2,p4) || check(p1,p2,p4,p3);
    }
}