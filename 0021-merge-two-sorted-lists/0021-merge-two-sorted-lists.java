/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
   }
}


// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
//         if(list1==null) return list2;
//         if(list2==null) return list1;
        
        
//         ListNode result=new ListNode();
//         ListNode temp=result;
        
//         temp=result;
        
//         while(list1!=null && list2!=null){
//             // temp는 result의 첫번째 노드를 가르키므로, 새로운 노드를 삽입할때에는 temp.next 사용
//             if(list1.val > list2.val){
//                 temp.next=list2;
//                 list2=list2.next;
//             }
//             else{
//                 temp.next=list1;
//                 list1=list1.next;
//             }
//             temp=temp.next;
//         }
        
//         if(list1==null){
//             temp.next=list2;
//         }else {temp.next=list1;}
        
//         return result.next;
//     }
// }