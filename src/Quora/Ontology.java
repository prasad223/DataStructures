package Quora;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by prasad223 on 12/26/15.
 */

class TreeNode{
    class TrieNode{
        char value;
        boolean isLeaf;
        int count;
        TrieNode[] children;

        public TrieNode(char ch){
            this.value = ch;
            this.isLeaf = false;
            this.count = 0;
            this.children = new TrieNode[59];
        }
    }

    String value;
    TreeNode parent;
    Map<Character, TrieNode> triestruct;
    Map<String, TreeNode> children;

    TreeNode(String value){
        this.value = value;
        this.parent = null;
        this.triestruct = new HashMap<>();
        this.children = new HashMap<>();
    }

    public void insertQues(String question){
        //TrieNode
        for(char ch: question.toCharArray()){

        }
    }
}

class Tree{
    TreeNode root;

    Tree(String value){
        this.root = new TreeNode(value);
    }

    public void insertChild(String parent, String child){
        TreeNode node = root;
        TreeNode newNode = new TreeNode(child);
        while(node != null){
            if(node.value.equals(parent)){
                newNode.parent = node;
                node.children.put(child, newNode);
                break;
            }
            else{
                if(node.children.containsKey(parent)){
                    node = node.children.get(parent);
                }
                else{
                    for(TreeNode temp: node.children.values()){
                        node = temp;
                    }
                }
            }
        }
    }

    public void insertQuestion(String topic, String question){
        TreeNode node = this.root;
        while(node != null){
            if(node.value.equals(topic)){
                node.insertQues(question);
                break;
            }
            else{
                for(TreeNode temp: node.children.values()){
                    node = temp;
                }
            }
        }
    }

    public void  display(TreeNode node){
        System.out.println(node.value);
        for(TreeNode temp: node.children.values()){
            display(temp);
        }
    }
}


public class Ontology {

    static Tree topicTree;
    static Stack<String> stack;
    static final int QUESTION_MARK_INDEX=58, SPACE_INDEX=59;

    public static void main(String[] args)throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final int numTopics = Integer.parseInt(bufferedReader.readLine());
        String[] topics = bufferedReader.readLine().split("\\s+");
        stack = new Stack<>();
        stack.push(topics[0]);
        topicTree = new Tree(topics[0]);
        buildTopicTree(topics,2);
        topicTree.display(topicTree.root);
        stack = null;
        char ch = 'A';
        for(int i=0; i<58;i++){
            System.out.println((char)(ch+i) + "  " + ((int) ch+i-65));

        }
        final int numQuestions = Integer.parseInt(bufferedReader.readLine());
        String temp = "";
        for(int i =0 ; i < numQuestions; i++){
            temp = bufferedReader.readLine();
            topicTree.insertQuestion(temp.split(":",2)[0], temp.split(":",2)[1].trim());
        }
/*        final int numQueries = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0; i< numQueries; i++){
            findQuery(bufferedReader.readLine());
        }
*/
    }
    public static void buildTopicTree(String[] topics, int startIndex){
        for(int i = startIndex; i < topics.length; i++){
            System.out.println(topics[i]);
            if(topics[i].equals("(")){
                stack.push(topics[i-1]);
            }
            else if(topics[i].equals(")")){
                if(!stack.empty())
                    stack.pop();
            }else{
                topicTree.insertChild(stack.peek(), topics[i]);
            }
        }
    }

    public static void insertQuestion(String topicName, String question){
    }

}
