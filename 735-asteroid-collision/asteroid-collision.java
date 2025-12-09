import java.util.ArrayList;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> stack = new ArrayList<>();

        for (int a : asteroids) {
            boolean alive = true;

            while (!stack.isEmpty() && a < 0 && stack.get(stack.size() - 1) > 0) {
                int top = stack.get(stack.size() - 1);

                if (top < -a) {
                    stack.remove(stack.size() - 1);
                } else if (top == -a) {
                    stack.remove(stack.size() - 1);
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                stack.add(a);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
