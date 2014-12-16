kerodon-playground
==================

Playground for testing Clojure web applications with Kerodon

Steps:

1. Install Leiningen
2. `lein new compojure kerodon-playground`
3. `cd kerodon-playground`
4. `lein ring server-headless`
5. Visit http://localhost:3000 in the browser and you should see "Hello World"
6. `rm test/kerodon_playground/core/handler_test.clj`
7. Write the first Kerodon test for the homepage.
8. `lein test`
9. Fix the handler
10. `lein test`
