package bai14;

import java.util.*;

public class Main {
    public static Map<String, List<String>> graph = new HashMap<>();
    public static void main(String[] args) {

    }
    public static void addAdge(String from,String to){
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);

    }

    public static boolean hasPath(String start,String end){
        boolean reuslt = false;
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(start);
        List<String> visited = new ArrayList<>();
        visited.add(start);

        while(!queue.isEmpty()){
            String curr = queue.poll();
            List<String> neighbors = graph.get(curr);
            if(curr.equals(end)){
                reuslt = true;
                break;
            }
            for(String neighbor : neighbors){
               if(!visited.contains(neighbor)){
                   queue.offer(neighbor);
                   visited.add(neighbor);
               }
            }
        }
        return reuslt;


    }

    public List<String> shortestPath(String start,String end){
        Queue<String> queue = new ArrayDeque<>();
        List<String> visited = new ArrayList<>();
        queue.offer(start);
        visited.add(start);
        Map<String,String> parents = new HashMap<>();
        while (!queue.isEmpty()){
            String curr = queue.poll();
            List<String> neighbors = graph.get(curr);

            if(curr.equals(end)){
                break;
            }
            for(String neighbor : neighbors){
                if(!visited.contains(neighbor)){
                    queue.offer(neighbor);
                    visited.add(neighbor);
                    parents.put(neighbor,curr);
                }
            }
        }
        if(!parents.containsKey(end)){
            return Collections.emptyList();
        }

        String current = end;
        List<String> path = new ArrayList<>();
        while (current!=null){
            path.add(current);
            current = parents.get(current);
        }
        Collections.reverse(path);
        return path;


    }

    public List<String> neighbors(String node){
        return graph.get(node);
    }

}
