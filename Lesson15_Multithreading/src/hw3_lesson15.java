public class hw3_lesson15 {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            Thread threadTwo = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Thread threadThree = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });

                threadThree.start();
                try {
                    threadThree.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            threadTwo.start();
            try {
                threadTwo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadOne.start();
    }
}
