/*
 * Merge(A, lb, mid,up) { i = lb; j = mid+1; k = lb; while(i<mid && j<=ub) {
 * if(a[i]<=a[j]) { b[k] = a[i]; i++; k++; }else { b[k] = a[j]; j++; k++; }
 * if(i>mid) { while(j<=up) { b[k]=a[j]; j++; k++; }
 * 
 * } else { while(i<mid) { b[k] = a[i]; i++; k++; } } } }
 * 
 * () -> system.out.println(""); (a,b) -> { //
 * 
 * } s-> sysout("");
 * 
 * class Thread1 extends Thread {
 * 
 * @override void run() { for(int i=0; i<3;i++) { try { Thread.sleep(1000);
 * }catch(InterruptedException e) { e.getStackTrace(); } } } }
 * 
 * public static void main(String[] args) { Thread1 t1 = new Thread1(); Thread1
 * t2 = new Thread1(); t1.start(); t2.start(); }
 */