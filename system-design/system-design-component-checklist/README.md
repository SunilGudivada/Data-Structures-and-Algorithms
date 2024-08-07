---
cover: >-
  https://images.unsplash.com/photo-1565728744382-61accd4aa148?crop=entropy&cs=srgb&fm=jpg&ixid=M3wxOTcwMjR8MHwxfHNlYXJjaHw0fHxpbnRlcnZpZXd8ZW58MHx8fHwxNzIwOTg0MDQxfDA&ixlib=rb-4.0.3&q=85
coverY: 0
---

# ☑️ System design component checklist

System design is a critical aspect of building scalable and efficient software systems. Understanding the key components involved in system design can help in architecting robust and maintainable solutions. Here are the primary components:

<figure><img src="../../.gitbook/assets/System Design Components.png" alt=""><figcaption><p>System design component checklist</p></figcaption></figure>

PDF Version:&#x20;

{% file src="../../.gitbook/assets/System Design Components - Checklist - Study sheet.pdf" %}

* [ ] **Client-Side Components**:
  * **Web Clients**: Browsers and web applications.
  * **Mobile Clients**: Android, iOS applications.\

* [ ] **Server-Side Components**:
  * **Web Servers**: Serve static and dynamic content to clients.
  * **Application Servers**: Handle business logic and application services.
  * **Database Servers**: Store and manage data.\

* [ ] **Databases**:
  * **Relational Databases (SQL)**: Structured data storage with relationships (e.g., MySQL, PostgreSQL).
  * **NoSQL Databases**: Flexible schema for unstructured data (e.g., MongoDB, Cassandra).\

* [ ] **Cache**:
  * **In-Memory Cache**: Speed up data retrieval (e.g., Redis, Memcached).
  * **Content Delivery Network (CDN)**: Distribute content to users globally with minimal latency.\

* [ ] **Load Balancers**:
  * Distribute incoming traffic across multiple servers to ensure high availability and reliability.\

* [ ] **Message Queues**:
  * Enable asynchronous communication between services (e.g., RabbitMQ, Apache Kafka).\

* [ ] **API Gateways**:
  * Act as an entry point for clients to interact with backend services, handling request routing, rate limiting, and security (e.g., NGINX, Kong).\

* [ ] **Microservices**:
  * Independently deployable services that communicate over APIs, allowing for modular and scalable system architecture.\

* [ ] **Service Discovery**:
  * Automatically detect and manage microservices in a dynamic environment (e.g., Consul, Eureka).\

* [ ] **Configuration Management**:
  * Centralized management of configuration settings for consistency and ease of updates (e.g., etcd, Consul).\

* [ ] **Monitoring and Logging**:
  * **Monitoring**: Track system performance and health (e.g., Prometheus, Grafana).
  * **Logging**: Collect and analyze logs for debugging and auditing (e.g., ELK Stack - Elasticsearch, Logstash, Kibana).\

* [ ] **Authentication and Authorization**:
  * **Authentication**: Verify user identity (e.g., OAuth, JWT).
  * **Authorization**: Control user access to resources (e.g., RBAC, ABAC).\

* [ ] **Scalability and Reliability**:
  * **Horizontal Scaling**: Add more servers to distribute the load.
  * **Vertical Scaling**: Add more resources to existing servers.
  * **Redundancy**: Duplicate critical components to avoid single points of failure.
  * **Backup and Disaster Recovery**: Ensure data integrity and availability in case of failures.\

* [ ] **Networking**:
  * **DNS**: Resolve domain names to IP addresses.
  * **Firewalls and Security Groups**: Control access to network resources.\

* [ ] **DevOps and CI/CD**:
  * **Continuous Integration/Continuous Deployment (CI/CD)**: Automate code integration, testing, and deployment (e.g., Jenkins, GitLab CI).
  * **Infrastructure as Code (IaC)**: Manage infrastructure using code (e.g., Terraform, Ansible).\

* [ ] **Data Processing**:
  * **Batch Processing**: Process large volumes of data in batches (e.g., Hadoop).
  * **Stream Processing**: Process data in real-time as it flows through the system (e.g., Apache Flink, Apache Storm).\

* [ ] **Analytics and Reporting**:
  * Generate insights and reports from collected data to drive decision-making (e.g., Google Analytics, Tableau).

By integrating these components effectively, you can design systems that are scalable, reliable, and maintainable, meeting the demands of modern applications and user expectations.
